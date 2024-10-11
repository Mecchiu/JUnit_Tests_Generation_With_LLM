// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		    /**
		     *  Test one unit test case.
		    */
	public void testOneUnitTestCase() throws Exception {
		    boolean result = false;
		    final double x = 0.15;
		    final double y = 0.5;

		    final PlotDatum p1 = new PlotDatum();
		    final PlotDatum p2 = new PlotDatum();

		    p1.setDatapoint_1(x);
		    p1.setDatapoint_2(y);
		    p1.setDatapoint_3(null);
		    p2.setDatapoint_1(x);
	        p2.setDatapoint_2(y);
	        p2.setDatapoint_3(null);

       result = p1.connected();
       result = false;

       p1.setDatapoint_1(x);
       p1.setDatapoint_2(y);
       p1.setDatapoint_3(null);

       p2.setDatapoint_1(x);
       p2.setDatapoint_2(y);
       p2.setDatapoint_3(null);

       result = p1.connected();
       result = false;

       assertFalse(result ); // No connected points, should be true.

       p1.setDatapoint_1(x);
       p1.setDatapoint_2(y);
       p1.setDatapoint_3(null);

       p2.setDatapoint_1(x);
       p2.setDatapoint_2(y);
       p2.setDatapoint_3(null);

       result = p1.connected();
       result = false;

       assertTrue(result );
	}

	/**
	* Test the clone() method (no need to actually
	* be the same instance :-).
	*/
	/**
	 *  Test with different sizes of the first two.
	 *  Same reference but for the second one.
	 *
	*/
    @Test
    public void testClone() {
		    final int size = 6;

		    PlotDatum temp = null;
		    PlotDatum temp2;

		    for (int i=0; i<size; i++) {

			temp = new PlotDatum();
			temp2 = (PlotDatum) temp.clone();
			assertNotNull(temp);
			assertNotNull(temp2);
			assertNotSame(temp.getClass(), temp2.getClass());
	    }
    }
	/**
	* Test one unit test case using two references
	* (i.e. two points on the same line).
	*
	* 1. If first datapoint is equal to second one,
	* 2. otherwise, one of them shall be equal.
	*
	* 1- 1. Note that it is illegal to set Datapoint (x,y)!= 1;
	* 2- if the other one is set.
	*/
	@Test
	public void testEqualUnitTestCase() throws Exception {
       boolean result = false;
      final double datapoint_1 = 0.2;
      final double datapoint_2 = 1.0;
      PlotDatum p1 = new PlotDatum(), p2 = new PlotDatum();

      p1.setDatapoint_1(datapoint_1);
      p1.setDatapoint_2(datapoint_2);
      p1.setDatapoint_3(null);

      // First datapoint in the first case
      assertEquals("p1.getDatapoint_1()!", datapoint_1, p1.getDatapoint_1(), 1e-100);
      result = p1.connected();
      assertTrue("Connected? wrong value.", result);

      p2 = p1.clone();

      assertEquals("p2.getDatapoint_1()!", datapoint_1, p2.getDatapoint_1());
      assertEquals("p2.getDatapoint_2()!", datapoint_2, p2.getDatapoint_2());
      assertEquals("p2.getDatapoint_3()!", null, p2.getDatapoint_3());

       
      // With two other points.

      p1 = new PlotDatum();
      p1.setDatapoint_1(datapoint_1);
      assertEquals("p1.getDatapoint_1()!", datapoint_2, p1.getDatapoint_1());
      assertEquals("p1.getDatapoint_2()!", datapoint_2, p1.getDatapoint_2());
      assertEquals("p1.getDatapoint_3()!", null, p1.getDatapoint_3());

      p1 = p2;

      assertEquals("p2.getDatapoint_1()!", datapoint_2, p1.getDatapoint_1());
      assertEquals("p2.getDatapoint_2()!", datapoint_2, p1.getDatapoint_2());
      assertEquals("p2.getDatapoint_3()!", null, p1.getDatapoint_3());

     // Last datapoint of the first case
      // Note that setDatapoint(1,1) is no longer necessary;
      // and that it is irrelevant that the new datapoint is 1.
	//p1.setDatapoint(1,1);
	//p1.setDatapoint(1,1);
      // p1 must have the value 1.
      
      assertEquals("p1.getDatapoint_1()!", datapoint_1, p1.getDatapoint_1());
      assertEquals("p1.getDatapoint_2()!", datapoint_1, p1.getDatapoint_2());
      assertEquals("p1.getDatapoint_3()!", null, p1.getDatapoint_3());

      p2 = (PlotDatum) p1.clone();
      assertEquals("p2.getDatapoint_1()!", datapoint_1, p2.getDatapoint_1());
      assertEquals("p2.getDatapoint_2()!", datapoint_1, p2.getDatapoint_2());
      assertEquals("p2.getDatapoint_3()!", null, p2.getDatapoint_3());
  
    }
}