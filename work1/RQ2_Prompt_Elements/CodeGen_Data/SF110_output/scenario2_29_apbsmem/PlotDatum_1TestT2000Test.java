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
private int conflg;


	/**
	 *  Return true if this datum is connected by another datum by a line
	 *  and false if it is not.
	 */
	@Test
	public  void datumIsConnected() {
		int oldVal;
		int newVal;
		PlotDatum testPnt;

		newVal = 0;
		oldVal = 1;

		oldPnt = new PlotDatum_1_1(2,newVal);
		newPnts = new PlotDatum[2];
		newPnts[0] = oldPnt;
		newPnts[1] = new PlotDatum_1_2(1,newVal);

		conflg = 0;
		oldPnt.connected();
		assertEquals(oldPnt,newPnts[0]);
		assertEquals(oldPnt,newPnts[1]);
		testPnt = oldPnt;
		for(int i = 0; i < 10; i++ ) {
			conflg = 0;
			testPnt = oldPnt;
			oldPnt.connected();
			assertEquals(oldPnt,testPnt);
			testPnt = new PntDatum_1_1();
			conflg = 0;
			testPnt = oldPnt;
			oldPnt.connected();
			assertNotEquals(oldPnt, testPnt);
			conflg = 0;
			oldPnt.connected();

			testPnt = new PntDatum_1_2();
			conflg = 0;
			testPnt = oldPnt;
			oldPnt.connected();
			assertNotEquals(oldPnt, testPnt);
		}

	}

	@Test
	public void datumHasValue() {
		try {
			int val = 1;
			PlotPntDatum_1 pnt;
			newPnts[0].connected();
			newPnts[1].connected();
			pnt = new PNTDatum(newPnts)[0];

            assertEquals(val,pnt.value());
	        int val2 = pnt.value();
	        pnt.value(50);
	        assertNotEquals(val,val2);
	    }
		catch(NumberFormatException e) {
            fail();
        }
	}

	@Test
	public void getName() {
		String name = new PlotDatum_1().getName();
		try {
			assertEquals("Datum-1",name);

		}
		catch(NullPointerException e) {
            fail();
        }
	}

	@Test(expected=NullPointerException.class)
	public void makeFromNull() {
		new PlotDatum();
	}


	/**
	* Create the object.
	*
	* @return the object.
	*/
	@Test
	public void clone() {

    new PNTDatum_1(1);

		new PNTDatum_1();

	}

	@Test
	public void getType() {
		assertEquals("PlotDatum",new PNTDatum_1().getType());
	}


}
// PlotDatum_3Test.java
