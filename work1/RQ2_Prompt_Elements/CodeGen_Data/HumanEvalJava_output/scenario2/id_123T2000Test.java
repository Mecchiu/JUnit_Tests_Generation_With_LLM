// GetOddCollatzTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains one unit test case for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
// GetOddCollatz.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GetOddCollatz {

    /**
     * * Given a positive integer n, return a sorted list that has the odd numbers in collatz sequence.
     *
     * The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
     * as follows: start with any positive integer n. Then each term is obtained from the
     * previous term as follows: if the previous term is even, the next term is one half of
     * the previous term. If the previous term is odd, the next term is 3 times the previous
     * term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
     *
     * Note:
     * 1. Collatz(1) is [1].
     * 2. returned list sorted in increasing order.
     */
    public static List<Integer> getOddCollatz(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n!= 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        Collections.sort(result);
        return result;
    }
}

// GetOddCollatzTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains one unit test case for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
		/**
		 * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
		 * @throws Exception Assertion failure in case {@link GetOddCollatz#getOddCollatz(int)} fails.
		 */
    @Test
    public void testGetOddCollatz() throws Exception {
        //test 1
        int n = 1;
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> oddCollatzResult = new ArrayList<Integer>();
        result.add(1);
        oddCollatzResult.add(1);
        result.add(2);
        oddCollatzResult.add(2);
        List<Integer> odd = GetOddCollatz.getOddCollatz(n);
        assertEquals(n, odd.size());
        assertTrue(oddCollatzResult.containsAll(odd));
        // test 2
        n = 3;
        oddCollatzResult.add(1);
        oddCollatzResult.add(2);
        oddCollatzResult.add(3);
        evenCollatzResult.add(n);
        List<Integer> even = GetOddCollatz.getOddCollatz(n);
        assertEquals(n, even.size());
        assertTrue(evenCollatzResult.containsAll(even));

        // test 3
        n = 0;
        oddCollatzResult.add(1);
        oddCollatzResult.add(3);
        oddCollatzResult.add(n);
        evenCollatzResult.add(n);
        nonEvenCollatzResult.add(n);
        List<Integer> nonEven = GetOddCollatz.getOddCollatz(n);
        assertEquals(3, nonEven.size());
        assertFalse(oddCollatzResult.containsAll(nonEven));
    }

        /**
		 * Test case:
		 * When n = {@code 2}, we return {@code [2]} in {@code getOddCollatz()} {@code oddCollatzResult} returns {@code [2]} in
		 * {@code getOddCollatz()} {@code evenCollatzResult} returns {@code [1, 2]} in order to get the sequence that ends in 4.
		 */
    @Test
    public void testEvenCollatzAndEndOddScenario() {
        int n = 2;
        List<Integer> evenCollatzResult = new ArrayList<Integer>();
        List<Integer> oddCollatzResult = new ArrayList<Integer>();
        List<Integer> evenCollatzResult2 = new ArrayList<Integer>();
        evenCollatzResult.add(n);
        oddCollatzResult.add(n);
        evenCollatzResult.add(n);
        evenCollatzResult.add(n);
        oddCollatzResult.add(n);
        List<Integer> evenPrime = GetOddCollatz.getEvenClosestPrime(n);
        List<Integer> oddPrime = GetOddCollatz.getOddClosestPrime(n);
        List<Integer> oddPrime2 = GetOddCollatz.getOddClosestTriplePrime(n);
        List<Integer> evenNonPrime = GetOddCollatz.getEvenNonPrime(n);
        List<Integer> oddNonPrime = GetOddCollatz.getOddNonPrime(n);
        List<Integer> evenTrianglePrime = GetOddCollatz.getEvenTriangledPrime(n);
        List<Integer> oddTrianglePrime = GetOddCollatz.getOddTriangledPrime(n);
        List<Integer> oddTrianglePrime2 = GetOddCollatz.getOddTriangledTriplePrime(n);
        List<Integer> oddTrianglePrime2prime = GetOddCollatz.getOddTriangledTriplePrime2(n);
        List<Integer> oddTrianglePrime3 = GetOddCollatz.getOddTriangledTriplePrime3(n);
        List<Integer> oddTrianglePrime3prime = GetOddCollatz.getOddTriangledTriplePrime3(n);
        List<Integer> oddTrianglePrime2primeprime = GetOddCollatz.getOddTriangledTriplePrime2prime(n);
        List<Integer> evenEndOdd = GetOddCollatz.getEvenEndOdd(n);
        List<Integer> nonEvenEndOdd = GetOddCollatz.getNonEvenEndOdd(n);

        List<Integer> evenList = GetOddCollatz.getEvenEndOdd(n);
        List<Integer> oddList = GetOddCollatz.getEndOdd(n);
        assertEquals(evenEndOdd, evenList);
        assertEquals(oddEndOdd, oddList);

        List<Integer> evenListprime = GetOddCollatz.getEvenPrime(n);
        List<Integer> oddListprime = GetOddCollatz.getPrime(n);
        assertEquals(evenPrime, evenListprime);
        assertEquals(oddListprime, oddList);

        List<Integer> evenListprime2 = GetOddCollatz.getPrime2(n);
        List<Integer> oddListprime2 = GetOddCollatz.getPrime2(n);
        assertEquals(evenPrime, evenListprime2);
        assertEquals(oddListprime2, oddList);

        List<Integer> evenListprime3 = GetOddCollatz.getPrime3(n);
        List<Integer> oddListprime3 = GetOddCollatz.getPrime3(n);
        assertEquals(evenPrime, evenListprime3);
        assertEquals(oddListprime3, oddList);

        List<Integer> evenListprime3prime = GetOddCollatz.getPrime3prime(n);
        List<Integer> oddListprime3prime = GetOddCollatz.getPrime3prime(n);
        assertEquals(evenPrime, evenListprime3prime);
        assertEquals(oddListprime3prime, oddList);

        List<Integer> oddListPrimeprimeprime = GetOddCollatz.getPrimePrimePrime(n);
        List<Integer> evenListPrimeprimeprime = GetOddCollatz.getPrimePrimePrimePrime(n);
        assertEquals(evenPrimeprime, evenListPrimeprime);
        assertEquals(oddListPrimeprimeprime, oddList);

        List<Integer> oddListPrimeprime2prime = GetOddCollatz.getPrimePrime2primePrime(n);
        List<Integer> evenListPrimeprime2prime = GetOddCollatz.getPrime2primePrimePrime2