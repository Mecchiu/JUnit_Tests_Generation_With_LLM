// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
		
	/**
	* Test of numberOfNamespaceMappings method, of class Element.
	*/
	@Test
	void testNumberOfNamespaceMappings() {
	    final ElementsTestCase testCase = new ElementsTestCase();
		test_constructor(testCase);

		// Test 0: element with one namespace mapping
		final String xsi_uri1 = "http://www.stalling.org/ns1/1.0";
		@SuppressWarnings("unused")
		final String xsi_uri2 = "http://www.stalling.org/ns2/1.0";
		final Element el1 = new Element();
		final NamespaceMapping mapping = el1.getNamespaceMapping(xsi_uri1);
		assertTrue(!el1.getNamespaceMapping(xsi_uri1).equals(mapping) );

		final String xsi_uri3 = "http://www.stalling.org/ns3/1.0";
		final NamespaceMapping mapping1 = el1.getNamespaceMapping(xsi_uri3);
        final NamespaceMapping mapping2 = el1.getNamespaceMapping(xsi_uri2,xsi_uri3);
        assertNotNull( mapping1 );
        assertFalse(!el1.getNamespaceMapping(xsi_uri2).equals(mapping1) );
        assertFalse(!el1.getNamespaceMapping(xsi_uri1).equals(mapping2) );

		final NamespaceContext nsctx = el1.getDefaultNamespaceContext();
		final NamespaceMapping mapping3 = nsctx.getNamespaceMapping("xmlns",xsi_uri1);
		assertTrue(mapping3.equals(nsctx.getNamespaceMapping("xmlns","xmlns:" +xsi_uri1)));
	}

}