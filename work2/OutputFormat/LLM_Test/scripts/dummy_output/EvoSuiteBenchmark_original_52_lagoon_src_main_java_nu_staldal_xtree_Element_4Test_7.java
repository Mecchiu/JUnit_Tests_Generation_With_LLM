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
		// Element.java
		// XML Document
		public final String XML = "<a aId='1' "
		+ "aIdref='2' "
		+ "aSubType='3'  >"
		+ "<b>BLAH</b>"
		+ "</a>";

		// Element.java#testConstructor()
		@Test public void testConstructor() throws SAXException, IOException {
			final Element e = new Element(null, null);
			assertNull(e.getBaseURI());
		}

		// Element.java#testGetAttributeValue(int)
		@Test public void testGetAttributeValue() {
			final Element e = new Element(new XTreeURI(), null);
			assertEquals("<a aId='1' aIdref='2' aSubType='3' >BLAH</a>", e.lookupAttribute("aSubType"));
			assertNull(e.lookupAttribute("aSubType"));
		}

		// Element.java#testSetAttribute(String,String)
		@Test public void testSetAttribute() {
			final Element e = new Element(new XTreeURI(), null);
			assertEquals("<a aId='1' aIdref='2' aSubType='3' >BLAH</a>", e.setAttribute("aId", "BLAH"));
			assertEquals("<a aId='3' aIdref='2' aSubType='3' >BLAH</a>", e.lookupAttribute("aSubType"));
			assertNull(e.lookupAttribute("aSubType"));
		}

		// Element.java#testSetAttributeValue(String,String)
		@Test public void testSetAttributeValue() {
			final Element e = new Element(new XTreeURI(), null);
			// the following are supported
			e.setAttribute("aSubType", "A");
			// but not
			e.setAttribute("aSubType", "B");
			assertEquals("<a aId='1' aIdref='2' aSubType='3' >BLAH</a>", e.lookupAttribute("aSubType"));
		}

		// Element.java#testLookupAttribute()
		@Test public void testLookupAttribute() {
			final Vector v = new Vector();
			v.add("<a aId='1' aIdref='2' aSubType='3' >BLAH</a>");
			v.add("<a aId='4' aIdref='6' aSubType='7'>BLAR</a>");
			v.add("<b>BLAH</b>" /* XXX */);
			v.add("<a aId='5' aIdref='7' aSubType='8'/>") /* *** */;
			v.add("<a aId='9' aSubType='10'>BLAR</a>");
			final Element e = new Element(new XTreeURI(), v);
			v.removeAllElements();
			// the following are supported
			if (v.size() == 0) {
				v.add("<a aSubType ='3' >BLAH</a>");
			}
			v.add("<a aId='6' aIdref='10' aSubType='11'/>");
			v.add("<a aId='11' aSubType='2'/>");
			v.add("<a aSubType ='14' aIdref='1' aSubType='3'/>");
			v.add("<a aSubType ='101' aSubType='13'>BLARA</a>");
			// these names are not used, because
			// it does not happen as a result
			v.add("<a aSubType ='4' aSubType='9' aIdref='2' aId='6'/>");
			// but they are now ignored
			e.lookupAttribute("aSubType") /* *** */;
			e.lookupAttribute("aSubType") /* *** */;
		}

		// Element.java#testSetAttributeValue(String,String)
		@Test public void testSetAttributeValue() {
			final Vector v = new Vector();
			v.add("<a aId='1' aIdref='2' aSubType='3'>BLAH</a>");
			v.add("<a aId='4' aIdref='6' aSubType='7'>BLAR</a>");
			v.add("<b>BLAH</b>" /* XXX here */);
			v.add("<a aId='5' aIdref='7' aSubType='8'/>");
			v.add("<b>BLAR</b>" /* XXX */);
			v.add("<a aId='6' aIdref='10' aSubType='11'/>");
			v.add("<a aId='11' aSubType='2'/>");
			v.add("<a aSubType='14' aIdref='1' aSubType='3'/>");
			v.add("<a aSubType='101' aSubType='13'>BLARA</a>");
			// these names are ignored but all attributes
			// are set to their values
			v.add("<a aSubType ='4' aSubType='9' aIdref='2' aId='6'/>");
			/* XXX
			 * these names are not used, because
			 * it does not happen as a result.
			 * 
			 * Note that in that case, it is never possible to use
			 * the two 'aSubType' attributes
			 */
			v.add("<a aSubType ='101' aSubType='13'>BLARA</a>");

			final Element e = new Element(new XTreeURI(), v);
			v.removeAllElements();

			if (v.size() == 0) {
				v.add("<a aId ='6' aIdref='10' aSubType='11'/>");
			}
			v.add("<a aId ='11' aSubType='2'/>");
			v.add("<a aId ='6' aIdref='10' aSubType='11'/>");
			v.add("<a aSubType ='101' aSubType='13'>BLARA</a>");
			// this should not cause any problems
			/* XXX
			 * these names are not used, because
			 * it does not happen as a result.
			 * 
			 * Note that in that case, it is never possible to use
			 * the two 'aSubType' attributes
			 */

			// aSubType is invalid.
			try {
				e.lookupAttribute("aSubType", null);
				fail("No exception is thrown!");
			} catch (final SAXNotRecognizedException e1) {
				fail("Not thrown is the expected exception.");
			}

			// aSubType is unsupported.
}
}