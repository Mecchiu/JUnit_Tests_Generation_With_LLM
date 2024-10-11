// ChooseNumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
			@Test
			void testChooseNum1() {
				assertEquals(10, ChooseNum.chooseNum(1, 10));
			}
			
			@Test
			void testChooseNum2() {
				assertEquals(10, ChooseNum.chooseNum(10, 10));
			}
			
			@Test
			void testChooseNum3() {
				assertEquals(10, ChooseNum.chooseNum(10, 1));
			}
			
			@Test
			void testChooseNum4() {
				assertEquals(10, ChooseNum.chooseNum(1, 10));
			}
			
			@Test
			void testChooseNum5() {
				assertEquals(10, ChooseNum.chooseNum(10, 10));
			}
			
			@Test
			void testChooseNum6() {
				assertEquals(10, ChooseNum.chooseNum(10, 1));
			}
			
			@Test
			void testChooseNum7() {
				assertEquals(10, ChooseNum.chooseNum(1, 10));
			}
			
			@Test
			void testChooseNum8() {
				assertEquals(10, ChooseNum.chooseNum(10, 10));
			}
			
			@Test
			void testChooseNum9() {
				assertEquals(10, ChooseNum.chooseNum(10, 1));
			}
			
			@Test
			void testChooseNum10() {
				assertEquals(-1, ChooseNum.chooseNum(1, 3));
			}
}