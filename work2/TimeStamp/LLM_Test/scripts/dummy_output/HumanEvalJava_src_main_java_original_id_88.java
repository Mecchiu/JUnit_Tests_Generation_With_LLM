// SortArray1Test.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {
			/**
			* Test case for empty list.
			*/
			@Test
			void testEmptyList() {
				List<Object> emptyList = new ArrayList<>();
				List<Object> expected = new ArrayList<>();
				List<Object> actual = SortArray1.sortArray(emptyList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> oneElementList = new ArrayList<>();
				oneElementList.add(5);
				List<Object> expected = new ArrayList<>();
				expected.add(5);
				List<Object> actual = SortArray1.sortArray(oneElementList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with two elements.
			*/
			@Test
			void testTwoElementsList() {
				List<Object> twoElementsList = new ArrayList<>();
				twoElementsList.add(2);
				twoElementsList.add(1);
				List<Object> expected = new ArrayList<>();
				expected.add(1);
				expected.add(2);
				List<Object> actual = SortArray1.sortArray(twoElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with six elements.
			*/
			@Test
			void testSixElementsList() {
				List<Object> sixElementsList = new ArrayList<>();
				sixElementsList.add(2);
				sixElementsList.add(4);
				sixElementsList.add(3);
				sixElementsList.add(0);
				sixElementsList.add(1);
				sixElementsList.add(5);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = SortArray1.sortArray(sixElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with seven elements.
			*/
			@Test
			void testSevenElementsList() {
				List<Object> sevenElementsList = new ArrayList<>();
				sevenElementsList.add(2);
				sevenElementsList.add(4);
				sevenElementsList.add(3);
				sevenElementsList.add(0);
				sevenElementsList.add(1);
				sevenElementsList.add(5);
				sevenElementsList.add(6);
				List<Object> expected = new ArrayList<>();
				expected.add(6);
				expected.add(5);
				expected.add(4);
				expected.add(3);
				expected.add(2);
				expected.add(1);
				expected.add(0);
				List<Object> actual = SortArray1.sortArray(sevenElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with two elements.
			*/
			@Test
			void testTwoElementsList2() {
				List<Object> twoElementsList = new ArrayList<>();
				twoElementsList.add(15);
				twoElementsList.add(42);
				List<Object> expected = new ArrayList<>();
				expected.add(15);
				expected.add(42);
				List<Object> actual = SortArray1.sortArray(twoElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with six elements.
			*/
			@Test
			void testSixElementsList2() {
				List<Object> sixElementsList = new ArrayList<>();
				sixElementsList.add(15);
				sixElementsList.add(42);
				sixElementsList.add(87);
				sixElementsList.add(32);
				sixElementsList.add(11);
				sixElementsList.add(0);
				List<Object> expected = new ArrayList<>();
				expected.add(0);
				expected.add(11);
				expected.add(15);
				expected.add(32);
				expected.add(42);
				expected.add(87);
				List<Object> actual = SortArray1.sortArray(sixElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with four elements.
			*/
			@Test
			void testFourElementsList() {
				List<Object> fourElementsList = new ArrayList<>();
				fourElementsList.add(21);
				fourElementsList.add(14);
				fourElementsList.add(23);
				fourElementsList.add(11);
				List<Object> expected = new ArrayList<>();
				expected.add(23);
				expected.add(21);
				expected.add(14);
				expected.add(11);
				List<Object> actual = SortArray1.sortArray(fourElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with seven elements.
			*/
			@Test
			void testSevenElementsList2() {
				List<Object> sevenElementsList = new ArrayList<>();
				sevenElementsList.add(21);
				sevenElementsList.add(14);
				sevenElementsList.add(23);
				sevenElementsList.add(11);
				sevenElementsList.add(0);
				sevenElementsList.add(1);
				sevenElementsList.add(5);
				List<Object> expected = new ArrayList<>();
				expected.add(5);
				expected.add(1);
				expected.add(0);
				expected.add(11);
				expected.add(14);
				expected.add(21);
				expected.add(23);
				List<Object> actual = SortArray1.sortArray(sevenElementsList);
				assertEquals(expected, actual);
			}

			/**
			* Test case for list with seven elements.
			*/
			@Test
			void testSevenElementsList3() {
				List<Object> sevenElementsList = new ArrayList<>();
				sevenElementsList.add(21);
				sevenElementsList.add(14);
				sevenElementsList.add(23);
				sevenElementsList.add(11);
				sevenElementsList.add(0);
				sevenElementsList.add(1);
				sevenElementsList.add(5);
				List<Object> expected = new ArrayList<>();
				expected.add(23);
				expected.add(21);
				expected.add(14);
				expected.add(11);
				expected.add(5);
				expected.add(1);
				expected.add(0);
				List<Object> actual = SortArray1.sortArray(sevenElementsList);
				assertEquals(expected, actual);
			}
		}