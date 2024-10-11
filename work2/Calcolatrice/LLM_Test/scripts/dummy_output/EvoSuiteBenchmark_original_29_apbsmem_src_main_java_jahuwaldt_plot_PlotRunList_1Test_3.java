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
		
	/**
	* Test method for {@link PlotRunList#get(int)}.
	*/
	@Test
	public void testGet() {
		
		PlotRunList oList = new PlotRunList();
		
		assertNotNull(oList.get(0));
		
		PlotRun run = new PlotRun();
		run.setData(this.getMaxY());
		oList.add(run);
		
		assertEquals(oList.get(1),run);
		
		run.setData(this.getMinY());
		oList.add(run);
		
		assertEquals(oList.get(2),run);

	}
	
}