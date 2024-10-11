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
		
    @Test
    public void getCharset() {
        assertThat(getCharset().name(), is("UTF-8"));
    }
    	
    @Test
    public void emptySet() throws UnsupportedEncodingException {
      Set<CharSequence> chalSet = new HashSet<>();
      System.setProperty("file.encoding", "UTF-8");
      
      assertThat(MediaWiki.getCharset().getCharset(), is(nullValue()));
      
      // Test when no charset is configured
      assertThat(getCharset().getCharset(), is(nullValue()));
	 }

	 @Test
	 public void emptySet1() throws UnsupportedEncodingException {
	     System.setProperty("file.encoding", "ISO-8859-1");
	     Class<?> clazz = 
			assertThat(MediaWiki.getCharset(), 
				  is(nullValue()));
	 }
	 
	 

}
// MediaWiki_1Test.java