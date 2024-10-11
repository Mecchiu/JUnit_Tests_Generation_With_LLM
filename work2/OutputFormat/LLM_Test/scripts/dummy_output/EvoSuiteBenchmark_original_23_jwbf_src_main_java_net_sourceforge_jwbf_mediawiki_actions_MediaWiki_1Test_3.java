// MediaWiki_1Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_1Test {
		
	/*
	 * Class under test.
	 */
	@Test
	void testEncode()
	throws UnsupportedEncodingException {
		
		// The default encoding is UTF-8.
		String out = MediaWiki.encode("Hello");
		
		// The UTF-8 encoding is not supported in Java code.
		assertTrue("The UTF-8 encoding is not supported",
			(out.indexOf("UTF-8")!= -1));
		
		// The UTF-8 encoding is not supported when there are no special characters in the text.
		assertTrue("The UTF-8 encoding is not supported",
			(out.indexOf("\u0020HALLO")!= -1 && out.indexOf("\ufffdHALLO")!= -1));
		
		Set<String> specialChars = new HashSet();
		specialChars.add("\u212b");
		
		out = MediaWiki.encode(out, specialChars);
		assertEquals("Unexpected text in UTF-8 encoding", out,
			"Hallo hallo h\u212b.");
		
		specialChars.remove("\u212b");
		
		// UTF-8 is now not supported.
		assertTrue("The UTF-16 encoding is not supported",
			(out.indexOf("UTF-16")!= -1));
	}
	
	@Test
	void testEncode_String()
	throws UnsupportedEncodingException {
		
		// The following characters are not supported.
		Set<String> specialChars = new HashSet();
		specialChars.add("\u212b");
		
		// When the UTF-16 encoding is used, the character set is detected.
		assertEquals("The UTF-16 encoding of TEXT cannot be used in the encoding of UTF-8.",
			0xef000000, Encode_String.encode(null, "TEXT", specialChars)
				& SpecialCharSetFilter.UTF16_ENCODING_MASK);
		
		Set<String> specialEncodingChars = new HashSet();
		specialEncodingChars.add("+");
		specialEncodingChars.add("#");
		specificEncodingCharsToSet(specialEncodingChars, "HTML");
		specificEncodingCharsToSet(specialEncodingChars, "HTML");
		specialEncodingCharsToSet(specialEncodingChars, "HTML");
		specialEncodingCharsToSet(specialEncodingChars, "HTML");
		specialEncodingCharsToSet(specialEncodingChars, "HTML");
		specialEncodingCharsToSet(specialEncodingChars, "HTML");
		specialEncodingCharsToSet(specialEncodingChars, "PNG");
		
		specificEncodingCharsToSet(specialEncodingChars, "HTML");
		
		// The following characters are not supported according to the
		// specification.
		specialEncodingCharsToSet(specialEncodingChars, "\u2027\u2028\u2029");
	}
	
	private static void specificEncodingCharsToSet(Set<String> chars, String enc) throws UnsupportedEncodingException, UnsupportedEncodingException {
		chars.add("");
		if (enc.equals("UTF-16BE"))
			chars.add("\u212b");
	}
}