// StartsOneEndsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {
	@Test
			void testStartsOneEnds1() {
				assertEquals(1, StartsOneEnds.startsOneEnds(1));
			}
			
			@Test
			void testStartsOneEnds2() {
				assertEquals(11, StartsOneEnds.startsOneEnds(2));
			}
			
			@Test
			void testStartsOneEnds3() {
				assertEquals(111, StartsOneEnds.startsOneEnds(3));
			}
			
			@Test
			void testStartsOneEnds4() {
				assertEquals(1111, StartsOneEnds.startsOneEnds(4));
			}
			
			@Test
			void testStartsOneEnds5() {
				assertEquals(11111, StartsOneEnds.startsOneEnds(5));
			}
			
			@Test
			void testStartsOneEnds6() {
				assertEquals(111111, StartsOneEnds.startsOneEnds(6));
			}
			
			@Test
			void testStartsOneEnds7() {
				assertEquals(1111111, StartsOneEnds.startsOneEnds(7));
			}
			
			@Test
			void testStartsOneEnds8() {
				assertEquals(11111111, StartsOneEnds.startsOneEnds(8));
			}
			
			@Test
			void testStartsOneEnds9() {
				assertEquals(111111111, StartsOneEnds.startsOneEnds(9));
			}
			
			@Test
			void testStartsOneEnds10() {
				assertEquals(1111111111, StartsOneEnds.startsOneEnds(10));
			}
}
