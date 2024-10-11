// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains one unit test case for the {@link F#f(int)} method.
*/
class FTest {
/**
		* Test the default constructor.
		*/
	@Test
	void testConstructorDefault() {
		F f = new F(); 
		assertEquals(f.size(), 0);
	}

	/**
	* Test the function f that takes n as a parameter,
	* and returns a list of size n.
	* Example:
	* f(5) == [2, 3, 5, 6, 15]
	*/
	@Test
	void testF() {
		assertEquals(F.f(5), [2, 3, 5, 6, 15]);
	}

	/**
	* Test method of {@link F#f} (throws IndexOutOfBoundsException).
	*/
	@Test(expected=IndexOutOfBoundsException.class)
	void testFerrThrowsIndexOutOfBounds() {
		F.f(-1);
	}

	/**
	* Test method of {@link F#sum} (throws IndexOutOfBoundsException).
	*/
	@Test(expected=IndexOutOfBoundsException.class)
	void testSum() {
		F.sum(-1);
	}
// end FTest
}
//FTest
