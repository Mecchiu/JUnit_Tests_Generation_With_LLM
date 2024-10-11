Here's the code for the `LargestPrimeFactorTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @Test
    void testLargestPrimeFactor() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(10));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(49));
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(9));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(110));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(169));
        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(680));
        assertEquals(19, LargestPrimeFactor.largestPrimeFactor(969));
        assertEquals(23, LargestPrimeFactor.largestPrimeFactor(529));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
    }
}
```

This test class contains ten unit test cases for the `largestPrimeFactor` method of the `LargestPrimeFactor` class. Each test case uses the `assertEquals` method to compare the expected result with the actual result of calling the `largestPrimeFactor` method with a specific input value.