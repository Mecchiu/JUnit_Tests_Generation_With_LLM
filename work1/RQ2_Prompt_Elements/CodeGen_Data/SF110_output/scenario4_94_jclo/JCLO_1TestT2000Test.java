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

	@Test
	void usage() {
		// Test to make sure that the class is properly parsed.
		boolean res = true;
		try {
			res = JCLO.usage();
		} catch (Exception ex) {
			res = false;
		}
		assertTrue("No error", res);
		
		// Test to make sure that the class is properly returned.
		// (see http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Class.html)
		Class javaClass = Class.forName("java.lang.Class");
		Class javaFieldClass = Class.forName("java.lang.Class$field");
		
		res = true;
		try {
			Class.forName("java.lang.Class$field");
		} catch (Exception nox) {
			res = false;
		}
		assertTrue("no field class found", res);
		res = true;
		try {
			Class.forName("java.lang.Class");
			res = false;
		} catch (Exception nox) {
			res = true;
		}
		assertTrue("error in class", res);
		
		// Test to make sure that parsing of this class fails.
		res = true;
		try { 
			res = JCLO.usage();
		} catch (Exception ex) {
			res = false;
		}
		assertTrue("no error", res);
	}
}
