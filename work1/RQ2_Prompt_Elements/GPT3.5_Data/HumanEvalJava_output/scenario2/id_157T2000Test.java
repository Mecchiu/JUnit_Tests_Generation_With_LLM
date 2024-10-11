Here's the code for the test class:

```
class RightAngleTriangleTest {

    @Test
    void testRightAngleTriangle1() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    @Test
    void testRightAngleTriangle2() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
    }

    @Test
    void testRightAngleTriangle3() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }

    @Test
    void testRightAngleTriangle4() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
    }

    @Test
    void testRightAngleTriangle5() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(0, 0, 0));
    }

    @Test
    void testRightAngleTriangle6() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(-1, -2, -3));
    }

    @Test
    void testRightAngleTriangle7() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 2, 4));
    }

    @Test
    void testRightAngleTriangle8() {
        assertTrue(RightAngleTriangle.rightAngleTriangle(6, 8, 10));
    }

    @Test
    void testRightAngleTriangle9() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(3, 4, 6));
    }

    @Test
    void testRightAngleTriangle10() {
        assertFalse(RightAngleTriangle.rightAngleTriangle(1, 1, 2));
    }
}
```

This test class contains ten test cases for the `rightAngleTriangle` method of the `RightAngleTriangle` class. Each test case tests a different scenario and checks whether the method returns the expected result. The `assertTrue` and `assertFalse` methods are used to check whether the method returns `true` or `false`, respectively.