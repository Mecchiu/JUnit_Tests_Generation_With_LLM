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
		PlotRunList_0 testobj;

		{
			testobj = new PlotRunList_0();
		}

		/**
		*  Construct an object of {@link PlotRunList} without
		*  a setPlotSymbol method.
		*/
		public PlotRunList_0_0() {
		}

		/**
		*  Set the PlotSymbol of the PlotRunList object
		*  that will be created and returned by the
		*  constructor.
		*/
    void setPlotSymbol(PlotSymbol symbol) {
    }


		/**
		*  Test the size() method for a run that has
		*  a single PlotRun.
		*/
		@Test
		void test_size_02() throws ClassCastException {
			{
				PlotRun run = testobj.get((int)0);
				assertEquals("size()",0,run.size());
			}
		}

		/**
		*  Test the size() method for a non-run that has
		*  a single PlotRun.
		*/
		@Test
		void test_size_03() throws ClassCastException {
			{
				int index = 1;
				{
					run = testobj.get(index);
					// Note: This test code assumes an unordered collection!
					assertTrue("size()",run.size() > index+1);
				}
			}
		}

		/**
		 *  Test the size() method for a range of runs that has
		 *  a single PlotRun that has a plot symbol.
		 */
		@Test
		void test_size_04() throws ClassCastException {
			{
				Map runs = new HashMap();
				run = testobj.get((int)0, runs);

				int index = 1;
				{
					run = testobj.get((int)0, runs);
					// Note: This test code assumes an unordered collection!
					assertEquals("size()",index+1,run.size());
				}
			}
		}

		/**
		*  Test the size() method for a range of runs that has
		*  no PlotRun that has a plot symbol.
		*/
		@Test
		void test_size_05() throws ClassCastException {
			{
				Map runs = new HashMap();
				run = testobj.get((int)0, runs);

				int index = 1;
				{
					run = testobj.get((int)0, runs);
					// Note: This test code assumes an unordered collection!
					assertEquals("size()",index+1,run.size());
				}
			}
		}

}