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
		PlotRunList_2Test(){}

	/**
	 *  The run objects are stored in an ArrayList.
	 */
	Class<Run> type;

	/**
	 *  Build an Object of type Run.
	 *
	 *  @return The Run object.
	 */
	static Run newRun() {
		return null;
	}

	/**
	 *  Test if object o can be converted to a {@link PlotRunList}.
	 *
	 *  @param  o   The first object to be tested.  Any other object
	 *                is supported.
	 *  @return {@code true} if this object represents a {@link PlotRunList},
	 *            another PlotRunList, another Collection (other than runs)
	 *            or an Object (for the first object)
	 */
	boolean canBeConvertedToList(Object o) {
		return type == Run.class || type == Collection.class || o instanceof Run;
	}

	/**
	 *  Test if an object could be an instance
	 *  of a Run.
	 *
	 *  @param  o   The object to be tested.
	 *  @return {@code true} if this object represents a PlotRun or a {@link Run},
     *          another PlotRun or a {@link Run}
     */
	boolean canBeInstanceofRun(Object o) {
		return type == Run.class || type == Run.class || o instanceof PlotRun;
	}

	/**
	 *  Test if an object could be an instance
	 *  of a Collection.
	 *
	 *  @param  o   The object to be tested.
	 *  @return {@code true} if this object represents a PlotRun or a {@link Run},
     *          another PlotRun or a {@link Run}.
	 */
	boolean canBeInstanceofCollection(Object o) {
		return type == Collection.class || o instanceof Collection;
	}

	/**
	 *  Test if an object could be an instance
	 *  of a PlotMark.
	 *
	 *  @param  o   The object to be tested.
	 *  @return {@code true} if this object represents a PlotRun or a {@link Run},
     *          another PlotRun or a {@link Run}.
	 */
	boolean canBeInstanceofPlotMark(Object o) {
		return type == PlotMark.class || o instanceof PlotMark;
	}

}