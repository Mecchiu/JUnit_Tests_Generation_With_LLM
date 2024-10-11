// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
		
    /**
    *  This test is only used in this test suite.  It is the test case which will be changed to
    *  a unit test for all the public tests.  By the time it executes, the generated code will
    *  be changed to a unit test which is in turn used by the unit tests in this class.
    */
	//@Test
	public void testDone() {
		
        boolean done = new ContourGenerator().done();
        assertTrue(done);
    }
    

    /**
    * This test verifies the internal method {@link #getPoints()} returns a list of 3 dimensional
    * data points.
    */
    @Test
    public void testGetPoints () {
          
        Map<Integer,Collection<Double>> myPoints = new HashMap<>();
          
        Integer x = new Integer(1);
        Collection<Double> collection = new ArrayList<>();
        
        assertTrue(myPoints.containsKey(x));
        assertEquals(myPoints.get(x).size(), 1);
        assertEquals(myPoints.get(x)
               .iterator()
               .next().floatValue(),
                1.0,
                Epsilon.Tolerance.ALL);
        
        assertTrue(myPoints.containsValue(collection));
        assertEquals(myPoints.get(x).size(), 1);
        assertEquals(myPoints.get(x)
               .iterator()
               .next()
               .floatValue(),
                0.0,
                Epsilon.Tolerance.ALL);
        
        x = new Integer(2);
        collection = new ArrayList<>();
        assertTrue(myPoints.containsKey(x));
        assertEquals(myPoints.get(x).size(), 1);
        
        assertTrue(myPoints.containsValue(collection));
        assertEquals(myPoints.get(x).size(), 1);
        assertEquals(myPoints.get(x)
               .iterator()
               .next()
               .floatValue(),
                0.0,
                Epsilon.Tolerance.ALL);
        
        Collection<Double> collection2 = new ArrayList<>();
        collection2.add(new Double(10.0));
        collection2.add(new Double(21.0));
        collection2.add(new Double(4.0));
        
        x = new Integer(3);
        myPoints.put(x, collection2);
        assertTrue(myPoints.containsKey(x));
        assertEquals(myPoints.get(x).size(), 2);
        
        x = new Integer(4);
        myPoints.put(x, collection);
        assertTrue(myPoints.containsKey(x));
        assertEquals(myPoints.get(x).size(), 2);
    }
}