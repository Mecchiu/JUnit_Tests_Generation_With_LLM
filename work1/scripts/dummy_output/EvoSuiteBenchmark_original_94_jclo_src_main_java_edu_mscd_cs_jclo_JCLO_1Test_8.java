// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		
	/**
	 * 	An Object that contains the name and other information
	 * 	of a command line variable.
	*/
	private Object object;

	/**
	 * 	A simple object for the String key that contains the
	 * 	expected value after parsing the command line.
	 * 	If <code>addToArray</code> is called with a String that
	 * 	contains the value of a command line variable name,
	 * 	it is a reference to it and is returned by that object.
	 * 	Otherwise, the value field is return.
	 */
	private Object simpleObject;

	/**
	 *  Test parse() method in a new program from the command line.
	 */
	public JCLO_1Test() {
	}

	/**
	 *  Test parse() method in another program from a different command line.
	 *
	 *  @return		A copy of <code>object</code> after parse is performed
	 */
	private Object newCopy();

    /**
	 * 	Create and usage message for the acceptable command line variables.
	 */
	@Test
	public void usage() {
	  	newCopy();
		String name, content;

		// add a new key with a String value
		setKey(() -> "hello");

		// add a new key with an Integer value
		setKey(() -> {
			// get an int, create a new object to create a String instance
			int i = 10;
			return i.toString();
		});

		// add a new key with a float value
		setKey(() -> {
			// get an int, create a new object to create a String instance
			float f = 10.4f;
			return f.toString();
		});
}
}