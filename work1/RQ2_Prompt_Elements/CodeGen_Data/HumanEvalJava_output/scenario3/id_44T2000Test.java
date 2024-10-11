// ChangeBaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains one unit test case for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

	@Test
	    public void testChangeBase() {
	
		String expected = "22";
				
		assertEquals("ChangeBase.changeBase(1, 3)",expected);
	}
    }
