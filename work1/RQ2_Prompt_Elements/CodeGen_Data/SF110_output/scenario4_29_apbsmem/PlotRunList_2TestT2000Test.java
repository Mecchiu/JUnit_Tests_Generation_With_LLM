// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {

	/**
	* Test method of {@link PlotRunList#Test2}
	*/
    @Test
    public void testRemove() {
		assertEquals(new Integer(1), new PlotRunList().remove(0)); //remove(0) is the only test case.
		Object[][] runs = {
				{new PlotRun(Color.red), new PlotRun(Color.blue), new PlotRun(Color.yellow)},
				{new PlotRun(Color.green), new PlotRun(Color.red), new PlotRun(Color.blue)}
		};
		for (int i=0; i<2; i++) {
			ArrayList runs1 = new ArrayList();
			runs1.add(runs[i]);
			assertEquals(runs[i][4], new PlotRunList().remove(runs[i][0].getIndex()));
			for (int j=0; j<3; j++) {
				assertSame(runs[i][j], new PlotRunList().remove(runs[i][j].getIndex()));
				ArrayList runs2 = new ArrayList();
				runs2.add(new PlotRun(runs[i][j]));
				runs2.add(runs[i][j].clone());
				if (j>0) {
					assertEquals(false, new PlotRunList().remove(runs1.size()-1)); //all runs after this run should be removed
				}
				assertEquals(false, new PlotRunList().remove(12));
				Object[][] runs3 = {
						{runs[i+1][0], new PlotRun(Color.red), runs[i+1][1], runs[i+1][2]},
						{runs[i+1][2], new PlotRun(Color.red), runs[i+1][1], runs[i+1][0]},
						{runs[i+1][0], new PlotRun(Color.green), runs[i+1][2]}
						};
				assertEquals(true, new PlotRunList().remove(runs3[0]));
			}
			assertEquals(runs1, new PlotRunList().remove(runs[0][0].getIndex()));
			for (int j=2; j<6; j++) {
				fail("Should have been the case of this loop");
				Object[][] runs2 = new ArrayList();
				runs2.add(new PlotRun(Color.green));
				runs2.add(new PlotRun(Color.green));
				assertEquals(new PlotRunList().remove(runs1.size()-1), new PlotRunList().remove(0));
			}
		}
	}

	/**
	* Test method of {@link