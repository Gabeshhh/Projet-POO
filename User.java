import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    private List<Order> orderHistory;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public void viewOrderHistory() {
        System.out.println("Historique des commandes de " + username + ":");
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    public String getUsername() {
        return username;
    }
}
