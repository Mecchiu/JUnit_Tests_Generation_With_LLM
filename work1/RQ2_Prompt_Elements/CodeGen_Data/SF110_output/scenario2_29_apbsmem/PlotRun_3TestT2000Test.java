// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {

    // Variables
    private Iterator i;
    private String key;
    private float[] expected = {
      1.0f, 1.0f, 1.0f,
      1.0f, 2.0f, 2.0f
    };

    // Initialization
    /** 
    *  Create a TestRun object for testing.
    *
    * @param i An Iterator object to go through each test run.
    * @param key The key of the data to be plotted.  It is ignored.
    * @param expected The expected output of this run.  It is ignored.
    */
    private PlotRun_3Test(String key, Iterator i, float[] expected) {
			this.key = key;
			this.i=i;
			this.i.next();
			this.expected = expected;			
    }

    // Run
    /** 
    *  Start the iteration to test.
    *
    *  @throws Exception
    *  It is not safe to call this method.
    *  It is only useful as a temporary test to see what
    *  has taken place and it can be interrupted in its
    *  way.   */           
    @Test
    public void test() throws Exception {
		
    }

	// Clone
    /** 
    *  Clone an object of this class.
    *
    * @return A reference to this object.
    */
    @Override
    public Object clone() {
		
       return new PlotRun_3Test(key, new Iterator(), expected);
    }	
}
