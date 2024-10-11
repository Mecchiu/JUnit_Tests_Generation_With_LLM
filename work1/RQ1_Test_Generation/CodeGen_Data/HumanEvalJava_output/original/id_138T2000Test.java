// IsEqualToSumEvenTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains one unit test case for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
/**
		* Test isEqualToSumEven().
		* Checks the result of isEqualToSumEven().
		*/
	@Test
	public void testIsEqualToFourPositive() {
        assertEquals(true,IsEqualToSumEven.isEqualToSumEven(4));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToFourNegative() {
        assertEquals(false,IsEqualToSumEven.isEqualToSumEven(-4));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixPositive() {
        assertEquals(true,IsEqualToSumEven.isEqualToSumEven(6));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixNegative() {
        assertEquals(false,IsEqualToSumEven.isEqualToSumEven(-6));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixThreePositive() {
        assertEquals(true,IsEqualToSumEven.isEqualToSumEven(6));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixThreeNegative() {
        assertEquals(false,IsEqualToSumEven.isEqualToSumEven(-6));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixTwoPositive() {
        assertEquals(true,IsEqualToSumEven.isEqualToSumEven(2));
	}

	/**
	* Test isEqualToSumEven().
	* Checks the result of isEqualToSumEven().
	*/
	@Test
	public void testIsEqualToSixTwoNegative() {
        assertEquals(false,IsEqualToSumEven.isEqualToSumEven(-2));
	}

}