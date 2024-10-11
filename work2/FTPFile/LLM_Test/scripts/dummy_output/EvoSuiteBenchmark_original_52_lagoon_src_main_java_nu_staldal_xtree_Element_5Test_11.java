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
		
    /**
     * Get the attribute value of an element, checking that the value is indeed 
     * valid XML.
     * @throws Exception if there is a problem with the XML stream
     */
    @Test
    public void getAttributeValue() throws Exception {
        
        String xmldata = "<a>text</a>";
        String realdata = Element.getAttributeValue("a", xmldata);
        
        assertTrue(realdata == xmldata);
    }
    
    /**
     * Parse an XML document in XML string: check that the parsing is correct.
     */ 
    @Test
    public void parseXML() throws SAXException {
        
        byte[] xmldata = new byte[] {
                (byte)0xFE,
                (byte)0xED,
                (byte)0xED,
                (byte)0xED,
                0x00, 0x03, 0x21, 0x02, 0x01, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00,
                (byte)0xED,
                0x00, (byte)0x00, (byte)0x00, (byte)0xED, (byte)0x00, (byte)0x00, (byte)0x00,
                (byte)0x00, (byte)0x00
        };
        
        String result = null;
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            factory.setProperty("javax.xml.stream.isCoalescing", true);
            factory.setProperty("javax.xml.stream.isCoalescingDirective", true);
            factory.setProperty("javax.xml.stream.input.encoding", "UTF-8");
            factory.setProperty("javax.xml.stream.output.encoding", "UTF-8");

            factory.setProperty("javax.xml.stream.isCoalescingEnabled", true);

            InputStream stream = factory.createUnshiftedInputStream(xmldata);
            result = new XMLHandler(stream).getAttributeValue("a");
        } catch (Exception xce) {
            System.err.println("FAILED: got: " + xce);
            result = xce.toString();
        }

        final String expected =
                   "<a>text</a>";
        assertEquals(result, expected);

    }
	
}