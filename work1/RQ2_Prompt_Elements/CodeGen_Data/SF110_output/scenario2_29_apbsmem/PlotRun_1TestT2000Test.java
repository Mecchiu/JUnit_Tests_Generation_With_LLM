// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {

		//
		// Private fields
		//
        private static final Color WHITE = new Color(255,255,255);
        private static final int[] BOTTOM = new int[]{0,0,200,200};
        private static final int HEIGHT = 200;
        private static final int WIDTH = 200 - HEIGHT;
        
        
    // Constructors
    public PlotRun_1Test() {
        clearBox();
    }
        
    // Set up
    public void clearBox() {
        super.clearBox();
       data = new Hashtable();
        super.add(data);
    }
        
    // Clear screen
    public void clear() {
        super.clear();
    }
        
    /**
     * Tests the constructor of a PlotRun object.
     */
    @Test
    public void testConstructor() {
        // test default values
        assertTrue("wrong size" + data.size(), data.size() == 0);
        
        // test construction of a PlotRun with a null array
        try {
            new PlotRun(null);
            fail("nonexistent class");
            }
                catch(IllegalArgumentException ihe) {
                // this is good
            }
        
        // test construction of a PlotRun with a null list
        try {
            new PlotRun(null);
            fail("nonexistent class");
            }
                catch(IllegalArgumentException ihe) {
                // this is good
            }
        
        // test construction of a PlotRun with a non-existent plot
        PlotDatum dataTest = new PlotDatum(WIDTH * HEIGHT);
        try {
            new PlotRun(dataTest);
            fail("plot not in array");
            }
                catch(IllegalArgumentException ihe) {
                // this is good
            }
    }
        
    /**
     * Tests the addition of a PlotDatum object to this run.
     * The method is used to add objects which are arrays,
     * or a collection of objects.
     */
    @Test
    public void testAdd() {
        // test adding a PlotDatum object to this run
        PlotRun run = new PlotRun_1Test();
        run.data.add(new PlotDatum(WIDTH * HEIGHT));
        run.add(new PlotDatum(WIDTH * HEIGHT));
        clearBox();
        assertFalse("wrong size" + super.size() + " for PlotRun object", 
                     super.size() == 1);
    }
    
    /**
     * Tests the insertion of new objects into a PlotRun object which
     * are arrays, or a collection of objects.
     */
    @Test
    public void testAppend() {
        // test appending new objects into the set
        PlotRun run = new PlotRun_1Test();
        run.data.add(new PlotDatum(WIDTH * HEIGHT));    // put a new object into this set
        run.add(new PlotDatum(WIDTH * HEIGHT));
        clearBox();
        assertFalse("wrong size" + super.size() + " for PlotRun object", 
                     super.size() == 1);
    }
    
    /**
     * Test the equals test for a PlotRun object.
     */
    @Test
    public void testEquals() {
        // test object equality for a PlotRun object
        PlotRun run1 = new PlotRun_1Test();
        PlotRun run2 = new PlotRun_1Test();
        assertTrue("wrong size" + super.size() + " for PlotRun object", 
                   super.size() == 1);
        assertTrue("wrong equality value for an empty object", run1.equals(run1) && run1.equals(run2));
        
        // test an object which is not a PlotRun object 
        PlotDatum data2 = new PlotDatum(WIDTH * HEIGHT);
        PlotRun run3 = new PlotRun_1Test();
        assertFalse("wrong size" + super.size() + " for PlotRun object", 
                    super.size() == 1);
        assertFalse("wrong equality value for an PlotRun object object", run1.equals(run3) && run1.equals(run2));
        
        // test an object which has been added
        run3.data.add(data3);
        // add a new object
        plot3 = new PlotDatum(WIDTH * HEIGHT);
        run3.data.add(plot3);
        assertSame("wrong value for PlotRun object before adding new object", 
                    run2.data, run3.data);
    }
    
    /**
     * Returns a hashcode for a PlotRun object.
     */   
    @Override
    public int hashCode() {
             return super.hashCode();
    }  
    
    /**
     * Returns a clone for a PlotRun object.
     */   
    @Override
    public Object clone() {
             return super.clone();
    }
    
    /**
     * An auxiliary object for this object test
     */   
    private PlotDatum plot3;
}
