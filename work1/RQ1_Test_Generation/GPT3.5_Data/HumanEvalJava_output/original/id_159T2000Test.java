```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EatTest {

    @Test
    void testEat1() {
        List<Integer> result = Eat.eat(5, 6, 10);
        assertEquals(Arrays.asList(11, 4), result);
    }

    @Test
    void testEat2() {
        List<Integer> result = Eat.eat(4, 8, 9);
        assertEquals(Arrays.asList(12, 1), result);
    }

    @Test
    void testEat3() {
        List<Integer> result = Eat.eat(1, 10, 10);
        assertEquals(Arrays.asList(11, 0), result);
    }

    @Test
    void testEat4() {
        List<Integer> result = Eat.eat(2, 11, 5);
        assertEquals(Arrays.asList(7, 0), result);
    }

    @Test
    void testEat5() {
        List<Integer> result = Eat.eat(4, 5, 7);
        assertEquals(Arrays.asList(9, 2), result);
    }

    @Test
    void testEat6() {
        List<Integer> result = Eat.eat(4, 5, 1);
        assertEquals(Arrays.asList(5, 0), result);
    }

    // Add more test cases as needed

}
```
```