public class ProdFib {

    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long tmp = a;
            a = b;
            b = tmp + b;
        }
        return new long[]{a, b, a * b == prod ? 1 : 0};
    }

    public static long fibo3(long n) {
        double goldNumber = (1 + Math.sqrt(5)) / 2;

        double fibo = (Math.pow(goldNumber, n) / Math.sqrt(5));

        return (int) Math.round(fibo);
    }

}