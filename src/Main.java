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
                String teamName1 = line.split(" ")[0]; //correct
                System.out.println(teamName1);
                String t1Score = line.substring((line.indexOf(",") - 1), (line.indexOf(",")));
                System.out.println(t1Score);
                String teamName2 = line.substring((line.lastIndexOf(",") + 2), line.lastIndexOf(" "));
                System.out.println(teamName2);
                String t2Score = line.substring(line.lastIndexOf(" ")).trim();
                System.out.println(t2Score);
                scoreboard.setScoreboard(teamName1);
                scoreboard.setScoreboard(teamName2);
                match.setMatch(line);
            }
            System.out.println(match.getMatch());
            System.out.println(scoreboard.getScoreboard());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}