public class Main {

    public static void main(String[] args)
    {
        System.out.println("Coucou !");

        // Creer deux character

        // Char 1
        Character char1 = new Character("Jean-Fredo");
        char1.attributes = new int[2];

        // Char 2
        Character char2 = new Character();
        char2.setPseudo("Todo");
        char2.attributes = new int[5];

        // Deux creer deux equipes (deux party)
        Party party1 = new Party();
        party1.name = "Equipe 1";

        Party party2 = new Party();
        party2.name = "Equipe 2";

        // Creer BattleGame
        BattleGame battleGame = new BattleGame();
        battleGame.timeLimit = 46.4f;

    }
}