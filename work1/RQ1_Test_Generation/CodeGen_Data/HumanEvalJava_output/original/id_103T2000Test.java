// RoundedAvgTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains one unit test case for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {

		private final static String TEST_PASS;
		private final static String TEST_FAIL;
		
		static {
			try {
				RoundedAvgTest.TEST_PASS = "<HelloWorld0>".replaceAll("\\s+", " ");
			} catch (Exception e) {
				//do nothing
			}
			try {
				RoundedAvgTest.TEST_FAIL =  "HelloWorldX".replaceAll("\\s+", " ");
			} catch (Exception e) {
				// do nothing
			}
		}
		
		@Test
		public void testRoundedAvg() {
			assertTrue(roundedAvg(0, 5) instanceof String);
			assertTrue(roundedAvg(5, 5) instanceof String);
			assertTrue(roundedAvg(0, -5) instanceof String);
			assertTrue(roundedAvg(5, -5) instanceof String);

			// Test with a negative integer.
			final int n = Integer.parseInt("-1");
			this.testRoundedAvg(n, n);
			
			// Test with a large integer.
			final int m = Integer.parseInt("6FFFFFFFFFFFFFFFFF2");
			this.testRoundedAvg(n, m);
			assertFalse(roundedAvg(n, m) instanceof String);
		}

		private void testRoundedAvg(int n, int m) {
			assertTrue(roundedAvg(n, m) instanceof String);
			assertTrue(roundedAvg(n, Integer.MAX_VALUE) instanceof String);
			assertTrue(roundedAvg(Integer.MAX_VALUE, m) instanceof String);
			assertTrue(roundedAvg(m, n) instanceof String);

			// Test with a negative integer.
			final int n1 = roundedAvg(Integer.parseInt("-1"), n);
			final int n2 = roundedAvg(Integer.parseInt("-1"), Integer.MAX_VALUE);
			final int m1 = roundedAvg(Integer.parseInt("0"), n1);
			final int m2 = roundedAvg(Integer.parseInt("0"), Integer.MAX_VALUE);
			final int m3 = roundedAvg(Integer.MAX_VALUE, m1);
			
		}

		public static Object roundedAvg(Object o1, Object o2) {
				String roundedAvg = o1 instanceof String? (o1.toString() + "").replaceAll("\\s+", " "): o1;
				return roundedAvg + (o2 instanceof String? (o2.toString() + "").replaceAll("\\s+", " "): o2);
		}
}

