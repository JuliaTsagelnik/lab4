public class DiskDrive {
    private String type; // DVD or Blu-ray
    private double speed; // in MB/s

    public DiskDrive(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getInfo() {
        return "Type: " + type + ", Speed: " + speed + "MB/s";
    }
}
