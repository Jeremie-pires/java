public class Character {

    private String pseudo;
    public int[] attributes;

    public Character() {

    }

    public Character(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * Encapsulation
     * Le pseudo est private pour forcer les dev
     * à modifier le pseudo uniquement en passant par un fonction
     * @param value
     */
    public void setPseudo(String value) {
        pseudo = value;

        System.out.println("Le pseudo a été modifié");
    }
}