package cs380group1.sandwich_shop;

/**
 * Represent a product offered by the business. Contains all relevant info about a product
 * as well as its availability.
 */
public class Product {
    private int idNumber;
    private String name, description, type;
    private float price;
    private boolean available = true;

    /**
     * Constructor for product
     * @param id product ID number for indexing in the system
     * @param n product name/title
     * @param des a description of the product
     * @param t the type of the product
     * @param pri the price of the product
     */
    public Product(int id, String n, String des, float pri) {
        idNumber = id;
        name = n;
        description = des;
        price = pri;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
