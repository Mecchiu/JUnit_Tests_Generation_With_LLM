// IsPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains one unit test case for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {

    private int testValue = 101;
	
	/**
	* Test isPrime(value) method with an argument of value.
	* @throws Exception 
	*/
    @Test
    public void testIsPrimeTest( ) throws Exception {
        assertTrue(IsPrime.isPrime(testValue));
    }
	
}
