// MinsubarraysumTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains one unit test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

    /**
    * Empty test case for {@link Minsubarraysum#minsubarraysum(List)}
    */
    @Test
    public void test_empty() {
        List<Object> nums = null;
        long result = Minsubarraysum.minsubarraysum(nums);
        assertEquals(0, result);
    }

    /**
    * Positive case for {@link Minsubarraysum#minsubarraysum(List)}
    */
    @Test
    public void test_positive() {
        List<Object> nums = new Number[1];
        nums[0] = new Integer(10);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(10, result);
    }

    /**
    * Negative case for {@link Minsubarraysum#minsubarraysum(List)}
    */
    @Test
    public void test_negative() {
        List<Object> nums = new Number[1];
        nums[0] = new Integer(-10);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(0, result);
    }

    /**
     * Positive case for {@link Minsubarraysum#minsubarraysum(List)}
     */
    @Test
    public void test_listofints() {
        List<Object> nums = new Number[1];
        nums[0] = new Integer(5);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(5, result);
    }

    /**
     * Negative case for {@link Minsubarraysum#minsubarraysum(List)}
     */
    @Test
    public void test_negatlistofints() {
        List<Object> nums = new Number[1];
        nums[0] = new Integer(-5);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(0, result);
    }

    /**
    * Positive case for {@link Minsubarraysum#minsubarraysum(List)}
    */
    @Test
    public void test_listoflongs() {
        List<Number> nums = new Number[1];
        nums[0] = new Number(5);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(5, result);
    }

    /**
     * Negative case for {@link Minsubarraysum#minsubarraysum(List)}
     */
    @Test
    public void test_negatlistoflongs() {
        List<Number> nums = new Number[1];
        nums[0] = new Number(-5);
        long result = Minsubarraysum.minsubarraysum(nums).longValue();
        assertEquals(0, result);
    }
}
