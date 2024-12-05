import java.util.ArrayList;
import java.util.List;

public class ComputerRepository {
    private List<Computer> computers;

    public ComputerRepository() {
        this.computers = new ArrayList<>();
    }

    // Добавление компьютера
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: ");
        computer.printInfo();
    }

    // Удаление компьютера по индексу
    public void removeComputer(int index) {
        if (index >= 0 && index < computers.size()) {
            Computer removedComputer = computers.remove(index);
            System.out.println("Удален компьютер: ");
            removedComputer.printInfo();
        } else {
            System.out.println("Ошибка: Неверный индекс.");
        }
    }

    // Обновление компьютера по индексу
    public void updateComputer(int index, Computer newComputer) {
        if (index >= 0 && index < computers.size()) {
            computers.set(index, newComputer);
            System.out.println("Компьютер обновлен: ");
            newComputer.printInfo();
        } else {
            System.out.println("Ошибка: Неверный индекс.");
        }
    }

    // Получение списка всех компьютеров
    public void listComputers() {
        System.out.println("Список всех компьютеров:");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println("Индекс: " + i);
            computers.get(i).printInfo();
            System.out.println();
        }
    }
}
