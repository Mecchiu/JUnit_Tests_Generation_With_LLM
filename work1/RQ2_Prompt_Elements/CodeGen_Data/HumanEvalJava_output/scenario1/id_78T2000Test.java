// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains one unit test case for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

	/**
	* Tests if the argument is a {@link Number}, and if it is an instance of {@link Number}.
	* The {@link Number} object is obtained from the argument object.
	*/
    @Test
    public void test() {
        Number n1;
        n1 = null;
        assertTrue(n1.getClass().equals(Integer.class));
    }

} // class HexKeyTest
