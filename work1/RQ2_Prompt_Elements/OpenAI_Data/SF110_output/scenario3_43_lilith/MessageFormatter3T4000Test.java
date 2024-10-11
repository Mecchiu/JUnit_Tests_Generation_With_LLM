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
		void identityToString_string_tab() {
				assertEquals("\"\\tfoo\"", MessageFormatter.identityToString("\tfoo"));
		}

		@Test
		void identityToString_string_carriageReturn() {
				assertEquals("\"\\rfoo\"", MessageFormatter.identityToString("\rfoo"));
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
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\u00e4\u00f6\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid2() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid3() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid4() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid5() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid6() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid7() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid8() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid9() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid10() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid11() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid12() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid13() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid14() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid15() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid16() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid17() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid18() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid19() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid20() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid21() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid22() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid23() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid24() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid25() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid26() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid27() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid28() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid29() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid30() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid31() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid32() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid33() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid34() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid35() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid36() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid37() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid38() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid39() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid40() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00f6\\u00fc"));
		}

		@Test
		void identityToString_string_unicode_escaped_invalid41() {
				assertEquals("\"\\u00e4\\u00f6\\u00fc\"", MessageFormatter.identityToString("\\u00e4\\u00