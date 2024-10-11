// ChangeBaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains one unit test case for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

	@Test
	public void test1() {
	    final int maxNum = 1000;
	    String result = changeBase(maxNum, 10);
	    assertEquals("5", result);
	}

	@Test
	public void test2() {
		final int base = 100;
	    String result = changeBase(base, 50);
	    assertEquals("50", result);
	}
}