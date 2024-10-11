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
	 *  Returns a new instance of this class.
	 */
	public static final PlotRunList_2Test test = new PlotRunList_2Test();

	/**
	 *  Test for remove.
	*  @throws  Exception  - if the run list cannot be tested.
	*/
	@Test
	public final void test_remove_1() throws Exception {
		assertNotNull(test);
		PlotRunList runList = new PlotRunList(new HashSet());
		runList.remove(0);
		assertTrue("RunList should have just one plot run element and not be an empty!", runList.get(0) instanceof PlotRun);
		assertTrue("RunList should contain one plot run element and not any subsequently removed plot runs, but an empty run list was returned", runList.size() == 1);
	}

	/**
	*  Test for remove.
	*  @throws  Exception  - if the run list cannot be tested.
	*/
	@Test
	public final void test_remove_2() throws Exception {
		test.test_remove_1();
	}


	/**
	*  Returns a new instance of this class.
	*  It contains five test cases for the {@link PlotRunList#set} method.
	*/
	@Test
	public final void test_set() {
		Graph graph = new TestGraph();
		TestGraph2 test = new TestGraph2(0);
		test.set(0, graph);
		assertTrue("TestGraph should have just one PlotRun element and have not been added afterwards", test.get(0) instanceof PlotRun);
	}

	/**
	*  Test for set.
	*  @throws  Exception  - if the run list cannot be tested.
	*/
	@Test
	public final void test_set_1() throws Exception {
		test.test_set();
	}

	/**
	*  Returns a new instance of this class.
	*  It contains one test case for the {@link PlotRunList#add} method.
	*/
	@Test
	public final void test_add() {
		Graph graph = new TestGraph();
		TestGraph2 test = new TestGraph2(0);
		test.add(graph);
		assertTrue("TestGraph2 should have just one PlotRun element, not a list of them", test.get(0) instanceof PlotRun);
	}
}

class TestGraph {
	Graph g;
	public TestGraph() throws Exception {
		g=new Graph(1);
		g.data.addElement(new PlotDataElement(Color.BLUE,0));
}
}