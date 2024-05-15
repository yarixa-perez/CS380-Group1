// author: Mohammed Mohideen
// class that can manage orders

import java.util.ArrayList;

public class OrderManager{

   private ArrayList<Order> orderList;
   
   public OrderManager(){
      orderList = new ArrayList<Order>();
   }
   
   public void addOrder(Order order) {
      orderList.add(order);
   }

   public void removeOrder(Order order) {
      orderList.remove(order);
   }
   
   public void editOrder(Order order) {}
   
   public Order getOrder(int orderNumber) {
      for (Order order : orderList) {
         if (order.getOrderNumber() == orderNumber) {
            return order;
         }
      }
      return null; 
   }

}