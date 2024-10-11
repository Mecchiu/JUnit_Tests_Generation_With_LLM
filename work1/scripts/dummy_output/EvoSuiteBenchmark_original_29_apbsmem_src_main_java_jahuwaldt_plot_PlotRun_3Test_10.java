// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		private final List toReturn = new ArrayList();
	/**
	* This is a utility method to make the test
	* scenario for the {@link PlotRun_3Test#iterator()}
	* method possible to be conveniently used in unit
	* tests.  It initializes this object with the three
	* PlotDatum objects in the two arrays passed in, and makes
	* a call to the {@link PlotRun_3Test#add(Object) add} method
	* on the object and makes the list examined.  Once a list of
	* PlotDatum objects is examined all the items in the
	* array are collected and return to the caller of
	* the {@link PlotRun_3Test} class, the list examined is
	* returned.
	*
	* @throws  IllegalStateException - if both arrays are null.
	*/
	public ArrayList toReturnForCall() {
		Object dummyFirst = new Object();
		add(dummyFirst);
		return toReturn;
	}

	/**
	 *  Make a copy of this object.
	*/
	public Object clone();

	/**
	 *  Does nothing.  All tests method are in accordance
	 *  with one-dimensional arrays.
	*/
	public static void main(String[] args) {
}
}