// MediaWiki_0Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {
		
	/**
	* This String contains only white'space' characters. So no whitespace
	* between it.
	*/
	private static final String WHITESPACE = "";

    /**
     * Test String creation using the getCharset method
     */
    @Test
    public void testGetCharset() throws UnsupportedEncodingException {
        String charset = MediaWiki.getCharset();
        assertNotNull("The getCharset() method returns null.", charset);
        assertTrue("The getCharset() method must return a valid string", charset.length()>1);
		
        String testCharsetToEnsureMightChange = CHARSET + "\u00a0";
        String testNewCharset;
        
        // Test that the string does not return a valid string, but just a length.
        try {
            testNewCharset = charset.replace("\n", "\\n");
            testNewCharset = charset.replace("\\", "\\\\");
            testNewCharset = charset.replace(";", "\\;");
            // TODO: Test that the charset returned must stay same

        } catch (RuntimeException re) {
            // Do nothing. Thrown only, is caught
            re.printStackTrace();
        }

        // Create the test string
        testNewCharset = "foo";

	        // Try to find the change in string.
	    try {
	        testNewCharset = charset.replaceAll(WHITESPACE, "\u00a0");
	    } catch (UnsupportedEncodingException e) {
	        e.printStackTrace();

	    }

        assertNotNull("The getCharset() method must return a valid string.", testCharsetToEnsureMightChange);
        assertTrue("The getCharset() method must return a valid string, but just a length.",
                    testNewCharset.length()>1);
        assertTrue("The getCharset() method must return a valid string, but just a length.",
            testNewCharset.startsWith(CHARSET));
		
	}
}
/* JavaCC - OriginalChecksum=e07d45c4fa16c8a1b0793c6dc1a5a7b4 (do not edit this line) */