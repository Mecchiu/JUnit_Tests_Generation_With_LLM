// DoubleTheDifferenceTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
// DoubleTheDifference.java
package scenario1;

import java.util.List;

class DoubleTheDifference {

    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) instanceof Integer) {
                int num = (int) lst.get(i);
                if (num % 2!= 0 && num > 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }
}

// DoubleTheDifferenceTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
		private int testCaseSize;

		public DoubleTheDifferenceTest(int theTestCaseSize) {
	testCaseSize = theTestCaseSize;
	}
	
	/**
	 * Test for the {@link DoubleTheDifference#doubleTheDifference(List)}.
	 */
      @Test
      public void testDoubleTheDifference() {
		
		final List<Object> testList = initTestList();
		
		try {
			listener.reset();
			DoubleTheDifference dtD = new DoubleTheDifference();
			int result = dtD.doubleTheDifference(testList);
			assertEquals(testCaseSize, testList.size());
			assertTrue(listener.isSuccessful());
			int expectedResult = testCaseSize;
			assertTrue(result == expectedResult);
		} catch (Exception e) {
			fail(e.getMessage());
		}
 		
	}
	
	private List<Object> initTestList() {
	return new ArrayList<Object>
               .add
                (new Integer(1)
				);
	}
			
}