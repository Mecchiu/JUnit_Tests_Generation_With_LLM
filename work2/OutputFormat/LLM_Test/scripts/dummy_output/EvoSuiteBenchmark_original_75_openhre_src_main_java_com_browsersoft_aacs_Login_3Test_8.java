// Login_3Test.java
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
* It contains one unit test case for the {@link Login#authorize()} method.
*/
class Login_3Test {
		
    final static String X509_CA = "https://ssl.browsersoftinc.com/aacs-security.crt";
	final static String X509_CERT = "https://browsersoftinc.com/aacs-security.crt";
	final static String SSL_CERT = "ssl-sec.crt";
    final static String USER = "browsersoft";
    final static String PASSWD = "test";
    final static String IN_DIR = "test-dir";
    final static String IN_FILE = "test-file.txt";
    final static String SERIAL_PORT = "12346";
    final static String PADDER = "1d-2f";

    @Test
    public void testLogin() throws LoginException
    {
        User u = authorize();
        System.setProperty("debug", "true");
        try{
            assertNotNull(u);
            System.out.println(u);
        } finally{}
    }
	
	
	@Test
	public void testAuthenticatedLogin() throws LoginException {
	
		Logger logger = Logger.getLogger(Login.class);
		Level level = Level.INFO;
		
		for (int m = 0; m<=Integer.MAX_VALUE; m++) {
			logger.setLevel(level);
			try{
				logger.addAppender(
						new FileAppender(
								SimpleLayout.newInstance().setName(IN_DIR + InDir.INDER + PADDER), "./logs/test.log"));
			}catch(IllegalArgumentException e) {
				assertTrue(e.getMessage(), true);
			}
			
			for (int i=0; i<1000 ; i++) {
				logger.setLevel(level);
				try{
					System.setProperty("log4j.loggerInfoLevel", "debug");
                    System.setProperty("log4j.useSingleFileAppender", "true");
                    System.setProperty("log4j.remoteLogger", "true");
					RequestBuilder builder = RequestBuilder.newUserRequest(
							System.getProperty("user.name"),
							System.getProperty("passwd"));

					for(String s: new String(sig()).split("#")){
						builder.addParameter(s);
                    }

					RequestCtx context = builder.getRequestContext();
					RequestCtx.set(context, "sessionID", USER);

					RequestCtx.set(context, "username",
							System.getProperty("user.name"));
					RequestCtx.set(context, "secureSession", PASSWD);
					String d = Date.now().toString()
						+ "."
						+ PADDER	
								+ String.format("%04d-%02d-%02dT%02d:%02d:%02d.%03dZ", 
														 Calendar.getInstance().get(Calendar.YEAR), 
															 Calendar.getInstance().get(Calendar.MONTH) + 1, 
															 Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
															 Calendar.getInstance().get(Calendar.HOUR_OF_DAY),
															 Calendar.getInstance().get(Calendar.MINUTE),
																			Calendar.getInstance().get(Calendar.SECOND),
																			Calendar.getInstance().get(Calendar.MILLISECOND) + 600);

					returner(new StringBuilder().append(USER).append(":").append(PASSWD).append("|"+user(IN_DIR, IN_FILE)).toString());
					
					returner(context.toString());
				}catch(LoginException e) {
					assertTrue(e.getMessage(), true);
                    logger.addAppender(new FileAppender(
							SimpleLayout.newInstance().setName(IN_DIR + InDir.INDER + PADDER), new PrintWriter("system.out").getClass()));
                    if (m==99){//this is the first iteration of the loop
                      System.setProperty("log4j.loggerInfoLevel", "trace");
                      System.setProperty("log4j.remoteLogger", "true");
                      System.setProperty("log4j.useSingleFileAppender", "true");
                    }
                    //if the first iteration of the loop (99) is unsuccessful,
                    //then the final attempt will fail since the value of
					//the log4j.logger.info.logger.impl.rootLogger is already set to the
                    //root logger
					returner(requestData(IN_FILE, i));
					returner(context.toString());
				}
			}
		}
}
}