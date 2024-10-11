// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
	/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> input = new ArrayList<Object>();
				input.add(111111);
				List<Object> expected = new ArrayList<Object>();
				expected.add(111111);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only one type of element.
			*/
			@Test
			void testOneTypeList() {
				List<Object> input = new ArrayList<Object>();
				input.add(5);
				input.add(5);
				input.add(5);
				input.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(5);
				expected.add(5);
				expected.add(5);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only two types of elements.
			*/
			@Test
			void testTwoTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(0);
				input.add(2);
				input.add(2);
				input.add(2);
				input.add(5);
				input.add(5);
				input.add(-5);
				input.add(-5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(-5);
				expected.add(5);
				expected.add(-5);
				expected.add(5);
				expected.add(0);
				expected.add(2);
				expected.add(2);
				expected.add(2);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only three types of elements.
			*/
			@Test
			void testThreeTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(7);
				expected.add(3);
				expected.add(6);
				expected.add(4);
				expected.add(5);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only four types of elements.
			*/
			@Test
			void testFourTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(4);
				expected.add(2);
				expected.add(3);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only five types of elements.
			*/
			@Test
			void testFiveTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				input.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(9);
				expected.add(6);
				expected.add(8);
				expected.add(7);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only six types of elements.
			*/
			@Test
			void testSixTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(6);
				expected.add(2);
				expected.add(5);
				expected.add(3);
				expected.add(4);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only seven types of elements.
			*/
			@Test
			void testSevenTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(7);
				expected.add(2);
				expected.add(6);
				expected.add(3);
				expected.add(5);
				expected.add(4);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for {@link StrangeSortList#strangeSortList(List)}.
			* It checks if the method returns the correct list when the input list contains only eight types of elements.
			*/
			@Test
			void testEightTypesList() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(7);
				expected.add(3);
				expected.add(6);
				expected.add(4);
				expected.add(5);
				List<Object> actual = StrangeSortList.strangeSortList(input);
				assertEquals(expected, actual);
			}
}
