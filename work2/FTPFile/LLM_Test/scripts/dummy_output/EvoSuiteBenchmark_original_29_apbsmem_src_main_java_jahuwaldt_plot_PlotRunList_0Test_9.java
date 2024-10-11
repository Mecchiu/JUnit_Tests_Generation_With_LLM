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
		/**
		*  Test run is empty.
		*/
    @Test
    public void TestRunListEmpty() {
        ArrayList<PlotRun> runList = new ArrayList();
        ArrayList<PlotRun> runList2 = new ArrayList();
        runList.addAll(runList2);

        ArrayList<PlotRun> runList3 = new ArrayList();
        ArrayList<PlotRun> runList4 = new ArrayList();
        runList3.addAll(runList4);

        ArrayList<PlotRun> runList5 = new ArrayList();
        runList5.addAll(runList);

        ArrayList<PlotRun> runList6 = new ArrayList();

        try {
        runList3.addAll(runList5);
        } catch (ClassCastException cce) {}
    }
}