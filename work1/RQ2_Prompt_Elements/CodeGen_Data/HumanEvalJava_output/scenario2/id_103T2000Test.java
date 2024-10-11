// RoundedAvgTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains one unit test case for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {


    final static  int NUM = 3;

	// Class under test
    private static object o = new object();

    @Test
    void test() {
        assertEquals(new RoundedAvg().roundedAvg( 0, Num), "0b");
        assertEquals(new RoundedAvg().roundedAvg(1, Num), "00");
		assertEquals(new RoundedAvg().roundedAvg(-2, Num), "-00000");
		assertEquals(new RoundedAvg().roundedAvg(0, 0), "0000");
		assertEquals(new RoundedAvg().roundedAvg(Num, 0), "b");
    }

    @Test
    void testRoundedAvgOfEmptyArray() {
        assertNull(new RoundedAvg().roundedAvg( new Object[0], 0));
    }

    @Test
    void testRoundedAvgOfTwoArrays() {
        RoundedAvg ra = new RoundedAvg();
        assertEquals(ra.roundedAvg(new int[]{0, 1}, 0), "00b");
        assertNull(ra.roundedAvg(new int[]{}, 0));
        assertEquals(ra.roundedAvg(new int[]{1}, 1), "01b");
        assertEquals(ra.roundedAvg(new int[]{2}, 2), "01b");
        assertNull(ra.roundedAvg(new int[]{0,2}, 1));
        assertNull(ra.roundedAvg(new int[]{1,2}, 1));
        assertNull(ra.roundedAvg(new int[]{-1}, -1));
        assertNull(ra.roundedAvg(new int[]{-1, -1}, -1));
        assertNull(ra.roundedAvg(new int[]{}, -1));
        assertNull(ra.roundedAvg(new int[]{-1}, -1));
        assertNull(ra.roundedAvg(new int[]{0, -1}, -1));
        assertNull(ra.roundedAvg(new int[]{1, -1}, -1));
        assertNull(ra.roundedAvg(new int[]{-1, 0}, -1));
        assertEquals(ra.roundedAvg(new int[]{0,1}, 1), "b");
	}

    @Test
    void testRoundedAvgOfTwoArraysWithDifferentSize() {
        
        RoundedAvg ra = new RoundedAvg();
        try {
            ra.roundedAvg(new int[]{(new Object[]{1}), (new Object[]{4}), (new Object[]{2}), (new Object[]{5}), (new Object[]{0})}, 3);
			fail();
        }
        catch(Exception ex) {
            
			
        }
        assertTrue(true);
   }

	class object {
		public double method() {
			return 42.0;
		}
	}

}
