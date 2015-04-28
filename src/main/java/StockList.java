import java.util.HashMap;
import java.util.Map;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : lstOfArt) {
            String letter = s.split("\\s")[0].substring(0, 1);
            int value = Integer.valueOf(s.split("\\s")[1]);
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + value);
            } else {
                map.put(letter, value);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String s = lstOf1stLetter[i];
            result.append("(").append(s).append(" : ");
            if (map.get(s) != null) {
                result.append(map.get(s));
            } else {
                result.append(0);
            }

            result.append(")");
            if ((i + 1) < lstOf1stLetter.length) {
                result.append(" - ");
            }
        }

        return result.toString();
    }

}

