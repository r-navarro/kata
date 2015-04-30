import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DeltaBitsTest {

    @Test
    public void test() throws Exception {
        assertThat(DeltaBits.convertBits(31, 14), is(2));

        assertThat(DeltaBits.convertBits(7, 17), is(3));

        assertThat(DeltaBits.convertBits(138436433, 1940692804), is(16));

        assertThat(DeltaBits.convertBits(312312312, 5645657), is(13));

        assertThat(DeltaBits.convertBits(279034796, 1447389656), is(15));
    }
}
