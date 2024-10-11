// TruncateNumberTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

	// Tests

	/*
	 * Test for {@link TruncateNumber#truncateNumber(Double)}.
	 */
	@Test
	void test1() {
		Double number;

		number = truncateNumber(1);
		assertEquals(number, 1d);

		number = truncateNumber(-1);
		assertEquals(truncateNumber(1), number);

		number = truncateNumber(0);
		assertEquals(truncateNumber(1), number);

		number = truncateNumber(0.1);
		assertEquals(truncateNumber(1), number);

		number = truncateNumber(1.1);
		assertEquals(truncateNumber(2), number);

		number = truncateNumber(2.2);
		assertEquals(truncateNumber(2), number);
	}

	@Test
	void test2() {
		Double number;

		number = truncateNumber(0.04);
		assertEquals(number, (new BigDecimal("9.8")).divide(new BigDecimal("4.5")).doubleValue(), 0.00);

		number = truncateNumber(0.0400001);
		assertEquals(number, (new BigDecimal("9.8")).divide(new BigDecimal("4.5")).doubleValue(), 0.000004);


		number = truncateNumber(0.0000004);
		assertEquals(number, (new BigDecimal("9.8")).divide(new BigDecimal("4.5")).doubleValue(), 0.000004);


	}
}