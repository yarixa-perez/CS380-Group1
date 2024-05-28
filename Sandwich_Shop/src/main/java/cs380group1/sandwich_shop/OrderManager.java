package cs380group1.sandwich_shop;

// author: Mohammed Mohideen
// class that can manage orders

import java.util.ArrayList;

public class OrderManager{

   // array list of orders
   private ArrayList<Order> orderList;
   
   // constructor
   public OrderManager(){
      orderList = new ArrayList<Order>();
   }
   
    /**
     * Adds an order to the order list
     * @param order Order to add to list.
     */
   public void addOrder(Order order) {
      orderList.add(order);
   }
   
    /**
     * Removes an order from the order list
     * @param order Order to remove from the list.
     */
   public void removeOrder(Order order) {
      orderList.remove(order);
   }
   
    /**
     * Replaces an order in the list with an updated order
     * @param order Order to update
     */
   public void editOrder(Order updatedOrder) {
      for (int i = 0; i < orderList.size(); i++) {
         Order currentOrder = orderList.get(i);
         if (currentOrder.getOrderNumber() == updatedOrder.getOrderNumber()) {
            orderList.set(i, updatedOrder);
            return;
         }
      }
   }
   
    /**
     * Accesses an order from the list
     * @return Returns order details
     * @param order Order to access
     */
   public Order getOrder(int orderNumber) {
      for (Order order : orderList) {
         if (order.getOrderNumber() == orderNumber) {
            return order;
         }
      }
      return null; 
   }

}