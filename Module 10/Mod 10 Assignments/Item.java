public class Item {
    private String name;
    private int productNumber;
    private double price;
    private int quantity;

    public Item(String name, int productNumber, double price, int quantity) {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%-20s%-20d$%-20.2f%-20d", name, productNumber, price, quantity);
    }
}
