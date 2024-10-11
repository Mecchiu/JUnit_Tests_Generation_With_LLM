// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {

     /**
     * Sets the width of the axis that can be drawn vertically on the plot.
     * @param width The width value of this axis. It should be a legal
	 *         value for the {@link javax.swing.JSlider} object's default value
	 */
    private void setWidth(double width) {
		getPlot().setVisible(true);
		getSlider().setPainted(true);
		getSlider().setWidth(width);
    }
    
	
    @Test
	public void testFindGoodLimits_default() {
		setWidth(50);
		
		final AxisLimitData data = LinearAxisScale.findGoodLimits(10, 50);

		assertEquals(50d, data.getMinVal());
		assertEquals(50d, data.getMaxVal());
	}
    
	
    @Test
	public void testFindGoodLimits_range() {
		
		getPlot().getViewport().setRangeMaxY(10);
		setWidth(50);
		
		final AxisLimitData data = LinearAxisScale.findGoodLimits(10, 50);

		assertEquals(10d, data.getMinVal());
		assertEquals(50d, data.getMaxVal());
	}
    
    @Test
	public void testFindGoodLimits_range_x() {
		
		getPlot().getViewport().setRangeY(2);

		final AxisLimitData data = LinearAxisScale.findGoodLimits(10, 50);

		assertEquals(10d, data.getMinVal());
		assertEquals(2, data.getMaxVal());
	}
    
	
    private Slider getSlider() {
		return getPlot().getSlider();
    }
}


