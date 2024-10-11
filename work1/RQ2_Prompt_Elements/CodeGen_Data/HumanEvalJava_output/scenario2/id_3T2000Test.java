// BelowZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains one unit test case for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	/**
	 * This method tests if all the operations should be executed from a bank account that has
	 * zero balance can be performed on. The expected outcomes of the test are as follows:
	 * <ul>
	 * <li>operation of 0 balance can be executed.</li>
	 * <li>operation of -1 balance can be executed.</li>
	 * <li>Operation of 1 balance is not executed and thus the test failed.</li>
	 * </ul>
	 *
	 * @throws Exception
	 */
	@Test
	public final void zeroBtwBalanceTest() throws Exception {
		
		List<Object> operations = null;
		// Operations
		operations = List.list(0, 1, -1);
		// Test: execute the operations
		assertEquals("Test conditions after successful execution", 1, AboveZero.belowZero(operations).getValue());
		
		operations = List.list(1, 1, -1);
		// Test: execute the operations
		assertEquals("Test conditions after successful execution", 1, AboveZero.belowZero(operations).getValue());
		
		operations = List.list(1, 2, -1);
		// Test: execute the operations
		assertEquals("Test conditions after successful execution", 1, AboveZero.belowZero(operations).getValue());
		
	}

}