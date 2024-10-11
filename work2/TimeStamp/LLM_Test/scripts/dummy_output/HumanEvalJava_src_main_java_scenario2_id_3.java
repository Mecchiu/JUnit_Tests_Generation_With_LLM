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
			* Test case 1: Test with empty list.
			* Expected result: False
			*/
			@Test
			void testEmptyList() {
				List<Object> operations = List.of();
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 2: Test with one deposit operation.
			* Expected result: False
			*/
			@Test
			void testOneDeposit() {
				List<Object> operations = List.of(100.0);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 3: Test with one withdrawal operation.
			* Expected result: True
			*/
			@Test
			void testOneWithdrawal() {
				List<Object> operations = List.of(-100.0);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case 4: Test with multiple deposit operations.
			* Expected result: False
			*/
			@Test
			void testMultipleDeposits() {
				List<Object> operations = List.of(100.0, 200.0, 300.0);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 5: Test with multiple withdrawal operations.
			* Expected result: True
			*/
			@Test
			void testMultipleWithdrawals() {
				List<Object> operations = List.of(-100.0, -200.0, -300.0);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case 6: Test with both deposit and withdrawal operations.
			* Expected result: False
			*/
			@Test
			void testBothDepositsAndWithdrawals() {
				List<Object> operations = List.of(100.0, -200.0, 300.0, -400.0);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 7: Test with deposit and withdrawal operations that result in zero balance.
			* Expected result: False
			*/
			@Test
			void testZeroBalance() {
				List<Object> operations = List.of(100.0, -100.0);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 8: Test with deposit and withdrawal operations that result in negative balance.
			* Expected result: True
			*/
			@Test
			void testNegativeBalance() {
				List<Object> operations = List.of(100.0, -200.0, 300.0, -400.0, 500.0, -600.0);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case 9: Test with deposit and withdrawal operations that result in positive balance.
			* Expected result: False
			*/
			@Test
			void testPositiveBalance() {
				List<Object> operations = List.of(100.0, -200.0, 300.0, -400.0, 500.0);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case 10: Test with invalid operation type.
			* Expected result: IllegalArgumentException
			*/
			@Test
			void testInvalidOperationType() {
				List<Object> operations = List.of(100.0, "200.0");
				assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
			}
}