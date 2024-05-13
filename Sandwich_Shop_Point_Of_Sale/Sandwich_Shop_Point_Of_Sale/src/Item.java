
public class Item {

    // Fields
    private ProductType type;
    private String name;
    private float price;


    /**
     * Constructor for an Item object
     * @param type The type of product an Item object
     * @param name The name of an Item object
     * @param price The price of an Item object
     */
    public Item(ProductType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter method for an Item's name
     * @return The name of an Item object
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for an Item's type
     * @return An ItemType enum value (Side, Drink, Sandwich)
     */
    public ProductType getType() {
        return type;
    }

    /**
     * Getter method for an Item's price
     * @return The price of an Item object
     */
    public float getPrice() {
        return price;
    }
}
