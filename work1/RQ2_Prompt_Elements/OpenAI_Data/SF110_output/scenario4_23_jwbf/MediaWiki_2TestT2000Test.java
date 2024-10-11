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
* It contains ten unit test cases for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {

	/**
	 * Test method for {@link MediaWiki#decode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testDecode() throws UnsupportedEncodingException {
		assertEquals("", MediaWiki.decode(""));
		assertEquals(" ", MediaWiki.decode(" "));
		assertEquals("a", MediaWiki.decode("a"));
		assertEquals("a b", MediaWiki.decode("a b"));
		assertEquals("a b c", MediaWiki.decode("a b c"));
		assertEquals("a b c d", MediaWiki.decode("a b c d"));
		assertEquals("a b c d e", MediaWiki.decode("a b c d e"));
		assertEquals("a b c d e f", MediaWiki.decode("a b c d e f"));
		assertEquals("a b c d e f g", MediaWiki.decode("a b c d e f g"));
		assertEquals("a b c d e f g h", MediaWiki.decode("a b c d e f g h"));
	}
}

// MediaWiki_3Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_3Test {
		
	/**
	 * Test method for {@link MediaWiki#encode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testEncode() throws UnsupportedEncodingException {
		assertEquals("", MediaWiki.encode(""));
		assertEquals("%20", MediaWiki.encode(" "));
		assertEquals("a", MediaWiki.encode("a"));
		assertEquals("a%20b", MediaWiki.encode("a b"));
		assertEquals("a%20b%20c", MediaWiki.encode("a b c"));
		assertEquals("a%20b%20c%20d", MediaWiki.encode("a b c d"));
		assertEquals("a%20b%20c%20d%20e", MediaWiki.encode("a b c d e"));
		assertEquals("a%20b%20c%20d%20e%20f", MediaWiki.encode("a b c d e f"));
		assertEquals("a%20b%20c%20d%20e%20f%20g", MediaWiki.encode("a b c d e f g"));
		assertEquals("a%20b%20c%20d%20e%20f%20g%20h", MediaWiki.encode("a b c d e f g h"));
	}
}

// MediaWiki_4Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_4Test {
		
	/**
	 * Test method for {@link MediaWiki#getCharset()}.
	 */
	@Test
	void testGetCharset() {
		assertEquals("UTF-8", MediaWiki.getCharset());
	}
}

// MediaWiki_5Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getBotGroups()} method.
*/
class MediaWiki_5Test {
		
	/**
	 * Test method for {@link MediaWiki#getBotGroups()}.
	 */
	@Test
	void testGetBotGroups() {
		assertEquals(new HashSet<String>(), MediaWiki.getBotGroups());
	}
}

// MediaWiki_6Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getVersion()} method.
*/
class MediaWiki_6Test {
		
	/**
	 * Test method for {@link MediaWiki#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		assertEquals(MediaWiki.Version.UNKNOWN, MediaWiki.getVersion());
	}
}

// MediaWiki_7Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setVersion(MediaWiki.Version)} method.
*/
class MediaWiki_7Test {
		
	/**
	 * Test method for {@link MediaWiki#setVersion(MediaWiki.Version)}.
	 */
	@Test
	void testSetVersion() {
		MediaWiki.setVersion(MediaWiki.Version.UNKNOWN);
	}
}

// MediaWiki_8Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setBotGroups(Set)} method.
*/
class MediaWiki_8Test {
		
	/**
	 * Test method for {@link MediaWiki#setBotGroups(Set)}.
	 */
	@Test
	void testSetBotGroups() {
		MediaWiki.setBotGroups(new HashSet<String>());
	}
}

// MediaWiki_9Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setCharset(String)} method.
*/
class MediaWiki_9Test {
