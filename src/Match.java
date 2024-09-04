import java.io.*;
import java.util.ArrayList;

public class Match {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList <String> teams = new ArrayList<>();

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
}
