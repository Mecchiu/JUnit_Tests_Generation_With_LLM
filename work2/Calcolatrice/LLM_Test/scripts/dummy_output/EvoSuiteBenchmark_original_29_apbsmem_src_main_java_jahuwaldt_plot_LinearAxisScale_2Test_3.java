// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		private LinearAxisScale obj;

    /**
    * Constructor for LinearAxisScale_2Test.
    * This test is expected to not throw exceptions.
    */
	public LinearAxisScale_2Test(){};

	  private void test(final Double aX, final Double aY, final String sMessage){
		  try {
			obj.findGoodLimits(aX, aY);
			assertFalse(sMessage, true);
		} catch(Throwable tException){
			assertFalse(sMessage, true);
		}
	  };

	  /**
	   *  Test the given bounds for the Axes bounds that the 
	   *  LinearAxisScale object returned from {<code>findGoodLimits(double, double)}}.
	  *
	  *  @param  lBL  The lower bound of the range this axis could lie in.
	  *  @param  lUB  The upper bound of the range this axis could lie in.
	  *  @return An AxisLimitData object containing the lower and upper bounds 
	  *              of the range this axis was in.
	  */
	  public AxisLimitData findGoodLimits(double lBL, double lUB){
		  AxisLimitData output = new AxisLimitData(lBL, lUB);
		  final double aX = lBL+lUB;
		  final double aY = lBL+lUB;
		  return obj.findGoodLimits(aX, aY);
	  }

	  /**
	   *  Test an empty axis scale.
	   */
	  public void test0(){
		  test(modfloor(1.0), modfloor(1.0), "_0");

		  test(modfloor(-1.0), modfloor(-1.0), "_1");

		  test(modfloor(0.0), modfloor(0.0), "_2");
	  };

    /**
    *  Test an axis scale of linear.
    */
    public void test1(){
	  final AxisLimitData testOutput = findGoodLimits(1, 1);
	  testOutput.setTickMarkLength(0.9);
	  testOutput.setTickMarkSize(0.9);
	  testOutput.setDataStep(0.01);
	  testOutput.setMinMaxTick(0,1);
	  testOutput.setMaxMaxTick(-1,1);
	  test(modfloor(5.0), modfloor(5.0), "_1");
	  test1(modfloor(0.5), modfloor(-0.5), "_1");
	  test1(modfloor(0.5), modfloor(0), "_1");
	  test1(modfloor(-0.5), modfloor(0), "_1");
    };     
    
    /**
     * A sample object being used in this unit test.
     */
    ArrayList test;

	/**
	 *  Object for unit test.
	*/
	private final LinearAxisScale obj;
	private final LinearAxisScale obj1;
    private final double[] limits = {0.0, 4.0, 2.0, 4.5, 1.2, 5.5, 3.5, 2};

    /**
     *  Create an object with an axis.
     *  @see com.jahuwaldt.plot.LinearAxisScale#LinearAxisScale(Plot, Axis)
     *  @param  plot  Plot object.
     *  @param  axis  Axis object.
     */
    public LinearAxisScale_2Test(Plot plot, Axis axis){
     	     obj = (LinearAxisScale) PlotUtilities.constructObject(plot, 2, Axis.class);
     	     obj1 = (LinearAxisScale) PlotUtilities.constructObject(plot, 2, LinearAxisScale.class);
     	  obj.setLabel("ax");
     	  obj.setAxis(axis);
     	  obj.setMin(0);
     	  obj1.setLabel("ax");
     	  obj1.setAxis(axis);
     	  obj1.setMin(0);
     	  try {
				obj.setLabel("ax2");
				obj1.setLabel("ax2");
			} catch(RuntimeException tException){
				assertTrue(tException.getMessage(), false);
			};   
    };

	 /**
	  *  Tests the findGoodLimits() method.
	  *
	  *  @see com.jahuwaldt.plot.LinearAxisScale#findGoodLimits(double, double)
	  */
    public void test2(){
}
}