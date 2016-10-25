import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {

    @Test
    public void MathTest() {
        assertThat(2 + 2, is(4));
    }
}
