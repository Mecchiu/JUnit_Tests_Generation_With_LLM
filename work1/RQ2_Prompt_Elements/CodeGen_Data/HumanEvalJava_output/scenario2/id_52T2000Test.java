// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains one unit test case for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

	/**
	* Constructor of the class.
	* @param  noOfTestCases number of cases in which the method execute.
	*/
	public BelowThresholdTest(int noOfTestCases) {
		super();
		this.testCases = new List[noOfTestCases];
		for (int i = 0; i < this.testCases.length; i++) {
			this.testCases[i] = new List();
		}
	}
	

	/**
	* Test case for the {@link BelowThreshold#belowThreshold(List, int)} method.
	*/
	@Test
	public void test1() {
		BelowThreshold belowThreshold = new BelowThreshold();

		for (int i = 0; i < this.testCases.length; i++) {
			List<Integer> l = this.testCases[i];
			Integer t = l.get(i);
			if (!this.aboveThreshold(l, t)) {
				assertTrue("No match when within the range between " + t + " and " + t + ".", belowThreshold.belowThreshold(l, t));
			}
		}
	}
	
	/**
	 * Test case for the {@link BelowThreshold#aboveThreshold(List, int)} method.
	 */
	@Test
	public void test2() {
		BelowThreshold belowThreshold = new BelowThreshold();

		for (int i = 0; i < this.testCases.length; i++) {
			List<Integer> l = this.testCases[i];
			Integer t = l.get(i);
			if (this.belowThreshold.aboveThreshold(l, t)) {
				assertTrue("Test case for " + t + " is failed.", belowThreshold.aboveThreshold(l, t));
			}
		}
	}
}
