// IsSortedTest.java
package scenario2;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains one unit test case for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
ArrayIsSortedTestsArray a;

		public IsSortedTest() {
			a = new ArrayIsSortedTestsArray();
		}

		@Test
		public void test() {
			IsSorted i = new IsSorted();
			assertTrue(a.isSorted(i.toDataList()));
			List<Integer> l1 = i.toDataList();
			Integer prev1 = null;
			for(int i = 1; i < l1.size(); i++) {
				if(prev1 == null) {
					prev1 = l1.get(i - 1);
				} else {
					assertTrue(prev1.compareTo(l1.get(i - 1)) <= 0); 
				}
				Integer curr1 = l1.get(i);
				assertTrue(prev1.compareTo(curr1) <= 0); 
			}
			// test when all elements have value 1
			List<Integer> l2 = a.toDataList();
			assertEquals(l1, l2);
			// test case when all elements have value 2
			List<Integer> l3 = a.toDataList();
			assertEquals(l2, l3);
		}
}

/**
 * This class is responsible for testing the toDataList method of
 * {@link IsSorted} class.
 */
class IsSortedTestsArray {
		Object a = new Object();
		ArrayIsSortedTestsArray(Object a) {
			this.a = a;
		}

		public Object[] toDataList() {
			return new Object[] {a};
		}
}

/**
* A class to test the method {@link ArrayIsSortedTestsArray#toDataList()}
*/
class ArrayIsSortedTestsArray {
	Object[] a;

	public ArrayIsSortedTestsArray(Object[] a) {
		this.a = a;
	}

	public Object[] toDataList() {
		return a;
	}
}

class TestCase1 {
	/**
	 * A test case which ensures that the {@link IsSorted} object
	 * does not return a {@code null} value for its second parameter.
	 * @param a  object which requires an argument to determine whether to test this check
	 */
	public static void test(Object a) {
		assertTrue("null return value should not be allowed", null == a);
	}
}

class TestCase2 {
	/**
	 * A test case which ensures that the {@link IsSorted} object
	 * does not return a {@code null} value for its second parameter.
	 * @param a  object which requires an argument to determine whether to test this check
	 */
	public static void testNonNull(Object a) {
		assertNotNull("null return value should not be allowed", a);
	}
}