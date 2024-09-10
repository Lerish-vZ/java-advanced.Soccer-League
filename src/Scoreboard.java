import java.util.*;

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

    public void getScoreboard() {
        String display = "League Resulst: \n";

                LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : score.entrySet()) { //populates list with points
            list.add(entry.getValue());
        }
        Collections.sort(list);

        for (int num = list.getLast(); num >= 0; num--) {
            for (Map.Entry<String, Integer> entry : score.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        int rank = 1;

        Iterator it = sortedMap.entrySet().iterator();
        it.next();

        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                display +=  "\n" + rank + ". " + "\n" + entry.getKey() + " " + entry.getValue() + "\n";
                rank++;
            }
        System.out.println(display);
        }
        
    }

