```java
class PasswordField_1Test {

    @Test
    void testGetPassword_EmptyInputStream() {
        InputStream emptyInputStream = new ByteArrayInputStream(new byte[0]);
        assertArrayEquals(null, PasswordField.getPassword(emptyInputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_SingleCharacterInput() {
        InputStream singleCharInputStream = new ByteArrayInputStream("a\n".getBytes());
        assertArrayEquals(new char[]{'a'}, PasswordField.getPassword(singleCharInputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_MultipleCharacterInput() {
        InputStream multipleCharInputStream = new ByteArrayInputStream("password\n".getBytes());
        assertArrayEquals(new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}, PasswordField.getPassword(multipleCharInputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_EmptyPrompt() {
        InputStream inputStream = new ByteArrayInputStream("test\n".getBytes());
        assertArrayEquals(new char[]{'t', 'e', 's', 't'}, PasswordField.getPassword(inputStream, ""));
    }

    @Test
    void testGetPassword_NullPrompt() {
        InputStream inputStream = new ByteArrayInputStream("12345\n".getBytes());
        assertArrayEquals(new char[]{'1', '2', '3', '4', '5'}, PasswordField.getPassword(inputStream, null));
    }

    @Test
    void testGetPassword_NoInput() {
        InputStream inputStream = new ByteArrayInputStream("\n".getBytes());
        assertArrayEquals(null, PasswordField.getPassword(inputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_CarriageReturn() {
        InputStream inputStream = new ByteArrayInputStream("password\r\n".getBytes());
        assertArrayEquals(new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}, PasswordField.getPassword(inputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_Backspace() {
        InputStream inputStream = new ByteArrayInputStream("pass\bword\n".getBytes());
        assertArrayEquals(new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}, PasswordField.getPassword(inputStream, "Enter password:"));
    }

    @Test
    void testGetPassword_ExceptionThrown() {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Test exception");
            }
        };
        assertThrows(IOException.class, () -> PasswordField.getPassword(inputStream, "Enter password:"));
    }
}
```
```