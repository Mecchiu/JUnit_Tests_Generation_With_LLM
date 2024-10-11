// FruitDistributionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains one unit test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
private final String str;
		private final int n;

		public FruitDistributionTest(String s, int n) {
			str = s;
			this.n = n;
		}

		@Test
		public void test() {
			assertEquals(str, "Fruit Distribution Test");
			assertEquals(n, 19);
		}
}
