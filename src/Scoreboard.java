import java.util.HashMap;

public class Scoreboard {
    HashMap <String, Integer> score = new HashMap<>(6);
    
    public Scoreboard(String teamName) {
        score.put(teamName, 0);
    }

    public void incScore(String teamName, int inc) {

    }

    
}
