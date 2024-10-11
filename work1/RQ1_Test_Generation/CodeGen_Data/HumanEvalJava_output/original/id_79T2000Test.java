// DecimalToBinaryTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains one unit test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
public final DecimalToBinary decimalToBinary = new DecimalToBinary();

	@Test
	public void test_decimalToBinary1() {
		assertEquals("The return value should equal the expected value.", 32, decimalToBinary.decimalToBinary(32));

        assertEquals("The return value should equal the expected value.", 15, decimalToBinary.decimalToBinary(15));

	}

	@Test
	public void test_zero() {
		assertEquals("The return value should equal null.", DecimalToBinary.zero, decimalToBinary.decimalToBinary(0));

	}

	@Test
	public void test_one() {
		assertEquals("The return value should equal 4.", 4, decimalToBinary.decimalToBinary(1));

	}

	@Test
    public void test_two() {
        assertEquals("The return value should equal 10.", 10, decimalToBinary.decimalToBinary(2));

        assertEquals("The return value should equal 14.", 14, decimalToBinary.decimalToBinary(3));

        assertEquals("The return value should equal 20.", 20, decimalToBinary.decimalToBinary(5));

    }
}
