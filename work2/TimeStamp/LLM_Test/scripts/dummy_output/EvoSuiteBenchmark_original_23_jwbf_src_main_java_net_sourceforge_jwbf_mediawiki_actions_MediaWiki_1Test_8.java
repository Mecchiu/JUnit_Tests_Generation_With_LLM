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
		
	@Test
  public void testEncoding() {
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("abcdefghijklmnopqrstuvxyz"));

    assertEquals("", MediaWiki.encode("", "_=+"));
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("abcdefghijklmnopqrstuvxyz", "_=+"));

    assertEquals("", MediaWiki.encode("", "-"));
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("abcdefghijklmnopqrstuvxyz", "-"));

    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("", ""));
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("", ".\t\r"));
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("abcdefghijklmnopqrstuvxyz", ".\t\r"));

    assertEquals("", MediaWiki.encode("", "/"));
    assertEquals("abcdefghijklmnopqrstuvxyz", MediaWiki.encode("abcdefghijklmnopqrstuvxyz", "/"));

    // should not fail since the encoding is valid

    assertNotEquals(MediaWiki.encode("", "/=+"),
		MediaWiki.encode("bc", "/=+"));

    assertNotEquals(MediaWiki.encode("", "/>+"),
		MediaWiki.encode("bcdef", "/>+"));
  }


  /**
  * Creates a Set containing all characters allowed in a URL encoded string.
  *
  * <p>Note that this method only takes a very minimal set of characters
  * in mind. The exact set must be tuned by adding the following
  * things to this method:</p>
  * <ul>
  *   <li>" +" and the space.</li>
  *   <li>"=+" and the space.</li>
  *   <li>a-z, A-Z, a-z, and the underscore.</li>
  *   <li>"_" and the underscore.</li>
  *   <li>"|" and the vertical bar.</li>
  *   <li></li>
  * </ul>
  *
  * <p>The returned Set is a copy of a Set used in the first place:</p>
  * <ul>
  *   <li></li>
  * </ul>
  *
  * @param value value which is URL encoded by the method.
  *
  * @return decoded value.
  *
  * @throws UnsupportedEncodingException when an error occurs in the
  * operating system.
  */
  public static Set<Character> decode(String value) throws UnsupportedEncodingException {
    Set<Character> decodedSet = new HashSet<>();

    try {
      decodedSet.addAll(URLEncoder.encode(new String(value.toCharArray(), 0, value.length()), "UTF-16")
         .trim().split("[^A-Za-z\\s\\=\\+_]"));
    } catch (UnsupportedEncodingException e) {}

    for (Character character : decodedSet) {
      char c = character.charAt(0);
      if (!Character.toUpperCase(c).equals(c)) {
        decodedSet.add(c);
      }
    }

    return decodedSet;
  }

}