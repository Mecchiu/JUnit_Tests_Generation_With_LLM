```java
    private SimpleCharStream createSimpleCharStream(String input) {
        return new SimpleCharStream(new java.io.StringReader(input));
    }

    @Test
    void testReadChar_EmptyStream() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("");
        assertEquals((char) 0, stream.readChar());
    }

    @Test
    void testReadChar_SingleCharacter() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a");
        assertEquals('a', stream.readChar());
    }

    @Test
    void testReadChar_MultipleCharacters() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("abc");
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
    }

    @Test
    void testReadChar_NewLine() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\nb");
        assertEquals('a', stream.readChar());
        assertEquals('\n', stream.readChar());
        assertEquals('b', stream.readChar());
    }

    @Test
    void testReadChar_CarriageReturn() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\rb");
        assertEquals('a', stream.readChar());
        assertEquals('\r', stream.readChar());
        assertEquals('b', stream.readChar());
    }

    @Test
    void testReadChar_Tab() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\tb");
        assertEquals('a', stream.readChar());
        assertEquals('\t', stream.readChar());
        assertEquals('b', stream.readChar());
    }

    @Test
    void testReadChar_Backup() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("abc");
        assertEquals('a', stream.readChar());
        stream.backup(1);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
    }

    @Test
    void testReadChar_AdjustBeginLineColumn() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("a\nb");
        stream.readChar();
        stream.adjustBeginLineColumn(2, 1);
        assertEquals(2, stream.getLine());
        assertEquals(1, stream.getColumn());
    }

    @Test
    void testReadChar_GetImage() throws java.io.IOException {
        SimpleCharStream stream = createSimpleCharStream("abc");
        stream.readChar();
        stream.readChar();
        stream.readChar();
        assertEquals("abc", stream.GetImage());
    }
```
```