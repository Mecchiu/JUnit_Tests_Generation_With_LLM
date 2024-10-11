// AddElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains one unit test case for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
/**
		* Tests {@link AddElements#addElements(List, int)}.
		*/
	@Test
	public void testAddElements() {
	assertEquals(0, AddElements.addElements(null, 0));
	assertEquals(0, AddElements.addElements(null, 1));
	assertEquals(1, AddElements.addElements(List.of(), 2));
	}
}