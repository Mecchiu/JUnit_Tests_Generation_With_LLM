```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DerivativeTest {

    @Test
    void testDerivative1() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(1);
        input.add(2);
        input.add(4);
        input.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(12);
        expected.add(20);
        assertEquals(expected, Derivative.derivative(input));
    }

    @Test
    void testDerivative2() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(6);
        assertEquals(expected, Derivative.derivative(input));
    }

    @Test
    void testDerivative3() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(2);
        input.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected, Derivative.derivative(input));
    }

    @Test
    void testDerivative4() {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(2);
        input.add(1);
        input.add(0);
        input.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(0);
        expected.add(16);
        assertEquals(expected, Derivative.derivative(input));
    }

    @Test
    void testDerivative5() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Derivative.derivative(input));
    }
}
```
