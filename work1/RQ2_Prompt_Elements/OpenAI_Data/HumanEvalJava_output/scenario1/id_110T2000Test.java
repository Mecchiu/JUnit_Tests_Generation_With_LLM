// ExchangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
	// Test case 1
    @Test
    void testExchange1() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 10);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("YES", result);
    }
			// Test case 2
    @Test
    void testExchange2() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 11);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 3
    @Test
    void testExchange3() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 12);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 4
    @Test
    void testExchange4() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 13);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 5
    @Test
    void testExchange5() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 14);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 6
    @Test
    void testExchange6() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 15);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 7
    @Test
    void testExchange7() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 16);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 8
    @Test
    void testExchange8() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 17);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 9
    @Test
    void testExchange9() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 18);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
			// Test case 10
    @Test
    void testExchange10() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lst2 = List.of(6, 7, 8, 9, 19);
        String result = Exchange.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
}
