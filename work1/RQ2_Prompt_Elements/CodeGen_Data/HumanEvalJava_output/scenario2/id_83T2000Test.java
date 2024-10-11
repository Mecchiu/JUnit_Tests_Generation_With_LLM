// StartsOneEndsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains one unit test case for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {

    /**
     * Test of method startsOneEnds.
     */
    @Test
    public void testMethod() {
        System.out.println("StartsOneEndsTest");
        int n = 15;
        int result = StartsOneEnds.startsOneEnds(n);
        System.out.println("n: " + n);
        System.out.println("result: " + result);
        assertEquals(n, result);
    }
}
// End StartsOneEndsTest.java