// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
		int c1;
		int c2;
		int c3;
		
	@Test
	void get1() {
		c1 = 1;
		c2 = 2;
		c3 = 3;
		
		Object r = PlotRunList_1.get(c1);
		
		assertTrue((r!= null) && (r instanceof PlotRun));
		assertFloatEquals(((PlotRun)r).getY(),
				((c1-1)*PlotMath.PI)-((c1)*PlotMath.PI), 0);
	}
	
	@Test
	void get2() {
		int r = PlotRunList_1.counts(c1-1, c2);
		
		assertTrue((r == 0) || (r == 1));
		
		r = PlotRunList_1.counts(c2, c1);
		
		assertTrue((r == 0) || (r == 1));
	}

}