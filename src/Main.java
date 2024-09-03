import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        Match match = new Match();
        try {
            File file = new File("C:\\Users\\lerishav\\ownCloud - lerishav@cloud.zylex.co.za\\Documents\\All my work\\Code College\\7_Java_Advanced\\Java_Advanced_Projects\\SoccerLeague\\src\\Soccer_Matches.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                scoreboard.setScoreboard(Arrays.toString(line.split(" ")));
                match.setMatch(line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}