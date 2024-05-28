/**
 * Represents an Item ordered by the Customer. Retrieves the type, name, and price
 * of an Item from the Product class.
 */
public class Item {

    // Fields
    private Product product;
    private String name;
    private float price;

    /**
     * Constructor for an Item object
     * @param product The type of product an Item Object is
     */
    public Item(Product product) {
        this.product = product;
        this.name = product.getName();
        this.price = product.getPrice();
    }

    /**
     * Getter method for name field
     * @return The name of an Item object
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method for price field
     * @return The price of an Item object
     */
    public float getPrice() {
        return this.price;
    }
}
