public class DiskDrive {
    private String type; // Тип дисковода
    private double price; // Цена дисковода

    public DiskDrive(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "DiskDrive: " + type + ", price: $" + price;
    }
}
