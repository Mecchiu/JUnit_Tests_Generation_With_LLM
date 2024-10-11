// IsPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains one unit test case for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
@Test
	  public void test() throws Exception {
		 isPrime(33L);
		isPrime(25L);
		isPrime(12L);
		isPrime(65L);
		isPrime(8L);
		isPrime(2L);
	}
}