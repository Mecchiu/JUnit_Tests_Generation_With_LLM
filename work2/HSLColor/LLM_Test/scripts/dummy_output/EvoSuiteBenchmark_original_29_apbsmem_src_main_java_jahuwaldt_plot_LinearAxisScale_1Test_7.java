// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
    /**
     * Test of upper bounds function.
     */
	@Test
    void upperBounds() {
        
        // Test case 1:
        final double value = 1.23;
        final double expected = 12.23;
        final AxisLimitData result = LinearAxisScale.upperBounds(value, value);
        
        assertEquals("Error in returned AxisLimitData", expected, result.dataMin(), 0.001);
        assertEquals("Error in returned AxisLimitData", expected, result.dataMax(), 0.001);
    }
    
    /**
     * Test of calcTickMarks method, of class LinearAxisScale.
     */
    @Test
    void calcTickMarks() {
        
        // Test case 1:
        final double value = 1.23;
        final AxisLimitData result = LinearAxisScale.calcTickMarks(value, value, value, value, value);
        
        assertEquals("Error in returned AxisLimitData", -10.20, result.dataMin(), 0.001);
        assertEquals("Error in returned AxisLimitData", value, result.dataMin(), 0.001);
    }
    
    /**
     * Test of calcTickMarks method, of class LinearAxisScale.
     */
    @Test
    void calcTickMarks_DataInError() {
        
        // Test case 1:
        final double value = 1.23;
        final AxisLimitData result = LinearAxisScale.calcTickMarks(value, value, value, value, value);
        
        assertEquals("Error in returned AxisLimitData", -10.20, result.dataMin(), 0.001);
        assertEquals("Error in returned AxisLimitData", value, result.dataMin(), 0.001);
    }
    
    /**
     * Test of calcTickMarks method, of class LinearAxisScale.
     */
    @Test
    void calcTickMarks_DataMin() {
        
        // Test case 1:
        final double a = 0.0;
        final double b = 1.23;
        final double value = LinearAxisScale.upperBounds(a, b);
        final AxisLimitData result = LinearAxisScale.calcTickMarks(value, a, b, value, value);
        
        assertEquals("Error in returned AxisLimitData", a, result.dataMin(), 0.001);
        assertEquals("Error in returned AxisLimitData", b, result.dataMin(), 0.001);
    }
    
    /**
     * Test of calcTickMarks method, of class LinearAxisScale.
     */
    @Test
    void calcTickMarks_DataMax() {
        
        // Test case 1:
        final double a = 0.0;
        final double b = 1.23;
        final double value = LinearAxisScale.lowerBounds(a, b);
        final AxisLimitData result = LinearAxisScale.calcTickMarks(value, a, b, value, value);
        
        assertEquals("Error in returned AxisLimitData", 0.0, result.dataMax(), 0.001);
        assertEquals("Error in returned AxisLimitData", b, result.dataMax(), 0.001);
    }
    
    /**
     * Test of calcTickMarks method, of class LinearAxisScale.
     */
    @Test
    void calcTickMarks_ZeroData() {
        
        final double value = 0.0;
        final AxisLimitData result = LinearAxisScale.calcTickMarks(value, value, value, value, value);
        
        assertEquals("Error in returned AxisLimitData", 0.0, result.dataMin(), 0.001);
        assertEquals("Error in returned AxisLimitData", 0.0, result.dataMax(), 0.001);
    }

    /**
     * Test of apply method, of class LinearAxisScale.
     */
    @Test
    void apply() {
       
        // Test case 1:
        final AxisLimitData result = LinearAxisScale.apply(0.0, 0.0);
        
        assertEquals("Error in result", 10., result.dataMin(), 0.001);
        assertEquals("Error in result", 20., result.dataMax(), 0.001);
    }

}