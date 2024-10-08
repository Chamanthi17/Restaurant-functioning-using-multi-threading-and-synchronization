package Restaurantfolder;

import java.util.ArrayList;
import java.util.Collections;

public class OrderList {
     private static ArrayList<Order> orders = new ArrayList<>();

    public synchronized static Order getOrder(){
        if(orders.size() == 0)
            return null;
        Order order = orders.remove(0);
        return order;
    }

    public synchronized static void addOrder(Order order){
        orders.add(order);
        Collections.sort(orders);
        OrderList.class.notifyAll();
    }
}
