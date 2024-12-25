package fr.SkibidiCorp;

import fr.SkibidiCorp.inventory.Equipment;
import fr.SkibidiCorp.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Character {
    public String pseudo;
    public Inventory inventory;
    public List<Equipment> equipments = new ArrayList<Equipment>();


    /**
     * Sert à équiper un item
     * @param equipment l'item à équiper
     */
    public void equipitem(Equipment equipment) {
        equipments.add(equipment);
        System.out.println("Equipped " + equipment.name);
    }
}
