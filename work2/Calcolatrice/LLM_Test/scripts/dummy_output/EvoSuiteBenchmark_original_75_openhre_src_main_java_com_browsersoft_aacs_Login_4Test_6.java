// Login_4Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#authenticate()} method.
*/
class Login_4Test {
		
	/**
	 * Test {@link Login#authenticate()}.
	 * @throws LoginException in case of a test failure.
	 * @throws ParseException thrown if a server error occurs.
	 */
  @Test
  public void testAuthentication() throws LoginException, ParseException {
	  Properties props = new Properties();
	props.setProperty("auth.prov.name", "localhost");
	props.setProperty("auth.prov.server", "Test");
	props.setProperty(Indenter.property, "simple");	  
        try {
          System.out.println("Running test ");
          Login login = new Login();
          Set<String> loginSet = login.authenticate();
          System.out.println("Login set (" + loginSet + "):");
          Iterator<String> i = loginSet.iterator();
          String first = i.next();
          String second = i.next();
          String third = i.next();
          String fourth = i.next();
          if (!first.equals("localhost")) {
            System.out.println("    -Server: ");
            System.out.println("    TLS-Server: " + System.getProperty("tests.port"));
            System.out.println("    TLS-File: " + new File("src/tests/test/log.file.properties"));
            System.out.println("");
          }
          if (!second.equals("localhost")) {
            System.out.println("    -Server: ");
            System.out.println("    TLS-Server: " + System.getProperty("tests.port"));
            System.out.println("    TLS-File: " + new File("src/tests/test/log.file.properties"));
            System.out.println("");
          }
          if (!third.equals("localhost")) {
            System.out.println("    -Server: ");
            System.out.println("    TLS-Server: " + System.getProperty("tests.port"));
            System.out.println("    TLS-File: " + new File("src/tests/test/log.file.properties"));
            System.out.println("");
          }
          if (!fourth.equals("localhost")) {
            System.out.println("    -Server: ");
            System.out.println("    TLS-Server: " + System.getProperty("tests.port"));
            System.out.println("    TLS-File: " + new File("src/tests/test/log.file.properties"));
            System.out.println("");
          }
          assertTrue(loginSet.size() > 0);
        }
        catch ( Exception e ) {
          throw new ParseException(e.getMessage(), e);
        }
  }
}