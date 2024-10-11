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
		Document doc;

		Element element;

    /**
     * Constructor.
     * Create a new {@link Element} with an empty DOM.
     *
     * This will create an element whose child are the same as the given node.
     *
     * @param node the node to be created
     * @throws ParserConfigurationException
     * @throws SAXException
     */
    Element_4Test(Node node) throws ParserConfigurationException, SAXException {
        doc = ParserConfiguration.newParserWithFeatures(parseFeatures()).newDocument();
        element = new Element(doc, null);
        element.appendChild(node);
    }

    /**
     * Get the attribute type of the element.
     *
     * It is used by the {@link Element} to determine the type of an attribute for a
     * given index (index < 0 means "no attribute").
     *
     * @return the attribute type
     */
    @Test
    public void testGetAttributeType() {
        assertEquals("CDATA", element.getAttributeType(0));
        assertEquals("CDATA", element.getAttributeType(-1));
        assertEquals("id", element.getAttributeType(1));
        assertEquals("idattr", element.getAttributeType(2));
        assertEquals("IDREFS", element.getAttributeType(3));
        assertEquals("IDREF", element.getAttributeType(4));
        assertEquals("IDREFS", element.getAttributeType(5));
        assertEquals("ENTITY", element.getAttributeType(6));
        assertEquals("ENTITIES", element.getAttributeType(7));
        assertEquals("NOTATION", element.getAttributeType(8));
        assertEquals("ANY", element.getAttributeType(-9));
        attribCount = "NOMINAL" + (element.getAttributeType(9) == null? 1 : 2);
        assertEquals("ENTITIES", element.getAttributeType(9));
        assertEquals("NOTATION", element.getAttributeType(10));

        attribCount++;
        assertEquals("ENTITIES", element.getAttributeType(attribCount - 1));
        attributeCount = 0;
        Vector values = element.getAttributeValues();
        for (int i = 0; i < values.size(); ++i) {
            assertEquals("ENTITIES", element.getAttributeType(attributeCount));
            attributeCount++;
        }
    }

    /**
     * Get a vector containing all of the attributes.
     *
     * @return the attributes vector
     */
    @Test
    public void testGetAttributeValues() {
        Vector val;
        attribCount = 0;
        val = element.getAttributeValues();
        attribCount = 0;
        for (int i = 0; i < val.size(); ++i) {
            assertEquals(String.valueOf((char) ((int)val.item(i)).toString()), element.getAttributeType(attribCount++));
        }
        Vector value = doc.getChildNodesAtIndex(0);
        int index = 0;
        for (; index < value.size(); index++) {
            assertEquals("ENTITIES", value.item(index).getAttributeType(1));
            value = value.item(index);
        }
        assertEquals(value.size(), doc.getChildNodes().size());
        nodeIndex = 0;
        Iterator nodes = value.iterator();
        for (; nodes.hasNext();) {
            Node current = (Node) nodes.next();
            assertEquals("ENTITIES", current.getAttributeType(0));
            assertNotNull(current);
        }
    }

}