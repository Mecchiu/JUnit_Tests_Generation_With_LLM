// Exchange.java
package scenario3;

import java.util.List;

class Exchange {

    /**
     * In this problem, you will implement a function that takes two lists of numbers,
     * and determines whether it is possible to perform an exchange of elements
     * between them to make lst1 a list of only even numbers.
     * There is no limit on the number of exchanged elements between lst1 and lst2.
     * If it is possible to exchange elements between the lst1 and lst2 to make
     * all the elements of lst1 to be even, return "YES".
     * Otherwise, return "NO".
     * For example:
     * exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
     * exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
     * It is assumed that the input lists will be non-empty.
     *
     * > exchange([1, 2, 3, 4], [1, 2, 3, 4])
     * "YES"
     * > exchange([1, 2, 3, 4], [1, 5, 3, 4])
     * "NO"
     * > exchange([1, 2, 3, 4], [2, 1, 4, 3])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 4])
     * "YES"
     * > exchange([5, 7, 3], [2, 6, 3])
     * "NO"
     * > exchange([3, 2, 6, 1, 8, 9], [3, 5, 5, 1, 1, 1])
     * "NO"
     * > exchange([100, 200], [200, 200])
     * "YES"
     */
    public static String exchange(List<Integer> lst1, List<Integer> lst2) {
        int sum = 0;
        int oddCount = 0;
        for (int i = 0; i < lst1.size(); i++) {
            int num = lst1.get(i);
            if (num % 2 != 0) {
                oddCount++;
            } else {
                sum += num;
            }
        }
        if (oddCount % 2 != 0) {
            return "NO";
        }
        for (int i = 0; i < lst2.size(); i++) {
            int num = lst2.get(i);
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum % 2 == 0 ? "YES" : "NO";
    }
}

// ExchangeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
    @Test
    void testExchange1() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(1, 2, 3, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange2() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(1, 5, 3, 4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange3() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(2, 1, 4, 3);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange4() {
        List<Integer> lst1 = Arrays.asList(5, 7, 3);
        List<Integer> lst2 = Arrays.asList(2, 6, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange5() {
        List<Integer> lst1 = Arrays.asList(5, 7, 3);
        List<Integer> lst2 = Arrays.asList(2, 6, 3);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange6() {
        List<Integer> lst1 = Arrays.asList(3, 2, 6, 1, 8, 9);
        List<Integer> lst2 = Arrays.asList(3, 5, 5, 1, 1, 1);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange7() {
        List<Integer> lst1 = Arrays.asList(100, 200);
        List<Integer> lst2 = Arrays.asList(200, 200);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange8() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 6);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange9() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 5);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange10() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 7);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
}