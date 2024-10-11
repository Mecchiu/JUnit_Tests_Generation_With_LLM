// PrimeFibTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains one unit test case for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
public static final int TEST_VAL = 17;
		private final int val = TEST_VAL;
		private static final int LIMIT = 30;

		@Test
		public void returnPrime() {
			assertEquals(val, PrimeFib.primeFib(val));
		}

		@Test
	    public void returnPrime2() {
			assertEquals(val, PrimeFib.primeFib(2 * val));
		}

		@Test
	    public void returnPrime3() {
			assertEquals(val, PrimeFib.primeFib(8 * val));
		}

		@Test
	    public void wrongValues() {
			assertTrue(false);
		}

		@Test
	    public void wrongValues2() {
			assertEquals(0, PrimeFib.primeFib(-1));
		}

	@Test
	public void returnPrime_limit() { 
		assertEquals(val, PrimeFib.primeFib(val, LIMIT));
	}
}

// Test suite for {@link PrimeFib#PrimeFib(int)}.
class PrimeFibTest_count {
    private static final int LIMIT = 30;
    private static int count;

    @Test
    public void countPrimeFib() { 
        assertEquals(10, count++);
    }

    @Test
    public void countPrimeFib_limit() {
        assertEquals(5, count++);
    }
}


// Unit test for {@link PrimeFib#isPrime(int)}.
class PrimeFibTest_isPrime {
    private static final int LIMIT = 30;
    private static Boolean isPrime;

    static void isPrimeTest(Boolean isPrime, int n) {
        StringBuilder sb = new StringBuilder();
        boolean test1 = isPrime(LIMIT);
        if (n <= 1) {
            return;
        }
        for (int i = 2; i < LIMIT; i++) {
            test1 = test1 && isPrime(i);
        }
        if (!test1) {
            sb.append((n - 1) / i + 1);
            sb.append("-1 ");
        }
        assertEquals("wrong result for isPrime" + sb.toString() + " for n " + String.valueOf(n),
                     true, isPrime(n));
    }

    @Test
    public void isPrime() {
        isPrimeTest(isPrime(TEST_VAL), TEST_VAL);
    }

    @Test
    public void isPrime_limit() {
        isPrimeTest(isPrime(LIMIT), LIMIT);
    }
}


// Unit test for {@link PrimeFib#isPrime(int)}.
class PrimeFibTest_isPrime2 {
    private static final int LIMIT = 30;
    private static Boolean isPrime;
    static void isPrimeTest2(Boolean isPrime, int n) {
        StringBuilder sb = new StringBuilder();
        boolean test1 = isPrime(LIMIT);
        if (n <= 1) {
            return;
        }
        for (int i = 2; i < LIMIT; i++) {
            test1 = test1 && isPrime(i);
        }
        if (!test1) {
            sb.append((n - 1) / i + 1);
            sb.append("-1 ");
        }
        assertEquals("wrong result for isPrime" + sb.toString() + " for n " + String.valueOf(n),
                     true, isPrime(n));
    }

    @Test
    public void isPrime2() {
        isPrimeTest2(isPrime(TEST_VAL), TEST_VAL);
    }

    @Test
    public void isPrime2_limit() {
        isPrimeTest2(isPrime(LIMIT), LIMIT);
    }
}


// Unit test for {@link PrimeFib#isPrime(int)}.
class PrimeFibTest_isPrime3 {
    private static final int LIMIT = 30;
    private static Boolean isPrime;
    static void isPrimeTest3(Boolean isPrime, int n) {
        StringBuilder sb = new StringBuilder();
        boolean test1 = isPrime(n);
        if (n <= 1) {
            return;
        }
        for (int i = 2; i < LIMIT; i++) {
            test1 = test1 && isPrime(i);
        }
        if (!test1) {
            sb.append((n - 1) / i + 1);
            sb.append("-1 ");
        }
        assertEquals("wrong result for isPrime" + sb.toString() + " for n " + String.valueOf(n),
                     true, isPrime(n));
    }

    @Test
    public void testPrime() {
        isPrimeTest3(isPrime(TEST_VAL), TEST_VAL);
    }

    @Test
    public void testPrime_limit() {
        isPrimeTest3(isPrime(LIMIT), LIMIT);
    }
}

