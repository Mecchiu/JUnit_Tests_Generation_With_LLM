// EvenOddCountTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
// EvenOddCount.java
package original;

import java.util.Arrays;
import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
        int even = 0;
        int odd = 0;
        if (num == 0) {
            even++;
        }
        while (num!= 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        return Arrays.asList(even, odd);
    }
}

// EvenOddCountTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		public static String evenOddCountTest(int num) {
			if (num == 0) return "zero";
			StringBuilder result = new StringBuilder();
			if (num % 2 == 0) {
				result.append(num + " ");
			}
			return result.toString();
		}

		@Test
		public void testEvenOddCount() {
			assertEquals(evenOddCount((-123)), Arrays.asList(0, 1));
			assertEquals(evenOddCount(123), Arrays.asList(1, 2));
			assertEquals(evenOddCount(-78), Arrays.asList(1, 0));
			assertEquals(evenOddCount(3452), Arrays.asList(2, 2));
			assertEquals(evenOddCount(-345821), Arrays.asList(3, 3));
			assertEquals(evenOddCount(-2), Arrays.asList(1, 0));
			assertEquals(evenOddCount(-45347), Arrays.asList(3, 3));
			assertEquals(evenOddCount(0), Arrays.asList(1, 0));
		}
		@Test
		public void testevenOddCount1() {
			int[] nums = {-12, 123, -1, 0, -78, 3452, -345821, -2, -45347};
			List<Integer> list = evenOddCount(12);
			assertEquals(list.size(), nums.length);
			for (int num : nums) {
				assertTrue(list.contains(num));
			}
		}
		@Test
		public void testevenOddCount1b() {
			int[] nums = {0, 1, 0, -78, 3452, -345821, -2, -45347};
			List<Integer> list = evenOddCount(0);
			assertEquals(list.size(), nums.length);
			for (int num : nums) {
				assertTrue(list.contains(num));
			}
		}
		@Test
		public void testevenOddCount2() {
			int[] nums = {0, 1, 0, -1, -78, 3452, -345821, -2, -45347};
			List<Integer> list = evenOddCount(1);
			assertTrue(list.contains(nums[0]));
		}
		@Test
			public void testevenOddCount5b() {
			boolean[][] nums = {true, true, true, true, true};
			List<Integer> list = evenOddCount(5);
			assertTrue(list.contains(nums[1][1]));
		}
}