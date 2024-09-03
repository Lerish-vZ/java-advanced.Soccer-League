import java.util.HashMap;

public class Scoreboard {
    static HashMap <String, Integer> score = new HashMap<>(6);

    public void setScoreboard(String teamName) {
        score.put(teamName, 0);
    }

    public static void incScore(String teamName, int inc) {
        score.put(teamName, score.get(teamName) + inc);
    }

    public int getScore(String teamName) {
        return score.get(teamName);
    }

    public String getScoreboard(){
        return score.toString();
    }
}
