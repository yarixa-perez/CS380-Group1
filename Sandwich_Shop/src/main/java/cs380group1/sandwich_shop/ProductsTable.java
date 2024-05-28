package cs380group1.sandwich_shop;

import java.util.HashMap;

/**
 * Holds a Hashmap that maps product categories to their String types.
 */
public class ProductsTable {
    private HashMap<String, ProductsOfType> productTypes = new HashMap<>();

    public ProductsTable() {

    }

    /**
     * Add a product type to the productTypes hashmap mapped to the given String type
     * @param type The name of the product type, used to map the product type.
     */
    public void addProductType(String type) {
        productTypes.put(type, new ProductsOfType(type));
    }

    /**
     * Adds a product to a given product type category.
     * @param product Product to be added.
     * @param type Product type to be added to.
     * @throws NullPointerException If the given type does not exist in the hashmap, throw an exception.
     */
    public void addProduct(Product product, String type) throws NullPointerException{
        ProductsOfType productsOfType = productTypes.get(type);

        if(productsOfType == null) {
            throw new NullPointerException("Type does not exist!");
        }

        productsOfType.addProduct(product);
    }

    /**
     * Get the ProductsOfType objects as an array. Used when displaying available products.
     * @return Array of ProductsOfType.
     */
    public ProductsOfType[] getProductTypes() {
        return (ProductsOfType[]) productTypes.values().toArray();
    }

}
