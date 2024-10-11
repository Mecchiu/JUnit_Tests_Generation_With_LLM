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
		private static final Logger LOG = Logger.getLogger(PasswordField_0Test.class
					.getName());

/**
 * Tests the method of {@link PasswordField#getPassword(String)}.

*/
@Test
void password_0Test() {
  List<String> pw = new ArrayList<>();
  assertNull("password was not null", pw);
}
}