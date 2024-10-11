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

	/**
	 * Test method for toString()
	 * @throws SAXException with error
	 */
	@Test public void testToString() throws SAXException {
		
        String xml = 
        	"<root><child/></root>"						//$NON-NLS-1$
        	+ "<child name='a' n='1'/><child name='b' n='2'><child></child><child/></child>" //$NON-NLS-1$ //$NON-NLS-2$
        	+ "<child><child name='a' /><child name='b' /><child><child></child><child/></child></child>" //$NON-NLS-1$ //$NON-NLS-2$
        	+ "</root>"; //$NON-NLS-1$

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
            parse(pw, xml);

        String output = sw.toString();
        System.out.println(output);

		// check output
		assertNotNull(output);

	}

	@Override
    public Class<Element> getClass() {
        return Element.class;
    }

	/**
	 * Convert from a XML document to raw DOM.
	 *
	 * @param pw PrintWriter to write to
	 * @param xml XML to parse.
	 */
	public static void parse(PrintWriter pw, String xml) throws SAXException {
        InputSource source = new InputSource(new ByteArrayInputStream(xml.getBytes()));
        Document dom = null;
        try {
            dom = Factory.createDocument(source);

            // check for well formed return value
            assertNotNull("dom is not formed", dom);

            // check parser for well formed return value
            DOM parser = new DOMImplementationRegistry().newDOMImplementation().getDOMImplementation().createDocumentBuilder();
            XMLReader xmlReader = new XMLReader(parser, new AttributesImpl());
            pw.println("Parsing XML from source:\n" + xml); //$NON-NLS-1$

            // walk through the tree and check for well formed return values
            int event = xmlReader.next();
            assertTrue("expected an START_ELEMENT for each", event == XMLReader.START_ELEMENT); //$NON-NLS-1$

            Element root = dom.getDocumentElement();
            checkNodes(pw, dom, root);
        } catch (Exception ex) {
            pw.println("Unexpected exception:"); //$NON-NLS-1$
            pw.println(ex.toString());
        } finally {
            pw.close();
        }


    }

    @Override
    public void assertNodes(Element e) throws SAXException {
        assertEquals("Node name", "child", e.getName());
        Vector children = e.getChildNodes();
        checkNodes(e, e.getChildNode("a"), children.elementAt(0), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("b"), children.elementAt(1), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("c"), children.elementAt(2), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("d"), children.elementAt(3), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("e"), children.elementAt(4), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("f"), children.elementAt(5), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("g"), children.elementAt(6), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("h"), children.elementAt(7), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("i"), children.elementAt(8), 0, 0); //$NON-NLS-1$
        checkNodes(e, e.getChildNode("j"), children.elementAt(9), 0, 0); //$NON-NLS-1$
    }

    private void checkNodes(Element e, Node node, NodeList nodes, int index, int position) throws SAXException {
        final int length = xpp.getNamespaceCount(node);

        String ret = null;
        for (int i = 0; i < length; ++i) {
            final TagName tagName = xpp.getNamespacePrefix(node);
            final String prefix = xpp.getPrefix(node);
            if (XMLFilter.URI_XMLNS.equals(prefix)  || XMLFilter.URI_XML_NS.equals(prefix)) {
                String namespace = xpp.getNamespaceURI(node);
                if (XMLFilter.URI_NS.equals(namespace)) {
                    NamespaceAttribute attr = xpp.getName(node);
                    final String val = attr.getAttributeValue();
                    assertFalse("Attribute " + attr + " is present but not expected - found=" + val + " expected=" + nameConverter.xmlToUnescaped(node.getName(), true) + " in xml:>" + xml, val.isEmpty();
                }
                break;
            }
        }

        for (int i = 0; i < length; ++i) {
            final TagName tagName = xpp.getName(node);
            final String name = xpp.getName(nodes.item(index + i));
            assertFalse("Tag " + tagName + " is present but not expected - found=" + name + " in node:>" + node.toString(), name.isEmpty());
        }
        
        // Check whether the child matches
        final String val = xpp.getName(nodes.item(index + position));
        if ("entities".equals(tagName)) { //$NON-NLS-1$
            assertTrue("Child isnt a TEXT (only TEXT nodes, no <>)", val.indexOf("<") < 0); //$NON-NLS-1$ //$NON-NLS-2$
        } else if ("cdata".equals(tagName)	) { //$NON-NLS-1$
            assertTrue("Child isnt a TEXT (only TEXT nodes, no <>)", val.indexOf("<") < 0); //$NON-NLS-1$ //$NON-NLS-2$
        } else if ("id".equals(tagName)) { //$NON-NLS-1$
            if ("a".