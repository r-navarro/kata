public class CircleSorted {

    public boolean isCircleSorted(int[] a) {
        int permutation = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[(i == 0 ? a.length : i) - 1] > a[i]) {
                permutation++;
            }
        }

        return permutation <= 1;
    }

    public boolean isCircleSorted2(int[] a) {
        boolean permutation = false;
        int permutationPoint = -1;
        for (int i = 0; i < a.length - 1; i++) {
            int point = a[i];
            int nextPoint = a[i + 1];
            if (point > nextPoint) {
                if (permutation) {
                    return false;
                }
                if (nextPoint > a[0]) {
                    return false;
                }
                permutation = true;
                permutationPoint = i;
            } else if (permutation && (nextPoint > a[permutationPoint])) {
                return false;
            }
        }
        return true;
    }
}
