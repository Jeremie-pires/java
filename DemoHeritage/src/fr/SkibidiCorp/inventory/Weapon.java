package fr.SkibidiCorp.inventory;

public class Weapon extends Equipment {
    /*
     * Retourne les dégats de l'arme
     * @return
     */
    public int getDamage() {
        return attributes[1];
    }
}
