// IsMultiplyPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains one unit test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

    private IsMultiplyPrimeTest(){
        System.out.println("Test " + this.getClass().getSimpleName() + " with initial conditions - class initialized!");
    }

    @Test
    public void isMultiplyPrimeTest(){
        System.out.println("" + IsMultiplyPrimeTest.class.getSimpleName() + " with initial conditions - the following assertion(s) fails :");
        assertTrue(IsMultiplyPrime.isMultiplyPrime(10));
        try{
            assertTrue(IsMultiplyPrime.isMultiplyPrime(2));
            assertTrue(false);
        }
        catch (AssertionError ex) {
            assertTrue(ex.getMessage(),ex.getMessage().contains("a=5"));
        }
    }

	

}
