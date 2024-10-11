// JCLOTest.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getValue(String)} method.
*/
class JCLOTest {
		
		@Test
		void testGetValue() {
				JCLO jclo = new JCLO();
				assertEquals(jclo.getValue("test"), "test");
		}
}