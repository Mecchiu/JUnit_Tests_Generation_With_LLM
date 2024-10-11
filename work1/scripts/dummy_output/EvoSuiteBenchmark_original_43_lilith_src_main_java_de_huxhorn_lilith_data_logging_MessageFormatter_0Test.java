package de.huxhorn.lilith.data.logging;
java
class MessageFormatter_0Test {

    @Test
    void testFormat_NullMessagePattern_NullArguments() {
        assertNull(MessageFormatter.format(null, null));
    }

    @Test
    void testFormat_NullMessagePattern_EmptyArguments() {
        assertEquals("", MessageFormatter.format(null, new String[0]));
    }

    @Test
    void testFormat_NullMessagePattern_NonEmptyArguments() {
        assertEquals(null, MessageFormatter.format(null, new String[]{"arg1", "arg2"}));
    }

    @Test
    void testFormat_EmptyMessagePattern_NullArguments() {
        assertEquals("", MessageFormatter.format("", null));
    }

    @Test
    void testFormat_EmptyMessagePattern_EmptyArguments() {
        assertEquals("", MessageFormatter.format("", new String[0]));
    }

    @Test
    void testFormat_EmptyMessagePattern_NonEmptyArguments() {
        assertEquals("", MessageFormatter.format("", new String[]{"arg1", "arg2"}));
    }

    @Test
    void testFormat_MessagePatternWithNoPlaceholders_NullArguments() {
        assertEquals("No placeholders", MessageFormatter.format("No placeholders", null));
    }

    @Test
    void testFormat_MessagePatternWithPlaceholdersAndArguments() {
        assertEquals("Hello, World!", MessageFormatter.format("Hello, {}!", new String[]{"World"}));
    }

    @Test
    void testFormat_MessagePatternWithMorePlaceholdersThanArguments() {
        assertEquals("Hello, World! {}", MessageFormatter.format("Hello, {}! {}", new String[]{"World"}));
    }
}
