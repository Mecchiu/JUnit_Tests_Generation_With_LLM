// ByLengthTest.java
package scenario2;

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
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
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
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithEmptyList() {
				List<Object> arr = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithNull() {
				List<Object> arr = null;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithNegativeNumbers() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(-1);
				arr.add(-2);
				arr.add(-3);
				arr.add(-4);
				arr.add(-5);
				arr.add(-6);
				arr.add(-7);
				arr.add(-8);
				arr.add(-9);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithZero() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(0);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithOneElement() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithTwoElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithThreeElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithFourElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithFiveElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithSixElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithSevenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithEightElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add("Eight");
				expected.add("Seven");
				expected.add("Six");
				expected.add("Five");
				expected.add("Four");
				expected.add("Three");
				expected.add("Two");
				expected.add("One");
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithNineElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
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
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithTenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
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
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithElevenElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
				arr.add(10);
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
				List<Object> actual = ByLength.byLength(arr);
				assertEquals(expected, actual);
			}
			
			@Test
			void testByLengthWithTwelveElements() {
				List<Object> arr = new ArrayList<Object>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				arr.add(6);
				arr.add(7);
				arr.add(8);
				arr.add(9);
				arr.add(10);
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
}
}