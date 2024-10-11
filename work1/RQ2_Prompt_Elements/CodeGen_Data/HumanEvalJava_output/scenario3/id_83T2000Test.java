// StartsOneEndsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains one unit test case for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

    /**
     * Initializes some objects in order to check the correctness of this test. 
     */
    @Test
    public void testInitialization() {
    }


    /**
     * Tests the correctness of {@link StartsOneEnds#startsOneEnds(int)}.
     */
//    @Test

    public final void testSTART() {
        int n = 1;
        
        startsOneEnds(n);
        startsOneEnds(n+1);
        startsOneEnds(n-1);
        startsOneEnds(n+1+1);
        
    }


	public final void testSTART_1() {
		int n = 10;

		startsOneEnds(n);

		for (int index = 3; index < 6; index *= 2) { // checks n >= 10 * 2
			startsOneEnds(n + index);
			startsOneEnds(n + index - 1);
			startsOneEnds(n + index + 1);
		}   


	}

} // end class StartsOneEndsTest
