// ChooseNumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains one unit test case for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

	/**
	* Tests {@link ChooseNum#chooseNum(int, int)}.
	* @since 3.6.0
	*/
	@Test
	void testChoosenNum() {
		// Given
		int inputNum;
		int inputMax;
		do {
			inputNum = 0;
			inputMax = chooseNum.chooseNum(4,5);
		} while (inputNum < inputMax);

		// Test
		assertEquals(inputNum, 6);
	}

}