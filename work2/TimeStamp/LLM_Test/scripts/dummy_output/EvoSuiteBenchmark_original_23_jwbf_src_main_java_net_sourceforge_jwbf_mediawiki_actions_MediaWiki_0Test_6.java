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
    protected void testGetCharset() throws UnsupportedEncodingException {
      setCharSets(new HashSet<>(), "UTF-8");
      assertEquals(HttpMediaWikiAction.CHAR_SET_UTF8,
                   MediaWiki.getCharset());
    }
  
  @Test
    protected void testGetEncoding() throws UnsupportedEncodingException {
      setCharSets(new HashSet<>(), "UTF-8");
      assertEquals(HttpMediaWikiAction.CHARACTER_ENCODING_UTF8,
                   MediaWiki.getEncoding());
    }
  
  @Test
    protected void testPutEncoding() throws UnsupportedEncodingException {
      setCharSets(new HashSet<>(), "UTF-8");
      assertEquals(HttpMediaWikiAction.PUT_ENCODING_UTF8,
                   MediaWiki.putEncoding("UTF-8"));
    }
  
  /**
   * @param charsetsToAdd
   * @param charset
   * @throws UnsupportedEncodingException
   * @throws NullPointerException
   */
  private static void setCharSets(Set<String> charsetsToAdd,
                                  String charset) throws UnsupportedEncodingException, NullPointerException {
    if (charsetsToAdd!= null) {
      charsetsToAdd.add(charset);
    } else {
      Set<String> set = new HashSet<>(1);
      set.add(charset);
      charsetsToAdd = set;
    }
    charset = "UTF-8";
    assertEquals(HttpMediaWikiAction.CHARACTER_ENCODING_UTF8, MediaWiki.putEncoding(charset));
  }

  @Test
  public void testPutEncodingNullCharset() {
    assertEquals(HttpMediaWikiAction.PUT_ENCODING_UTF8,
                 MediaWiki.putEncoding(null));
  }

  @Test
  public void testPutEncoding() throws UnsupportedEncodingException {
    Set<String> charsets = new HashSet<>();
    charsets.add(URLEncoder.encode("UTF-8", "UTF-8"));
    charsets.add(URLEncoder.encode("KO", "UTF-8"));
    // TODO: test that this case is not reached?
  }

}