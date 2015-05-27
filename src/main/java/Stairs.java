public class Stairs {

    public static int NumberOfSteps(int n, int m) {
        int nimStepCount = n / 2 + n % 2;

        while (nimStepCount != n && nimStepCount % m != 0) {
            nimStepCount++;
        }
        return (nimStepCount % m != 0) ? -1 : nimStepCount;
    }

    public static int NumberOfSteps2(int n, int m) {
        if (n == 1) return -1;
        int stairsBy2Count = n / 2;
        int stairBy1 = n % 2;

        int nimStepCount = stairsBy2Count + stairBy1;
        int maxStepCount = nimStepCount * 2;

        while (nimStepCount <= maxStepCount) {
            if (nimStepCount % m == 0) return nimStepCount;
            nimStepCount++;
        }

        return -1;
    }
}