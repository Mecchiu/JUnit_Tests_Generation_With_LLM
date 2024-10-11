// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {
		static Map runs = new HashMap();
		static LinkedList runs_run = new LinkedList();
		static LinkedList runs_run1 = new LinkedList();
		static LinkedList runs_run2 = new LinkedList();
		static void fill(PlotRunList list, Map map) {
			for (Iterator iter = map.keySet().iterator(); iter.hasNext(); ) {
				String key = (String) iter.next();
				Run run = ((PlotRun) map.get(key)).getRun();
				list.add(run);
			}
		}

		/**
		 *  Test method for {@link PlotRunList#size()}.
		 * @throws IOException if an I/O error occurs.
		 */
		@Test
		public void testSize() throws IOException {
			assertEquals(2, ((PlotRunList) runs.get(runs_run.get(0))).size());
			List l = new LinkedList();
			assertEquals(1, ((LinkedList) runs.get(runs_run2)).size());
			fill(l, runs);
			assertEquals(4, l.size());
		}

}
/**
* End of File.  Any additional class files referenced by this
*.class file should be included in the build project.
*
* Copyright (c) 2002 Xinghai Hu, and others.  All rights reserved.
*/