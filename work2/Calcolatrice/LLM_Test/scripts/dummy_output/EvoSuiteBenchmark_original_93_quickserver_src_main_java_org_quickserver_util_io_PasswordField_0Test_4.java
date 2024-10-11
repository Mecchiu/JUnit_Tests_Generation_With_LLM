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
		
    /**
     * Testing {@link PasswordField_0#getPassword(String)}.
     * @throws IOException If a I/O error occurs, an exception thrown by
     * the user, or another error.
     */
    @Test
    public void getPassword() throws IOException, InterruptedException {
            
            HashMap<String, String> info = new HashMap<>();
            String userPassword = PasswordField.getPassword("\nUSERNAME\n");
            info.put("__INFO__", userPassword+"\n");
            
            HashSet<String> set = new HashSet<>();
            set.add("GATEWAY1");
            info.put("__SET__", set.toString());
            
            InputStreamReader isr = new InputStreamReader(System.in, "iso8859-1");
            InputStreamReader osr = new InputStreamReader(System.out, "iso8859-1");
            
            PrintWriter w = new PrintWriter(new OutputStreamWriter(System.out, "iso8859-1"));
            PrintWriter o = new PrintWriter(new OutputStreamWriter(System.err, "iso8859-1"));
            PasswordField passwordField = new PasswordField(isr, osr, w);

            passwordField.getPassword("\nUSERNAME");
            passwordField.getPassword("\n");

            assertNotNull(passwordField);
            assertFalse(passwordField.getClass().equals(DefaultPasswordField.class));

            o.close();
            w.close();
    }
}