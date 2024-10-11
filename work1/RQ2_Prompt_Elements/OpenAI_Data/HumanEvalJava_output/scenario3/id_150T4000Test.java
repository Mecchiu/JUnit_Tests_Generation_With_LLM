// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {

	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOrY.xOrY(2, 2, 0));
	}
}

// XOrY.java
package scenario3;

class XOrY {

    /**
     * A simple program which should return the value of x if n is
     * a prime number and should return the value of y otherwise.
     *
     * Examples:
     * for xOrY(7, 34, 12) == 34
     * for xOrY(15, 8, 5) == 5
     *
     * > xOrY(7, 34, 12)
     * 34
     * > xOrY(15, 8, 5)
     * 5
     * > xOrY(3, 33, 5212)
     * 33
     * > xOrY(1259, 3, 52)
     * 3
     * > xOrY(7919, -1, 12)
     * -1
     * > xOrY(3609, 1245, 583)
     * 583
     * > xOrY(91, 56, 129)
     * 129
     * > xOrY(6, 34, 1234)
     * 1234
     * > xOrY(1, 2, 0)
     * 0
     * > xOrY(2, 2, 0)
     * 2
     */
    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        if (n == 2) {
            return x;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
		
	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOrY.xOrY(2, 2, 0));
	}
}

// XOrY.java
package scenario3;

class XOrY {

    /**
     * A simple program which should return the value of x if n is
     * a prime number and should return the value of y otherwise.
     *
     * Examples:
     * for xOrY(7, 34, 12) == 34
     * for xOrY(15, 8, 5) == 5
     *
     * > xOrY(7, 34, 12)
     * 34
     * > xOrY(15, 8, 5)
     * 5
     * > xOrY(3, 33, 5212)
     * 33
     * > xOrY(1259, 3, 52)
     * 3
     * > xOrY(7919, -1, 12)
     * -1
     * > xOrY(3609, 1245, 583)
     * 583
     * > xOrY(91, 56, 129)
     * 129
     * > xOrY(6, 34, 1234)
     * 1234
     * > xOrY(1, 2, 0)
     * 0
     * > xOrY(2, 2, 0)
     * 2
     */
    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        if (n == 2) {
            return x;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
		
	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOrY.xOrY(2, 2, 0));
	}
}

// XOrY.java
package scenario3;

class XOrY {

    /**
     * A simple program which should return the value of x if n is
     * a prime number and should return the value of y otherwise.
     *
     * Examples:
     * for xOrY(7, 34, 12) == 34
     * for xOrY(15, 8, 5) == 5
     *
     * > xOrY(7, 34, 12)
     * 34
     * > xOrY(15, 8, 5)
     * 5
     * > xOrY(3, 33, 5212)
     * 33
     * > xOrY(1259, 3, 52)
     * 3
     * > xOrY(7919, -1, 12)
     * -1
     * > xOrY(3609, 1245, 583)
     * 583
     * > xOrY(91, 56, 129)
     * 129
     * > xOrY(6, 34, 1234)
     * 1234
     * > xOrY(1, 2, 0)
     * 0
     * > xOrY(2, 2, 0)
     * 2
     */
    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        if (n == 2) {
            return x;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
		
	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOrY.xOrY(2, 2, 0));
	}
}

// XOrY.java
package scenario3;

class XOrY {

    /**
     * A simple program which should return the value of x if n is
     * a prime number and should return the value of y otherwise.
     *
     * Examples:
     * for xOrY(7, 34, 12) == 34
     * for xOrY(15, 8, 5) == 5
     *
     * > xOrY(7, 34, 12)
     * 34
     * > xOrY(15, 8, 5)
     * 5
     * > xOrY(3, 33, 5212)
     * 33
     * > xOrY(1259, 3, 52)
     * 3
     * > xOrY(7919, -1, 12)
     * -1
     * > xOrY(3609, 1245, 583)
     * 583
     * > xOrY(91, 56, 129)
     * 129
     * > xOrY(6, 34, 1234)
     * 1234
     * > xOrY(1, 2, 0)
     * 0
     * > xOrY(2, 2, 0)
     * 2
     */
    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        if (n == 2) {
            return x;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
		
	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOrY.xOrY(2, 2, 0));
	}
}

// XOrY.java
package scenario3;

class XOrY {

    /**
     * A simple program which should return the value of x if n is
     * a prime number and should return the value of y otherwise.
     *
     * Examples:
     * for xOrY(7, 34, 12) == 34
     * for xOrY(15, 8, 5) == 5
     *
     * > xOrY(7, 34, 12)
     * 34
     * > xOrY(15, 8, 5)
     * 5
     * > xOrY(3, 33, 5212)
     * 33
     * > xOrY(1259, 3, 52)
     * 3
     * > xOrY(7919, -1, 12)
     * -1
     * > xOrY(3609, 1245, 583)
     * 583
     * > xOrY(91, 56, 129)
     * 129
     * > xOrY(6, 34, 1234)
     * 1234
     * > xOrY(1, 2, 0)
     * 0
     * > xOrY(2, 2, 0)
     * 2
     */
    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        if (n == 2) {
            return x;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
		
	@Test
	void testXOrY() {
		assertEquals(34, XOrY.xOrY(7, 34, 12));
		assertEquals(5, XOrY.xOrY(15, 8, 5));
		assertEquals(33, XOrY.xOrY(3, 33, 5212));
		assertEquals(3, XOrY.xOrY(1259, 3, 52));
		assertEquals(-1, XOrY.xOrY(7919, -1, 12));
		assertEquals(583, XOrY.xOrY(3609, 1245, 583));
		assertEquals(129, XOrY.xOrY(91, 56, 129));
		assertEquals(1234, XOrY.xOrY(6, 34, 1234));
		assertEquals(0, XOrY.xOrY(1, 2, 0));
		assertEquals(2, XOr