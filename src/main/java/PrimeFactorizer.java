import java.util.HashMap;

public class PrimeFactorizer {

    public java.util.Map<Long, Integer> factor(long n) {
        java.util.Map<Long, Integer> result = new HashMap<Long, Integer>();
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            addToMap(2L, result);
            n = n / 2;
        }

        // n must be odd at this point.  So we can skip one element (Note i = i +2)
        for (long i = 3; i <= Math.sqrt(n); i = i + 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                addToMap(i, result);
                n = n / i;
            }
        }

        // This condition is to handle the case when n is a prime number
        // greater than 2
        if (n > 2) {
            addToMap(n, result);
        }

        return result;
    }

    private void addToMap(Long key, java.util.Map<Long, Integer> map) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
