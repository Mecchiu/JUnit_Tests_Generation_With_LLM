package org.quickserver.util.io;
java
class PasswordField_0Test {

    @Test
    void testGetPassword_EmptyPrompt() {
        assertThrows(IOException.class, () -> {
            PasswordField.getPassword("");
        });
    }

    @Test
    void testGetPassword_NullPrompt() {
        assertThrows(IOException.class, () -> {
            PasswordField.getPassword(null);
        });
    }

    @Test
    void testGetPassword_ValidPrompt() {
        assertDoesNotThrow(() -> {
            PasswordField.getPassword("Enter password: ");
        });
    }

    @Test
    void testGetPasswordInputStream_EmptyPrompt() {
        assertThrows(IOException.class, () -> {
            PasswordField.getPassword(System.in, "");
        });
    }

    @Test
    void testGetPasswordInputStream_NullPrompt() {
        assertThrows(IOException.class, () -> {
            PasswordField.getPassword(System.in, null);
        });
    }

    @Test
    void testGetPasswordInputStream_ValidPrompt() {
        assertDoesNotThrow(() -> {
            PasswordField.getPassword(System.in, "Enter password: ");
        });
    }

    @Test
    void testGetPasswordInputStream_NullInputStream() {
        assertThrows(IOException.class, () -> {
            PasswordField.getPassword(null, "Enter password: ");
        });
    }

    @Test
    void testGetPasswordInputStream_ValidInputStream() {
        assertDoesNotThrow(() -> {
            PasswordField.getPassword(new ByteArrayInputStream("test".getBytes()), "Enter password: ");
        });
    }

    @Test
    void testGetPasswordInputStream_ValidInputStreamAndPrompt() {
        assertDoesNotThrow(() -> {
            PasswordField.getPassword(new ByteArrayInputStream("test".getBytes()), "Enter password: ");
        });
    }
}
