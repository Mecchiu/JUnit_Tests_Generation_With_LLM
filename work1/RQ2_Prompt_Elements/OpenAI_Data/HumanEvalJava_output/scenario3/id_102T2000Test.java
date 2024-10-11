// ChooseNumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
	@Test
			void test1() {
				assertEquals(14, ChooseNum.chooseNum(12, 15));
			}
			
			@Test
			void test2() {
				assertEquals(-1, ChooseNum.chooseNum(13, 12));
			}
			
			@Test
			void test3() {
				assertEquals(12354, ChooseNum.chooseNum(33, 12354));
			}
			
			@Test
			void test4() {
				assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
			}
			
			@Test
			void test5() {
				assertEquals(28, ChooseNum.chooseNum(6, 29));
			}
			
			@Test
			void test6() {
				assertEquals(-1, ChooseNum.chooseNum(27, 10));
			}
			
			@Test
			void test7() {
				assertEquals(-1, ChooseNum.chooseNum(7, 7));
			}
			
			@Test
			void test8() {
				assertEquals(546, ChooseNum.chooseNum(546, 546));
			}
			
			@Test
			void test9() {
				assertEquals(10, ChooseNum.chooseNum(10, 10));
			}
			
			@Test
			void test10() {
				assertEquals(10, ChooseNum.chooseNum(10, 11));
			}
}