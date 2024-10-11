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
		assertEquals("Usage: java edu.mscd.cs.jclo.JCLO [options]\n" +
								 "Options:\n" +
								 "  -h, --help\n" +
								 "  -v, --verbose\n" +
								 "  -o, --output <file>\n" +
								 "  -i, --input <file>\n" +
								 "  -n, --number <number>\n" +
								 "  -s, --string <string>\n" +
								 "  -f, --flag\n" +
								 "  -a, --array <number> [<number> ...]\n" +
								 "  -m, --multiple <number> [<number> ...]\n" +
								 "  -c, --choice <number>\n", usage);
	}
}