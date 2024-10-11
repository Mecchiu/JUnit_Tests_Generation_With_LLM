// IscubeTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Iscube}.
 * It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
 */
class IscubeTest {

    @Test
    void testPositiveCube() {
        assertTrue(Iscube.iscube(8));
    }

    @Test
    void testNegativeCube() {
        assertFalse(Iscube.iscube(-8));
    }

    @Test
    void testZero() {
        assertTrue(Iscube.iscube(0));
    }

    @Test
    void testOne() {
        assertTrue(Iscube.iscube(1));
    }

    @Test
    void testLargeCube() {
        assertTrue(Iscube.iscube(19683));
    }

    @Test
    void testSmallCube() {
        assertTrue(Iscube.iscube(27));
    }

    @Test
    void testNonCube() {
        assertFalse(Iscube.iscube(10));
    }

    @Test
    void testMaxValue() {
        assertFalse(Iscube.iscube(Integer.MAX_VALUE));
    }

    @Test
    void testMinValue() {
        assertFalse(Iscube.iscube(Integer.MIN_VALUE));
    }

    @Test
    void testEdgeCase() {
        assertTrue(Iscube.iscube(1000000));
    }
}