// ChooseNumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
	/**
			* Test case for {@link ChooseNum#chooseNum(int, int)}.
			* It checks if the method returns the biggest even integer number that is in the range [x, y] inclusive.
			*/
			@Test
			void testChooseNum() {
						assertEquals(14, ChooseNum.chooseNum(12, 15));
						assertEquals(-1, ChooseNum.chooseNum(13, 12));
						assertEquals(12354, ChooseNum.chooseNum(33, 12354));
						assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
						assertEquals(28, ChooseNum.chooseNum(6, 29));
						assertEquals(-1, ChooseNum.chooseNum(27, 10));
						assertEquals(-1, ChooseNum.chooseNum(7, 7));
						assertEquals(546, ChooseNum.chooseNum(546, 546));
						assertEquals(100, ChooseNum.chooseNum(100, 101));
						assertEquals(100, ChooseNum.chooseNum(100, 100));
			}
}