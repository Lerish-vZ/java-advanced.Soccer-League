import java.io.*;
import java.util.ArrayList;

public class Match {
    private ArrayList<String> match = new ArrayList<>();

    public void setMatch(String team1, String team2, String score1, String score2) {
        this.match.add(("Match: " + team1 + " " + score1 + " | " + team2 + " " + score2));
    }

    public ArrayList<String> getMatch() {
        return match;
    }
}
