import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
        if (listOfBallots.size() == 1) return listOfBallots.get(0);
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : listOfBallots) {
            if (map.containsKey(s)) {
                int count = map.get(s) + 1;
                if (count > (listOfBallots.size() / 2)) {
                    return s;
                }
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }

        return null;
    }
}