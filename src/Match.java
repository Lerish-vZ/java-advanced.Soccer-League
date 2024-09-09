import java.io.*;
import java.util.ArrayList;

public class Match {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList <String> teams = new ArrayList<>();

    static Scoreboard scoreboard = new Scoreboard();


    public void setMatch(String team1, String team2, String score1, String score2) {
        teams.add(team1);
        scores.add(Integer.parseInt(score1));
        scores.add(Integer.parseInt(score2));
        teams.add(team2);

    }
    public ArrayList<String> getTeamNames(){
        return teams;
    }

    public ArrayList<Integer> getScores(){
        return scores;
    }

    public String getMatch(){
        String match = "";
        for (int i = 0; i < scores.size(); i++) {
            match += teams.get(i) + " " + scores.get(i) + " ";
        }
        return match;
    }

    public void setScore(int numMatches){
        int j = 0;
        int k = 1;
    for (int i = 0; i <= (numMatches - 1); i++) {
        if (scores.get(j) == scores.get(k)) {
            scoreboard.incScore(teams.get(j), 1);
            scoreboard.incScore(teams.get(k), 1);
        } else if (scores.get(j) > scores.get(k)) {
            scoreboard.incScore(teams.get(j), 3);
        } else if (scores.get(j) < scores.get(k)) {
            scoreboard.incScore(teams.get(k), 3);
        }
        j += 2;
        k += 2;
    }

    }
}
