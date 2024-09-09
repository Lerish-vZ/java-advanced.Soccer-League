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
        while (it.hasNext()) {

            String info = it.next().toString();
            String name = info.split("=")[0];
            int point = Integer.parseInt(info.split("=")[1]);

            for(int i = 0; i <= sortedMap.size(); i++) {
                String infoN = it.next().toString();
                String name2 = infoN.split("=")[0];
                int point2 = Integer.parseInt(infoN.split("=")[1]);

                if (point == point2) {
                    display += rank + ". " + name + " " + point + " & " + name2 + " " + point2;
                } else {
                    display += "\n" + rank + ". " + name + " " + point + "\n";
                    rank++;
                    break;
                }
            }

//            ArrayList<String> teams = new ArrayList<>(sortedMap.keySet());
//            ArrayList<Integer> points = new ArrayList<>(sortedMap.values());
//
//            for(int i = 0; i <= (points.size() - 1); i++) {
//                for (int j = 1; j <= points.size(); j++) {
//                    if (points.get(i).equals(points.get(j))) {
//                        display += rank + ". " + teams.get(i) + " " + points.get(i) + " & " + teams.get(j) + points.get(j) + "\n";
//                    } else {
//                        display += rank + ". " + teams.get(i) + " " + points.get(i) + "\n";
//                        rank++;
//                    }
//                    it.next();
//                }
//           }
        }

        System.out.println(display);
        System.out.println(sortedMap);
    }
}