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
		
    
    @Test
    void test() throws IOException {
        String prompt = "Enter new password: ";
        String password = getPassword("PasswordField", prompt);

        assertEquals(prompt+"  ", password);
    }

    // PasswordField_2Test.java
    @Test
    void test2() throws IOException {
        String prompt = "Enter new password: ";
        String password = getPassword("PasswordField2", prompt);
		
        // If password is not null
        assertNotNull(password);

        // If first character after password is 'x', the password remains null and password is just blank
        assertNull(password.substring(password.length()-1));
    }

    // PasswordField_3Test.java
    @Test
    void test3() throws IOException {
        String prompt = "Enter new password: ";
        String password = getPassword("PasswordField3", prompt);
	
        // If password is not null
        assertNotNull(password);

        // If password contains 'a', the password remains null and password is just blank
        assertNull(password.substring(password.length()-1, password.length()));
    }

    // PasswordField_4Test.java
    @Test
    void test4() throws IOException {

        String prompt = "Enter new password: ";
        List<Integer> pass = new Vector<>();
        for (int i = 0; i < 8; i++) {
            pass.add(i);
        }
		
        // If password is not null
        assertNotNull(password);

        // If first character after password is 'a', the password remains null and passwords are separated by three character
        assertNull(password.substring(password.length()-1));
     }
}