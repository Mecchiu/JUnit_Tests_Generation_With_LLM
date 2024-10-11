// Test case 1: Test if reset() method returns an empty string when buffer is empty
@Test
public void testResetEmptyBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    String result = outputStream.reset();
    assertEquals("", result);
}

// Test case 2: Test if reset() method returns the contents of the buffer when it is not empty
@Test
public void testResetNonEmptyBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    outputStream.print("Hello");
    outputStream.print("World");
    String result = outputStream.reset();
    assertEquals("HelloWorld", result);
}

// Test case 3: Test if reset() method clears the buffer after returning its contents
@Test
public void testResetClearsBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    outputStream.print("Hello");
    outputStream.print("World");
    outputStream.reset();
    String result = outputStream.reset();
    assertEquals("", result);
}

// Test case 4: Test if getSize() method returns 0 when buffer is empty
@Test
public void testGetSizeEmptyBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    int size = outputStream.getSize();
    assertEquals(0, size);
}

// Test case 5: Test if getSize() method returns the correct size of the buffer when it is not empty
@Test
public void testGetSizeNonEmptyBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    outputStream.print("Hello");
    outputStream.print("World");
    int size = outputStream.getSize();
    assertEquals(10, size);
}

// Test case 6: Test if getPW() method returns a PrintWriter object
@Test
public void testGetPW() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    PrintWriter pw = outputStream.getPW();
    assertNotNull(pw);
}

// Test case 7: Test if flush() method throws IOException when buffer is empty
@Test
public void testFlushEmptyBuffer() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    assertThrows(IOException.class, () -> outputStream.flush());
}

// Test case 8: Test if flush() method writes the contents of the buffer to the response
@Test
public void testFlushNonEmptyBuffer() throws IOException {
    MockHttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    outputStream.print("Hello");
    outputStream.print("World");
    outputStream.flush();
    assertEquals("HelloWorld", response.getContentAsString());
}

// Test case 9: Test if toString() method returns the contents of the buffer
@Test
public void testToString() {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    outputStream.print("Hello");
    outputStream.print("World");
    String result = outputStream.toString();
    assertEquals("HelloWorld", result);
}

// Test case 10: Test if HTMLOutputStream constructor initializes instance variables correctly
@Test
public void testConstructor() throws IOException {
    HttpServletResponse response = new MockHttpServletResponse();
    HTMLOutputStream outputStream = new HTMLOutputStream(response);
    assertNotNull(outputStream);
    assertNotNull(outputStream.getPW());
    assertEquals(0, outputStream.getSize());
}