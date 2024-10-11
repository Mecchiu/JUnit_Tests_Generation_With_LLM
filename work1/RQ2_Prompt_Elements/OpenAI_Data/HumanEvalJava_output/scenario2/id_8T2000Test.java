// SumProductTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(15, result.get(0));
        assertEquals(50, result.get(1));
    }

    // Test case 4: List with three elements
    @Test
    void testThreeElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(30, result.get(0));
        assertEquals(750, result.get(1));
    }

    // Test case 5: List with four elements
    @Test
    void testFourElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(50, result.get(0));
        assertEquals(15000, result.get(1));
    }

    // Test case 6: List with five elements
    @Test
    void testFiveElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(75, result.get(0));
        assertEquals(375000, result.get(1));
    }

    // Test case 7: List with six elements
    @Test
    void testSixElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(105, result.get(0));
        assertEquals(33750000, result.get(1));
    }

    // Test case 8: List with seven elements
    @Test
    void testSevenElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(140, result.get(0));
        assertEquals(1181250000, result.get(1));
    }

    // Test case 9: List with eight elements
    @Test
    void testEightElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(180, result.get(0));
        assertEquals(47250000000L, result.get(1));
    }

    // Test case 10: List with nine elements
    @Test
    void testNineElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(225, result.get(0));
        assertEquals(2132812500000L, result.get(1));
    }
}
