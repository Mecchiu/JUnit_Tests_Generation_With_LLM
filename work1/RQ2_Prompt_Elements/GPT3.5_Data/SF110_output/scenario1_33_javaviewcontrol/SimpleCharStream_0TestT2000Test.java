// Test case 1: Test if BeginToken() returns the first character of the input stream
@Test
public void testBeginTokenReturnsFirstChar() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    char expected = 'H';
    char actual = stream.BeginToken();
    assertEquals(expected, actual);
}

// Test case 2: Test if BeginToken() sets tokenBegin to the correct position
@Test
public void testBeginTokenSetsTokenBegin() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    stream.BeginToken();
    int expected = 0;
    int actual = stream.tokenBegin;
    assertEquals(expected, actual);
}

// Test case 3: Test if BeginToken() returns the second character of the input stream after calling readChar() once
@Test
public void testBeginTokenReturnsSecondChar() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    stream.readChar();
    char expected = 'e';
    char actual = stream.BeginToken();
    assertEquals(expected, actual);
}

// Test case 4: Test if BeginToken() sets tokenBegin to the correct position after calling readChar() once
@Test
public void testBeginTokenSetsTokenBeginAfterReadChar() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    stream.readChar();
    stream.BeginToken();
    int expected = 1;
    int actual = stream.tokenBegin;
    assertEquals(expected, actual);
}

// Test case 5: Test if BeginToken() returns the last character of the input stream
@Test
public void testBeginTokenReturnsLastChar() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    char expected = 'd';
    char actual = 0;
    while (true) {
        char c = stream.readChar();
        if (c == 0) {
            actual = stream.BeginToken();
            break;
        }
    }
    assertEquals(expected, actual);
}

// Test case 6: Test if BeginToken() sets tokenBegin to the correct position when called at the end of the input stream
@Test
public void testBeginTokenSetsTokenBeginAtEndOfStream() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    while (true) {
        char c = stream.readChar();
        if (c == 0) {
            stream.BeginToken();
            int expected = input.length();
            int actual = stream.tokenBegin;
            assertEquals(expected, actual);
            break;
        }
    }
}

// Test case 7: Test if BeginToken() throws an IOException when the input stream is empty
@Test
public void testBeginTokenThrowsIOExceptionWhenStreamIsEmpty() {
    String input = "";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    assertThrows(IOException.class, () -> {
        stream.BeginToken();
    });
}

// Test case 8: Test if BeginToken() throws an IOException when the input stream is null
@Test
public void testBeginTokenThrowsIOExceptionWhenStreamIsNull() {
    SimpleCharStream stream = new SimpleCharStream(null);
    assertThrows(IOException.class, () -> {
        stream.BeginToken();
    });
}

// Test case 9: Test if BeginToken() returns the correct character after calling readChar() multiple times
@Test
public void testBeginTokenReturnsCorrectCharAfterMultipleReadCharCalls() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    stream.readChar();
    stream.readChar();
    char expected = 'l';
    char actual = stream.BeginToken();
    assertEquals(expected, actual);
}

// Test case 10: Test if BeginToken() sets tokenBegin to the correct position after calling readChar() multiple times
@Test
public void testBeginTokenSetsTokenBeginAfterMultipleReadCharCalls() throws IOException {
    String input = "Hello World";
    SimpleCharStream stream = new SimpleCharStream(new StringReader(input));
    stream.readChar();
    stream.readChar();
    stream.BeginToken();
    int expected = 2;
    int actual = stream.tokenBegin;
    assertEquals(expected, actual);
}