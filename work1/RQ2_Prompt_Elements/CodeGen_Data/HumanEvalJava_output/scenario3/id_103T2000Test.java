// RoundedAvgTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains one unit test case for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
private RoundedAvg testedObject;

		RoundedAvgTest() {
			testedObject = new RoundedAvg();
		}
		
		@Test
		public void testRoundedAvg() throws Exception {
			Object obj0 = "obj1";
			assertEquals("" + (Integer) obj0,
					testedObject.roundedAvg(1, 7));
			assertEquals("" + (Integer) obj0,
					testedObject.roundedAvg(1, 5));

			Object obj1 = "obj2";
			assertEquals("" + (Integer) obj1,
					testedObject.roundedAvg(7, 5));
			assertEquals("-1" + (Integer) obj1,
					testedObject.roundedAvg(-1, 5));
		}

}