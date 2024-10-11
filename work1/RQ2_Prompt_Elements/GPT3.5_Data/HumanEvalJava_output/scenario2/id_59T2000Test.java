Here's the code for the test class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @Test
    void testLargestPrimeFactor() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(100));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(196));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(2310));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(1859));
        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(40834));
        assertEquals(19, LargestPrimeFactor.largestPrimeFactor(361));
        assertEquals(23, LargestPrimeFactor.largestPrimeFactor(3915));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
        assertEquals(31, LargestPrimeFactor.largestPrimeFactor(200560490));
        assertEquals(37, LargestPrimeFactor.largestPrimeFactor(123456789));
    }
}
```

This test class contains ten unit test cases for the `largestPrimeFactor` method of the `LargestPrimeFactor` class. Each test case calls the method with a different input value and checks that the output is correct using the `assertEquals` method from the JUnit library.