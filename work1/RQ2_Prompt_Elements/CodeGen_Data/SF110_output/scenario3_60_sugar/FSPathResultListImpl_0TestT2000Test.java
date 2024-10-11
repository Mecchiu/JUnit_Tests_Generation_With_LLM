// FSPathResultListImpl_0Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

	/**
	* Method that tests the execute method of FSPathResultListImpl.
	* This method is executed as the result of the List method call in each() method 
	* of the Result class.
	* Note that results are ordered based on the call(Result) method call.
	*
	* @throws Exception - thrown by the code calling execute
	*/
	@Test
    void every() throws Exception;
}

// FSPathResultListImpl_1Test.java

//import java.io.File;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;



// FSPathResultListImpl is an ArrayList implementation
class FSPathResultListImpl_1Test extends ArrayList<FSPathResult> {
	
	////////////////////////////////////////////////////////////////////////////
	//						Instance Variables								//
	////////////////////////////////////////////////////////////////////////////

		// This is the default value
	
	////////////////////////////////////////////////////////////////////////////
	//							   Protected Methods								//
	////////////////////////////////////////////////////////////////////////////
	
	
	/*
	* Method: execute(List)
	*/
	@SuppressWarnings("unchecked")
	public FSPathResult execute(List results){
	    assertEquals(results.size(), size());
	    return ((FSPathResult)results.iterator().next());
	}

}








