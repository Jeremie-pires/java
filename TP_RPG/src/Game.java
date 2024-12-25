import java.util.Random;

public class Game {
    public Team t1;
    public Team t2;
    public Random random = new Random();

    public Game(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public int chooseFirstPlayer() {
        return random.nextInt(2) + 1;
    }

    public void play() {
        int currentTurn = chooseFirstPlayer();

        while (!t1.isLoose() && !t2.isLoose()) {
            Battler attacker;
            Battler defender;

            if (currentTurn == 1) {
                attacker = t1.getPlayers().get(0);
                defender = t2.getPlayers().get(0);
                currentTurn = 2; // Change le tour
            } else {
                attacker = t2.getPlayers().get(0);
                defender = t1.getPlayers().get(0);
                currentTurn = 1;
            }

            playRound(attacker, defender);
        }

        if (t1.isLoose()) {
            System.out.println("L'équipe 2 gagne");
        } else {
            System.out.println("L'équipe 1 gagne");
        }
    }

    public void playRound(Battler attacker, Battler defender) {
        attacker.attaque();
        defender.defense();
        defender.looseHP(attacker.ATK);
    }
}
