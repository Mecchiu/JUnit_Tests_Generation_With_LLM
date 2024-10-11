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
		
//	String[][] aliases;
	private String[][] aliases;

		
	/**
	* Simple class that does nothing
	*/
	public class Simple {
		
//		public Simple() {
//			usage();
//		}
	}
	
	/**
	* @see JCLO.Simple
	*/
	Simple simple = new Simple();

	/**
	* Test usage of the String[][] and the aliases
	* by parsing the command line args.
	*/
	@Test
	public void usage() {
		simple.parse(new String[] { "aliases" });;
	}
	
	/**
	* Test usage of the aliases
	* by parsing the command line arguments.
	*/
	@Test
	public void usage_aliases() {
		JCLO.testAliases();
		
	}

	
	/**
	* Test aliases for the aliases
	*/
	private void testAliases() {
}
}