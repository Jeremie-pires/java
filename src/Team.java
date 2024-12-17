import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Battler> players = new ArrayList<>();
    private int id;

    public Team(int id) {
        this.id = id;
    }

    public void addPlayer(Battler p) {
        if (p.getTeamId() == this.id) {
            players.add(p);
        }
    }

    public List<Battler> getPlayers() {
        return players;
    }

    public boolean isLoose() {
        for (Battler player : players) {
            if (player.isAlive()) {
                return false;
            }
        }
        return true;
    }
}
