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
		String className = null;
		


	@Test
    public void hasSuperClass() {
		assertTrue("should have a super class",JavaSource.hasSuperClass());
	}
    
    

	@Test
    public void returnsStringForTheClassName() {
		className = JavaSource.class.getName()+".java";
		assertEquals(className, JavaSource.class.getName());	
	}

    
    @Test
    public void addClassName() {
		className = "X$xX_X";
		assertEquals(className, JavaSource.class.getName());
    }
    
    
    

	@Test
    public void throwsIllegalArgumentExceptionIfClassNameIsEmpty() {
		className = "";
		try {
			assertTrue(JavaSource.class.getName().equals(""));
		}
		catch(Exception expectedException) {
	    	fail("The method should throw IllegalArgumentException for the empty Class Name");
		}
	}
    

	@Test
    public void testCreateSource() {
		StringWriter sw = new StringWriter();
		JavaSource.createSource(className, true, sw);
		List<String> lineList = new ArrayList<String>();
		lineList.add(className);
		lineList.add(sw.toString());

		assertTrue(lineList.size()== 4);
		Iterator<String> i = lineList.iterator();
		String currentLine = i.next();
		assertEquals("\n", currentLine);
		currentLine = i.next();
		assertEquals("\n\n", currentLine);
		currentLine = i.next();
		assertEquals("\n\n", currentLine);
		currentLine = i.next();
		assertEquals("\n", currentLine);

    }

}