package cs380group1.sandwich_shop;

import java.util.ArrayList;

/**
 * Represents a manager of a specific store.
 */
public class Owner {

    // Fields
    private ArrayList<StoreManager> stores;

    /**
     * Constructor for an Owner object
     */
    public Owner() {
        this.stores = new ArrayList<>();
    }

    /**
     * Adds a new store to the owner's store list
     * @param storeManager Represents the store to add
     */
    public void addStore(StoreManager storeManager) {
        stores.add(storeManager);
    }

    /**
     * Removes a store from owner's store list
     * @param storeManager Represents the store to remove
     * @return True if the store was removed successfully, false otherwise
     */
    public boolean removeStore(StoreManager storeManager) {
        return  stores.remove(storeManager);
    }

    /**
     * Getter method for stores
     * @return The list of stores managed by owner
     */
    public ArrayList<StoreManager> getStores() {
        return new ArrayList<>(stores);
    }
}
