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
		private final PlotData testData = new PlotData();

    /**
     *  Make a new data structure that is used to store
     *  all the plot data.  A data structure is a Collection
     *  that holds each PlotData object.  A PlotData object
     *  is of type PlotDatum.  A PlotData object is used
     *  internally by the PlotRunList class and should not
     *  be accessed directly.
     */
    public static PlotData testData() {
    return testData;
} // static class testData

    /**
     *  Make a new data structure that is used to store
     *  the run objects in the list of PlotRun elements.
     */
    public static PlotRunList testList() {
    return new PlotRunList(testData);
} // static class testList

    /** 
     * Test data.
     */
    @java.io.Serial
    private static class PlotData implements Serializable {
    int value;

    public Object clone(){ return this;}
    @Override public boolean equals(Object obj) {
        return false;}
    } // class PlotData

    /** Create a new object of type PlotRunList with
     *  array of PlotRun objects.
     */
    public PlotRunList runList(){
        return new PlotRunList(this.data.toArray());
    } // runList

    /** Return a copy of the PlotRun objects in the
     *  list of PlotData objects.  The elements
     *  in the list can be used in the order that they
     *  take into account.
     *  @return a copy of the PlotRun objects in the list.
     */
    public PlotData testDataArray(){
        return new PlotData();
    }
} // static class PlotRunList_3Test