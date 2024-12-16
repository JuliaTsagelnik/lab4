public class Computer {
    private HardDrive hardDrive;
    private RAM ram;
    private DiskDrive diskDrive;
    private boolean isAvailable;

    public Computer(HardDrive hardDrive, RAM ram, DiskDrive diskDrive, boolean isAvailable) {
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.diskDrive = diskDrive;
        this.isAvailable = isAvailable;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public RAM getRam() {
        return ram;
    }

    public DiskDrive getDiskDrive() {
        return diskDrive;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void printInfo() {
        System.out.println("Hard Drive: " + hardDrive.getInfo());
        System.out.println("RAM: " + ram.getInfo());
        System.out.println("Disk Drive: " + diskDrive.getInfo());
        System.out.println("Availability: " + (isAvailable ? "Yes" : "No"));
    }
}
