// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {
		
    /**
     * Test if we get the attribute by shortcut.
     */
    @Test
    public void getAttrValueWithShortcut() {
        Hero hero = new Hero();
        assertEquals("getAttrValue() must return <shortcut>None</shortcut>.",
                     "None", hero.getAttrValue("testShortcutValue"));
    }

    /**
     * Test if we get the attribute by shortcut.
     * We should never get this because we set it to the target.
     */
    @Test
    public void getAttrValueWithNoShortcut() {
        Hero hero = new Hero();
        assertNull(hero.getAttrValue("testLongKey"));
    }

    /**
     * Test if we find special.
     */
    @Test
    public void special() {
        Hero hero = new Hero();
        assertFalse(hero.isSpecial() == Hero.Special.None);

    }

    private static final String SPECIALS_FILE = "specials.xml";

    /**
     * Read specials.xml file
     * @return specials.xml
     */
    private static Document getXmlFromFile(String filePath) {
	Document xml = new Document(filePath);

	// Load special attributes
	Element e = xml.getRootElement();

	// Load special spells
	for (Iterator i = e.elementIterator(); i.hasNext(); ) {
	    Element e1 = (Element) i.next();
	    Attribute.SPECIALSPECIALSPECIAL.fromXML(e1);
	}

	// Load special values
	Element e2 = xml.addElement(e, "values");
	e2.addAttribute(Attribute.TARGET).setValue(
		"Special<0", Attribute.TARGET);
	e2.addAttribute(Attribute.VALUE).setValue(
		"<3>Foo</3>", Attribute.VALUE);
	e2.addAttribute(Attribute.VALUE).setValue(
		"<1>Bar</1>", Attribute.VALUE);
	e2.addElement(Document.ElementName.PREFIX).addAttribute(Attribute.VALUE).setValue(
		"<0>A</0>", Attribute.PREFIX);
	e2.addAttribute(Attribute.VALUE).setValue(
		"<2>B</2>", Attribute.VALUE);
	e2.addElement(Document.ElementName.PREFIX).addAttribute(Attribute.VALUE).setValue(
		"<1>C</1>", Attribute.PREFIX);
	e2.addElement(Document.ElementName.PREFIX).addAttribute(Attribute.VALUE).setValue("<2>D</2>", Attribute.PREFIX);
	// end adding Element.

	return xml;
    }

    /**
     * Read special (special values) from special.xml
     * @return special.xml
     */
    private static Document getXmlFromFile(String filePath, String elementName) {
	Document xml = getXmlFromFile(filePath);
	Element e = xml.getRootElement().element(elementName);

	// Load special values
	for (Iterator i = e.elementIterator(); i.hasNext(); ) {
	    Element s = (Element) i.next();
	    Attribute.SPECIALSPECIALSPECIAL.fromXML(s);
	}

	// Load special spells
	return getXmlFromFile(filePath, "specials");
    }

    public static void addElement(Element el) {
	String nodeName = el.getName();
	String nodeValue = el.getText();
}
}