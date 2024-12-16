public class RAM {
    private int size; // in GB
    private double speed; // in MHz

    public RAM(int size, double speed) {
        this.size = size;
        this.speed = speed;
    }

    public String getInfo() {
        return "Size: " + size + "GB, Speed: " + speed + "MHz";
    }
}
