// CompareOneTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

		@Test
		void testCompareOne_1() {
			assertEquals(null, CompareOne.compareOne(1, 1));
		}
		
		@Test
		void testCompareOne_2() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_3() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_4() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_5() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_6() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_7() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_8() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_9() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
		
		@Test
		void testCompareOne_10() {
			assertEquals(1.0, CompareOne.compareOne(1, 0.5));
		}
}