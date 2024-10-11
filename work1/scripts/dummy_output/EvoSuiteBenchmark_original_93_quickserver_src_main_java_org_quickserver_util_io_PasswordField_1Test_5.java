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
		* @param in input stream to be used (e.g. System.in)
		*/
	private InputStream in;

	/**
	* @param prompt The prompt to display to the user.
	*/
	private String prompt;

	/**
	* @param out output stream to be used (e.g. System.out)
	*/
	private OutputStream out;

	/**
	* @param testData Input stream of the data to be tested.
	*/
	public PasswordField_1Test(InputStream in, String prompt) throws IOException {
		this.in = in;
		this.prompt = prompt;
		this.out = new BufferedOutputStream(in, 6) ;
		
	}

	// UnitTest
	@Test
	public void test1() throws IOException {
		password(in, prompt);
		password(in, prompt);
		verifyPassword(in, out);
		in.close();
		out.close();
		assertTrue(out.checkPassword(null));
//		else
//			assertTrue(in.checkPassword(null));
	}

//    private void verifyPassword(InputStream in, String out) throws IOException {
//	  String password = "";
//      int c;
//  
//      while ((c = in.read())!= -1){
//  	  password += (char) c;
//	  }
//      log(password);
//
//      password.trim();     // Remove trailing spaces
//      if (password.length() < 2)
//	  {
//	       password = "";
//      }
//      if (password.length() < 6)
//	  {
//	       password = "";
//      }
//      if (password.length() > 6)
//	  {
//	       password = "";
//      }
//      out.write(password.toCharArray());
//      log("Password verified..."); 
//    }
	
	private static final Logger LOG = Logger.getLogger(Input.class.getName());
}
