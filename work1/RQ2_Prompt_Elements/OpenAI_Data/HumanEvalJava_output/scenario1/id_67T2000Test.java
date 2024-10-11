// FruitDistributionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
	// Test case 1: Test the case when the input string is null.
    @Test
    void testFruitDistributionNull() {
        String s = null;
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 2: Test the case when the input string is empty.
    @Test
    void testFruitDistributionEmpty() {
        String s = "";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 3: Test the case when the input string contains only one fruit.
    @Test
    void testFruitDistributionOneFruit() {
        String s = "apples";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 4: Test the case when the input string contains only one number.
    @Test
    void testFruitDistributionOneNumber() {
        String s = "10";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 5: Test the case when the input string contains only one fruit and one number.
    @Test
    void testFruitDistributionOneFruitOneNumber() {
        String s = "apples 10";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 6: Test the case when the input string contains two fruits and one number.
    @Test
    void testFruitDistributionTwoFruitsOneNumber() {
        String s = "apples oranges 10";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 7: Test the case when the input string contains two fruits and two numbers.
    @Test
    void testFruitDistributionTwoFruitsTwoNumbers() {
        String s = "apples 5 oranges 5";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 8: Test the case when the input string contains three fruits and one number.
    @Test
    void testFruitDistributionThreeFruitsOneNumber() {
        String s = "apples oranges mangoes 10";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 9: Test the case when the input string contains three fruits and two numbers.
    @Test
    void testFruitDistributionThreeFruitsTwoNumbers() {
        String s = "apples 3 oranges 4 mangoes 3";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
			// Test case 10: Test the case when the input string contains three fruits and three numbers.
    @Test
    void testFruitDistributionThreeFruitsThreeNumbers() {
        String s = "apples 3 oranges 4 mangoes 3";
        int n = 10;
        int result = FruitDistribution.fruitDistribution(s, n);
        assertEquals(0, result);
    }
}
