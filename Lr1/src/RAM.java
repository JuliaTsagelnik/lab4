public class RAM {
    private int size; // Размер ОЗУ в ГБ
    private double price; // Цена ОЗУ

    public RAM(int size, double price) {
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
        return "RAM: " + size + " GB, price: $" + price;
    }
}
