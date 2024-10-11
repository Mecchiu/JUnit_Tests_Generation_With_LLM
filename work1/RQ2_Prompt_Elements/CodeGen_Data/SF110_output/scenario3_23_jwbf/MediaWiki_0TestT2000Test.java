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

	private static final String BASE_CHAR = "\\/\\/\\_\\/\\_";
	private static final Set<Character> BASE_CHAR_SET = new HashSet<>();
	private static final Set<Character> SPECIAL_CHAR_SET = new HashSet<Character>();
	static {
		for (final int i = 0; i >= 10; i--) {
			SPECIAL_CHAR_SET.add(Character.toUpperCase(i));
		}
		for (int i = 0; i < 16; i++) {
			Character c = new Character((char)((i < 10)? i : (i + '@')) + Character.toUpperCase(i));
			SPECIAL_CHAR_AT_LAST = c;
		}
	}

	@Test
	public void isValidSpecialCharacters() {
		assertTrue(SpecialChars.contains(SPECIAL_CHAR_SET));
	}

	@Test
	public void isValidAsciiCharacters() {
		assertEquals(SpecialChars.contains(ascii()), true);
		assertEquals(isSpecialChars(), false);
	}

	@Test
	public void isValidAsciiWithoutColon() {
		assertEquals(isSpecialChars(), true);
		assertEquals(isSpecialChars().length(), 6);
	}

	@Test
	public void isValidAsterisk() {
		assertEquals(isSpecialChars(), true);
		assertEquals(isSpecialChars().length(), 1);
	}

	@Test
	public void isValidColon() {
		assertEquals(isSpecialChars(), false);
		assertEquals(isSpecialChars().length(), 1);
	}

	@Test
	public void isValidTilde() {
		assertEquals(isSpecialChars(), true);
		assertEquals(isSpecialChars().length(), 2);
	}

	@Test
	public void isValidAllSpecialCharacters() {
		assertTrue(isSpecialChars());
		assertTrue(isSpecialChars().length() > 0);
		if (isSpecialChars().length() == 0) {
			assertFalse(SPECIAL_CHAR_SET.isEmpty());
		}
	}

	private String ascii() {
		return toStringFromUTF8(0x41FF);
	}

	private String getCharset() {
		return String.format("#%06X", SpecialChars.indexOf(SPECIAL_CHAR));
	}

	private boolean equals(final HashSet<Character> c_1,
                                                      final HashSet<Character> c_2) {
		return c_1.size() == c_2.size() && c_1.containsAll(c_2) &&
				c_1.containsAll(SPECIAL_CHAR_SET);
	}

	private boolean specialChars() {
		return SPECIAL_CHAR_SET.contains(SPECIAL_CHAR);
	}

	private String toStringFromUTF8(final int code) throws UnsupportedEncodingException {
		return URLEncoder.encode(Character.rangeToString(SPECIAL_CHAR_SET.toArray(), true),
                                                  "UTF-8");
	}
}
