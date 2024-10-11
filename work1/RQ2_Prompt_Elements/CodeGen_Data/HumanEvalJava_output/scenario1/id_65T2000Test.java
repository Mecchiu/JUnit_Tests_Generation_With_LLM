// CircularShiftTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains one unit test case for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

    private final int ARGUMENT = 0x1;
    private final int TESTS = 0x2;
    private final int RES = 0x3;

    /**
	 * It run and test the {@link CircularShift#circularShift(int,int)} method for the
	 * purpose of this test case.
       
	 */
    @Test
    public void testCirShitlShift() {
        System.out.println("CircularShiftTest -------------------------------------");
        assertEquals("", Integer.toString(ARGUMENT), Integer.toString(CircularShift.circularShift(ARGUMENT, TESTS)));
        assertEquals("", Integer.toString(TESTS), Integer.toString(CircularShift.circularShift(ARGUMENT, RES)));
        assertEquals("", Integer.toString(RES), Integer.toString(CircularShift.circularShift(RES, TESTS)));
    }
	
}
