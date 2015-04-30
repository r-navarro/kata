import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void testtrue() throws Exception {
        CircleSorted calc = new CircleSorted();

        int[] A = {3, 0, 1, 2};
        assertEquals(true, calc.isCircleSorted(A));
        assertEquals(true, calc.isCircleSorted(new int[]{2, 3, 4, 5, 0, 1}));
        assertEquals(true, calc.isCircleSorted(new int[]{4, 5, 6, 9, 1}));
        assertEquals(true, calc.isCircleSorted(new int[]{10, 11, 6, 7, 9}));
        assertEquals(true, calc.isCircleSorted(new int[]{1, 2, 3, 4, 5}));
        assertEquals(true, calc.isCircleSorted(new int[]{5, 7, 43, 987, -9, 0}));

    }

    @Test
    public void testfalse() throws Exception {
        CircleSorted calc = new CircleSorted();
        int[] A = {9, 10, 14, 12};
        assertEquals(false, calc.isCircleSorted(A));
        assertEquals(false, calc.isCircleSorted(new int[]{4, 1, 2, 5}));
        assertEquals(false, calc.isCircleSorted(new int[]{8, 7, 6, 5, 4, 3}));
        assertEquals(false, calc.isCircleSorted(new int[]{6, 7, 4, 8}));
        assertEquals(false, calc.isCircleSorted(new int[]{7, 6, 5, 4, 3, 2, 1}));
    }
}
