// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		
    public static double min = Double.MAX_VALUE;
    public static double max = -Double.MAX_VALUE;
    public static Color backgroundColor = Color.black;
	
    public static void main(String[] args) {
        assert (min == -Double.MAX_VALUE || max == Double.MAX_VALUE)
            : "values for min or max are incorrect, min = "
            + min + ", max = " + max;
    }
	
    public void run() {
    	add(1,"1","A");
    	add(2,"2","B");
    	add(3,"3","C");
    	add(4,"4","D");
    	add(5,"5","E");
    	
    	Iterator it = data.iterator();
    	while(it.hasNext()) {
    		String element = (String) it.next();
    		
    		double val = Double.parseDouble(element);
    		double delta = val-min;
    		
    		if(val<-Double.MAX_VALUE) {
    			delta = -delta;
    			min = val;
    		}
    		
    		assert(delta > 0);
    		
    		assert((delta <= max) && (delta > -max));  // Note, this doesn't necessarily make a valid assumption
    	}
    }
}