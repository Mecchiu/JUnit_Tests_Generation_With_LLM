// MedianTest.java
package scenario2;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

		/**
		* Test case 1.
		* Test case for {@link Median#median(List)} method.
		* Test case with an empty list.
		*/
		@Test
		void testMedianEmptyList() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with one element.
		*/
		@Test
		void testMedianOneElementList() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with two elements.
		*/
		@Test
		void testMedianTwoElementsList() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with three elements.
		*/
		@Test
		void testMedianThreeElementsList() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with four elements.
		*/
		@Test
		void testMedianFourElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with five elements.
		*/
		@Test
		void testMedianFiveElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with six elements.
		*/
		@Test
		void testMedianSixElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with seven elements.
		*/
		@Test
		void testMedianSevenElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with eight elements.
		*/
		@Test
		void testMedianEightElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* Test case for {@link Median#median(List)} method.
		* Test case with a list with nine elements.
		*/
		@Test
		void testMedianNineElementsList() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}