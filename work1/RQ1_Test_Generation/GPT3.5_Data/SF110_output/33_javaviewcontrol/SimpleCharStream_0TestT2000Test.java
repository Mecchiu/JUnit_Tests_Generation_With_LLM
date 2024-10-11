```java
    private SimpleCharStream createSimpleCharStream(String input) {
        return new SimpleCharStream(new java.io.StringReader(input));
    }

    @Test
    void testBeginToken_EmptyStream() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("");
        assertEquals((char) 0, stream.BeginToken());
    }

    @Test
    void testBeginToken_SingleChar() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_MultipleChars() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("abc");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_NewLine() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\nb");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_CarriageReturn() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\rb");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_Tab() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\tb");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_MixedCharacters() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\n\tb");
        assertEquals('a', stream.BeginToken());
    }

    @Test
    void testBeginToken_UnicodeCharacter() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("€");
        assertEquals('€', stream.BeginToken());
    }

    @Test
    void testBeginToken_SpecialCharacters() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("!@#$%^&*()");
        assertEquals('!', stream.BeginToken());
    }
}
```