// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
private List data=new ArrayList();
		private List runs=new ArrayList();
		private final int NUM_SQRTS=10;
		private final int NUMSQRS=0;
		private PlotRun newRun=new PlotRun();
		
		@Test
		public void test() {
			for (int i=0; i<NUM_SQRTS; i++) {
				newRun.setDatum(i,new PlotDatum(i,new Color(255,255,0),new Color(0,0,0)));
				runs.add(newRun);
				newRun.reset();
			}

			for (int i=0; i<NUM_SQRTS; i++) {
				newRun.setDatum(i,new PlotDatum(i,new Color(255,255,0),new Color(0,0,0)));
				runs.add(newRun);
				newRun.reset();
			}

			for (int i=0; i<NUM_SQRTS; i++) {
				newRun = runs.remove(0);
				newRun.setDatum(0,new PlotDatum(0,new Color(255,0,0),new Color(0,0,0)));
				runs.add(newRun);
			}
			
			for (int i=0; i<NUM_SQRTS; i++) {
				newRun.setDatum(NUM_SQRTS, new PlotDatum(0,new Color(255,0,0),new Color(0,0,0)));
				runs.add(newRun);
			}

			assertTrue("the run list doesn't have the same number of runs",runs.size()==NUM_SQRTS);

			newRun.reset();
			for (Iterator it=runs.iterator(); it.hasNext();)
				assertTrue("the run list's first entry shouldn't be an empty",it.next().getDatum().isEmpty());

			for (int i=0; i < NUMSQRS; i++) {
				newRun.setDatum(i,new PlotDatum(i,new Color(255,0,0),new Color(0,0,0)));
				runs.add(newRun);
			}

			assertTrue("the run list doesn't have the same number of runs",runs.size()==NUMSQRS);

			data.add(runs);
			assertEquals("the list shouldn't change",runs,data);

			runs = null;
		}
}


