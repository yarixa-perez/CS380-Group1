package cs380group1.sandwich_shop;

import java.util.HashMap;
import java.util.Set;

/**
 * A class to hold a hashmap of products mapped to their IDs
 * of a specific type. Product type is assigned when they are
 * added to a ProductsOfType.
 */
public class ProductsOfType {
    private String type;
    private HashMap<Integer, Product> products = new HashMap<>();

    /**
     * Constructor that takes a type
     * @param t the type of products to be stored
     */
    public ProductsOfType(String t) {
        type = t;
    }

    /**
     * Adds a product to this ProductsOfType and sets it type to this type
     * @param product product to be added
     */
    public void addProduct(Product product) {
        products.put(Integer.valueOf(product.getIdNumber()), product);
        product.setType(type);
    }

    /**
     * Gets a product based on its ID number
     * @param id ID of the product to be retrieved
     * @return the product
     */
    public Product getProduct(int id) {
        return products.get(id);
    }

    /**
     * Get the set of Products contained in the products map as an array of Products
     * @return array of Products
     */
    public Product[] getProducts() {
        return (Product[]) products.values().toArray();
    }


}
