public class Product {
    private String productName;
    private int productID;
    private double price;
    private int stockQuantity;

    public Product(String productName, int productID, double price, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void updateStock(int quantity) {
        this.stockQuantity -= quantity;
    }

    public String getProductDetails() {
        return productName + " - " + price + "€ (Stock: " + stockQuantity + ")";
    }
}
