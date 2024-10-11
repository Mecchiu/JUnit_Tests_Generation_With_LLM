// Solve1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

	@Test
	void testSolve() {
		assertEquals("1", Solve1.solve(1000));
		assertEquals("110", Solve1.solve(150));
		assertEquals("1100", Solve1.solve(147));
		assertEquals("1001", Solve1.solve(333));
		assertEquals("10010", Solve1.solve(963));
		assertEquals("1101", Solve1.solve(13));
		assertEquals("1101", Solve1.solve(13));
		assertEquals("1101", Solve1.solve(13));
		assertEquals("1101", Solve1.solve(13));
		assertEquals("1101", Solve1.solve(13));
	}
}

// Solve2.java
package original;

class Solve2 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve2Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve2}.
* It contains ten unit test cases for the {@link Solve2#solve(int)} method.
*/
class Solve2Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve2.solve(1000));
		assertEquals("110", Solve2.solve(150));
		assertEquals("1100", Solve2.solve(147));
		assertEquals("1001", Solve2.solve(333));
		assertEquals("10010", Solve2.solve(963));
		assertEquals("1101", Solve2.solve(13));
		assertEquals("1101", Solve2.solve(13));
		assertEquals("1101", Solve2.solve(13));
		assertEquals("1101", Solve2.solve(13));
		assertEquals("1101", Solve2.solve(13));
	}
}

// Solve3.java
package original;

class Solve3 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve3Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve3}.
* It contains ten unit test cases for the {@link Solve3#solve(int)} method.
*/
class Solve3Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve3.solve(1000));
		assertEquals("110", Solve3.solve(150));
		assertEquals("1100", Solve3.solve(147));
		assertEquals("1001", Solve3.solve(333));
		assertEquals("10010", Solve3.solve(963));
		assertEquals("1101", Solve3.solve(13));
		assertEquals("1101", Solve3.solve(13));
		assertEquals("1101", Solve3.solve(13));
		assertEquals("1101", Solve3.solve(13));
		assertEquals("1101", Solve3.solve(13));
	}
}

// Solve4.java
package original;

class Solve4 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve4Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve4}.
* It contains ten unit test cases for the {@link Solve4#solve(int)} method.
*/
class Solve4Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve4.solve(1000));
		assertEquals("110", Solve4.solve(150));
		assertEquals("1100", Solve4.solve(147));
		assertEquals("1001", Solve4.solve(333));
		assertEquals("10010", Solve4.solve(963));
		assertEquals("1101", Solve4.solve(13));
		assertEquals("1101", Solve4.solve(13));
		assertEquals("1101", Solve4.solve(13));
		assertEquals("1101", Solve4.solve(13));
		assertEquals("1101", Solve4.solve(13));
	}
}

// Solve5.java
package original;

class Solve5 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve5Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve5}.
* It contains ten unit test cases for the {@link Solve5#solve(int)} method.
*/
class Solve5Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve5.solve(1000));
		assertEquals("110", Solve5.solve(150));
		assertEquals("1100", Solve5.solve(147));
		assertEquals("1001", Solve5.solve(333));
		assertEquals("10010", Solve5.solve(963));
		assertEquals("1101", Solve5.solve(13));
		assertEquals("1101", Solve5.solve(13));
		assertEquals("1101", Solve5.solve(13));
		assertEquals("1101", Solve5.solve(13));
		assertEquals("1101", Solve5.solve(13));
	}
}

// Solve6.java
package original;

class Solve6 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve6Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve6}.
* It contains ten unit test cases for the {@link Solve6#solve(int)} method.
*/
class Solve6Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve6.solve(1000));
		assertEquals("110", Solve6.solve(150));
		assertEquals("1100", Solve6.solve(147));
		assertEquals("1001", Solve6.solve(333));
		assertEquals("10010", Solve6.solve(963));
		assertEquals("1101", Solve6.solve(13));
		assertEquals("1101", Solve6.solve(13));
		assertEquals("1101", Solve6.solve(13));
		assertEquals("1101", Solve6.solve(13));
		assertEquals("1101", Solve6.solve(13));
	}
}

// Solve7.java
package original;

class Solve7 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100"
     * > solve(333)
     * "1001"
     * > solve(963)
     * "10010"
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve7Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve7}.
* It contains ten unit test cases for the {@link Solve7#solve(int)} method.
*/
class Solve7Test {
		
	@Test
	void testSolve() {
		assertEquals("1", Solve7.solve(1000));
		assertEquals("110", Solve7.solve(150));
		assertEquals("1100", Solve7.solve(147));
		assertEquals("1001", Solve7.solve(333));
		assertEquals("10010", Solve7.solve(963));
		assertEquals("1101", Solve7.solve(13));
		assertEquals("1101", Solve7.solve(13));
		assertEquals("1101", Solve7.solve(13));
		assertEquals("1101", Solve7.solve(13));
		assertEquals("1101", Solve7.solve(13));
	}
}

// Solve8.java
package original;

class Solve8 {

    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Example
     * For N = 1000, the sum of digits will be 1 the output should be "1".
     * For N = 150, the sum of digits will be 6 the output should be "110".
     * For N = 147, the sum of digits will be 12 the output should be "1100".
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     *
     * > solve(1000)
     * "1"
     * > solve(150)
     * "110"
     * > solve(147)
     * "1100