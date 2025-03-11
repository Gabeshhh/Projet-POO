public class Main {
    public static void main(String[] args) {
        // Création d'un utilisateur
        User user = new User("Alice", "alice@example.com", "password123");

        // Création de produits
        Product laptop = new Product("Laptop", 101, 1200.00, 5);
        Product phone = new Product("Phone", 102, 800.00, 10);

        // Affichage des détails des produits
        System.out.println(laptop.getProductDetails());
        System.out.println(phone.getProductDetails());

        // Création du panier et ajout de produits
        Cart cart = new Cart(user);
        cart.addProduct(laptop);
        cart.addProduct(phone);

        // Affichage du total
        System.out.println("Total du panier : " + cart.calculateTotal() + "€");

        // Création et validation de la commande
        Order order = new Order(user, cart.getItems());
        order.placeOrder();

        // Affichage de l'historique des commandes
        user.viewOrderHistory();
    }
}
