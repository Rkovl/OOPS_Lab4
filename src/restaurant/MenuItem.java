package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    private double priceInDollars;

    public MenuItem(String name, double price) {
        this.name = name;
        this.priceInDollars = price;
    }

    //returns the name of the menu item
    public String getName() {
        return name;
    }

    //returns the price of the menu item in dollars
    public double getPrice() {
        return priceInDollars;
    }
}
