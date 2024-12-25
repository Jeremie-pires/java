public class DemoArray {
    public static void main(String[] args) {
        //Creér un tableau d'attributs
        int[] attributes = new int[3];
        attributes[0] = 300;
        attributes[1] = 27;
        attributes[2] = 50;

        //================================================================
        //Partie 2
        //Itération sur un tableau
        for (int i = 0; i < attributes.length; i++) {
            System.out.println(String.format("Attribut %d : %d", i, attributes[i]));
        }

        for (int att : attributes) {
            System.out.println(String.format("Attribut : %d", att));
        }
    }
}