// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@Test
	void testLargestPrimeFactor() {
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
		assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
		assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
		assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
		assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
		assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
		assertEquals(2, LargestPrimeFactor.largestPrimeFactor(8));
	}
}

// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            } else {
                i++;
            }
        }
        return largestPrimeFactor;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
		
	@