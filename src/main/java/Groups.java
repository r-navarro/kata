import java.util.ArrayList;
import java.util.List;

public class Groups {


    public static boolean groupCheck(String s) {
        int length;
        do {
            length = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");

        } while (length != s.length());

        return s.length() == 0;
    }


    public static boolean groupCheck2(String s) {
        List<Character> chars = new ArrayList<Character>();
        for (Character c : s.toCharArray()) {
            try {
                if (c == ')' && chars.get(chars.size() - 1) == '(') {
                    chars.remove(chars.size() - 1);
                } else if (c == '}' && chars.get(chars.size() - 1) == '{') {
                    chars.remove(chars.size() - 1);
                } else if (c == ']' && chars.get(chars.size() - 1) == '[') {
                    chars.remove(chars.size() - 1);
                } else {
                    chars.add(c);
                }
            } catch (Exception e) {
                return false;
            }
        }
        return chars.isEmpty();
    }

}