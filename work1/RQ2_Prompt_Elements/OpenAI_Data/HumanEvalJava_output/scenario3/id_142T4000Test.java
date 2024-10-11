// SumSquares1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

	@Test
	void testSumSquares1() {
		List<Object> lst = List.of(1, 2, 3);
		assertEquals(6, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares2() {
		List<Object> lst = List.of(1, 4, 9);
		assertEquals(14, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares3() {
		List<Object> lst = List.of();
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares4() {
		List<Object> lst = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertEquals(9, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares5() {
		List<Object> lst = List.of(-1, -1, -1, -1, -1, -1, -1, -1, -1);
		assertEquals(-3, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares6() {
		List<Object> lst = List.of(0);
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares7() {
		List<Object> lst = List.of(-1, -5, 2, -1, -5);
		assertEquals(-126, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares8() {
		List<Object> lst = List.of(-56, -99, 1, 0, -2);
		assertEquals(3030, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares9() {
		List<Object> lst = List.of(-1, 0, 0, 0, 0, 0, 0, 0, -1);
		assertEquals(0, SumSquares1.sumSquares(lst));
	}
	
	@Test
	void testSumSquares10() {
		List<Object> lst = List.of(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
		assertEquals(-14196, SumSquares1.sumSquares(lst));
	}
}

// SumSquares2.java
package scenario3;

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
    }
}

// SumSquares2Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares2}.
* It contains ten unit test cases for the {@link SumSquares2#sumSquares(List)} method.
*/
class SumSquares2Test {
		
	@Test
	void testSumSquares1() {
		List<Object> lst = List.of(1, 2, 3);
		assertEquals(6, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares2() {
		List<Object> lst = List.of(1, 4, 9);
		assertEquals(14, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares3() {
		List<Object> lst = List.of();
		assertEquals(0, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares4() {
		List<Object> lst = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertEquals(9, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares5() {
		List<Object> lst = List.of(-1, -1, -1, -1, -1, -1, -1, -1, -1);
		assertEquals(-3, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares6() {
		List<Object> lst = List.of(0);
		assertEquals(0, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares7() {
		List<Object> lst = List.of(-1, -5, 2, -1, -5);
		assertEquals(-126, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares8() {
		List<Object> lst = List.of(-56, -99, 1, 0, -2);
		assertEquals(3030, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares9() {
		List<Object> lst = List.of(-1, 0, 0, 0, 0, 0, 0, 0, -1);
		assertEquals(0, SumSquares2.sumSquares(lst));
	}
	
	@Test
	void testSumSquares10() {
		List<Object> lst = List.of(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
		assertEquals(-14196, SumSquares2.sumSquares(lst));
	}
}

// SumSquares3.java
package scenario3;

import java.util.List;

class SumSquares3 {

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
    }
}

// SumSquares3Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares3}.
* It contains ten unit test cases for the {@link SumSquares3#sumSquares(List)} method.
*/
class SumSquares3Test {
		
	@Test
	void testSumSquares1() {
		List<Object> lst = List.of(1, 2, 3);
		assertEquals(6, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares2() {
		List<Object> lst = List.of(1, 4, 9);
		assertEquals(14, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares3() {
		List<Object> lst = List.of();
		assertEquals(0, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares4() {
		List<Object> lst = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertEquals(9, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares5() {
		List<Object> lst = List.of(-1, -1, -1, -1, -1, -1, -1, -1, -1);
		assertEquals(-3, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares6() {
		List<Object> lst = List.of(0);
		assertEquals(0, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares7() {
		List<Object> lst = List.of(-1, -5, 2, -1, -5);
		assertEquals(-126, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares8() {
		List<Object> lst = List.of(-56, -99, 1, 0, -2);
		assertEquals(3030, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares9() {
		List<Object> lst = List.of(-1, 0, 0, 0, 0, 0, 0, 0, -1);
		assertEquals(0, SumSquares3.sumSquares(lst));
	}
	
	@Test
	void testSumSquares10() {
		List<Object> lst = List.of(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
		assertEquals(-14196, SumSquares3.sumSquares(lst));
	}
}

// SumSquares4.java
package scenario3;

import java.util.List;

class SumSquares4 {

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
    }
}

// SumSquares4Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link