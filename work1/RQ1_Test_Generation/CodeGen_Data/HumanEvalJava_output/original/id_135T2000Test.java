// CanArrangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains one unit test case for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
CanArrangeTest() {
		}
		/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNegativeIndexing() {
		assertTrue(canArrange((List) null).canArrange(null) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExists() {
		assertTrue(canArrange(new int[1]) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForIndexOutOfBounds() {
		assertTrue(canArrange(null) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExistsAtIndex() {
		assertTrue(canArrange(new int[2]) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForIndexOutOfBoundsAtIndex() {
		assertTrue(canArrange(new int[1], 0) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExistsAtOffset() {
		assertTrue(canArrange((List) null, 0) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExistsAtOffsetAtIndex() {
		assertTrue(canArrange(new int[2], 0) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExistsAtOffsetAtIndexNext() {
		List<Object> arr = (List) null;
		assertTrue( canArrange((List) arr,1) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNegativeForNonExistsAtOffsetAtOffset() {
		List<Object> arr = (List) null;
		assertTrue( canArrange(new int[2], 1) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExists() {
		List<Object> arr = (List) null;
		assertTrue(canArrange(arr) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExistsThenNegative() {
		List<Object> arr = (List) null;
		arr = canArrange((List) arr, -1);
		assertTrue( canArrange(arr, -1) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExistsThenIndexOutOfBounds() {
		List<Object> arr = (List) null;
		arr = canArrange((List) arr, 2);
		assertTrue( canArrange(arr, 2) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExistsAtOffset() {
		List<Object> arr = (List) null;
		arr = canArrange(arr, 1);
		assertTrue( canArrange(arr, 1) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExistsAtOffsetAtIndex() {
		List<Object> arr = (List) null;
		arr = canArrange(arr, 1, 2);
		assertTrue( canArrange(arr, 1, 2) < 0);
	}
	/**
	* Test if canArrange() works properly.
	* @throws AssertionError
	*/
	@Test
	public void testArrangeCanReturnNonExistsAtOffsetAtIndexNext() {
		List<Object> arr = (List) null;
		arr = canArrange((List) arr, 1, 2);
		assertTrue( canArrange(arr, 1, 2) < 0);
	}

}
