// GenerateIntegers.java
package scenario3;

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
    public static List<Integer> generateIntegers(int a, int b) {
        List<Integer> result = new ArrayList<>();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    result.add(i);
                    break;
                }
                num /= 10;
            }
        }
        return result;
    }
}

// GenerateIntegersTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
    
    @Test
    void testGenerateIntegers1() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers2() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(8, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers3() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 14);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers4() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers5() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers6() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers7() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GenerateIntegers.generateIntegers(17, 89);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers8() {
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(0, 8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers9() {
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        List<Integer> actual = GenerateIntegers.generateIntegers(8, 0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers10() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GenerateIntegers.generateIntegers(1, 1);
        assertEquals(expected, actual);
    }
}