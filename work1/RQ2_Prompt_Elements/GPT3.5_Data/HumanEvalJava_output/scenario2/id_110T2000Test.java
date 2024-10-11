// ExchangeTest.java
package scenario2;

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
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 5);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange2() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange3() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange4() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9, 11);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange5() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9, 11, 13);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange6() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9, 11, 13, 15);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange7() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9, 11, 13, 15, 17);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange8() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6);
        List<Integer> lst2 = Arrays.asList(1, 3, 7, 9, 11, 13, 15, 17, 19);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange9() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> lst2 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchange10() {
        List<Integer> lst1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> lst2 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
}