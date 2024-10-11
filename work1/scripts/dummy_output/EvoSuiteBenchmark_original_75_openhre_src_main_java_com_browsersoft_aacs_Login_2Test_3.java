// Login_2Test.java
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
* It contains one unit test case for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {
		private static final Logger logger = Logger.getLogger(Login_2Test.class);
		private static final String securityLogFile ="aacsLogin.log";
	@SuppressWarnings({"unchecked","rawtypes"})
  void test_getSecurityLogFilePath_fileExistCheck() {
    File f = new File(getSecurityLogFile());  //This is how I set the right value of log filename.

    String path = f.getPath(); //f.getFullPath() will return f.getFullPath() without /.

    if(!f.exists()) {  //If is not found, I will return null.

      logger.info("Test for Login.getSecurityLogFilePath_fileExistCheck() PASSED. " +path);
    } else {
      logger.error("Test for Login.getSecurityLogFilePath_fileExistCheck() FAILED.");
      throw new RuntimeException("Test for Login.getSecurityLogFilePath_fileExistCheck() FAILED.");
    }
	}

}

