// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
			@Test
			void test1() {
				assertEquals(34, XOrY.xOrY(7, 34, 12));
			}
			
			@Test
			void test2() {
				assertEquals(5, XOrY.xOrY(15, 8, 5));
			}
			
			@Test
			void test3() {
				assertEquals(33, XOrY.xOrY(3, 33, 5212));
			}
			
			@Test
			void test4() {
				assertEquals(3, XOrY.xOrY(1259, 3, 52));
			}
			
			@Test
			void test5() {
				assertEquals(-1, XOrY.xOrY(7919, -1, 12));
			}
			
			@Test
			void test6() {
				assertEquals(583, XOrY.xOrY(3609, 1245, 583));
			}
			
			@Test
			void test7() {
				assertEquals(129, XOrY.xOrY(91, 56, 129));
			}
			
			@Test
			void test8() {
				assertEquals(1234, XOrY.xOrY(6, 34, 1234));
			}
			
			@Test
			void test9() {
				assertEquals(0, XOrY.xOrY(1, 2, 0));
			}
			
			@Test
			void test10() {
				assertEquals(2, XOrY.xOrY(2, 2, 0));
			}
}