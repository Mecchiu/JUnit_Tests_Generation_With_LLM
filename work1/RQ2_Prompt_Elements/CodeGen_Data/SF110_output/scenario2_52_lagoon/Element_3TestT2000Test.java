// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
/**
	* Set up the test.
	*/
	@Test public void test() throws Exception {
		URL source = getClass().getResource("/element.xml");
		Source s = new StringSource(source.toString());
		int lastIndex = 0;
		Parser p = saxFactory.makeSAXParser().getParser();
		p.setFeature(SAXParser.FEATURE_PROCESS_NAMESPACES, false);
		p.setProperty("http://xml.org/sax/properties/lexical-handler",
				new LexicalHandler() {
					public void start(String uri, String publicId, String systemId,
							Attributes atts, String text) throws SAXException {
					}
					public void end(String uri, String publicId, String systemId,
							Attributes atts) throws SAXException {
						assertion(lastIndex < atts.getLength(),
								"Unexpected Attributes");
					}
					public void startPrefixMapping(String prefix, String uri)
					{
					}
					public void endPrefixMapping(String prefix)
					{
					}
					public void ignorableWhitespace(char[] ch, int start, int length)
					throws SAXException {
					}
				});
		InputSource is = new InputSource(s);
		XmlPullParser p2 = p.parse(is);
                p2.getXMLReader().setFeature(DISCARD_XMLDECLARATION, false);
                p2.getXMLReader().setFeature(NAMESPACES, null);
                Elements elements = new Elements();
                p2.getContentHandler().startElement(null, "", "",
                		new Vector<XMLElement>());
                while (p2.getEventType()!= XmlPullParser.END_DOCUMENT) {
                    p2.next();
                }
        }
}
// End Element_3Test.java
