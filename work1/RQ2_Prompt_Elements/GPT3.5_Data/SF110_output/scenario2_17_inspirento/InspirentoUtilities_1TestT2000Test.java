@Test
void testEscapeText() {
    // Test case 1: empty string
    String emptyStr = "";
    assertEquals("", InspirentoUtilities.escapeText(emptyStr));

    // Test case 2: string with no special characters
    String noSpecialCharStr = "This is a normal string.";
    assertEquals("This is a normal string.", InspirentoUtilities.escapeText(noSpecialCharStr));

    // Test case 3: string with ampersand
    String ampersandStr = "This & that";
    assertEquals("This &amp; that", InspirentoUtilities.escapeText(ampersandStr));

    // Test case 4: string with less than symbol
    String lessThanStr = "5 < 10";
    assertEquals("5 &lt; 10", InspirentoUtilities.escapeText(lessThanStr));

    // Test case 5: string with greater than symbol
    String greaterThanStr = "10 > 5";
    assertEquals("10 &gt; 5", InspirentoUtilities.escapeText(greaterThanStr));

    // Test case 6: string with double quotes
    String doubleQuotesStr = "She said, \"Hello!\"";
    assertEquals("She said, &quot;Hello!&quot;", InspirentoUtilities.escapeText(doubleQuotesStr));

    // Test case 7: string with single quotes
    String singleQuotesStr = "It's raining outside.";
    assertEquals("It&apos;s raining outside.", InspirentoUtilities.escapeText(singleQuotesStr));

    // Test case 8: string with all special characters
    String allSpecialCharStr = "& < > \" '";
    assertEquals("&amp; &lt; &gt; &quot; &apos;", InspirentoUtilities.escapeText(allSpecialCharStr));

    // Test case 9: string with mixed special characters
    String mixedSpecialCharStr = "5 > 3 & 2 < 4";
    assertEquals("5 &gt; 3 &amp; 2 &lt; 4", InspirentoUtilities.escapeText(mixedSpecialCharStr));

    // Test case 10: string with multiple occurrences of special characters
    String multipleSpecialCharStr = "He said, \"I'm > you\" & she said, \"No, you're < me\"";
    assertEquals("He said, &quot;I&apos;m &gt; you&quot; &amp; she said, &quot;No, you&apos;re &lt; me&quot;", InspirentoUtilities.escapeText(multipleSpecialCharStr));
}
}