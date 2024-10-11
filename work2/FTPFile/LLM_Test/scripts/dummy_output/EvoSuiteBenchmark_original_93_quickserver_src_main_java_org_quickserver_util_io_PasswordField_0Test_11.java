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
		* A field containing a String that is initialized using the given String.
		*/
		static String str1 = "Initializing\nwith\nstring\0\0";
		
		static String str2 = "Initializing 2\n\0\0";
		
        /**
         * Test that the first line of the {@link PasswordField} instance 
         * is the password returned by the {@link PasswordField#getPassword(String)} method.
         */
        @Test
        void testGetPassword1() {
            assertEquals(PasswordField.str1, PasswordField.getPassword(PasswordField.str1));
        }
        
        /**
         * Test that the first line of the {@link PasswordField} instance 
         * is the password returned by the {@link PasswordField#getPassword(String)} method,
         * but a second line is added that excludes it.
         */
        @Test
        void testGetPassword2() {
            assertEquals(PasswordField.str2, PasswordField.getPassword(PasswordField.str2 + "\n  \0\0"));
            assertEquals("Initializing 2\n \0\0", PasswordField.getPassword(PasswordField.str2));
        }
}