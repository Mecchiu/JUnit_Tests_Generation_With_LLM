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
	 * @throws URLEncoderEncodingException is thrown if the encoding of the input
	 * character sets differs from the encoding of the output.
	*/
    @Test
    public void getCharset() throws UnsupportedEncodingException {
		
        assertDifferent(MediaWiki.class, MediaWiki_0.class);
    }
	/**
	 * @throws UnsupportedEncodingException is thrown if the encoding of the input
	 * character sets is not supported.
	*/
    @Test
    public void getCharsetNoConversionDetected() throws UnsupportedEncodingException {
		System.err.println(MediaWiki_0.class.getSimpleName());
		System.err.println(MediaWiki_0.class.getSimpleName());
		assertDifferent(MediaWiki_0.class, MediaWiki_0.class);
	}
	
	private static void assertDifferent(Class<?> c1, Class<?> c2) {
		boolean isDifferent = c1.getCanonicalName()
				.equals(c2.getCanonicalName())
				&& c1.getSimpleName().equals(c2.getSimpleName())
        ;
        
		if(!isDifferent) {
			System.out.println("C1.getCanonicalName() = " + c1.getCanonicalName());
			
        }
		
		if(!isDifferent) {
			System.out.println("C2.getCanonicalName() = " + c2.getCanonicalName());
			
        }
		
        if(!isDifferent) {
            System.out.println("Is different");
			
        }
		
        if(isDifferent) {
            System.out.println("Error");
        }
	}
	
	/**
	 * @return the charset from MediaWiki.
	 * MediaWiki.java
	 */
	public static String getCharset();
}