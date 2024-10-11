```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightAngleTriangleTest {

    @Test
    void testRightAngleTriangle_3_4_5() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void testRightAngleTriangle_1_2_3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle_10_6_8() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(10, 6, 8));
    }

    @Test
    void testRightAngleTriangle_2_2_2() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 2));
    }

    @Test
    void testRightAngleTriangle_7_24_25() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(7, 24, 25));
    }

    @Test
    void testRightAngleTriangle_10_5_7() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(10, 5, 7));
    }

    @Test
    void testRightAngleTriangle_5_12_13() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    @Test
    void testRightAngleTriangle_15_8_17() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(15, 8, 17));
    }

    @Test
    void testRightAngleTriangle_48_55_73() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(48, 55, 73));
    }

    @Test
    void testRightAngleTriangle_1_1_1() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 1));
    }

    @Test
    void testRightAngleTriangle_2_2_10() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(2, 2, 10));
    }
}
```
