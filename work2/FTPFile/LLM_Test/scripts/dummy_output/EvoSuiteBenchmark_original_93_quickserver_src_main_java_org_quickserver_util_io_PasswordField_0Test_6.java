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
     * @param args the command line arguments.
     */
    public static void main (String[] args) {
        try {
            Object[] args2 = new Object[1];
            args2[0] = "-validity-level 2,error,info,warning";

            PasswordField f;

            f = new PasswordField();
            f.setPassword("password");
            String p = f.getPassword("this is the password for this user :");
            assertTrue(p.length() > 2 && p.charAt(0) == '!');
            assertTrue(p.charAt(1) == '!');
        } catch (IOException e) {
            fail(e.toString());
        }
    }

    @Test
	public void test() throws IOException {
		
        PrintWriter out = new PrintWriter(System.out, true);
		
        try {
            System.setProperty("quickserver.password.masker.debug", "on");
            char[] password = getPassword("password");
            System.setProperty("quickserver.password.masker.debug", "off");
            String p = new String(password);
            System.setProperty("quickserver.password.masker.debug", "on");
            assertTrue("Password does not match", p.length() > 2 && p.charAt(0) == '!' && p.charAt(p.length()-1) == '!');
        } catch (RuntimeException e) {
            assertTrue("Password does not match, e=" + e, false);
        } finally {
            System.setProperty("quickserver.password.masker.debug", "off");
            out.close();
        }
    }

}
// PasswordField_0Test.java