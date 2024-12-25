public class Main {
    public static void main(String[] args)
    {
        //Démo variables primitives
        int hp = 300;
        boolean isAlive = true;
        float atkPercent = 0.5f;

        //Calcul
        hp = hp - 200;

        //Afficher du texte formaté
        System.out.println(String.format("HP : %d", hp));

        //============================================
        //Partie 2

        float hpDivide = (float) hp /  300f;
        System.out.println(String.format("HP : %f", hpDivide));

    }
}