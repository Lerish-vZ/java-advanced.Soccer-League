import java.util.HashMap;

public class Scoreboard {
    static HashMap <String, Integer> score = new HashMap<>(6);
    public static Integer points = 0;
    public void setScoreboard(String teamName) {
        score.put(teamName, points);
    }

    public static void incScore(String teamName, int inc) {
        points = score.get(teamName);
        points += inc;
        score.put(teamName, points);
    }

    public int getScore(String teamName) {
        return score.get(teamName);
    }

    public String getScoreboard(){
        return score.toString();
    }
}