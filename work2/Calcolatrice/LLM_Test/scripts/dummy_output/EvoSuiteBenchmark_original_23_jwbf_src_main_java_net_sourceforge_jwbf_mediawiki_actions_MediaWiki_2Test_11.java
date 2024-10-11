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
		
  @Test
  void testDecodeUnencoded() throws UnsupportedEncodingException {
    assertEquals("", new MediaWiki().decode(""));
    assertEquals("abc", new MediaWiki().decode("abc"));
    assertEquals("abcdefghi%E4%9D%83", new MediaWiki().decode("abcdefghi%E4%9D%83"));
    assertEquals("%21abc", new MediaWiki().decode("%21abc"));
    assertEquals("xyzw%E5%9D%84", new MediaWiki().decode("xyzw%E5%9D%84"));
  }
  
  @Test
  void testEncoding() throws UnsupportedEncodingException {
    assertEquals("", new MediaWiki().encoded(""));
    assertEquals("abc", new MediaWiki().encoded("abc"));
    assertEquals("abcdefghi%E4%9D%83", new MediaWiki().encoded("abcdefghi%E4%9D%83"));
    assertEquals("%21abc", new MediaWiki().encoded("%21abc"));
    assertEquals("xyzw%E5%9D%84", new MediaWiki().encoded("xyzw%E5%9D%84"));
  }
  
  @Test
  void testEncoded() {
    assertEquals("%22abc%22%8d%22%3a%22%e4%9d%84%28%22%21%28%22",
        new MediaWiki().encoded("%22abc%22%8d%22%3a%22%e4%9d%84%28%22%21%28%22"));
  }
  
  private static final String CHARSET = "UTF-8";
  private static final Set<String> CHARSET_PATTERNS = new HashSet<>();
  static {
    CHARSET_PATTERNS.add("");
    CHARSET_PATTERNS.add("utf-8");
    CHARSET_PATTERNS.add("utf-16");
    CHARSET_PATTERNS.add("utf-16-be");
    CHARSET_PATTERNS.add("utf-16-le");
  }
  
  @Test
  void testEncodedUnencoded() throws UnsupportedEncodingException {
    assertThrows(IllegalArgumentException.class, () -> new MediaWiki().encoded(CHARSET, "bogus"));
  }
  
  @Test
  void testEncodedIllegalCharset() throws UnsupportedEncodingException {
    checkError("charset=illegal.value.in.use.for.me", MediaWiki.class);
  }
  
  private static final String CHARSET_PATTERN_WITHOUT_FWS = "UTF-8";
  private static final Set<String> CHARSET_PATTERNS_WITHOUT_FWS = new HashSet<>();
  static {
    CHARSET_PATTERNS_WITHOUT_FWS.add(CHARSET_PATTERN_WITHOUT_FWS);
    CHARSET_PATTERNS_WITHOUT_FWS.add(CHARSET_PATTERN_WITHOUT_FWS);
    CHARSET_PATTERNS_WITHOUT_FWS.add(CHARSET_PATTERN_WITHOUT_FWS);
    CHARSET_PATTERNS_WITHOUT_FWS.add("utf-8");
  }
  @Test
  void testEncodedIllegalCharset2() throws UnsupportedEncodingException {
    checkError("charset=illegal.value.in.use.for.me", MediaWiki_2Test.class);
  }
  
  @Test
  void testEncodedIllegalCharset3() throws UnsupportedEncodingException {
    checkError("no.allowed.charset=illegal.value.in.me", MediaWiki_2Test.class);
  }
  
  private static final String CHARSET_PATTERN_WITH_FWS = "\"string\": \"string\"";
  private static final Set<String> CHARSET_PATTERNS_WITH_FWS = new HashSet<>();
  static {
    CHARSET_PATTERNS_WITH_FWS.add("\"string\": \"string\"");
    CHARSET_PATTERNS_WITH_FWS.add("\"string\": \"string\"");
  }
  @Test
  void testEncodedIllegalCharset4() throws UnsupportedEncodingException {
    checkError("charset='illegal.value.in.use.for.me', string", MediaWiki_2Test.class);
  }
  
  private static final String CHARSET_PATTERN_WITH_FWS_AND_QUOTE =
      "\"string\": \"a string\" \"string\": \"a string\" \"string\": \"a string\"";
  private static final Set<String> CHARSET_PATTERNS_WITH_FWS_AND_QUOTE = 
      new HashSet<>(CHARSET_PATTERNS_WITH_FWS.retainAll(CHARSET_PATTERNS_WITH_FWS))
     .add("\"string\": \"a string\" \"string\": \"a string\" \"string\": \"a string\"");

  @Test
  void testEncodedIllegalCharsetWOQUOTE() throws UnsupportedEncodingException {
}
}