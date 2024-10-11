// ClosestIntegerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains one unit test case for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {

	@Test
    public void testValueOf() {
    	assertEquals(ClosestInteger.closestInteger("2"), 2);
    	assertEquals(ClosestInteger.closestInteger("10"), 10);
    	assertEquals(ClosestInteger.closestInteger("01"), 1);
    	assertEquals(ClosestInteger.closestInteger("-2"), -2);
    	assertEquals(ClosestInteger.closestInteger("-10"), -10);
    	assertEquals(ClosestInteger.closestInteger("-01"), -1);
    	assertEquals(ClosestInteger.closestInteger("-2"), -2);
		}
		@Test
		void testGet() {
		assertEquals(ClosestInteger.<Integer>closestInteger("2"), 2);
		assertEquals(ClosestInteger.<Integer>closestInteger("1"), 1);
		}}
	/* test cases */