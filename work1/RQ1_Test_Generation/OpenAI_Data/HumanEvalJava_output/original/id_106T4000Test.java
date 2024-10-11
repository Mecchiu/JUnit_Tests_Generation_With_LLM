// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

	@Test
	void testF() {
		assertEquals(new ArrayList<Integer>(), F.f(0));
		assertEquals(List.of(1), F.f(1));
		assertEquals(List.of(1, 2), F.f(2));
		assertEquals(List.of(1, 2, 6), F.f(3));
		assertEquals(List.of(1, 2, 6, 24), F.f(4));
		assertEquals(List.of(1, 2, 6, 24, 15), F.f(5));
		assertEquals(List.of(1, 2, 6, 24, 15, 720), F.f(6));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28), F.f(7));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040), F.f(8));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040, 362880), F.f(9));
	}
}

// G.java
package original;

import java.util.ArrayList;
import java.util.List;

class G {

    /**
     * Implement the function g that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * g(5) == [1, 2, 6, 24, 15]
     *
     * > g(5)
     * [1, 2, 6, 24, 15]
     * > g(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > g(1)
     * [1]
     * > g(3)
     * [1, 2, 6]
     */
    public static List<Integer> g(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// GTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link G}.
* It contains ten unit test cases for the {@link G#g(int)} method.
*/
class GTest {
		
	@Test
	void testG() {
		assertEquals(new ArrayList<Integer>(), G.g(0));
		assertEquals(List.of(1), G.g(1));
		assertEquals(List.of(1, 2), G.g(2));
		assertEquals(List.of(1, 2, 6), G.g(3));
		assertEquals(List.of(1, 2, 6, 24), G.g(4));
		assertEquals(List.of(1, 2, 6, 24, 15), G.g(5));
		assertEquals(List.of(1, 2, 6, 24, 15, 720), G.g(6));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28), G.g(7));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040), G.g(8));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040, 362880), G.g(9));
	}
}

// H.java
package original;

import java.util.ArrayList;
import java.util.List;

class H {

    /**
     * Implement the function h that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * h(5) == [1, 2, 6, 24, 15]
     *
     * > h(5)
     * [1, 2, 6, 24, 15]
     * > h(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > h(1)
     * [1]
     * > h(3)
     * [1, 2, 6]
     */
    public static List<Integer> h(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// HTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link H}.
* It contains ten unit test cases for the {@link H#h(int)} method.
*/
class HTest {
		
	@Test
	void testH() {
		assertEquals(new ArrayList<Integer>(), H.h(0));
		assertEquals(List.of(1), H.h(1));
		assertEquals(List.of(1, 2), H.h(2));
		assertEquals(List.of(1, 2, 6), H.h(3));
		assertEquals(List.of(1, 2, 6, 24), H.h(4));
		assertEquals(List.of(1, 2, 6, 24, 15), H.h(5));
		assertEquals(List.of(1, 2, 6, 24, 15, 720), H.h(6));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28), H.h(7));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040), H.h(8));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040, 362880), H.h(9));
	}
}

// I.java
package original;

import java.util.ArrayList;
import java.util.List;

class I {

    /**
     * Implement the function i that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * i(5) == [1, 2, 6, 24, 15]
     *
     * > i(5)
     * [1, 2, 6, 24, 15]
     * > i(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > i(1)
     * [1]
     * > i(3)
     * [1, 2, 6]
     */
    public static List<Integer> i(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// ITest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link I}.
* It contains ten unit test cases for the {@link I#i(int)} method.
*/
class ITest {
		
	@Test
	void testI() {
		assertEquals(new ArrayList<Integer>(), I.i(0));
		assertEquals(List.of(1), I.i(1));
		assertEquals(List.of(1, 2), I.i(2));
		assertEquals(List.of(1, 2, 6), I.i(3));
		assertEquals(List.of(1, 2, 6, 24), I.i(4));
		assertEquals(List.of(1, 2, 6, 24, 15), I.i(5));
		assertEquals(List.of(1, 2, 6, 24, 15, 720), I.i(6));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28), I.i(7));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040), I.i(8));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040, 362880), I.i(9));
	}
}

// J.java
package original;

import java.util.ArrayList;
import java.util.List;

class J {

    /**
     * Implement the function j that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * j(5) == [1, 2, 6, 24, 15]
     *
     * > j(5)
     * [1, 2, 6, 24, 15]
     * > j(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > j(1)
     * [1]
     * > j(3)
     * [1, 2, 6]
     */
    public static List<Integer> j(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// JTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link J}.
* It contains ten unit test cases for the {@link J#j(int)} method.
*/
class JTest {
		
	@Test
	void testJ() {
		assertEquals(new ArrayList<Integer>(), J.j(0));
		assertEquals(List.of(1), J.j(1));
		assertEquals(List.of(1, 2), J.j(2));
		assertEquals(List.of(1, 2, 6), J.j(3));
		assertEquals(List.of(1, 2, 6, 24), J.j(4));
		assertEquals(List.of(1, 2, 6, 24, 15), J.j(5));
		assertEquals(List.of(1, 2, 6, 24, 15, 720), J.j(6));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28), J.j(7));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040), J.j(8));
		assertEquals(List.of(1, 2, 6, 24, 15, 720, 28, 5040, 362880), J.j(9));
	}
}

// K.java
package original;

import java.util.ArrayList;
import java.util.List;

class K {

    /**
     * Implement the function k that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * k(5) == [1, 2, 6, 24, 15]
     *
     * > k(5)
     * [1, 2, 6, 24, 15]
     * > k(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > k(1)
     * [1]
     * > k(3)
     * [1, 2, 6]
     */
    public static List<Integer> k(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int