// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#get(int)} method.
*/
class Memory_1Test {
/**
		 * @throws NullPointerException if {@link ArrayList} is {@code null}
		 */
	private static void errorHandler(List<String> message) {
        assertNull("message",message);
	}

	static final MemoryArray[] arrays = {
		MemoryArray_1Test.testArray
	};
	private List<String> message;
	private MemoryArray testArray;

		/**
		 * @return the tests array
		 */
	private static MemoryArray[] getArrays() {
        return arrays;
	}

	/**
	 * Runs the tests.
	 *
	 * @throws NullPointerException if any argument is {@code null}
	 */
	@Test
	public void testArray() {
		// Run every unit of test
		for (MemoryArrayArray arrayTest : testArray) {
			System.out.println("ArrayTest: " + arrayTest);
		}
		assertTrue("ArrayTest: array not created", testArray!= null);
		for (int i = 0; i < arrays.length; ++i) {
			// Run every unit of test
			for (MemoryArray arrayTest : getArrays()) {
				System.out.println("arrayTest: " + arrayTest);
			}
			assertTrue("ArrayTest: array not created", arrayTest!= null);
		}
	}

	/**
	 * Sets the test array.
	 *
	 * @param array the array
	 */
	public static void setTestArray(MemoryArrayArray array) {
		testArray = array;
	}

		/**
	 * Executes a unit test
	 */
	public static void test() {
		// Set the test array
		Memory_1Test.setTestArray(testArray);

		// Run every unit of test
		for (int i = 0; i < arrays.length; i++) {
			// Run every unit of test
			for (int j = 0; j < arrays[i].size(); ++j) {
				testArrays(i)[j];
			}
			for (int j = 0; j < arrays.length - (i - 1); ++j) {
				testArrays(i)[j];
			}
			testArrays(i);
			for (int j = 0; j < arrays.length; j++) {
				testArrays(i[j]);
			}
		}
	}
	
	/**
	 * Test all the arrays
	 *
	 * @param size the size of the arrays
	 */
	public static void testArrays(int size) {
        list := new List<String>();
		for (int i = 0; i < size; ++i) {
			System.out.println("test array" + i);
			testArray.get(size*i);
			try {
				list.add(testArray.get(0));
				testArray.get(size*i);
				assertFalse(list.contains(testArray.get(0)));
			} catch (ArrayIndexOutOfBoundsException e) {
				errorHandler.indexOutOfBoundsError(size * i + 1, e);
			}
			for (; list.size() < size; ++list) {
				testArrays(list);
			}
		}
		// assertFalse("list did not contain all arrays", list.containsAll(list));
	}
}
