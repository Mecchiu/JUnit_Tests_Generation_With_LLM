// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

	/**
	* Test case 1.
	* The input list is [1, 2, 3].
	* The expected output is 6.
	*/
	@Test
	void testSumSquares1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		int expected = 6;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list is [1, 4, 9].
	* The expected output is 14.
	*/
	@Test
	void testSumSquares2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(4);
		lst.add(9);
		int expected = 14;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list is [].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares3() {
		List<Object> lst = new ArrayList<Object>();
		int expected = 0;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list is [1, 1, 1, 1, 1, 1, 1, 1, 1].
	* The expected output is 9.
	*/
	@Test
	void testSumSquares4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		int expected = 9;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list is [-1, -1, -1, -1, -1, -1, -1, -1, -1].
	* The expected output is -3.
	*/
	@Test
	void testSumSquares5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		int expected = -3;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list is [0].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		int expected = 0;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list is [-1, -5, 2, -1, -5].
	* The expected output is -126.
	*/
	@Test
	void testSumSquares7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-5);
		lst.add(2);
		lst.add(-1);
		lst.add(-5);
		int expected = -126;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list is [-56, -99, 1, 0, -2].
	* The expected output is 3030.
	*/
	@Test
	void testSumSquares8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-56);
		lst.add(-99);
		lst.add(1);
		lst.add(0);
		lst.add(-2);
		int expected = 3030;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list is [-1, 0, 0, 0, 0, 0, 0, 0, -1].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(0);
		lst.add(-1);
		int expected = 0;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list is [-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37].
	* The expected output is -14196.
	*/
	@Test
	void testSumSquares10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-16);
		lst.add(-9);
		lst.add(-2);
		lst.add(36);
		lst.add(36);
		lst.add(26);
		lst.add(-20);
		lst.add(25);
		lst.add(-40);
		lst.add(20);
		lst.add(-4);
		lst.add(12);
		lst.add(-26);
		lst.add(35);
		lst.add(37);
		int expected = -14196;
		int actual = SumSquares1.sumSquares(lst);
		assertEquals(expected, actual);
	}
}

// SumSquares2.java
package original;

import java.util.ArrayList;
import java.util.List;

class SumSquares2 {

    /**
     * "
     * This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a
     * multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not
     * change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries.
     *
     * Examples:
     * For lst = [1,2,3] the output should be 6
     * For lst = []  the output should be 0
     * For lst = [-1,-5,2,-1,-5]  the output should be -126
     *
     * > sumSquares([1, 2, 3])
     * 6
     * > sumSquares([1, 4, 9])
     * 14
     * > sumSquares([])
     * 0
     * > sumSquares([1, 1, 1, 1, 1, 1, 1, 1, 1])
     * 9
     * > sumSquares([-1, -1, -1, -1, -1, -1, -1, -1, -1])
     * -3
     * > sumSquares([0])
     * 0
     * > sumSquares([-1, -5, 2, -1, -5])
     * -126
     * > sumSquares([-56, -99, 1, 0, -2])
     * 3030
     * > sumSquares([-1, 0, 0, 0, 0, 0, 0, 0, -1])
     * 0
     * > sumSquares([-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37])
     * -14196
     * > sumSquares([-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10])
     * -1448
     */
    public static int sumSquares(List<Object> lst) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add((int) lst.get(i) * (int) lst.get(i));
            } else if (i % 4 == 0 && i % 3 != 0) {
                result.add((int) lst.get(i) * (int) lst.get(i) * (int) lst.get(i));
            } else {
                result.add((int) lst.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }
}

// SumSquares2Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares2}.
* It contains ten unit test cases for the {@link SumSquares2#sumSquares(List)} method.
*/
class SumSquares2Test {
		
	/**
	* Test case 1.
	* The input list is [1, 2, 3].
	* The expected output is 6.
	*/
	@Test
	void testSumSquares1() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		int expected = 6;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list is [1, 4, 9].
	* The expected output is 14.
	*/
	@Test
	void testSumSquares2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(4);
		lst.add(9);
		int expected = 14;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list is [].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares3() {
		List<Object> lst = new ArrayList<Object>();
		int expected = 0;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list is [1, 1, 1, 1, 1, 1, 1, 1, 1].
	* The expected output is 9.
	*/
	@Test
	void testSumSquares4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		lst.add(1);
		int expected = 9;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list is [-1, -1, -1, -1, -1, -1, -1, -1, -1].
	* The expected output is -3.
	*/
	@Test
	void testSumSquares5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		lst.add(-1);
		int expected = -3;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list is [0].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		int expected = 0;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list is [-1, -5, 2, -1, -5].
	* The expected output is -126.
	*/
	@Test
	void testSumSquares7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-5);
		lst.add(2);
		lst.add(-1);
		lst.add(-5);
		int expected = -126;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list is [-56, -99, 1, 0, -2].
	* The expected output is 3030.
	*/
	@Test
	void testSumSquares8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(-56);
		lst.add(-99);
		lst.add(1);
		lst.add(0);
		lst.add(-2);
		int expected = 3030;
		int actual = SumSquares2.sumSquares(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list is [-1, 0, 0, 0, 0, 0, 0, 0, -1].
	* The expected output is 0.
	*/
	@Test
	void testSumSquares9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add