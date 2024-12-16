public class HardDrive {
    private int capacity; // in GB
    private double speed; // in MB/s

    public HardDrive(int capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public String getInfo() {
        return "Capacity: " + capacity + "GB, Speed: " + speed + "MB/s";
    }
}
