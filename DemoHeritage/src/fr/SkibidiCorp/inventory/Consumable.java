package fr.SkibidiCorp.inventory;

public class Consumable extends Item {
    public void use() {
        System.out.println("Using " + name);
    }
}
