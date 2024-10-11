// JCLOTest.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLOTest {

	/**
	* Test case for the {@link JCLO#usage()} method.
	* It tests the usage message for the acceptable command line variables.
	*/
	@Test
	void testUsage() {
		JCLO jclo = new JCLO();
		String usage = jclo.usage();
		assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n-j\n-k\n-l\n-m\n-n\n-o\n-p\n-q\n-r\n-s\n-t\n-u\n-v\n-w\n-x\n-y\n-z\n", usage);
	}
}