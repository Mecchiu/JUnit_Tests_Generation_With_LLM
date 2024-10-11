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
		 * Run all unit tests from here to the end.
		 * @param args	Test arguments.
		 */

		/**
		 * @throws IOException 
		 */
	@Test
	void getPassword(String[] args) throws IOException {
		final PrintStreamWriter pw = new PrintStreamWriter(System.err);
		pw.println("PasswordField should produce a random password");

		final Random random = new Random();

		final String password;
		{
			int i;

			for (i = 0; i < 5; i++) {
				pw.close();

				assertFalse(this.getPassword(System.in, "Enter password", i).equals(null), "Wrong password should not be generated");
				break;
			}
			if (i == 5) {
				throw new Error("All letters in a password string will be unique");
			}
			password = this.getPassword(System.in, "Password", i);
		}

		assertNotNull(password, "No password generated");
        final FileOutputStream fos = new FileOutputStream("generated.password");
		final byte[] pass = pw.toString().getBytes();
		fos.write(pass);
		fos.flush();
		fos.close();
		pw.close();

        final DataOutputOutputStream daos = new DataOutputStream(new FileOutputStream("generated.password"));
        final PasswordField p = new PasswordField(password);
        p.process(new PrintWriter(pw));
        daos.flush();
        daos.close();

        final String passwordWithoutCharset = p.getPassword(new BufferedReader(new FileReader("generated.password")));

        final String passwordWithCharset = null;
        p = new PasswordField(null);
        p.process(new PrintWriter(new FileOutputStream("generated.")),passwordWithCharset);
	  final Properties props = new Properties();
        props.load(this.getClass().getResourceAsStream("/generated.properties"));
        this.assertEquals(passwordWithoutCharset, p.getPassword(new BufferedReader(new FileReader("generated.password"))), "Charset is not correctly set");
	  this.assertEquals(passwordWithCharset, p.getPassword(new BufferedReader(new FileReader("generated."))), "Charset is not correctly set"); 

        final System.setProperty("java.lang.System.lineSeparator", "\n");
        final PrintStream oldOS = System.out;
        final Writer out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("generated.password")));
        final PrintWriter pw = new PrintWriter(out);
        out.printf("Password: %s\n", passwordWithoutCharset);
        out.printf("Password without charset%n");
        out.close();

        // check with the line separator
        final System.setProperty("os.lineSeparator", "\n");
        out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("generated.password")));
        out.printf("password: %s\n", password);
        out.close();

        assertEquals(passwordWithoutCharset, p.getPassword(new BufferedReader(new FileReader("generated.password"))), "Should be equal");

        assertFalse(this.getPassword(new FileInputStream("generated.password"), null).equals(null), "Password should be generated");
        assertFalse(this.getPassword(new FileInputStream("generated.password"), "Enter password").equals(null), "Password should be generated");
        assertFalse(this.getPassword(new FileInputStream("generated.password"), "Password").equals(passwordWithoutCharset), "Password should not be generated");
    }
}