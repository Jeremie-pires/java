public class Battler {
    public String name;
    public int HP;
    public int ATK;
    public int teamID;
    public boolean attacker = false;
    public boolean defender = false;

    public Battler(String name, int teamID) {
        this.name = name;
        this.teamID = teamID;
    }

    public int getTeamId() {
        return teamID;
    }

    public void attaque() {
        attacker = true;
        defender = false;
    }

    public void defense() {
        attacker = false;
        defender = true;
    }

    public void looseHP(int atk) {
        this.HP -= atk;
        System.out.println(name + " a perdu " + atk + " HP. HP restants : " + this.HP);
    }

    public boolean isAlive() {
        return this.HP > 0;
    }
}
