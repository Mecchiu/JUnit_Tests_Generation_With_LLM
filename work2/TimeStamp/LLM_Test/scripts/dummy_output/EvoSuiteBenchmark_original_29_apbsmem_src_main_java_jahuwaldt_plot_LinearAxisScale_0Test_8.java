// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		
    /**
    * Construct a unit test class this object is not equal to.
    **/
    public LinearAxisScale_0Test() {
    }
    
    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * @return The upper and lower bounds, as determined by the scale's
    *	lower and upper methods
    */
    double upperBounds() {
        return modfloor(10.0, 10.0);
    }

    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * @return The upper and lower bounds, as determined by the scale's
    *	lower and upper methods
    */
    double lowerBounds() {
        return modceil(10.0, 10.0);
    }

    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * @return The upper and lower bounds, as determined by the scale's
    *	lower and upper methods
    */
    protected final double lowerBounds_0() {
        return lowerBounds();
    }

    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * @return The upper and lower bounds, as determined by the scale's
    *	lower and upper methods
    */
    protected final double upperBounds_0() {
        return upperBounds();
    }

    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * @return The upper and lower bounds, as determined by the scale's
    *	lower and upper methods
    */
    protected final double add(double a, double b) {
        return modfloor(10.0 + a, 10.0 + b);
    }

    /**
     * Returns a double value specifying an arbitrary upper and lower
     * bounds for this object.
     *
     * @return The upper and lower bounds, as determined by the scale's
     *	lower and upper methods
     *
     */
    double add_0_0() {
        return modfloor(10.0 + 10.0, 10.0);
    }

    /**
     * Returns a double value specifying an arbitrary upper and lower
     * bounds for this object.
     *
     * @return The upper and lower bounds, as determined by the scale's
     *	lower and upper methods
     */
    double add_0_1() {
        return lowerBounds();
    }

    /**
    * Returns a double value specifying an arbitrary upper and lower
    * bounds for this object.
    *
    * <P>The lower, upper, and add values will be cast in the
    * object before being returned.  The cast creates a new object.
    *
    * @return The lower, upper, and add values, as determined by the
    *	scale's lower, upper, and add methods
    */
    double[] add_2() {
        return add(0, 20).add(0, 30).add(20, 40);
    }
    
   //~ Methods for class Object -------------------------------------------

  /**
  * Tests if this object is equal to another.
  *
  * @param obj The <CODE>Object</CODE> we are comparing <CODE>self</CODE> to.
  * @return <CODE>true</CODE> if <CODE>obj</CODE> is equal to this object.
  */
   protected final boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj instanceof LinearAxisScale_0Test)
        return true;
      if (!(obj instanceof LinearAxisScale_0))
        return false;
      return this == ((LinearAxisScale_0)obj).getSuperclass();
   }
}