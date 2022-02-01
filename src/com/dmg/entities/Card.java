package com.dmg.entities;

public class Card {
    private Integer iD;
    private String name;
    private String description;

    public Card(Integer iD, String name, String description) {
        this.iD = iD;
        this.name = name;
        this.description = description;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Card{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
