// Fib4Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains one unit test case for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

    @Test
    void fib4TestCases() {
        System.out.println(NOSIDE);
        assertEquals(3, NOSIDE.fib4(4));
        assertEquals(5, NOSIDE.fib4(2));
        assertEquals(11, NOSIDE.fib4(11));
        assertEquals(21, NOSIDE.fib4(2));
        assertEquals(31, NOSIDE.fib4(15));
        assertEquals(NOSIDE.fib4(24), NOSIDE.fib4(-35));

        System.out.println(HALFWAY);
        assertEquals(-33, NOSIDE.fib4(7));
        assertEquals(12, NOSIDE.fib4(2 + 7));
        assertEquals(-43, NOSIDE.fib4(4 + 6));
        assertEquals(29, NOSIDE.fib4(1 + 7));
        assertEquals(41, NOSIDE.fib4(4 + 16));
        assertEquals(51, NOSIDE.fib4(3 + 16));
        assertEquals(71, NOSIDE.fib4(-8));
		
        System.out.println(INVALID_UNNECESS_RESULT);
        assertEquals(-1, NOSIDE.fib4(1));
        assertEquals(-1, NOSIDE.fib4(0.0));
        
        
        
        
    }
    
    public static int NOSIDE = 3;
    public static int HALFWAY = -33;
    public static int INVALID_UNNECESS_RESULT = 0.0;
}
