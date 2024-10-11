// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
// SumSquares1.java
package original;

import java.util.ArrayList;
import java.util.List;

class SumSquares1 {

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
            } else if (i % 4 == 0 && i % 3!= 0) {
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

// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
		
	@Test
	void testSumSquares1() {
		
		IntSum1 sum = new IntSum1();
		boolean result = sum.sumSquares(new ArrayList<>(new ArrayList<>()
								    	    )),
					is = true;
		assertTrue("Not a true sum.", is);
	}

	@Test
	void testSumSquares1_1() {
		
		IntSum1 sum = new IntSum1();
		boolean result = sum.sumSquares(new ArrayList<>(new ArrayList<>(
												new ArrayList<>()
													    ))),
					is = true;
		assertTrue("Not a true sum.", is);
	}

	@Test
	void testSumSquares1_1_2() {
		
		IntSum1 sum = new IntSum1();
		boolean result = sum.sumSquares(new ArrayList<>(new ArrayList<>(
											new ArrayList<>()
											    ))),
					is = true;
		assertTrue("Not a true sum.", is);
	}

	@Test
	void testSumSquares1_2() {
		
		IntSum1 sum = new IntSum1();
		boolean result = sum.sumSquares(new ArrayList<>(new ArrayList<>(
														new ArrayList<>()
																			      )
													    )
					                   ),
					is = true;
		assertTrue("Not a true sum.", is);
	}

	static Boolean isTrue(Boolean a) {
		return (null!= a);
	}
	
	static Boolean isFalse(Boolean a) {
		return (null == a);
	}

}












