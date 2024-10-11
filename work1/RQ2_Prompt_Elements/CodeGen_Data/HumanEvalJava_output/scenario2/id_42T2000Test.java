// IncrListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains one unit test case for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

	/**
	 * This unit test creates two two lists with the correct 
	 * size and test function with no arguments.
	*/
	@Test
	public void incrlistTest1() {
		List<Object> res = IncrList.incrList(new ArrayList<>());
		res.addAll(new ArrayList<>());
	}

	/**
	 * This test creates two two lists with the same elements 
	 * and test function of the one that can be set with more arguments.
	 */
	@Test
	public void incrlistTest2() {
		List<Object> res = IncrList.incrList(new ArrayList<>(), new ArrayList<Object>());
		List<Object> r2 = IncrList.incrList(new ArrayList<>());
		assertTrue(r2.equals(res));
	}

	/**
	 * This tests is a non duplicate test of the incrList. It creates
	 * a list with three items. It compares only those items, that are not
	 * duplicate objects.
	 */
	@Test
	public void incrlistTest3() {
		List<Object> res = IncrList.incrList(new ArrayList<>());
		assertTrue(res.equals(res));
		List<Object> res2 = IncrList.incrList(new ArrayList<>());
		List<Object> res3 = IncrList.incrList(new ArrayList<>());
		assertTrue(res2.equals(res3));
	}
}
