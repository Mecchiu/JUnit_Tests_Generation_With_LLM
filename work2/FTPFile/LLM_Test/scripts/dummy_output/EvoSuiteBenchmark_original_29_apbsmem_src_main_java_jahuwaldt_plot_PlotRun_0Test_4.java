// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {
		
    /**
     *  Test method for {@link PlotRun#size()}
     */
    @Test
    public void testSize() {
    	
    	boolean res1;
    	int result = 0, retVal = 0, retVal2;
    	
    	res1 = null;
    	try {
			res1 = PlotRun.size();
    		result = 1;
    	} catch( RuntimeException e ) {
    	}
    	
    	retVal = res1? result: 0;
    	retVal2 = res1? 0: result; // The previous value was invalid, so ignore ret.
    	
    	assertEquals( Boolean.valueOf((result == 0) ), Boolean.valueOf( true ));
    	
    	res1 = null;
    	retVal = 0;
    	retVal2 = 0;
    	
    	res1 = PlotRun.size();
    	retVal = result;
    	retVal2 = res1;
    	
    	assertEquals( Boolean.valueOf((result == 0) ), Boolean.valueOf( true ));
    	assertEquals( Boolean.valueOf( retVal), Boolean.valueOf( retVal2 ));
    	assertEquals( Boolean.valueOf(! (retVal < retVal2)), Boolean.valueOf( retVal > retVal2 ));
    	
    	boolean res3;
    	res3 = null;
    	retVal = PlotRun.size();
    	result = 3;
    	retVal2 = res3? result: result; // The previous value was valid, so ignore return value.
    	
    	assertEquals( Boolean.valueOf((result == 3) ), Boolean.valueOf( true ));
    	assertEquals( Boolean.valueOf((retVal == 3) ), Boolean.valueOf( true ));
    	
    	res1 = PlotRun.size();
    	retVal = result;
}
}