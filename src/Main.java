import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scoreboard scoreboard = new Scoreboard();
    static Match match = new Match();

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\lerishav\\ownCloud - lerishav@cloud.zylex.co.za\\Documents\\All my work\\Code College\\7_Java_Advanced\\Java_Advanced_Projects\\SoccerLeague\\src\\Soccer_Matches.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String teamName1 = line.split(" ")[0]; //correct
                String t1Score = line.substring((line.indexOf(",") - 1), (line.indexOf(",")));
                String teamName2 = line.substring((line.lastIndexOf(",") + 2), line.lastIndexOf(" "));
                String t2Score = line.substring(line.lastIndexOf(" ")).trim();
                scoreboard.setScoreboard(teamName1);
                scoreboard.setScoreboard(teamName2);
                match.setMatch(teamName1, teamName2, t1Score, t2Score);
            }
            System.out.println(match.getMatch());
            System.out.println(scoreboard.getScoreboard());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }



        System.out.println(scoreboard.getScoreboard());
    }

    public static void calcScore(String team1, String score1, String team2, String score2) {
//        int iScore1 = Integer.parseInt(score1);
//        int iScore2 = Integer.parseInt(score2);

        if(iScore1 == iScore2){
            scoreboard.incScore(team1, 1);
            scoreboard.incScore(team2, 1);
        } else if(iScore1 > iScore2){
            scoreboard.incScore(team1, 3);
        } else if(iScore1 < iScore2){
            scoreboard.incScore(team2, 3);
        }
    }
}