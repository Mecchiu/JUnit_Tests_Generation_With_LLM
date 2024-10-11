// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {
		/**
         * This unit test class demonstrates use of the private static {@link PasswordField} method,
         * which allows the user to directly invoke a {@link PasswordField} method.
         */
    @Test
    public void test_getPassword() {
        String prompt = "> ";
        String password = null;
        Object[] results = new Object[2];
        int tests = 1;
        InputStream in = null;
        try {
            in = PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), prompt);
            password = PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), prompt);
        } catch (SecurityException s) {
            String msg = "An authorization error occurred";
            s.printStackTrace(); //System.err.println(msg);
        } catch (IOException io) {
            String msg = "An input error occurred";
            io.printStackTrace(); //System.err.println(msg);
            io.printStackTrace();
        }

        System.out.println("getPassword tests success: "
                + tests + " with test code [" + tests + " tests]");
        System.out.println("password: " + password);
        if (password == null) {
            fail("no password set from the input stream");
        }

        System.out.println("password get was: " + password);

        results = PasswordField.getPassword(new ByteArrayInputStream(new byte[1]), prompt);
        assertTrue(password.equals(results[0]));
        if (password.equals(results[1])) {
            tests--;
            passed(password);
        } else {
            failed(password, results[1]);
            passed(password);
        }

    }

	/////////////////////////////////////////////////
	// PRIVATE UTILITY methods
	/////////////////////////////////////////////////

    private static char[] readPassword(ByteArrayOutputStream baos)
            throws IOException {
        byte[] password = new byte[baos.size()];
        baos.writeTo(password);
        return new char[password.length];
    }

    private static void failed(String password, char[] results) {
            assertTrue(
                    password
                    + " has been returned with characters from the expected "
                    + "iteration ["
                    + results.length
                    + " results] but this password was returned with characters ["
                    + password.length + "].",
                    System.arraycopy(results, 0, new char[2], 0, 3));

    }

    private static void passed(char[] password) {
            assertTrue(
                    "A valid password has not been returned", password.length > 0);
    }
}