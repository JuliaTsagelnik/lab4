public class Main {
    public static void main(String[] args) {
        // Создаем несколько компьютеров
        Computer[] computers = new Computer[10];
        computers[0] = new Computer(new HardDrive(500, 50), new RAM(8, 30), new DiskDrive("DVD", 20), true);
        computers[1] = new Computer(new HardDrive(1000, 100), new RAM(16, 60), new DiskDrive("Blu-ray", 40), false);
        computers[2] = new Computer(new HardDrive(2000, 200), new RAM(32, 120), new DiskDrive("DVD", 20), true);
        computers[3] = new Computer(new HardDrive(500, 50), new RAM(8, 30), new DiskDrive("Blu-ray", 40), false);
        computers[4] = new Computer(new HardDrive(750, 75), new RAM(12, 45), new DiskDrive("DVD", 20), true);
        computers[5] = new Computer(new HardDrive(1500, 150), new RAM(24, 90), new DiskDrive("Blu-ray", 40), true);
        computers[6] = new Computer(new HardDrive(1000, 100), new RAM(16, 60), new DiskDrive("DVD", 20), false);
        computers[7] = new Computer(new HardDrive(2000, 200), new RAM(32, 120), new DiskDrive("Blu-ray", 40), true);
        computers[8] = new Computer(new HardDrive(750, 75), new RAM(12, 45), new DiskDrive("DVD", 20), false);
        computers[9] = new Computer(new HardDrive(1500, 150), new RAM(24, 90), new DiskDrive("Blu-ray", 40), true);

        // Выводим информацию о каждом компьютере
        for (Computer computer : computers) {
            computer.printInfo();
            System.out.println();
        }

        // Выводим компьютеры, которые были собраны вручную
        System.out.println("Компьютеры, собранные вручную:");
        for (Computer computer : computers) {
            if (computer.isManualAssembly()) {
                computer.printInfo();
            }
        }

        // Находим самый выгодный компьютер
        Computer bestValueComputer = computers[0];
        for (Computer computer : computers) {
            if (computer.getTotalPrice() < bestValueComputer.getTotalPrice()) {
                bestValueComputer = computer;
            }
        }

        System.out.println("Самый выгодный компьютер:");
        bestValueComputer.printInfo();
    }
}
