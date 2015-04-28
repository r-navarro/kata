import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("This is rehtona test", new SpinWords().spinWords("This is another test"));
    }
}
