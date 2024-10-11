// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {

	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
		
	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
		
	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
		
	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
		
	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
		
	@Test
	void testIsEqualToSumEven() {
		assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
		assertFalse(IsEqualToSumEven.isEqualToSumEven(17));
		assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
	}
}

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        if (n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            if (