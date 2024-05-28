package cs380group1.sandwich_shop;

/**
 * Represents an Item ordered by the Customer. Retrieves the type, name, and price
 * of an Item from the Product class.
 */
public class Item {

    // Fields
    private String name;
    private float price;

    /**
     * Constructor for an Item object
     * @param name The name of an Item object
     * @param price The price of an Item object
     */
    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Getter method for name field
     * @return The name of an Item object
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for price field
     * @return The price of an Item object
     */
    public float getPrice() {
        return price;
    }
}
