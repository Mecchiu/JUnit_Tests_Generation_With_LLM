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
		
//private static final Log log = LogFactory.getLog(PasswordFilter.class);

/** Test of getPassword() method, of class PasswordField. */

						@Test
						public void testGetPassword() throws Exception {

							String password = getPassword1();

							assertTrue("should work", password.length() > 0);

						}

						private String getPassword1() throws IOException {

							PrintWriter pw = new PrintWriter(System.out, true);

							ArrayList<String> input = new ArrayList<String>();
							String [] pwCodes = new String[] {
									"",
									"abcdeabcde",
									"a",
									"123456",
									"456abcd",
									"ab",
									"abcdeabcd",
									"12345abcd", 
									"a1b",
									"ab",
									"abcde",
									"1234abcd", 
									"abcde",
									"123abcde", 
									"ab",
							};
							for (int i=0; i < pwCodes.length; i++) {
								input.add(pwCodes[i]);
							}
							pw.write(password + " ");

							pw.flush();

							pw.close();

							String password = pw.getBuffer().toString();

							return  password;

						}

}