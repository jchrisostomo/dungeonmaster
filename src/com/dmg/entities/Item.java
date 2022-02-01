package com.dmg.entities;

public class Item extends Card {
    private Integer price;

    public Item(Integer iD, String name, String description, Integer price) {
        super(iD, name, description);
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Card{" +
                "iD=" + getiD() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Item{" +
//                "price=" + price +
//                '}';
//    }
}
