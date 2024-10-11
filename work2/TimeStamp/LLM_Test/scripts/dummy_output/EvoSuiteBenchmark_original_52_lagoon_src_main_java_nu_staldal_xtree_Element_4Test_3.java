// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		// Element_4Test.java

	/** Testing attribute access from class without parent class. */
	@Test
	void lookupAttributeNoParent() throws Exception {
		ElementElement ee = (ElementElement) Parser.parse(getClass().getResourceAsStream("elements_with_no_parent.sax"), null);
		AttributesImpl a = new AttributesImpl();
		try (StreamSource ssl = new StreamSource(ee.characters(false))) {
			getAttributes(a, ee);
		}
	}

	/** Testing attribute access from class without class loader. */
	@Test
	void lookupAttributeNoClassLoader() throws Exception {
		ElementElement ee = (ElementElement) Parser.parse(getClass().getResourceAsStream("elements_without_class_loader.sax"), null);
		AttributesImpl a = new AttributesImpl();
		try (StreamSource ssl = new StreamSource(ee.characters(false))) {
			getAttributes(a, ee);
		}
	}

	/** Testing attribute access from test class. */
	@Test
	void lookupAttributeWithParent() throws Exception {
		Element ctl = (Element) Parser.parse(Element.class.getResourceAsStream("elements_without_class_loader.sax"), null);
		ElementElement ee = (ElementElement) ctl;
		AttributesImpl a = new AttributesImpl();
		try (StreamSource ssl = new StreamSource(ee.characters(false))) {
			getAttributes(a, ctl);
		}
	}

	/** Testing attribute access from test class that is part of the class hierarchy. */
	@Test
	void lookupAttributeFromParent() throws Exception {
		Element ctl = (Element) Parser.parse(Element.class.getResourceAsStream("elements_with_an_attribute_not_parent.sax"), null);
		ElementElement ee = (ElementElement) ctl;
		AttributesImpl a = new AttributesImpl();
		try (StreamSource ssl = new StreamSource(ee.characters(false))) {
			getAttributes(a, ctl);
		}
	}

	/** Testing attribute access from test class with class loader. */
	@Test
	void lookupAttributeWithClassLoader() throws Exception {
		Element ctl = (Element) Parser.parse(Element.class.getResourceAsStream("ejax_test1_no_class_loader.sax"), null);
		ElementElement ee = (ElementElement) ctl;
		AttributesImpl a = new AttributesImpl();
		try (StreamSource ssl = new StreamSource(ee.characters(false))) {
			getAttributes(a, ctl);
		}
	}

}