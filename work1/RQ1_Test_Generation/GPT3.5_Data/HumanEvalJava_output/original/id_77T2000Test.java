```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IscubeTest {

    @Test
    void testIsCube1() {
        assertTrue(Iscube.iscube(1));
    }

    @Test
    void testIsCube2() {
        assertFalse(Iscube.iscube(2));
    }

    @Test
    void testIsCubeNegative1() {
        assertTrue(Iscube.iscube(-1));
    }

    @Test
    void testIsCube64() {
        assertTrue(Iscube.iscube(64));
    }

    @Test
    void testIsCube180() {
        assertFalse(Iscube.iscube(180));
    }

    @Test
    void testIsCube1000() {
        assertTrue(Iscube.iscube(1000));
    }

    @Test
    void testIsCube0() {
        assertTrue(Iscube.iscube(0));
    }

    @Test
    void testIsCube1729() {
        assertFalse(Iscube.iscube(1729));
    }
}
```
