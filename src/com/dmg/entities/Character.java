package com.dmg.entities;

public class Character extends Card {
    private Integer hp;
    private Integer attack;
    private Integer defence;
    private Integer initiative;

    public Character(Integer iD, String name, String description, Integer hp, Integer attack, Integer defence, Integer initiative) {
        super(iD, name, description);
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.initiative = initiative;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    @Override
    public String toString() {
        return "--------------------" + '\n' +
                "iD: " + getiD() + '\n' +
                "Name: " + getName() + '\n' +
                "Description: " + getDescription() + '\n' +
                '\n' +
                "HP: " + getHp() + '\n' +
                "Attack: " + getAttack() + '\n' +
                "Defense: " + getDefence() + '\n' +
                "Initiative: " + getInitiative() + '\n' +
                "--------------------";
    }
}
