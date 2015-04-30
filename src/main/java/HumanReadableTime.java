
public class HumanReadableTime {

    public static String makeReadable(int seconds) {

        StringBuilder result = new StringBuilder();
        int min = seconds / 60;
        seconds = seconds % 60;
        int hour = min / 60;
        min = min % 60;

        result.append(String.format("%02d", hour)).append(":").append(String.format("%02d", min)).append(":").append(String.format("%02d", seconds));

        return result.toString();
    }
}
