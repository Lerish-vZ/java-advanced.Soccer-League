import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\lerishav\\ownCloud - lerishav@cloud.zylex.co.za\\Documents\\All my work\\Code College\\7_Java_Advanced\\Java_Advanced_Projects\\SoccerLeague\\src\\Soccer_Matches.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Match match = new Match(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}