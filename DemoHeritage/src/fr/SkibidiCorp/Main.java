package fr.SkibidiCorp;

import fr.SkibidiCorp.Character;
import fr.SkibidiCorp.inventory.Consumable;
import fr.SkibidiCorp.inventory.Inventory;
import fr.SkibidiCorp.inventory.Item;
import fr.SkibidiCorp.inventory.Material;
import fr.SkibidiCorp.inventory.Equipment;
import fr.SkibidiCorp.inventory.Weapon;


public class Main {

    public static void main(String[] args) {
        // Creer un inventaire
        Inventory inventory = new Inventory();

        // Creer deux items
        Material crystal = new Material();
        crystal.name = "Crystal";

        Consumable potion = new Consumable();
        potion.name = "Potion de vie";

        // Les ajouter dans l'inventaire
        inventory.items.add(crystal);
        inventory.items.add(potion);

        // Afficher l'inventaire
        for (Item item : inventory.items) {
            // Afficher le nom de l'item
            System.out.println(item.name);

            // Tester que l'Item (parentClass, baseClass) est un Material
            // Tester que l'enfant de la class (childClass) Item est un Material
            if (item instanceof Material) {
                System.out.println("La c'est un Material");
            }

            // Tester que c'est un Consumable
            if (item instanceof Consumable) {
                // Récupérer la version consumable de l'item
                // Caster l'item en Consumable pour l'exploiter
                // Version en deux temps
                Consumable consumable = (Consumable) item;
                consumable.use();

                // Version en une seule ligne
                // ((Consumable) item).use();
            }
        }
        ///SUITE : Créer perso et donner des équipements
        Character skibidi = new Character();
        skibidi.pseudo = "skibidi";

        //Associer l'inventaire dans le character
        skibidi.inventory = inventory;

        //Créer un équipement
        Weapon bonk = new Weapon();
        bonk.name = "Baton Bonk";
        bonk.attributes = new int[]{20, 999};

        //Associer l'équipement à Skibidi
        skibidi.equipitem(bonk);

        for (Equipment equipment : skibidi.equipments) {
            if (equipment instanceof Weapon) {
                Weapon weapon = (Weapon) equipment;
                System.out.println("L'arme "+weapon.name+" fait "+weapon.getDamage()+" dégats");
            }
        }

    }
}