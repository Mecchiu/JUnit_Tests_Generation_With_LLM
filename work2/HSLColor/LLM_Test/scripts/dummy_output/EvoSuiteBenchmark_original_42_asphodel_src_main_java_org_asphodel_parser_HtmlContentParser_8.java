// HtmlContentParserTest.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains one unit test case for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		/**
		 * constructor
		 */
    HtmlContentParserTest () {
    	
    }
		/**
		 * @throws java.io.IOException
		 */
    @Test
    public void test_extractPlainText(){
        assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
    	assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
    	assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
    	assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
        assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
        assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
        assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
    	assertEquals(extractPlainText("<html><p>abc</p></html>"),	"abc");
        assertEquals(extractPlainText("<html><p>abc<br><br>abc</p></html>"),	"abc\nabc");
    	assertEquals(extractPlainText("<html><p>abc<br><br>abc<br></p></html>"),	"abc\nabc\r\rabc\r");
        assertEquals(extractPlainText("<html><p>abc<br><br>abc<br></p></html>"), "abc\nabc\r");
        assertEquals(extractPlainText("<html><p>abc<br><br>abc<br></p></html>"), "abc\r\rabc\r");

    }    
}