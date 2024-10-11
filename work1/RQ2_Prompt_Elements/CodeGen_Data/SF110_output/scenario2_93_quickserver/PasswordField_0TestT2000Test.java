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
private String prompt;
		private String[] passwords;
		private BufferedReader reader;

		PasswordField_0Test(String prompt, String password1, String password2) throws IOException {
			this.prompt = prompt;
			this.passwords = new String[]{password1, password2};
		}

		@Test
    	public void testGetPassword_1() throws IOException {
        		assertArrayEquals(this.passwords, getPassword(this.prompt));
        	}

		@Test
    	public void testGetPassword_2() throws IOException {
        		assertArrayEquals(0, getPassword(this.prompt).length);
        	}

		@Test
    	public void testGetPassword_3() throws IOException {
        		assertArrayEquals(this.passwords, getPassword(this.prompt));
        	}

		@Test
    	public void testGetPassword_4() throws IOException {
        		passwords = new String[]{0};
        		try {
        			getPassword(this.prompt);
        			unexpected();
        		} catch (IOException e) {
        			assertEquals("The password cannot be empty for the field setter.", e.getMessage());
        		}
        	}
    }
