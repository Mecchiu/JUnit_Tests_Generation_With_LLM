// SumProduct.java
package scenario3;

import java.util.List;
import java.util.ArrayList;

class SumProduct {

    /**
     * For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
     * Empty sum should be equal to 0 and empty product should be equal to 1.
     *
     * > sumProduct([1, 2, 3, 4])
     * [10, 24]
     * > sumProduct([])
     * [0, 1]
     * > sumProduct([1, 1, 1])
     * [3, 1]
     * > sumProduct([100, 0])
     * [100, 0]
     * > sumProduct([3, 5, 7])
     * [15, 105]
     * > sumProduct([10])
     * [10, 10]
     */
    public static List<Integer> sumProduct(List<Integer> numbers) {
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        List<Integer> result = new ArrayList<>();
        result.add(sum);
        result.add(product);
        return result;
    }
}

// SumProductTest.java
package scenario3;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
    
    @Test
    void testSumProductWithPositiveNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithSameNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithZero() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(100);
        expected.add(0);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithOddNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        List<Integer> expected = new ArrayList<>();
        expected.add(15);
        expected.add(105);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithSingleNumber() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(10);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithNegativeNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        List<Integer> expected = new ArrayList<>();
        expected.add(-10);
        expected.add(-24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithMixedNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithLargeNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1000000);
        numbers.add(2000000);
        numbers.add(3000000);
        List<Integer> expected = new ArrayList<>();
        expected.add(6000000);
        expected.add(6000000000000000);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithNull() {
        List<Integer> numbers = null;
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
}