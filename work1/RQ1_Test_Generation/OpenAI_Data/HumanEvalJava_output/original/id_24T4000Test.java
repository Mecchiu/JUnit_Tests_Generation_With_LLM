// LargestDivisorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(3, LargestDivisor.largestDivisor(3));
		assertEquals(2, LargestDivisor.largestDivisor(4));
	}
}

// LargestDivisor.java
package refactored;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

// LargestDivisorTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@