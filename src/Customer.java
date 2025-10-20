package restaurant;
// Customer class
public class Customer {
    private String name; // initializing private variables of name and order
    private Order order;

// Initializing the constructor for the Customer class
    public Customer(String name) {
        this.name = name;
        this.order = new Order();  
    }

    public void addToOrder(MenuItem item) { 
        order.addItem(item);  // a method that takes in an instance of MenuItem item, then add it to the order
    }

    public void placeOrder() {
        System.out.println("Customer: " + name);
        order.printOrderDetails(); // a method that prints in the order details of the Customer
    }
}
