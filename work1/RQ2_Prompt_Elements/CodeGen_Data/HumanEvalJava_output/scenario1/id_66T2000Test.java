// DigitsumTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains one unit test case for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

	/**
	* Unit test for {@link Digitsum#digitSum(String)} method.
	*/
	@Test
    void test() {
        assertEquals("123", Digitsum.digitSum("1234"));
    }
}
		