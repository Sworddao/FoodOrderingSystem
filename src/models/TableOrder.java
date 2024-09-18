package models;

public class TableOrder {
    public Item item;
    public int quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TableOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
}
