package models;

public class Item {
    public String name;
    public int price;
    Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Item(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
