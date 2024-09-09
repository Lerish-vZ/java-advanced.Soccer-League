import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scoreboard scoreboard = new Scoreboard();
    static Match match = new Match();

    public static void main(String[] args) {
        int count = 0;
        try {
            File file = new File("C:\\Users\\lerishav\\ownCloud - lerishav@cloud.zylex.co.za\\Documents\\All my work\\Code College\\7_Java_Advanced\\Java_Advanced_Projects\\SoccerLeague\\src\\Soccer_Matches.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                count++;
                String line = sc.nextLine();
                String teamName1 = line.split(" ")[0];
                String t1Score = line.substring((line.indexOf(",") - 1), (line.indexOf(",")));
                String teamName2 = line.substring((line.lastIndexOf(",") + 2), line.lastIndexOf(" "));
                String t2Score = line.substring(line.lastIndexOf(" ")).trim();

                //match function in scoreboard calculate the points, match send integer and teamname back
                //check if team is in hashmap, if not add team with points, if not

                scoreboard.setScoreboard(teamName1);
                scoreboard.setScoreboard(teamName2);

                match.setMatch(teamName1, teamName2, t1Score, t2Score);
            }
            match.setScore(count);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
        scoreboard.getScoreboard();
    }

}
