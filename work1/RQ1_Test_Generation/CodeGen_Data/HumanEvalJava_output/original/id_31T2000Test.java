// IsPrimeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains one unit test case for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
private final static int MAX = Integer.MAX_VALUE;
		private final static int MIN = Integer.MIN_VALUE;

		@Test (expected = ArithmeticException.class)
		public void testNaN(){
			IsPrime.isPrime(-20);
		}

		@Test (expected = ArithmeticException.class)
		public void testNull(){
			IsPrime.isPrime(null);
		}

		@Test
		public void testIntegerMax(){
			assertArrayEquals(new int[]{MIN,MAX},IsPrime.isPrime(Integer.MAX_VALUE).toArray());
			assertArrayEquals(new int[]{MAX},IsPrime.isPrime(Integer.MAX_VALUE).toArray());
		}

		@Test
		public void testIntegerMin(){
			assertArrayEquals(new int[]{MIN,MAX},IsPrime.isPrime(Integer.MIN_VALUE).toArray());
			assertArrayEquals(new int[]{MIN,MAX},IsPrime.isPrime(Integer.MIN_VALUE).toArray());
		}

		@Test
		public void testInteger(){
			assertArrayEquals(new int[] {-6,6,7,7,8,8,8,8,8,5,6,5,8,8},IsPrime.isPrime(1000).toArray());
		}
}
