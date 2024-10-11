```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizzBuzz_50() {
        assertEquals(0, FizzBuzz.fizzBuzz(50));
    }

    @Test
    void testFizzBuzz_78() {
        assertEquals(2, FizzBuzz.fizzBuzz(78));
    }

    @Test
    void testFizzBuzz_79() {
        assertEquals(3, FizzBuzz.fizzBuzz(79));
    }

    @Test
    void testFizzBuzz_100() {
        assertEquals(3, FizzBuzz.fizzBuzz(100));
    }

    @Test
    void testFizzBuzz_200() {
        assertEquals(6, FizzBuzz.fizzBuzz(200));
    }

    @Test
    void testFizzBuzz_4000() {
        assertEquals(192, FizzBuzz.fizzBuzz(4000));
    }

    @Test
    void testFizzBuzz_10000() {
        assertEquals(639, FizzBuzz.fizzBuzz(10000));
    }

    @Test
    void testFizzBuzz_100000() {
        assertEquals(8026, FizzBuzz.fizzBuzz(100000));
    }

    // Add more test cases as needed

}
```
```