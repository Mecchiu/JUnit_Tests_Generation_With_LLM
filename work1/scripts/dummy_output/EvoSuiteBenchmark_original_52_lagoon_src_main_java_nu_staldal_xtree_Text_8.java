// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains one unit test case for the {@link Text#asCharArray()} method.
*/
class TextTest {
		
    /**
     * Test case for <code>{@link Text#asCharArray()}</code>.
     */
    @Test
    public void testAsCharArray() throws Exception {
        final String xml = "<t></t>";
        final XmlPullParser parser = XmlPullParserFactory.create(xml, null);
        final StringBuilder builder = new StringBuilder();
        assertEquals(null, parser.getText());
        parser.next();
        assertEquals("", parser.getText());
        parser.next();
        assertNull(parser.getText());
        parser.next();
        builder.append("text").append("").append("content").append('\n');
        assertEquals(xml, builder.toString());
    }
    
}