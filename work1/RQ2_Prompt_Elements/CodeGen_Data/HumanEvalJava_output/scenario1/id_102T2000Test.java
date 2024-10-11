// ChooseNumTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains one unit test case for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

	/**
	 * Test method for {@link ChooseNum#chooseNum(int, int)}.
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testChooseNum_1_1_2() throws NoSuchMethodException, IllegalAccessException {
		chooseNum(1,2);
	}

	/**
	 * Test method for {@link ChooseNum#chooseNum(int, int)}.
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testChooseNum_1_1_1() throws NoSuchMethodException, IllegalAccessException {
		chooseNum(1,1);
	}

	/**
	 * Test method for {@link ChooseNum#chooseNum(int, int)}.
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testChooseNum_1_1_0() throws NoSuchMethodException, IllegalAccessException {
		chooseNum(1,0);
	}

	/**
	 * Test method for {@link ChooseNum#chooseNum(int, int)}.
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testChooseNum_1_1_0_2() throws NoSuchMethodException, IllegalAccessException {
		chooseNum(1,0,2);
	}
}
