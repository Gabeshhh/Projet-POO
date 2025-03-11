import java.util.ArrayList;
import java.util.List;

public class Cart {
    private User user;
    private List<Product> items;

    public Cart(User user) {
        this.user = user;
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getItems() {
        return items;
    }
}
