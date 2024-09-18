import java.util.ArrayList;
import models.Item;
import models.Category;
import models.TableOrder;
import models.Order;

public class Main {
    public static void main(String[] args) {

        // Creating categories
        Category c1 = new Category("Momo", "Momo food");
        Category c2 = new Category("Fish", "Fish food");

        // Creating items
        Item i1 = new Item("Momo", 120, c1);
        Item i2 = new Item("Fish", 180, c2);

        // Creating table orders
        TableOrder to1 = new TableOrder(i1, 4);
        TableOrder to2 = new TableOrder(i2, 5);

        // Adding table orders to the order list
        ArrayList<TableOrder> tableOrders = new ArrayList<>();
        tableOrders.add(to1);
        tableOrders.add(to2);

        // Creating the final order
        Order order = new Order(tableOrders);

        // Getting the total bill
        order.getBill();
    }
}
