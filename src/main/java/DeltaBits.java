public class DeltaBits {
    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }

    public static int convertBits2(int a, int b) {
        String biggerBinary = (a > b) ? Integer.toString(a, 2) : Integer.toString(b, 2);
        String lowerBinary = (a < b) ? Integer.toString(a, 2) : Integer.toString(b, 2);

        int diff = 0;
        int lowerIndex = lowerBinary.length() - 1;
        for (int i = biggerBinary.length() - 1; i >= 0; i--) {
            char charBig = biggerBinary.charAt(i);
            char charLow = (lowerIndex < 0) ? '0' : lowerBinary.charAt(lowerIndex);
            if (charBig != charLow) diff++;
            lowerIndex--;
        }

        return diff;
    }
}
