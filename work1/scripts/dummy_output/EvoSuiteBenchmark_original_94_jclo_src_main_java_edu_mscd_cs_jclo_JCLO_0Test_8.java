// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		
		@Test
		public void test() {
			assertNotNull("JCLO expects a field named 'object'!");
			Object obj = parseAdditional("/src/edu/mscd/cs/jclo/JCLO.java");
			JCLO_0.getValue("object");
			assertEquals("Wrong", obj, null);
			assertNotNull("JCLO expects the 'object' field to have been set correctly!");
		}

}