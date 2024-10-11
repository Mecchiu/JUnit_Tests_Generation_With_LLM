// ChooseNumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains one unit test case for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {
@Test
		public void testChooseNum(int i, int j) {
			assertEquals("Incorrect number", j, chooseNum(i, j).intValue());
		}
}

