// Here's an example of how you can complete the HTMLFilterTest class:

@Test
void testNullInput() {
    assertNull(HTMLFilter.filter(null));
}

@Test
void testEmptyInput() {
    assertEquals("", HTMLFilter.filter(""));
}

@Test
void testNoSpecialCharacters() {
    String input = "This is a test message.";
    assertEquals(input, HTMLFilter.filter(input));
}

@Test
void testLessThan() {
    String input = "This is < a test message.";
    String expected = "This is &lt; a test message.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testGreaterThan() {
    String input = "This is > a test message.";
    String expected = "This is &gt; a test message.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testAmpersand() {
    String input = "This is & a test message.";
    String expected = "This is &amp; a test message.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testDoubleQuotes() {
    String input = "This is \" a test message.";
    String expected = "This is &quot; a test message.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testMultipleSpecialCharacters() {
    String input = "This is < a test message with & and \" characters >.";
    String expected = "This is &lt; a test message with &amp; and &quot; characters &gt;.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testLongInput() {
    String input = "This is a very long test message with lots of special characters like <, >, &, and \".";
    String expected = "This is a very long test message with lots of special characters like &lt;, &gt;, &amp;, and &quot;.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testInputWithNewlines() {
    String input = "This is a test message.\nIt has multiple lines.\nAnd some special characters like <, >, &, and \".";
    String expected = "This is a test message.\nIt has multiple lines.\nAnd some special characters like &lt;, &gt;, &amp;, and &quot;.";
    assertEquals(expected, HTMLFilter.filter(input));
}

@Test
void testInputWithTabs() {
    String input = "This is a test message.\tIt has tabs.\tAnd some special characters like <, >, &, and \".";
    String expected = "This is a test message.\tIt has tabs.\tAnd some special characters like &lt;, &gt;, &amp;, and &quot;.";
    assertEquals(expected, HTMLFilter.filter(input));
}