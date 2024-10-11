```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsBoredTest {

    @Test
    void testIsBored1() {
        assertEquals(0, IsBored.isBored("Hello world"));
    }

    @Test
    void testIsBored2() {
        assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }

    @Test
    void testIsBored3() {
        assertEquals(0, IsBored.isBored("Hello world"));
    }

    @Test
    void testIsBored4() {
        assertEquals(0, IsBored.isBored("Is the sky blue?"));
    }

    @Test
    void testIsBored5() {
        assertEquals(1, IsBored.isBored("I love It !"));
    }

    @Test
    void testIsBored6() {
        assertEquals(0, IsBored.isBored("bIt"));
    }

    @Test
    void testIsBored7() {
        assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
    }

    @Test
    void testIsBored8() {
        assertEquals(0, IsBored.isBored("You and I are going for a walk"));
    }

    // Add more test cases as needed

}
```
```