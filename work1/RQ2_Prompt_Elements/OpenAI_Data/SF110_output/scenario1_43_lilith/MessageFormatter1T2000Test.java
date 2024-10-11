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
* It contains ten unit test cases for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatterTest {

	@Test
	void testCountArgumentPlaceholders() {
		assertEquals(0, MessageFormatter.countArgumentPlaceholders(null));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders(""));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo"));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo{}"));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo{}bar"));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo{}bar{}"));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz"));
		assertEquals(0, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}"));
		assertEquals(1, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux"));
		assertEquals(1, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}"));
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux"));
		assertEquals(2, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}"));
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge"));
		assertEquals(3, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}"));
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault"));
		assertEquals(4, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}"));
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply"));
		assertEquals(5, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}"));
		assertEquals(6, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo"));
		assertEquals(6, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}"));
		assertEquals(7, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred"));
		assertEquals(7, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}"));
		assertEquals(8, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh"));
		assertEquals(8, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}"));
		assertEquals(9, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy"));
		assertEquals(9, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}"));
		assertEquals(10, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud"));
		assertEquals(10, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}"));
		assertEquals(11, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo"));
		assertEquals(11, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}"));
		assertEquals(12, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar"));
		assertEquals(12, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}"));
		assertEquals(13, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}baz"));
		assertEquals(13, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}baz{}"));
		assertEquals(14, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}baz{}qux"));
		assertEquals(14, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}baz{}qux{}"));
		assertEquals(15, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}waldo{}fred{}plugh{}xyzzy{}thud{}foo{}bar{}baz{}qux{}quux"));
		assertEquals(15, MessageFormatter.countArgumentPlaceholders("foo{}bar{}baz{}qux{}quux{}corge{}grault{}garply{}