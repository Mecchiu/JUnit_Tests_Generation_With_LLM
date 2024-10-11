// IsMultiplyPrimeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains one unit test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

	/**
	* Creates an instance of this class with the given parameters.
	*
	* @param a the number of prime numbers
	*/
	public IsMultiplyPrimeTest(final int a) {
		
	}
	
	/**
    * Test for the method <code>isMultiplyPrime(int)</code>
    * when the number is 1.
    */
    @Test
    public void testSetArgWhenNumber1() {
    
		System.out.println("isMultiplyPrime(1) -> true");
		
		IsMultiplyPrime isMultiplyPrime = new IsMultiplyPrime();
		
		assertTrue(isMultiplyPrime.isMultiplyPrime(1));
		
		System.out.println("isMultiplyPrime(1) -> false");
		
	}
	
	/**
    * Test for the method <code>isMultiplyPrime(int)</code>
    * when the number is 11.
    */
    @Test
    public void testSetArgWhenNumber11() {
    
		System.out.println("isMultiplyPrime(11) -> true");
		
		IsMultiplyPrime isMultiplyPrime = new IsMultiplyPrime();
		
		assertTrue(isMultiplyPrime.isMultiplyPrime(11));
		
		System.out.println("isMultiplyPrime(11) -> false");
		
	}
	
	/**
    * Test for the method <code>isMultiplyPrime(int)</code>
    * when the number is 23.
    */
    @Test
    public void testSetArgWhenNumber23() {
    
		System.out.println("isMultiplyPrime(23) -> true");
		
		IsMultiplyPrime isMultiplyPrime = new IsMultiplyPrime();
		
		assertTrue(isMultiplyPrime.isMultiplyPrime(23));
		
		System.out.println("isMultiplyPrime(23) -> false");
		
	}
	
	/**
    * Test for the method <code>isMultiplyPrime(int)</code>
    * when the number is 99.
    */
    @Test
    public void testSetArgWhenNumber99() {
    
		System.out.println("isMultiplyPrime(99) -> true");
		
		IsMultiplyPrime isMultiplyPrime = new IsMultiplyPrime();
		
		assertTrue(isMultiplyPrime.isMultiplyPrime(99));
		
		System.out.println("isMultiplyPrime(99) -> false");
		
	}
	
	/**
    * Test for the method <code>isMultiplyPrime(int)</code>
    * when the number is 123.
    */
    @Test
    public void testSetArgWhenNumber123() {
    
		System.out.println("isMultiplyPrime(123) -> true");
		
		IsMultiplyPrime isMultiplyPrime = new IsMultiplyPrime();
		
		assertTrue(isMultiplyPrime.isMultiplyPrime(123));
		
		System.out.println("isMultiplyPrime(123) -> false");
		
	}
	
	
		
}