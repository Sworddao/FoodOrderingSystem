package models;

import java.util.ArrayList;

public class Order {
    ArrayList<TableOrder> tableOrders;

    public ArrayList<TableOrder> getTableOrders() {
        return tableOrders;
    }

    public void setTableOrders(ArrayList<TableOrder> tableOrders) {
        this.tableOrders = tableOrders;
    }

    public Order(ArrayList<TableOrder> tableOrders) {
        this.tableOrders = tableOrders;
    }

    public void getBill() {
        ArrayList<TableOrder> orderList = this.tableOrders;
        int totalBill = 0;
        System.out.println("Getting Bill........");
        for (TableOrder order : orderList) {
            int itemTotal = order.getQuantity() * order.getItem().getPrice();
            System.out.println(order.getItem().getName() + " x " + order.getQuantity() + " = " + itemTotal);
            totalBill += itemTotal;
        }
        System.out.println("Total Bill: " + totalBill);
    }
}
