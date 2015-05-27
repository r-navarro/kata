import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StairTests {
    @Test
    public void test1() {
        assertEquals(6, new Stairs().NumberOfSteps(10, 2));
    }

    @Test
    public void test2() {
        assertEquals(-1, new Stairs().NumberOfSteps(3, 5));
    }

    @Test
    public void test3() {
        assertEquals(2, new Stairs().NumberOfSteps(2, 2));
    }

    @Test
    public void test4() {
        assertEquals(-1, new Stairs().NumberOfSteps(1, 2));
    }
}