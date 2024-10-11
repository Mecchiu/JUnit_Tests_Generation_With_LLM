```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModpTest {

    @Test
    void testModpCase1() {
        assertEquals(3, Modp.modp(3, 5));
    }

    @Test
    void testModpCase2() {
        assertEquals(2, Modp.modp(1101, 101));
    }

    @Test
    void testModpCase3() {
        assertEquals(1, Modp.modp(0, 101));
    }

    @Test
    void testModpCase4() {
        assertEquals(8, Modp.modp(3, 11));
    }

    @Test
    void testModpCase5() {
        assertEquals(1, Modp.modp(100, 101));
    }

    @Test
    void testModpCase6() {
        assertEquals(3, Modp.modp(30, 5));
    }

    @Test
    void testModpCase7() {
        assertEquals(3, Modp.modp(31, 5));
    }

    // Add more test cases as needed
}
```
