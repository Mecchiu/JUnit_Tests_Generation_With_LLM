// Test case 1: Test if reset() method returns an empty string when no data has been written to the stream
@Test
void testResetEmpty() {
    HTMLOutputStream stream = new HTMLOutputStream();
    String contents = stream.reset();
    assertEquals("", contents);
}

// Test case 2: Test if reset() method returns the correct string when data has been written to the stream
@Test
void testResetWithData() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, world!";
    stream.write(expected.getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 3: Test if reset() method clears the stream after it has been called
@Test
void testResetClearsStream() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, world!";
    stream.write(expected.getBytes());
    stream.reset();
    String contents = stream.reset();
    assertEquals("", contents);
}

// Test case 4: Test if reset() method returns the correct string when multiple writes have been made to the stream
@Test
void testResetWithMultipleWrites() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, world!";
    stream.write("Hello".getBytes());
    stream.write(", ".getBytes());
    stream.write("world!".getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 5: Test if reset() method returns the correct string when a large amount of data has been written to the stream
@Test
void testResetWithLargeData() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1000000; i++) {
        sb.append("a");
    }
    String expected = sb.toString();
    stream.write(expected.getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 6: Test if reset() method returns the correct string when special characters have been written to the stream
@Test
void testResetWithSpecialCharacters() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "<p>Hello, world!</p>";
    stream.write(expected.getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 7: Test if reset() method returns the correct string when non-ASCII characters have been written to the stream
@Test
void testResetWithNonASCIICharacters() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "こんにちは、世界！";
    stream.write(expected.getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 8: Test if reset() method returns the correct string when a mix of ASCII and non-ASCII characters have been written to the stream
@Test
void testResetWithMixedCharacters() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, こんにちは、世界！";
    stream.write(expected.getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 9: Test if reset() method returns the correct string when a mix of different types of data have been written to the stream
@Test
void testResetWithMixedData() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, world! 123";
    stream.write("Hello, world!".getBytes());
    stream.write(" ".getBytes());
    stream.write("123".getBytes());
    String contents = stream.reset();
    assertEquals(expected, contents);
}

// Test case 10: Test if reset() method returns the correct string when data has been written to the stream using a Writer instead of a byte array
@Test
void testResetWithWriter() throws IOException {
    HTMLOutputStream stream = new HTMLOutputStream();
    String expected = "Hello, world!";
    PrintWriter writer = new PrintWriter(stream);
    writer.write(expected);
    writer.flush();
    String contents = stream.reset();
    assertEquals(expected, contents);
}