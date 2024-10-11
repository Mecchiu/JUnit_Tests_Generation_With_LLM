```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleArea1Test {

    @Test
    void testTriangleAreaValidTriangle() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
        assertEquals(8.18, TriangleArea1.triangleArea(4, 8, 5));
        assertEquals(1.73, TriangleArea1.triangleArea(2, 2, 2));
        assertEquals(16.25, TriangleArea1.triangleArea(10, 5, 7));
        assertEquals(0.43, TriangleArea1.triangleArea(1, 1, 1));
    }

    @Test
    void testTriangleAreaInvalidTriangle() {
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 10));
        assertEquals(-1, TriangleArea1.triangleArea(1, 2, 3));
        assertEquals(-1, TriangleArea1.triangleArea(2, 6, 3));
        assertEquals(-1, TriangleArea1.triangleArea(2, 2, 10));
    }
}
```
