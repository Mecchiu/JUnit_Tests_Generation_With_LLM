// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSourceTest {

	@Test
	void testHasSuperClass() {
		JavaSource javaSource = new JavaSource();
		assertFalse(javaSource.hasSuperClass());
	}
}