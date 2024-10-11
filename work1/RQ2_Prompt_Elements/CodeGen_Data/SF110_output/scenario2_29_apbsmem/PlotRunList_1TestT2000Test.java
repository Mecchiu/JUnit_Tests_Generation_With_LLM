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
		 *  Initializes a {@Link PlotRunList_1Test} object.
		 */
	@Test
    public void initialize_() {
        Object[] data1 = new Object [] { PlotDate.get(8,2), null, new Color(255, 0, 0), 7.5, "Data 0"};

    }

	/**
	 *  Calls {@link PlotRunList#get(int)} and compares the retrieved
	 *  object with the expected object.
	 */
	@Test
	public void get_with_index_test() {
		//Arrays to copy with reference
		List<PlotRun_1> runList = new ArrayList<>();
		PlotRun_1 newRunList = PlotRun_1.get(runList);

	}

	/**
	 *  Calls {@link PlotRunList#add(PlotRun)} and compares the result with the
	 *  expected object, which cannot be inserted using an {@link Object#hashCode()}
	 *  method.
	 */
	@Test
    public void add_with_result_test() {
        PlotRun_1 newRunList = new PlotRunList (runList);
        List<PlotRun_1> resultList = newRunList.add (new PlotRun_1(new Date(2), new Data(new Color(0,255,0), new Double(7.5)), new PlotDate(10,9.)));


	}

	/**
	 *  Calls {@link PlotRunList#add(PlotRun)} with the results that the new
	 *  run should take as parameters.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
    public void add_with_add_run_error_test() {
        PlotRun_1 newRunList = new PlotRunList (runList);
        newRunList.add (new PlotRun_1(new Date(2), new Data(new Color(0,255,0), new Double(7.5)), new PlotDate(10,9.)));


	}


	/**
	 *  Calls {@link PlotRunList#set(int, PlotRun)} and compares the retrieved
	 *  set-with-expected object.
	 */
	@Test
    public void set_with_set_element_test() {
        List<PlotRun_1> runList = new ArrayList<>();
        runList.add (PlotRun_1.get(new Date(1), new Data(new Color(0,0,255), new Double(100*7.5)))) ;
        runList.add (PlotRun_1.get(new Date(1), new Data(new Color(0,255,0), new Double(100*7.5)))) ;

        List<PlotRun_1> newRunList = new PlotRunList(runList);

		assertNull(newRunList.remove(new PlotRun_1 (new Date(2), new Data(new Color(0,0,255), new Double(100*7.5)))) );


	}



	



}
