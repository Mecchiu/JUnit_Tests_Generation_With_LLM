// PasswordField_0Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordField_0Test {
		
    private static final String prompt = "Password: ";

    @Test
    public void passwordInput() throws IOException {
        String p = "Hello";
        System.out.println("Got password: ");
        System.out.print(p);
        checkPassword(p, p);
    }

    private void checkPassword(String p, String expected) throws IOException {
        checkPassword(new StringReader(p), expected);
    }

    private void checkPassword(Reader p, String expected) throws IOException {
        assertNotNull(p);
        assertEquals(expected, PasswordField.getPassword(p));
    }
}