// ByLengthTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains one unit test case for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	/**
	 * Initializes your test case.
	 */
    @Test
    void testInitialization(){
        final ByLength testObject = new ByLength();
        assertNotNull(testObject);
    }
	
	/**
	 * test method for {@link ByLength#byLength(List)}.
	 */
	@Test
	void byLengthIntList(){
		final Collection<Integer> tests = new ArrayList<Integer>();
		tests.add(1);
		tests.add(3);
		tests.add(5);
		
		assertEquals(tests.size(), testObject.byLength(tests).size());
	}
	
	/**
	 * test method for {@link ByLength#byLength(Collection)}.
	 */
	@Test
	void byLengthCollection(){
		final Collection<Integer> tests = new ArrayList<Integer>();
		tests.add(1);
		tests.add(3);
		tests.add(5);
		
		assertEquals(tests.size(), testObject.byLength(tests).size());
	}
}
