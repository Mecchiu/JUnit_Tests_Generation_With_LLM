// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains one unit test case for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {
		
    /*
     * Test class contains methods for XML output from the test object.
     */
    private static class XMLTestObject extends IFXObject {
        private String data;

        public String getData() {
            return data;
        }

        protected void setData(String newData) {
            data = newData;
        }
    }
	
	/**
	 * Creates a new empty XML object with default XML indentation mechanism of 2.
	 * @return an XML object.
	 */
	private static Element makeXML(String name) {
		Element root = new Element("testNode");
		root.setName(name);
		return root;
	}

	/**
	 * Makes a new empty XML object from a map of element names and corresponding field names
	 * @param elemNames the name of the elements that this object represents.
	 * @return the XML object.
	 */
	private static Element makeXML(Map elemNames) {
		Element root = new Element("testNode");
		Namespace ns = Namespace.NO_NAMESPACE;
		Namespace n1 = Namespace.create("ns1", "ns2");
		Namespace n2 = Namespace.create("ns2", "ns3");
		Namespace n3 = Namespace.create("ns3", "ns4");
		root.setDefaultNamespace(ns);
		root.setAttribute("name", "testChildXML");
		root.setAttribute("targetNamespace", "ns1");
		root.addContent(makeXML(elemNames.get("testNode.xmlChildXML")));
		root.setAttribute("ns1", "0");
		root.setAttribute("ns2", "0");
		root.setAttribute("ns3", "0");
		root.setAttribute("ns4", "0");
		return root;
	}
	
	/**
	 * Makes an xmlObject from an element by giving it a name.
	 * @param rootElement the element to make a test object for.
	 * @param elementName the name of the element that is representing the test object.
	 * @return the xml object.
	 */
	private static Element makeXML(Element rootElement, String elementName) {
		return rootElement.getChild("testNode.xml", rootElement.getSchema(), elementName);
	}
	 
	/**
	 * Test a nested Element for the object that we just created.
	 */
	@Test
	public void testElementName() {
		// Create a new IFX object.
		XMLTestObject o = new XMLTestObject();
		o.setData("<test/>");
		XMLOutputter output = new XMLOutputter();
		output.setXMLHeader(true);
		assertEquals(1, XMLEncoder.encode(output, o));
		output.reset();
		o = new XMLTestObject();
		o.setData("<? xml?>");
		output = new XMLOutputter();
		output.setXMLHeader(true);
		assertEquals(2, XMLEncoder.encode(output, o));
	}

	/**
	 * Test a list of elements for a given IFXObject.
	 * This list of elements is ordered such that we get the element at
	 * index 0 (with its associated test child), followed by its
	 * test child (if any), and so on.
	 */
	@Test
	public void testElements() {
		Element root = makeXML("<test/>");
		List expected = new ArrayList();
}
}