import java.util.List;

public class Order {
    private static int orderCounter = 1;
    private int orderID;
    private User user;
    private List<Product> items;
    private String status;

    public Order(User user, List<Product> items) {
        this.orderID = orderCounter++;
        this.user = user;
        this.items = items;
        this.status = "Processing";
        user.addOrder(this);
    }

    public void placeOrder() {
        for (Product product : items) {
            product.updateStock(1);
        }
        System.out.println("Commande #" + orderID + " passée avec succès.");
    }

    @Override
    public String toString() {
        return "Commande #" + orderID + " - Statut: " + status;
    }
}
