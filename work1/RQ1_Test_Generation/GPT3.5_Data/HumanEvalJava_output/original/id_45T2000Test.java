```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    void testTriangleArea_case1() {
        assertEquals(7.5, TriangleArea.triangleArea(5, 3));
    }

    @Test
    void testTriangleArea_case2() {
        assertEquals(2.0, TriangleArea.triangleArea(2, 2));
    }

    @Test
    void testTriangleArea_case3() {
        assertEquals(40.0, TriangleArea.triangleArea(10, 8));
    }

    // Add more test cases as needed
}
```
