public class Keypad {

    private static String[] keys = new String[]{"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

    public static int presses(String phrase) {
        int result = 0;
        for (char c : phrase.toCharArray()) {
            String s = (c + "").toUpperCase();
            for (String key : keys) {
                if (key.contains(s)) {
                    result += key.indexOf(s) + 1;
                }
            }
        }
        return result;
    }
}
