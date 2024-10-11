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
@Test
		void testGetPassword_input() {
		passwordField_getPassword_input_00();
		}
		private static void passwordField_getPassword_input_00() {
		String inp = "abcdefghiabcd";
		String actual = "password".getBytes("UTF-8")[0];
		String expected = "ABCDEFGHIabcdefghiabcd";
		assertEquals(expected, new String(actual));
		}

}
