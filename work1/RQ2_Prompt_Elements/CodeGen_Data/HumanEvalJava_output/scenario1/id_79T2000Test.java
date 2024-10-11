// DecimalToBinaryTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains one unit test case for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {

	@Test
	public void testDecimalToBinary() {
		
		DecimalToBinary test = new DecimalToBinary();
		assertEquals("db0db",  test.decimalToBinary(0));	
		assertEquals("db1db",  test.decimalToBinary(1));	
		assertEquals("db11db", test.decimalToBinary(10));	
		assertEquals("db12db", test.decimalToBinary(11));	
		assertEquals("db13db", test.decimalToBinary(12));	
		assertEquals("db14db", test.decimalToBinary(13));	
		assertEquals("db15db", test.decimalToBinary(14));	
		
		// Invalid argument
		assertThrows(IllegalArgumentException.class,() -> test.decimalToBinary(null));
		assertThrows(IllegalArgumentException.class,() -> test.decimalToBinary("a"));
	}
}