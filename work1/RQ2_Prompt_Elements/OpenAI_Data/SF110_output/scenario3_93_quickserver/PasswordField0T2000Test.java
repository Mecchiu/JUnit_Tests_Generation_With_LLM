// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {

	@Test
	public void testGetPassword() throws IOException {
		String password = "password";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordChars = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordChars));
		assertEquals(prompt, baos.toString());
	}
}

// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

    /**
     * @param prompt The prompt to display to the user.
     * @return The password as entered by the user.
     */
    public static final char[] getPassword(String prompt) throws IOException;
}

// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {
		
	@Test
	public void testGetPassword() throws IOException {
		String password = "password";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordChars = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordChars));
		assertEquals(prompt, baos.toString());
	}
}

// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

    /**
     * @param prompt The prompt to display to the user.
     * @return The password as entered by the user.
     */
    public static final char[] getPassword(String prompt) throws IOException;
}

// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {
		
	@Test
	public void testGetPassword() throws IOException {
		String password = "password";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordChars = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordChars));
		assertEquals(prompt, baos.toString());
	}
}

// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

    /**
     * @param prompt The prompt to display to the user.
     * @return The password as entered by the user.
     */
    public static final char[] getPassword(String prompt) throws IOException;
}

// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {
		
	@Test
	public void testGetPassword() throws IOException {
		String password = "password";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordChars = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordChars));
		assertEquals(prompt, baos.toString());
	}
}

// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

    /**
     * @param prompt The prompt to display to the user.
     * @return The password as entered by the user.
     */
    public static final char[] getPassword(String prompt) throws IOException;
}

// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {
		
	@Test
	public void testGetPassword() throws IOException {
		String password = "password";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordChars = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordChars));
		assertEquals(prompt, baos.toString());
	}
}

// PasswordField.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class prompts the user for a password and attempts to mask
 * input.
 *
 * @since 1.4
 */
public class PasswordField {

   