public class Computer {
    private HardDrive hardDrive;
    private RAM ram;
    private DiskDrive diskDrive;
    private boolean isManualAssembly; // Флаг для ручной сборки
    private boolean isOn; // Состояние компьютера

    public Computer(HardDrive hardDrive, RAM ram, DiskDrive diskDrive, boolean isManualAssembly) {
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.diskDrive = diskDrive;
        this.isManualAssembly = isManualAssembly;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Компьютер включен.");
        } else {
            System.out.println("Компьютер уже включен.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Компьютер выключен.");
        } else {
            System.out.println("Компьютер уже выключен.");
        }
    }

    public void checkForViruses() {
        if (isOn) {
            System.out.println("Проверка на вирусы завершена. Вирусы не найдены.");
        } else {
            System.out.println("Компьютер выключен. Включите его для проверки на вирусы.");
        }
    }

    public void printHardDriveSize() {
        System.out.println("Размер винчестера: " + hardDrive.getSize() + " ГБ.");
    }

    public void printInfo() {
        System.out.println("Информация о компьютере:");
        System.out.println(hardDrive);
        System.out.println(ram);
        System.out.println(diskDrive);
        System.out.println("Ручная сборка: " + (isManualAssembly ? "Да" : "Нет"));
    }

    public double getTotalPrice() {
        return hardDrive.getPrice() + ram.getPrice() + diskDrive.getPrice();
    }

    public boolean isManualAssembly() {
        return isManualAssembly;
    }

    public void upgradeHardDrive(HardDrive newHardDrive) {
        this.hardDrive = newHardDrive;
        System.out.println("Жесткий диск был обновлен до: " + hardDrive);
    }

    public void upgradeRAM(RAM newRAM) {
        this.ram = newRAM;
        System.out.println("ОЗУ было обновлено до: " + ram);
    }

    public void upgradeDiskDrive(DiskDrive newDiskDrive) {
        this.diskDrive = newDiskDrive;
        System.out.println("Дисковод был обновлен до: " + diskDrive);
    }
}
