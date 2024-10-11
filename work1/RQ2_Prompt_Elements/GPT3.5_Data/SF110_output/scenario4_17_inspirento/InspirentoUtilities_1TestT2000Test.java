// Test case for escapeText method
class InspirentoUtilities_1Test {

    @Test
    void testEscapeText() {
        // Test case 1: Empty string
        String input1 = "";
        String expectedOutput1 = "";
        String actualOutput1 = InspirentoUtilities.escapeText(input1);
        assertEquals(expectedOutput1, actualOutput1);

        // Test case 2: String with no special characters
        String input2 = "This is a normal string";
        String expectedOutput2 = "This is a normal string";
        String actualOutput2 = InspirentoUtilities.escapeText(input2);
        assertEquals(expectedOutput2, actualOutput2);

        // Test case 3: String with HTML special characters
        String input3 = "<html><head><title>Test</title></head><body><p>This is a test.</p></body></html>";
        String expectedOutput3 = "&lt;html&gt;&lt;head&gt;&lt;title&gt;Test&lt;/title&gt;&lt;/head&gt;&lt;body&gt;&lt;p&gt;This is a test.&lt;/p&gt;&lt;/body&gt;&lt;/html&gt;";
        String actualOutput3 = InspirentoUtilities.escapeText(input3);
        assertEquals(expectedOutput3, actualOutput3);

        // Test case 4: String with single quote
        String input4 = "This is a string with a 'single quote'";
        String expectedOutput4 = "This is a string with a &#39;single quote&#39;";
        String actualOutput4 = InspirentoUtilities.escapeText(input4);
        assertEquals(expectedOutput4, actualOutput4);

        // Test case 5: String with double quote
        String input5 = "This is a string with a \"double quote\"";
        String expectedOutput5 = "This is a string with a &quot;double quote&quot;";
        String actualOutput5 = InspirentoUtilities.escapeText(input5);
        assertEquals(expectedOutput5, actualOutput5);

        // Test case 6: String with ampersand
        String input6 = "This is a string with an & ampersand";
        String expectedOutput6 = "This is a string with an &amp; ampersand";
        String actualOutput6 = InspirentoUtilities.escapeText(input6);
        assertEquals(expectedOutput6, actualOutput6);

        // Test case 7: String with less than symbol
        String input7 = "This is a string with a < less than symbol";
        String expectedOutput7 = "This is a string with a &lt; less than symbol";
        String actualOutput7 = InspirentoUtilities.escapeText(input7);
        assertEquals(expectedOutput7, actualOutput7);

        // Test case 8: String with greater than symbol
        String input8 = "This is a string with a > greater than symbol";
        String expectedOutput8 = "This is a string with a &gt; greater than symbol";
        String actualOutput8 = InspirentoUtilities.escapeText(input8);
        assertEquals(expectedOutput8, actualOutput8);

        // Test case 9: String with all special characters
        String input9 = "<html><head><title>Test</title></head><body><p>This is a 'test' with \"special\" characters &amp; symbols < >.</p></body></html>";
        String expectedOutput9 = "&lt;html&gt;&lt;head&gt;&lt;title&gt;Test&lt;/title&gt;&lt;/head&gt;&lt;body&gt;&lt;p&gt;This is a &#39;test&#39; with &quot;special&quot; characters &amp;amp; symbols &lt; &gt;.&lt;/p&gt;&lt;/body&gt;&lt;/html&gt;";
        String actualOutput9 = InspirentoUtilities.escapeText(input9);
        assertEquals(expectedOutput9, actualOutput9);

        // Test case 10: String with backslash
        String input10 = "This is a string with a \\ backslash";
        String expectedOutput10 = "This is a string with a &#92; backslash";
        String actualOutput10 = InspirentoUtilities.escapeText(input10);
        assertEquals(expectedOutput10, actualOutput10);
    }
}