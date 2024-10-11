// MessageFormatter_3Test.java
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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
private String str;

	/**
	 * {@inheritDoc}
	*/
	@Test
	void null_obj_can_create_identity_strings() {
		MessageFormatter formatter = new MessageFormatter();
		assertEquals(identityToString(null), formatter.identityToString(null));
	}

	/**
	 * {@inheritDoc}
	*/
	@Test
	void not_null_obj_can_create_identity_strings() {
		MessageFormatter formatter = new MessageFormatter();
		formatter.str = "foo";
		assertEquals(
				"Identity generated for <MessageFormatter> : identityToString(\"\");",
				formatter.identityToString(null));
		formatter.str = "test";
		formatter.str = "test-1";
		formatter.str = "test-1.";
		formatter.str = "test-somethingelse";
		formatter.str = "test-somethingelse-9";
		formatter.str = "test-somethingelse-a.b.c.4.5";
		formatter.str = "test-somethingelse-4.8.5";
		formatter.str = "-";
		formatter.str = "test-3.5";
		formatter.str = "test-nothing";
		formatter.str = "test-.";
		formatter.str = "test-*";
		formatter.str = "test-..*";
		formatter.str = ".test";
		formatter.str = "somethingelse-9";
		formatter.str = "somethingelse";
		formatter.str = "somethingelse-1.2.9";
		formatter.str = "somethingelse-0.2";
		String id = formatter.identityToString((null));
		assertEquals("Identity generated for <MessageFormatter> +\"\";", id);
		String id1 = formatter.identityToString(null);
		String id2 = formatter.identityToString("test");
		String id3 = formatter.identityToString("test.nothing.something");
		String id4 = formatter.identityToString("test-..*");
		String id5 = formatter.identityToString("test-..*.");
		String id6 = formatter.identityToString("somethingelse-9");
		String id7 = formatter.identityToString("somethingelse");
		String id8 = formatter.identityToString("somethingelse-1.2.9");
		String id9 = formatter.identityToString("somethingelse-0.2");
		assertEquals("Identity generated for <MessageFormatter> +\"\";", id3);
		assertEquals("Identity generated for <MessageFormatter> +\";\", """, id2);
		assertEquals("Identity generated for <MessageFormatter> +\"\";", id1);
		assertEquals("Identity generated for <MessageFormatter> +\";\"", id4);
		assertEquals("Identity generated for <MessageFormatter> +\";\"", id5);
		assertEquals("Identity generated for <MessageFormatter> +\"-\"", id6);
		assertEquals("Identity generated for <MessageFormatter> +\"-\"", id7);
		assertEquals("Identity generated for <MessageFormatter> +\"-\"", id8);
		String id10 = formatter.identityToString("somethingelse");
		String id11 = formatter.identityToString("test-somethingelse-9");
		String id12 = formatter.identityToString("test-somethingelse-a.b.c.4.5");
		String id13 = formatter.identityToString("test-somethingelse-4.8.5");
		String id14 = formatter.identityToString("test-somethingelse-5");
		assertEquals("Identity generated for <MessageFormatter> +\"\";", id10);
		assertEquals("Identity generated for <MessageFormatter> +\";\"", id11);
		assertEquals("Identity generated for <MessageFormatter> +\"\";", id12);
		assertEquals("Identity generated for <MessageFormatter> +\";\"", id13);
		assertEquals("Identity generated for <MessageFormatter> +\";\"", id14);
	}

	/**
	 * {@inheritDoc}
	*/
	@Test
	void no_obj_can_create_identity_strings() {
		MessageFormatter formatter = new MessageFormatter();
		Set<String> values = new HashSet<>(Arrays.asList(formatter.identityToString(""), formatter
				.identityToString(null)));
		assertEquals(Arrays.asList("", ""), values);
		values.remove("");
		assertEquals(Arrays.asList("", ""), values);
		values.retainAll(Arrays.asList("", ""));
		assertEquals(Arrays.asList("", ""), values);
	}
}
