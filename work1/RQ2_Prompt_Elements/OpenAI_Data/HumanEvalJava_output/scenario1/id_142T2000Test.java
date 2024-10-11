// SumSquares1Test.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
	// Test case 1: Test with empty list
    @Test
    void testSumSquares1() {
        List<Object> lst = new ArrayList<Object>();
        int result = SumSquares1.sumSquares(lst);
        assertEquals(0, result);
    }

    // Test case 2: Test with list of one element
    @Test
    void testSumSquares2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(2, result);
    }

    // Test case 3: Test with list of two elements
    @Test
    void testSumSquares3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(11, result);
    }

    // Test case 4: Test with list of three elements
    @Test
    void testSumSquares4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(27, result);
    }

    // Test case 5: Test with list of four elements
    @Test
    void testSumSquares5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(38, result);
    }

    // Test case 6: Test with list of five elements
    @Test
    void testSumSquares6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(74, result);
    }

    // Test case 7: Test with list of six elements
    @Test
    void testSumSquares7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(123, result);
    }

    // Test case 8: Test with list of seven elements
    @Test
    void testSumSquares8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(219, result);
    }

    // Test case 9: Test with list of eight elements
    @Test
    void testSumSquares9() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(328, result);
    }

    // Test case 10: Test with list of nine elements
    @Test
    void testSumSquares10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        int result = SumSquares1.sumSquares(lst);
        assertEquals(478, result);
    }
}
