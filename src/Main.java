public class Main {
    public static void main(String[] args) {
        Team t1 = new Team(1);
        Team t2 = new Team(2);

        Battler p1 = new Battler("Tom", 1);
        p1.ATK = 15;
        p1.HP = 89;

        Battler p2 = new Battler("Pere", 2);
        p2.ATK = 22;
        p2.HP = 72;

        t1.addPlayer(p1);
        t2.addPlayer(p2);

        Game jeu = new Game(t1, t2);
        jeu.play();
    }
}
