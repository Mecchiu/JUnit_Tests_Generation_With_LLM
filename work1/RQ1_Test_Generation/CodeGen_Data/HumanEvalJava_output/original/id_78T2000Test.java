// HexKeyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains one unit test case for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

    /**
	* Test constructor.
	* You should not create an object of this class, but one with empty string as the number of prime number.
	*/
    @Test
    void testConstructorEmpty() {
        assertEquals("Error when the first parameter is empty!", "", new HexKey().hexKey(""));
    }

    /**
	* Test method {@link HexKey#hexKey(Object)}.
        The first parameter should be an integer to be counted.
        The second parameter should be a {@code long} containing the prime number given by the first parameter.
    */
	@Test
    public void testHexKey() {
        assertEquals("Error when the first parameter is empty!", "{2}", new HexKey().hexKey("{}"));
        assertEquals("Error when the second parameter is empty!", long.valueOf(1), new HexKey().hexKey("{}{}"));
    }
}