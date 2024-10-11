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
		//-- test object ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	PlotRunList testObject() { 
		Collection runs   = new ArrayList();  
		runs.set( 0, new PlotRun( 1.0,  Color.black, Color.green) );
		runs.set( 1, new PlotRun( 2.0,  Color.red , Color.pink ) );
		runs.set( 2, new PlotRun( 3.0,  Color.blue, Color.black  ) );
		Object obj = runs.replace( 0,  new  PlotRun( 0.0,  Color.black, (Color) null) );
		assertTrue( "Error. Test object should be replaced with runs",!obj.equals(runs) );
		return (PlotRunList)( obj );
	}	
		//-- test object serialiation ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public static void testUnserialization() throws Exception {
		plotRunList( testObject().serialize() );
	}
	
	static public void testSerial() throws Exception {
		String dataJson = "{\"run\":[{\"plotObject\":"+testObject().serialize()+"},"
				+ "{\"plotObject\":"+testObject().serialize()+"}]}";

		testObject();

		plotRunList( dataJson );
	}	
}