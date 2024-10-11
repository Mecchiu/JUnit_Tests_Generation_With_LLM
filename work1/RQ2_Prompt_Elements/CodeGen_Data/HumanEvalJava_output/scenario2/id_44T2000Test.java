// ChangeBaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains one unit test case for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {
private final int x = 9;
		private final int base = 10;

		@Test
		void testChangeBase(ChangeBase base) throws IllegalArgumentException {
			int result = ChangeBase.changeBase(x, base.getNum());
			assertEquals(result, x);
		}

		@Test
		void testChangeBaseFromBase() throws IllegalArgumentException {
			char oldBase = (char)10;
			ChangeBase base = new ChangeBase(oldBase);
			char result = ChangeBase.changeBase(x, base.getNum());
			assertEquals(result, oldBase);
		}
}
