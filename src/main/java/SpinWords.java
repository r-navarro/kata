public class SpinWords {

    public String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();

        for (String s : sentence.split("\\s")) {
            if (s.length() >= 5) {
                StringBuilder toReverse = new StringBuilder(s);
                result.append(toReverse.reverse().toString()).append(" ");
            } else {
                result.append(s).append(" ");
            }
        }
        return result.toString().trim();
    }
}
