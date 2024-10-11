// GenerateIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
	// Test case 1: Test with a = 1 and b = 10
    @Test
    void testGenerateIntegers1() {
        int a = 1;
        int b = 10;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 2: Test with a = 10 and b = 1
    @Test
    void testGenerateIntegers2() {
        int a = 10;
        int b = 1;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 3: Test with a = 2 and b = 8
    @Test
    void testGenerateIntegers3() {
        int a = 2;
        int b = 8;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 4: Test with a = 8 and b = 2
    @Test
    void testGenerateIntegers4() {
        int a = 8;
        int b = 2;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 5: Test with a = 1 and b = 1
    @Test
    void testGenerateIntegers5() {
        int a = 1;
        int b = 1;
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 6: Test with a = 10 and b = 10
    @Test
    void testGenerateIntegers6() {
        int a = 10;
        int b = 10;
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 7: Test with a = 2 and b = 2
    @Test
    void testGenerateIntegers7() {
        int a = 2;
        int b = 2;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 8: Test with a = 8 and b = 8
    @Test
    void testGenerateIntegers8() {
        int a = 8;
        int b = 8;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 9: Test with a = 0 and b = 0
    @Test
    void testGenerateIntegers9() {
        int a = 0;
        int b = 0;
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }

    // Test case 10: Test with a = -1 and b = -10
    @Test
    void testGenerateIntegers10() {
        int a = -1;
        int b = -10;
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(a, b));
    }
}
