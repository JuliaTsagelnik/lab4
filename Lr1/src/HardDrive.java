public class HardDrive {
    private int size; // Размер винчестера в ГБ
    private double price; // Цена винчестера

    public HardDrive(int size, double price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HardDrive: " + size + " GB, price: $" + price;
    }
}
