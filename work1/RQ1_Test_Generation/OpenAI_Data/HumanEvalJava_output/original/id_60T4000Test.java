// SumToNTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN() {
		assertEquals(15, SumToN.sumToN(5));
		assertEquals(55, SumToN.sumToN(10));
		assertEquals(1, SumToN.sumToN(1));
		assertEquals(21, SumToN.sumToN(6));
		assertEquals(66, SumToN.sumToN(11));
		assertEquals(465, SumToN.sumToN(30));
		assertEquals(5050, SumToN.sumToN(100));
		assertEquals(0, SumToN.sumToN(0));
		assertEquals(1, SumToN.sumToN(-1));
		assertEquals(0, SumToN.sumToN(-10));
	}
}

// SumToN.java
package refactored;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package refactored;


import org.