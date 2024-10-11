// MessageFormatterTest.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatterTest {
@Test
		void identityToString_null() {
				assertEquals("null", MessageFormatter.identityToString(null));
		}

		@Test
		void identityToString_string() {
				assertEquals("\"foo\"", MessageFormatter.identityToString("foo"));
		}

		@Test
		void identityToString_string_empty() {
				assertEquals("\"\"", MessageFormatter.identityToString(""));
		}

		@Test
		void identityToString_string_null() {
				assertEquals("\"null\"", MessageFormatter.identityToString("null"));
		}

		@Test
		void identityToString_string_quotes() {
				assertEquals("\"\\\"foo\\\"\"", MessageFormatter.identityToString("\"foo\""));
		}

		@Test
		void identityToString_string_backslash() {
				assertEquals("\"\\\\foo\"", MessageFormatter.identityToString("\\foo"));
		}

		@Test
		void identityToString_string_newline() {
				assertEquals("\"\\nfoo\"", MessageFormatter.identityToString("\nfoo"));
		}

		@Test
		void identityToString_string_carriageReturn() {
				assertEquals("\"\\rfoo\"", MessageFormatter.identityToString("\rfoo"));
		}

		@Test
		void identityToString_string_tab() {
				assertEquals("\"\\tfoo\"", MessageFormatter.identityToString("\tfoo"));
		}

		@Test
		void identityToString_string_formFeed() {
				assertEquals("\"\\ffoo\"", MessageFormatter.identityToString("\ffoo"));
		}

		@Test
		void identityToString_string_backspace() {
				assertEquals("\"\\bfoo\"", MessageFormatter.identityToString("\bfoo"));
		}

		@Test
		void identityToString_string_unicode() {
				assertEquals("\"\\u00e4\"", MessageFormatter.identityToString("\u00e4"));
		}

		@Test
		void identityToString_string_unicode_2() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc"));
		}

		@Test
		void identityToString_string_unicode_3() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df"));
		}

		@Test
		void identityToString_string_unicode_4() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4"));
		}

		@Test
		void identityToString_string_unicode_5() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6"));
		}

		@Test
		void identityToString_string_unicode_6() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc"));
		}

		@Test
		void identityToString_string_unicode_7() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e"));
		}

		@Test
		void identityToString_string_unicode_8() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\\u0024\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e\u0024"));
		}

		@Test
		void identityToString_string_unicode_9() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\\u0024\\u00a2\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e\u0024\u00a2"));
		}

		@Test
		void identityToString_string_unicode_10() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\\u0024\\u00a2\\u20ac\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e\u0024\u00a2\u20ac"));
		}

		@Test
		void identityToString_string_unicode_11() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\\u0024\\u00a2\\u20ac\\u00e4\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e\u0024\u00a2\u20ac\u00e4"));
		}

		@Test
		void identityToString_string_unicode_12() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\u00d6\\u00dc\\u1e9e\\u0024\\u00a2\\u20ac\\u00e4\\u00f6\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc\u00df\u00c4\u00d6\u00dc\u1e9e\u0024\u00a2\u20ac\u00e4\u00f6"));
		}

		@Test
		void identityToString_string_unicode_13() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\\u00df\\u00c4\\