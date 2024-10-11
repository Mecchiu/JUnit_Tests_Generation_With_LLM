// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
		private final Element example = testElement();
public static final String INVALID_PROPERTY_VALUE = "invalid property value";
		private final Element example2 = testElement("one","two");
	private final Element example3 = testElement("one","two");
private final Element example4 = testElement("one","two","three");
	private final Element example5 = testElement("one2","two3");
public static final String NON_EXISTENT_ELEMENT = "<none>";
		private final Element element = testElement();
		private final Element element2 = testElement();
		private final Element element3 = testElement("");
		protected final AttributesImpl attributes = new AttributesImpl();
 
//	@Test
//	public void test() throws IOException
//	{
//		System.out.println("test test");
}