package cs380group1.sandwich_shop;

//ColdCutCoders
//Justin Jakahi

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Order {
    // Person taking order
    private Employee cashier;
    // Customer Name/ID(?)
    private Customer customer;
    // Discount
    private float discountMult;
    // Items in Order
    private ArrayList<Item> items;
    // Date of Order
    private LocalDateTime orderDate;
    // Order ID - for tracking in database
    private int orderNumber;
    private int cashierNum;
    private int customerNum;
    private float total;

    // Order Constructor
    public Order(Employee cashier, Customer customer, float discountMult, int orderNumber) {
        this.cashier = cashier;
        this.customer = customer;
        this.discountMult = discountMult;
        this.items = new ArrayList<Item>();
        this.orderDate = LocalDateTime.now(); // Current date and time
        this.orderNumber = orderNumber;
    }
    public void setOrderDate(LocalDateTime orderDate){
        this.orderDate = orderDate;
    }
    public void setOrderNum(int orderNumber){
        this.orderNumber = orderNumber;
    }
    public void setCashierNum(int cashierNum){
        this.cashierNum = cashierNum;
    }
    public void setCustomerNum(int customerNum){
        this.customerNum = customerNum;
    }
    public void setTotal(float total){
        this.total = total;
    }
    public Order() {

    }

    /**
     * Calculates the total price of the order, with discount applied.
     * @return Returns total price of order, as a decimal number.
     */
    public float getTotal() {
        float total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        // Apply discount
        total *= discountMult;
        return total;
    }

    /**
     * Adds an item to the order, given an Item object.
     * @param item An Item object.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Adds an item to the order, given a ProductType object.
     * @param product A ProductType object.
     */
    public void addItem(Product product) {
        // Create Item object from productType and add to items
        // Assuming ProductType has a getPrice() method
        Item item = new Item(product.getName(), product.getPrice());
        items.add(item);
    }

    /**
     * Removes an item from the order.
     * @param item Item to remove.
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Returns a list of items in the order.
     * @return Returns a list of items on the order.
     */
    public ArrayList<Item> orderList(){
        return items;
    }

    // Other methods can be added as needed
}
