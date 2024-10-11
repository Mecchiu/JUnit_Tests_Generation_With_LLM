// ExchangeTest.java
package scenario1;

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
    void testExchangeWithEmptyLists() {
        List<Integer> lst1 = Arrays.asList();
        List<Integer> lst2 = Arrays.asList();
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithOneEvenNumberAndOneOddNumber() {
        List<Integer> lst1 = Arrays.asList(2);
        List<Integer> lst2 = Arrays.asList(3);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithOneEvenNumberAndOneEvenNumber() {
        List<Integer> lst1 = Arrays.asList(2);
        List<Integer> lst2 = Arrays.asList(4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithOneOddNumberAndOneOddNumber() {
        List<Integer> lst1 = Arrays.asList(3);
        List<Integer> lst2 = Arrays.asList(5);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndTwoEvenNumbers() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(2, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndOneEvenNumber() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(2);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndTwoEvenNumbersAndOneZero() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(0, 2, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndTwoEvenNumbersAndTwoZeros() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(0, 2, 4, 0);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndTwoEvenNumbersAndThreeZeros() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(0, 2, 4, 0, 0);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    @Test
    void testExchangeWithTwoOddNumbersAndTwoEvenNumbersAndFourZeros() {
        List<Integer> lst1 = Arrays.asList(1, 3);
        List<Integer> lst2 = Arrays.asList(0, 2, 4, 0, 0, 0);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
}