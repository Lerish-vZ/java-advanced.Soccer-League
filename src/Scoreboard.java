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

        List<Map.Entry<String, Integer>> list = new ArrayList<>(score.entrySet());

        list.sort((e1, e2) -> {
            int valueComparison = e2.getValue().compareTo(e1.getValue());
            /*
            In the line above, we are comparing the second entries value (in this case the points) to the first entries value. We do the second one first to order them in decending order.
            If value 2 > value 1 the valueComparison = 1; thus they put entry 2 in front of entry 1.
            If value 2 < value 1 the valueComparison = -1; thus it puts entry 1 in front of entry 2.
             */
            if(valueComparison == 0){
                return e1.getKey().compareTo(e2.getKey());
            }
            /*
            If value 2 == value 1 the valueComparison = 0. Now we want to sort it according to the keys in ascending order.
            thus we compare key 1 to key 2 and according to the number returned 1, -1, 0 it is ordered.
             */
            return valueComparison;
        });

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int rank = 1;

        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                display +=  "\n" + rank + ". " + "\n" + entry.getKey() + " " + entry.getValue() + "\n";
                rank++;
            }
        System.out.println(display);
        }

    }

