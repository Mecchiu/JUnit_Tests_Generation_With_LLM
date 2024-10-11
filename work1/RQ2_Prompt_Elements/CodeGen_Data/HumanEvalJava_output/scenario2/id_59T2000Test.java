// LargestPrimeFactorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains one unit test case for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

	/**
	 * Test method for {@link LargestPrimeFactor#largestPrimeFactor(int)}.
	 */
	@Test
    public void testLargestPrimeFactor() {
	    
        assertTrue(LargestPrimeFactor.largestPrimeFactor(1000) == 1000);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(10) == 1);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(10) == 10);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(10) == 100);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(100) == 1000);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(200) == 1);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(100) == 2);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(500) == 10);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(1000) == 10);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(10) == 0);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(100) == 0);
        assertTrue(LargestPrimeFactor.largestPrimeFactor(200) == 0);
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(10*10*10*10*10) == 10*10*10*10*10*10*10);
    }

    /**
     * Unit test for {@link LargestPrimeFactor#LargestPrimeFactor(int)}.
     */
    @Test
    public void testLargestPrimeFactorInt() {
        
        int n = 100123;
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(n) == n);
        
        n = 1000;
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(n) == n);
        
        n = 1000000000;
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(n) == n);
        
        n = 1;
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(n) == n);
        
        n = 9;
        
        assertTrue(LargestPrimeFactor.largestPrimeFactor(n) == n);
    }

}

