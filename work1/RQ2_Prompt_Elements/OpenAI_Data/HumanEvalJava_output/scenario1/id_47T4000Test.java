// MedianTest.java
package scenario1;

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
		* The list is empty.
		*/
		@Test
		void testMedian1() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* The list contains one element.
		*/
		@Test
		void testMedian2() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* The list contains two elements.
		*/
		@Test
		void testMedian3() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* The list contains three elements.
		*/
		@Test
		void testMedian4() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* The list contains four elements.
		*/
		@Test
		void testMedian5() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* The list contains five elements.
		*/
		@Test
		void testMedian6() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* The list contains six elements.
		*/
		@Test
		void testMedian7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* The list contains seven elements.
		*/
		@Test
		void testMedian8() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* The list contains eight elements.
		*/
		@Test
		void testMedian9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* The list contains nine elements.
		*/
		@Test
		void testMedian10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}

// MedianTest.java
package scenario1;

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
		* The list is empty.
		*/
		@Test
		void testMedian1() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* The list contains one element.
		*/
		@Test
		void testMedian2() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* The list contains two elements.
		*/
		@Test
		void testMedian3() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* The list contains three elements.
		*/
		@Test
		void testMedian4() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* The list contains four elements.
		*/
		@Test
		void testMedian5() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* The list contains five elements.
		*/
		@Test
		void testMedian6() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* The list contains six elements.
		*/
		@Test
		void testMedian7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* The list contains seven elements.
		*/
		@Test
		void testMedian8() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* The list contains eight elements.
		*/
		@Test
		void testMedian9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* The list contains nine elements.
		*/
		@Test
		void testMedian10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}

// MedianTest.java
package scenario1;

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
		* The list is empty.
		*/
		@Test
		void testMedian1() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* The list contains one element.
		*/
		@Test
		void testMedian2() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* The list contains two elements.
		*/
		@Test
		void testMedian3() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* The list contains three elements.
		*/
		@Test
		void testMedian4() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* The list contains four elements.
		*/
		@Test
		void testMedian5() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* The list contains five elements.
		*/
		@Test
		void testMedian6() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* The list contains six elements.
		*/
		@Test
		void testMedian7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* The list contains seven elements.
		*/
		@Test
		void testMedian8() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* The list contains eight elements.
		*/
		@Test
		void testMedian9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* The list contains nine elements.
		*/
		@Test
		void testMedian10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}

// MedianTest.java
package scenario1;

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
		* The list is empty.
		*/
		@Test
		void testMedian1() {
				List<Integer> l = Collections.emptyList();
				assertNull(Median.median(l));
		}
		
		/**
		* Test case 2.
		* The list contains one element.
		*/
		@Test
		void testMedian2() {
				List<Integer> l = Collections.singletonList(1);
				assertEquals(1, Median.median(l));
		}
		
		/**
		* Test case 3.
		* The list contains two elements.
		*/
		@Test
		void testMedian3() {
				List<Integer> l = List.of(1, 2);
				assertEquals(1.5, Median.median(l));
		}
		
		/**
		* Test case 4.
		* The list contains three elements.
		*/
		@Test
		void testMedian4() {
				List<Integer> l = List.of(1, 2, 3);
				assertEquals(2, Median.median(l));
		}
		
		/**
		* Test case 5.
		* The list contains four elements.
		*/
		@Test
		void testMedian5() {
				List<Integer> l = List.of(1, 2, 3, 4);
				assertEquals(2.5, Median.median(l));
		}
		
		/**
		* Test case 6.
		* The list contains five elements.
		*/
		@Test
		void testMedian6() {
				List<Integer> l = List.of(1, 2, 3, 4, 5);
				assertEquals(3, Median.median(l));
		}
		
		/**
		* Test case 7.
		* The list contains six elements.
		*/
		@Test
		void testMedian7() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(3.5, Median.median(l));
		}
		
		/**
		* Test case 8.
		* The list contains seven elements.
		*/
		@Test
		void testMedian8() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(4, Median.median(l));
		}
		
		/**
		* Test case 9.
		* The list contains eight elements.
		*/
		@Test
		void testMedian9() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(4.5, Median.median(l));
		}
		
		/**
		* Test case 10.
		* The list contains nine elements.
		*/
		@Test
		void testMedian10() {
				List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(5, Median.median(l));
		}
}

// MedianTest.java
package scenario1;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit