import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Random random = new Random();
        Team t1 = new Team(1);
        Team t2 = new Team(2);

        Battler p1 = new Battler("Tom", 1);
        p1.ATK = random.nextInt(40)+1;
        p1.HP = random.nextInt(150)+1;

        Battler p2 = new Battler("Pere", 2);
        p2.ATK = random.nextInt(40)+1;
        p2.HP = random.nextInt(150)+1;

        t1.addPlayer(p1);
        t2.addPlayer(p2);

        Game jeu = new Game(t1, t2);
        System.out.println("Stats du joueur 1 : ");
        System.out.println("ATK : "+p1.ATK+"  HP : "+p1.HP);
        System.out.println("Stats du joueur 2 : ");
        System.out.println("ATK : "+p2.ATK+"  HP : "+p2.HP);
        System.out.println("----------------------------------------------------");
        jeu.play();
    }
}
