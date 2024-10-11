// SpecialfilterTest.java
package scenario2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
    
    @Test
    void testSpecialfilterWithEmptyList() {
        List<Object> nums = Arrays.asList();
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberGreaterThan10AndOddFirstAndLastDigits() {
        List<Object> nums = Arrays.asList(123);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(1, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberGreaterThan10AndEvenFirstDigit() {
        List<Object> nums = Arrays.asList(234);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberGreaterThan10AndEvenLastDigit() {
        List<Object> nums = Arrays.asList(3210);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberGreaterThan10AndOddFirstDigitButEvenLastDigit() {
        List<Object> nums = Arrays.asList(1350);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberGreaterThan10AndEvenFirstDigitButOddLastDigit() {
        List<Object> nums = Arrays.asList(2461);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithOneNumberLessThan10() {
        List<Object> nums = Arrays.asList(5);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSpecialfilterWithTwoNumbersGreaterThan10AndOddFirstAndLastDigits() {
        List<Object> nums = Arrays.asList(123, 789);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(2, result);
    }
    
    @Test
    void testSpecialfilterWithTwoNumbersGreaterThan10AndOnlyOneWithOddFirstAndLastDigits() {
        List<Object> nums = Arrays.asList(123, 246);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(1, result);
    }
    
    @Test
    void testSpecialfilterWithTwoNumbersGreaterThan10AndNoneWithOddFirstAndLastDigits() {
        List<Object> nums = Arrays.asList(246, 468);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
}