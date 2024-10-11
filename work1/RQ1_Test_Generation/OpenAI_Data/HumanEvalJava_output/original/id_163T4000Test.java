// GenerateIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	@Test
	void testGenerateIntegers() {
		List<Object> expected = new ArrayList<>();
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
		assertEquals(expected, GenerateIntegers.generateIntegers(10, 2));
		assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
		assertEquals(new ArrayList<>(), GenerateIntegers.generateIntegers(17, 89));
	}
}

// GenerateIntegers.java
package refactored;

import java.util.ArrayList;
import java.util.List;

class GenerateIntegers {

    /**
     * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.
     *
     * For example:
     * generateIntegers(2, 8) => [2, 4, 6, 8]
     * generateIntegers(8, 2) => [2, 4, 6, 8]
     * generateIntegers(10, 14) => []
     *
     * > generateIntegers(2, 10)
     * [2, 4, 6, 8]
     * > generateIntegers(10, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(132, 2)
     * [2, 4, 6, 8]
     * > generateIntegers(17, 89)
     * []
     */
    public static List<Object> generateIntegers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));
        List<Object> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
}

// GenerateIntegersTest.java
package refactored;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
		
	@Test
	void testGenerateIntegers() {
		List<Object> expected = new ArrayList<>();
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
		assertEquals(expected, GenerateIntegers.generateIntegers(10, 2));
		assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
		assertEquals(new ArrayList<>(), GenerateIntegers.generateIntegers(17, 89));
	}
}