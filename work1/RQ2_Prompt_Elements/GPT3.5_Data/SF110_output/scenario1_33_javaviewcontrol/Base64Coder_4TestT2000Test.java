Here's an example of how you can write unit test cases for the `Base64Coder` class:

```
@Test
void testDecodeEmptyString() {
    byte[] result = Base64Coder.decode("");
    assertEquals(0, result.length);
}

@Test
void testDecodeValidString() {
    byte[] result = Base64Coder.decode("SGVsbG8gV29ybGQ=");
    assertArrayEquals("Hello World".getBytes(), result);
}

@Test
void testDecodeInvalidString() {
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decode("invalid base64 string");
    });
}

@Test
void testDecodeNullString() {
    assertThrows(NullPointerException.class, () -> {
        Base64Coder.decode(null);
    });
}

@Test
void testDecodeStringWithPadding() {
    byte[] result = Base64Coder.decode("SGVsbG8gV29ybGQ==");
    assertArrayEquals("Hello World".getBytes(), result);
}

@Test
void testDecodeStringWithWhitespace() {
    byte[] result = Base64Coder.decode("SGVsbG8gV29ybGQ=\n");
    assertArrayEquals("Hello World".getBytes(), result);
}

@Test
void testDecodeStringWithInvalidPadding() {
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decode("SGVsbG8gV29ybGQ=!");
    });
}

@Test
void testDecodeStringWithInvalidCharacter() {
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.decode("SGVsbG8gV29ybGQ$");
    });
}

@Test
void testDecodeStringWithTrailingWhitespace() {
    byte[] result = Base64Coder.decode("SGVsbG8gV29ybGQ=  \t");
    assertArrayEquals("Hello World".getBytes(), result);
}

@Test
void testDecodeStringWithLeadingWhitespace() {
    byte[] result = Base64Coder.decode("  SGVsbG8gV29ybGQ=");
    assertArrayEquals("Hello World".getBytes(), result);
}
``` 

These test cases cover various scenarios such as empty string, valid and invalid base64 strings, null input, strings with padding and whitespace, and strings with invalid characters. You can add more test cases as per your requirements.