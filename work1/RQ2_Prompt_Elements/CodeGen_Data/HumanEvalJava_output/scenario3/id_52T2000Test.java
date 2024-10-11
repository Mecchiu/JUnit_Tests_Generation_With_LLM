// BelowThresholdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains one unit test case for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

	@Test
    public void belowThreshold0() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1}, 0));
    }
    
    @Test
    public void belowThreshold1() {
        assertTrue(BelowThreshold.belowThreshold(new int[]{1}, 1));
    }
    
    @Test
    public void belowThreshold2() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1, 2}, 0));
    }
    
    @Test
    public void belowThreshold3() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1, 2, 4}, 0));
    }
    
    @Test
    public void belowThreshold4() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1, 2, 4, 10}, 0));
    }
    
    @Test
    public void belowThreshold5() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1, 2, 4, 10}, 100));
    }
    
	@Test
    public void belowThreshold6() {
        assertFalse(BelowThreshold.belowThreshold(new int[]{1, 2, 4, 10, 20}, 10));
    }
	
	@Test
    public void belowThreshold7() {
        assertFalse(AboveThreshold.aboveThreshold(new int[]{1, 2, 4, 100, 20}, 10));
    }
	
	@Test
    public void belowThreshold8() {
        assertFalse(AboveThreshold.aboveThreshold(new int[]{1, 2, 4, 100, 20}, 10));
    }
	
	@Test
    public void belowThreshold9() {
        assertTrue(AboveThreshold.aboveThreshold(new int[]{1, 2, 4, 100, 20}, 10));
    }
	
	@Test
    public void belowThreshold10() {
        int nums[] = new int[]{1, 20, 4, 10};
        assertTrue(BelowThreshold.belowThreshold(nums, 5));
    }
	
	@Test
    public void belowThreshold11() {
        int nums[] = new int[]{1, 20, 4, 10};
        assertTrue(BelowThreshold.belowThreshold(nums, 11));
    }
	
	
	@Test
    public void belowThreshold12() {
        int nums[] = new int[]{1, 20, 4, 10};
        assertFalse(BelowThreshold.aboveThreshold(nums, 10));
    }

}