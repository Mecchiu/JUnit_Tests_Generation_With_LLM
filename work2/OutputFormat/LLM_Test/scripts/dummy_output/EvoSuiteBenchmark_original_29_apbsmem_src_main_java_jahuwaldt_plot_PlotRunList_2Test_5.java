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
		Vector<Integer> data = new Vector<Integer>();

        /**
         *  Creates an empty run list that contains no runs.
         */

		private PlotRunList_2Test() {
		}

        /**
         *  Creates an empty run list that contains one plot run.
         */

		private PlotRunList_2Test(PlotRun element) {
		    data.add(element);
		}

         /**
         *  Create a runlist  that contains the specified Array of PlotRun objects.
         */

	    private PlotRunList_2Test(Vector<PlotRun> runList) {
		    for (int ii = 0; ii < runList.size(); ii++) {
			    data.add(runList.elementAt(ii));
		    }
	    }

        /**
         *  Create a runlist  that contains the specified Collection of PlotRun objects.
         */

        private PlotRunList_2Test(Collection runList) {
        	for (int ii = 0; ii < runList.size(); ii++) {
                data.add(runList.get(ii));
	        }
	}

         /**
         *  Test the remove(int) method.
         */
        @Test
        public void testRemove() {
                Random random = new Random(23);

                //
                // Test for:
                //     new exception in test case 1
                //
                int index1 = 1;
                int element = 0;
                int iterations = 5;
                int size = data.size();

                int expected = 0;
                int actual = 0;

}
}