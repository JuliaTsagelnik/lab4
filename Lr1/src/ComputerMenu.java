import java.util.Scanner;

public class ComputerMenu {
    private ComputerRepository repository; // Хранилище компьютеров
    private Computer lastGeneratedComputer; // Последний созданный компьютер
    private int lastGeneratedIndex; // Индекс последнего компьютера

    public ComputerMenu() {
        this.repository = new ComputerRepository();
        this.lastGeneratedComputer = null;
        this.lastGeneratedIndex = -1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Сгенерировать компьютер");
            System.out.println("2. Добавить компьютер");
            System.out.println("3. Удалить последний вывод");
            System.out.println("4. Изменить последний сгенерированный компьютер");
            System.out.println("0. Выход");
            System.out.print("Введите номер команды: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateComputer(true); // Генерация нового компьютера
                    repository.listComputers(); // Вывод всех компьютеров
                    break;
                case 2:
                    generateComputer(false); // Добавление нового компьютера
                    repository.listComputers(); // Вывод всех компьютеров
                    break;
                case 3:
                    deleteLastOutput(); // Удаление последнего компьютера
                    repository.listComputers(); // Вывод всех компьютеров
                    break;
                case 4:
                    modifyLastGeneratedComputer(); // Изменение последнего компьютера
                    repository.listComputers(); // Вывод всех компьютеров
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Ошибка: неверный выбор. Попробуйте снова.");
            }
        }
    }

    // Генерация нового компьютера
    private void generateComputer(boolean replaceLast) {
        Computer newComputer = createRandomComputer();
        if (replaceLast && lastGeneratedIndex != -1) {
            repository.updateComputer(lastGeneratedIndex, newComputer); // Обновляем последний компьютер
        } else {
            repository.addComputer(newComputer); // Добавляем новый компьютер
            lastGeneratedIndex = repository.getComputers().size() - 1; // Сохраняем индекс
        }
        lastGeneratedComputer = newComputer; // Обновляем ссылку на последний компьютер
        System.out.println("Компьютер успешно сгенерирован:");
        newComputer.printInfo();
    }

    // Удаление последнего компьютера
    private void deleteLastOutput() {
        if (lastGeneratedIndex != -1) {
            repository.removeComputer(lastGeneratedIndex);
            lastGeneratedIndex = repository.getComputers().size() - 1; // Обновляем индекс
            lastGeneratedComputer = lastGeneratedIndex != -1
                    ? repository.getComputers().get(lastGeneratedIndex)
                    : null; // Обновляем последний компьютер
            System.out.println("Последний компьютер удален.");
        } else {
            System.out.println("Ошибка: нет компьютеров для удаления.");
        }
    }

    // Изменение последнего сгенерированного компьютера
    private void modifyLastGeneratedComputer() {
        if (lastGeneratedComputer != null) {
            Computer replacement = createRandomComputer(); // Генерируем новый компьютер
            repository.updateComputer(lastGeneratedIndex, new Computer(
                    replacement.getHardDrive(),
                    replacement.getRam(),
                    replacement.getDiskDrive(),
                    lastGeneratedComputer.isAvailable()
            ));
            System.out.println("Последний компьютер изменен.");
        } else {
            System.out.println("Ошибка: нет компьютеров для изменения.");
        }
    }

    // Метод для создания случайного компьютера
    private Computer createRandomComputer() {
        HardDrive hardDrive = new HardDrive((int) (Math.random() * 2000) + 500, Math.random() * 150 + 50);
        RAM ram = new RAM((int) (Math.random() * 32) + 4, Math.random() * 120 + 30);
        DiskDrive diskDrive = new DiskDrive(Math.random() > 0.5 ? "DVD" : "Blu-ray", Math.random() * 50 + 20);
        boolean isAvailable = Math.random() > 0.5;
        return new Computer(hardDrive, ram, diskDrive, isAvailable);
    }

    public static void main(String[] args) {
        ComputerMenu menu = new ComputerMenu();
        menu.start();
    }
}
