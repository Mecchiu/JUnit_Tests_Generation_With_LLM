// MediaWiki_2Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {
		
    /**
     * Test method for {@link MediaWiki#decode(String)}.
     */
    @Test
    public void testDecode()
    {
    	final String sEncoding = "UTF-8";
    	final String sEncoded = "I dunno";
    	
    	try
    	{
    		final MediaWiki action = new MediaWiki(sEncoding);
    		final String s = new String(action.encode(sEncoded), sEncoding);
    		{
    		assertEquals(sEncoded, s);
    		}
    		{
    		assertEquals(sEncoded, action.decode(sEncoded));
    		}
    	}
    	catch(final UnsupportedEncodingException e)
    	{
    		System.out.println("Failed at test " + sEncoded);
    		e.printStackTrace();
    	}

    	final MediaWiki action = new MediaWiki(0);
    	final String s = new String(action.encode(sEncoded), sEncoding);
    	{
    	assertEquals(sEncoded, s);
    	}
    	{
    	assertEquals(sEncoded, action.decode(sEncoded));
    	}
    }
}
// MediaWiki_2MainTest.java