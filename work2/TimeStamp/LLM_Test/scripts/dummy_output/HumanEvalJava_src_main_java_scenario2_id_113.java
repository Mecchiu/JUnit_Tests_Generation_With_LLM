// OddCountTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with an empty list.
			*/
			@Test
			void testOddCountEmptyList() {
						List<String> lst = new ArrayList<String>();
						List<String> result = OddCount.oddCount(lst);
						assertEquals(0, result.size());
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of one element.
			*/
			@Test
			void testOddCountOneElementList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(1, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of two elements.
			*/
			@Test
			void testOddCountTwoElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(2, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of three elements.
			*/
			@Test
			void testOddCountThreeElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(3, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of four elements.
			*/
			@Test
			void testOddCountFourElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						lst.add("02468");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(4, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(3));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of five elements.
			*/
			@Test
			void testOddCountFiveElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(5, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(3));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(4));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of six elements.
			*/
			@Test
			void testOddCountSixElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						lst.add("02468");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(6, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(3));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(4));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(5));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of seven elements.
			*/
			@Test
			void testOddCountSevenElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(7, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(3));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(4));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(5));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(6));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of eight elements.
			*/
			@Test
			void testOddCountEightElementsList() {
						List<String> lst = new ArrayList<String>();
						lst.add("123456789");
						lst.add("2468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						lst.add("02468");
						lst.add("13579");
						lst.add("02468");
						List<String> result = OddCount.oddCount(lst);
						assertEquals(8, result.size());
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(0));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(1));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(2));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(3));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(4));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(5));
						assertEquals("the number of odd elements 5 in the string 5 of the input.", result.get(6));
						assertEquals("the number of odd elements 0 in the string 0 of the input.", result.get(7));
			}

			/**
			* Test case for the {@link OddCount#oddCount(List)} method.
			* It tests the method with a list of nine elements.
			*/
			@Test
			void testOddCountNineElementsList() {
						List<String> lst = new ArrayList<String>();
}
}