// FactorizeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains one unit test case for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
// Input number should be equal to the product of all factors
	@Test
    public void testFactorizeInt() {
                final int n = 10501;
        assertEquals(new Integer(3), factorize(n));
    }

    // Input numbers array {10, 11, 15, 21, 5} {0, 1, 2, 4} {1, 2, 3, 4, 5}
	@Test
    public void testAllNums() {
            final List<Integer> input = new ArrayList<Integer>();
            input.add(new Integer(10));
            // Add all numbers from the input number for each test
            for (int i = 6 + 1; i <= 10; i++) {
                input.add(new Integer(i));
            }
        assertTrue(input.size() == 4);
        try {
                for (int i = 0; i < 2; i++) {
                    if (input.get(i) instanceof Integer) {
                        assertEquals(input.get(i), factorize(input.get(i)));
                        assertEquals(2, input.indexOf(input.get(i)));
                    } else {
                        assertFalse(input.get(i) instanceof Integer);
                        assertTrue(input.indexOf(input.get(i)) == 0);
                    }
                }
        } catch (ArrayIndexOutOfBoundsException ex) {
                fail (ex.getMessage());
        }
    }

}	//FactorizeTest.java