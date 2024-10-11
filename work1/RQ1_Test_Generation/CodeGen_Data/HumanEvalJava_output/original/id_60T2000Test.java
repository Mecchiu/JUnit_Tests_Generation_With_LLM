// SumToNTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains one unit test case for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

// Test to count the maximum number of digits of a number.
// {@link SumToNTest#testMinMaxDigits()} is unit test case of {@link SumToN#maxDigits()} method.
// The number <code>10</code>, <code>10</code>, and <code>100</code> are tested in this unit test case.

// ********************************************************************************
// Test methods, testcases
// ********************************************************************************
    @Test
    public void testMinMaxDigits() {
    
        int digits = 10;
        int[] numbers = {1, 5, 5};

        assertEquals( digits, SumToN.sumToN(digits) );

        numbers = new int[digits];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*5;
        }

        assertEquals( digits, SumToN.sumToN(digits) );
        assertEquals( digits, SumToN.maxDigits() );
        
        digits = 10;

        numbers = new int[digits];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = digits;
        }

        assertEquals( digits, SumToN.sumToN(digits) );
        assertEquals( digits, SumToN.maxDigits() );

    }

    @Test
    public void testMaxDigits() {
    
        int digits = 10;
        int[] numbers = {1, 5, 5};

        assertEquals( digits, SumToN.maxDigits() );

        numbers = new int[digits];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*5;
        }

        assertEquals( digits, SumToN.maxDigits() );
        assertEquals( digits, SumToN.minDigits() );

    }
    /*
    @Test
    public void testCountDigits() {
        int digits = 10;
        int[] numbers = {1, 5, 5};

        assertEquals( digits, SumToN.countDigits(numbers) );

        numbers = new int[digits];

        assertEquals( 2, SumToN.countDigits(numbers) );

        digits = 5;

        numbers = new int[digits];

        assertEquals( 1, SumToN.countDigits(numbers) );
    }

    */
}
