// CountUpperTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains one unit test case for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

	@Test void testCountUpperIn() {
	// given
	String string = "aBCdEf";
	

	// when
	int result = CountUpper.countUpper(string);

	// then
	assertEquals( 1, result);
	}

	@Test void testCountUpperWithNullString() {
	// given
	String string = null;

	// when
	int result = CountUpper.countUpper(string);

	// then
	assertEquals( 0, result);
	}

}