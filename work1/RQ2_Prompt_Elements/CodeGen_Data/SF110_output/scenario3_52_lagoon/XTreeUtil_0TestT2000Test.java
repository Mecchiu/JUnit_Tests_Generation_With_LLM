// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {

        @Test
        public void testGetXML_() {
            String xml = "XTreeTest XML";
            XTreeUtil.Element e = XTreeUtil.parseXML(xml);
            assertNotNull(e);

            //test values
            assertEquals(xml, e.getContent());
            
            // test attributes (namespace)
            assertEquals("test", e.getName().getNamespaceURI());
            assertEquals(NAMESPACE, e.getName().getNamespacePrefix());
            assertEquals(ElementType.ELEMENT, e.getName().getLocalName());
            
            // test contents (structure)
            assertTrue(hasContent(e));
        }
	
        @Test
        public void testGetXML_validateDTD() {
            String xml = "XTreeTest/XTreeTest1 XML 1";
            XTreeUtil.Element e = XTreeUtil.parseXML(xml, true, null, xmlInput);
            assertNotNull(e);

            //test if parsed correctly
            assertNull(e.getContent());
            assertTrue(hasContent(e));
   		}
	
    /**
     * If the <schema> element and/or <dtd> contains an XML Schema 
     * reference which is defined in a schema validation programatically, 
     * the schema validation programatically will not have to 
     * resolve the XML Schema in order to correctly resolve this reference.
     * @throws IllegalArgumentException if the <schema> element contains a 
     * schema reference, or if the <dtd> element does not contain an XML 
     * schema reference.
     */
    @Test
    public void testGetXMLSchema() throws IllegalArgumentException {
         String error = "XTreeUtil.TestGetXMLSchema(XTreeUtil.parseXML(InputSource, false, null, null))";
         try {
             XTreeUtil.parseXML(null, false, null, error);
             fail("XTreeUtil.TestGetXMLSchema(XTreeUtil.parseXML(InputSource, false, null, null)) should not have succeeded");
         }
         catch (IllegalArgumentException e) {
             // OK
         }
         
        //if there is a schema to be used, it must resolve as XML Schema in order not to have it resolved as DOM in this manner
        try {
            XTreeUtil.parseXML(xmlInput, false, null, schemaType);
            fail("XTreeUtil.TestGetXMLSchema - failed to resolve schema in XML");
        }
        catch (IllegalArgumentException e) {
            // OK
        }
	}
}
