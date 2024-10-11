// BelowZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
	/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns true when the balance falls below zero.
			*/
			@Test
			void testBelowZero() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0);
						assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns false when the balance never falls below zero.
			*/
			@Test
			void testNotBelowZero() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0);
						assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns true when the balance falls below zero after a deposit.
			*/
			@Test
			void testBelowZeroAfterDeposit() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0, 700.0);
						assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns true when the balance falls below zero after a withdrawal.
			*/
			@Test
			void testBelowZeroAfterWithdrawal() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0, 700.0, -800.0);
						assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns true when the balance falls below zero after a deposit and a withdrawal.
			*/
			@Test
			void testBelowZeroAfterDepositAndWithdrawal() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0, 700.0, -800.0, 900.0);
						assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns false when the balance never falls below zero after a deposit.
			*/
			@Test
			void testNotBelowZeroAfterDeposit() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, 600.0);
						assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns false when the balance never falls below zero after a withdrawal.
			*/
			@Test
			void testNotBelowZeroAfterWithdrawal() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0, 700.0);
						assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns false when the balance never falls below zero after a deposit and a withdrawal.
			*/
			@Test
			void testNotBelowZeroAfterDepositAndWithdrawal() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, -600.0, 700.0, -800.0, 900.0, -1000.0);
						assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method throws an IllegalArgumentException when the operation type is invalid.
			*/
			@Test
			void testInvalidOperationType() {
						List<Object> operations = List.of(100.0, 200.0, 300.0, 400.0, 500.0, "600.0");
						assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
			}

			/**
			* Test case for {@link BelowZero#belowZero(List)} method.
			* It checks if the method returns false when the operations list is empty.
			*/
			@Test
			void testEmptyOperationsList() {
						List<Object> operations = List.of();
						assertFalse(BelowZero.belowZero(operations));
			}
}
