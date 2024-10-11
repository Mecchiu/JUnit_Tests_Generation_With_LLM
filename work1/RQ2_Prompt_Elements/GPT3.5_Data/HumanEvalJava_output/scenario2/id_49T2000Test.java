Here's the code for the ModpTest class with ten unit test cases for the modp method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModpTest {

    @Test
    void testModp1() {
        assertEquals(1, Modp.modp(0, 7));
    }

    @Test
    void testModp2() {
        assertEquals(2, Modp.modp(1, 7));
    }

    @Test
    void testModp3() {
        assertEquals(4, Modp.modp(2, 7));
    }

    @Test
    void testModp4() {
        assertEquals(1, Modp.modp(3, 7));
    }

    @Test
    void testModp5() {
        assertEquals(2, Modp.modp(4, 7));
    }

    @Test
    void testModp6() {
        assertEquals(4, Modp.modp(5, 7));
    }

    @Test
    void testModp7() {
        assertEquals(1, Modp.modp(6, 7));
    }

    @Test
    void testModp8() {
        assertEquals(2, Modp.modp(7, 7));
    }

    @Test
    void testModp9() {
        assertEquals(4, Modp.modp(8, 7));
    }

    @Test
    void testModp10() {
        assertEquals(1, Modp.modp(9, 7));
    }
}
```

These test cases cover a range of inputs for the modp method and ensure that it returns the expected output for each input.