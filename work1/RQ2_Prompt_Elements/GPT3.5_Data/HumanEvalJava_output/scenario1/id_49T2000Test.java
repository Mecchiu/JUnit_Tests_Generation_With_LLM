Here's the code for the ModpTest class with ten unit test cases for the modp method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModpTest {

    @Test
    void testModp1() {
        assertEquals(1, Modp.modp(0, 5));
    }

    @Test
    void testModp2() {
        assertEquals(2, Modp.modp(1, 5));
    }

    @Test
    void testModp3() {
        assertEquals(4, Modp.modp(2, 5));
    }

    @Test
    void testModp4() {
        assertEquals(3, Modp.modp(3, 5));
    }

    @Test
    void testModp5() {
        assertEquals(1, Modp.modp(4, 5));
    }

    @Test
    void testModp6() {
        assertEquals(1, Modp.modp(5, 5));
    }

    @Test
    void testModp7() {
        assertEquals(2, Modp.modp(6, 5));
    }

    @Test
    void testModp8() {
        assertEquals(4, Modp.modp(7, 5));
    }

    @Test
    void testModp9() {
        assertEquals(3, Modp.modp(8, 5));
    }

    @Test
    void testModp10() {
        assertEquals(1, Modp.modp(9, 5));
    }
}
```

These test cases cover a range of inputs and expected outputs for the modp method.