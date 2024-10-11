// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {

    /** Unit test test constructor. */
    @Test
    void hasInterface() {
    	assertTrue("This method should be implemented correctly", JavaSource.hasInterface() );
	}
    
	/** Unit test {@link JavaSource#hasInterface()} method. */
    @Test
    void hasInterfaceIntent() {
    	final java.lang.Class clz = Class.forName("org.sourceforge.ifx.tools.JavaSource_0Test");
    	assertEquals (true, java.lang.Class.isInstance (clz, clz.getDeclaredConstructors ()[0]));
    }

	/** @see JavaSource#hasInterface() */
	@Test
	void hasInterfaceNull() {
	    assertNull("This method should be implemented correctly if the class doesn't implements interface with null methods", 
	            JavaSource.hasInterface (null));
    }

	/** @see JavaSource#hasInterface() */
	@Test
	void hasInterfaceTrue() {
	    assertTrue("This method should be implemented correctly if the class implements interface with null methods and the true value is true",
	            JavaSource.hasInterface (true));
    }

	/** @see JavaSource#hasInterface() */
	@Test
	void hasInterfaceTrueIntent() {
	    final java.lang.Class clz = Class.forName ("org.sourceforge.ifx.tools.JavaSource_0Test");
	    final boolean ret = true;
	    assertEquals (true, java.lang.Class.isInstance (clz, clz.getDeclaredConstructors ()[0]));
	    assertEquals (false, ret);
	}

	/** @see JavaSource#create(java.lang.String) */
	@Test
	void create() {
		final String s = "JavaSource_0Test";
		final JavaSource javaSource = (JavaSource) JavaSource_0Test.class.getDeclaredMethod("create", String.class).invoke(null, s);
		assertNotNull("This method should not fail unless there's a problem to create the class.", javaSource);
	}

	/** @see JavaSource#list(java.lang.String) */
	@Test
	void list() {
		final String s = "JavaSource_0TestList";
		final List list = new ArrayList();
		JavaSource_0Test.list (list, s);
		final Iterator iterator = list.iterator();
		final java.lang.Class clz = java.lang.Class.forName ("org.sourceforge.ifx.tools.JavaSource_0Test");
		final boolean ret = iterator.hasNext();
		assertEquals (true, ret);
		while (iterator.hasNext()) {
			assertTrue("Iterator should not accept null values.", iterator.next()!= null);
		}
	}

	/** @see JavaSource#list(java.lang.String, java.lang.String) */
	@Test
	void listString() {
		final String s = "JavaSource_0TestListString";
		final List list = new ArrayList();
		JavaSource_0Test.list (list, s, s);
		final Iterator iterator = list.iterator();
		final java.lang.Class clz = java.lang.Class.forName ("org.sourceforge.ifx.tools.JavaSource_0Test");
		final boolean ret = iterator.hasNext();
		assertEquals (true, ret);
		while (iterator.hasNext()) {
			assertTrue("Iterator should not accept null values.", iterator.next()!= null);
		}
	}

}
