// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {
		@Test
	    void test1()
	    {
		  Element e = new Element();
		  assertNull("Null value", e.getValue());
		  Vector v = new Vector();
		  v.addElement(e);
		  assertTrue("Not a list", v.getClass().getName().equals(Vector.class.getName()));
		  assertEquals("Not equal", e, v.get(0));
		  v.addElement(new Element());
		  assertTrue("Not a list", v.getClass().getName().equals(Vector.class.getName()));
		  assertEquals("Not equal", new Element(), v.get(0));
	    }
}