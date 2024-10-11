// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {

	@Test
	public void testHasSuperClass() {
		JavaSource javaSource = new JavaSource();
		assertFalse("Has a superclass", javaSource.hasSuperClass());
		javaSource.addMemberVariable("iHasSuper", true);
		assertTrue("Has a superclass", javaSource.hasSuperClass());
		Iterator<String> iter = javaSource.getMemberVariables();
		while (iter.hasNext()) {
			String result = iter.next();
			assertEquals(new Integer(50), result);
		}
	}
	



}