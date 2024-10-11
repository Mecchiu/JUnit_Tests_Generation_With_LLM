// ByLengthTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	@Test
	void testByLength() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(1);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(8);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Eight");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("Two");
		expected.add("One");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthEmpty() {
		List<Object> arr = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(-1);
		arr.add(55);
		List<Object> expected = new ArrayList<Object>();
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber2() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(-1);
		arr.add(3);
		arr.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber3() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Four");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber4() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber5() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber6() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		arr.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber7() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		arr.add(0);
		arr.add(11);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber8() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		arr.add(0);
		arr.add(11);
		arr.add(12);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber9() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		arr.add(0);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber10() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(10);
		arr.add(0);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		List<Object> expected = new ArrayList<Object>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
}