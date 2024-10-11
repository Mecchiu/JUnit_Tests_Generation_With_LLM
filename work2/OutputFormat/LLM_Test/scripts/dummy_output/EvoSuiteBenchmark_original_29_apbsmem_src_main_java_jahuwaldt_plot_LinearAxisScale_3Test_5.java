// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		
	@Test
	public void scalarScale() {
		LinearAxisScale.scalarScale(0.25, 0.5); //Test
		LinearAxisScale.scalarScale(0.25, 0.5);
		LinearAxisScale.scalarScale(0.25, 0.5);
	}
	
	@Test
	public void logScale() {
		LinearAxisScale.logScale(0.3, 0.5); //Test
		LinearAxisScale.logScale(0.3, 0.5);
		LinearAxisScale.logScale(0.3, 0.5);
	}
	
	@Test
	public void logScaleB() {
		LinearAxisScale.logScaleB(0.5, 1.5); //Test
		LinearAxisScale.logScaleB(0.6, 1.7);
	}
	
	@Test
	public void moduloScale() {
		LinearAxisScale.moduloScale(6.4, 1.5); //Test
	}

	@Test
	public void floorScale() {
		LinearAxisScale.floorScale(0.5, 1.5); //Test
		LinearAxisScale.floorScale(0.3, 0.9); //Test
		LinearAxisScale.floorScale(0.3, 0.8); //Test
		LinearAxisScale.floorScale(1, 0.7); //Test
		LinearAxisScale.floorScale(1, 0.3); //Test
		LinearAxisScale.floorScale(2, 0.1); //Test
	}
	
	@Test
	public void moduloscale() {
		LinearAxisScale.moduloscale(0.4, 1.4); //Test
	}
	
	@Test
	public void modularScale() {
		LinearAxisScale.modularScale(3.5, 0.4); //Test
	}
	private void scalarScale(double x, double y) {
    double s=getPrecision();
    System.out.println(x);
    System.out.println(y);
    System.out.println(s);
    System.out.println(LinearAxisScale.scalarScale(x,y));
	}
	private void logScale(double x, double y) {
    double s=getPrecision();
    System.out.println(x);
    System.out.println(y);
    System.out.println(s);
    System.out.println(LinearAxisScale.logScale(x,y));
	}
	private void moduloScale(double x, double y) {
    Double.parseDouble(x);
    Double.parseDouble(y);    	    
    double s=getPrecision();
    System.out.println(x);
    System.out.println(y);
    System.out.println(s);
    System.out.println(LinearAxisScale.moduloScale(x,y));
	}
	private double modfloor(double x) {
    Double.parseDouble(x);
    Double.parseDouble(x);    	    
    double s=getPrecision();
        System.out.println(Math.floor(x));
        System.out.println(s);
        System.out.println(LinearAxisScale.modfloor(x));
	}
	private double modceil(double x) {
    Double.parseDouble(x);
    Double.parseDouble(x);    	    
    double s=getPrecision();
        System.out.println(Math.ceil(x));
        System.out.println(s);
        System.out.println(LinearAxisScale.modceil(x));
	}	
	private void floorScale(double x) {
    Double.parseDouble(x);
    Double.parseDouble(x);    	    
    double s=getPrecision();
        System.out.println(Math.floor(x));
        System.out.println(s);
        System.out.println(LinearAxisScale.floorScale(x));
	}
	private void moduloscale(double x) {
    Double.parseDouble(x);
    Double.parseDouble(x);    	    
    double s=getPrecision();
        System.out.println(Math.floor(x));
        System.out.println(s);
        System.out.println(LinearAxisScale.moduloscale(x));
	}
	private void modularScale(double x, double y) {
    Double.parseDouble(x);
    Double.parseDouble(y);    	    
    double s=getPrecision();
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
}
}