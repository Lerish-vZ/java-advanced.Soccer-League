import java.io.*;
import java.util.ArrayList;

public class Match {
    private ArrayList<String> match = new ArrayList<>();

    public void setMatch(String match) {
        this.match.add(match);
    }

    public ArrayList<String> getMatch() {
        return match;
    }
}
