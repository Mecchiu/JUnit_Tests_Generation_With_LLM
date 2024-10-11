// Iscube.java
package scenario1;

class Iscube {

    public static Boolean iscube(int a) {
        if (a < 0) {
            return iscube(-a);
        }
        int i = 0;
        while (i * i * i < a) {
            i++;
        }
        return i * i * i == a;
    }
}

// IscubeTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
    
    @Test
    void testPositiveCubes() {
        assertTrue(Iscube.iscube(1));
        assertTrue(Iscube.iscube(8));
        assertTrue(Iscube.iscube(27));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(125));
    }
    
    @Test
    void testNegativeCubes() {
        assertFalse(Iscube.iscube(-1));
        assertFalse(Iscube.iscube(-8));
        assertFalse(Iscube.iscube(-27));
        assertFalse(Iscube.iscube(-64));
        assertFalse(Iscube.iscube(-125));
    }
    
    @Test
    void testNonCubes() {
        assertFalse(Iscube.iscube(2));
        assertFalse(Iscube.iscube(10));
        assertFalse(Iscube.iscube(30));
        assertFalse(Iscube.iscube(50));
        assertFalse(Iscube.iscube(70));
    }
}