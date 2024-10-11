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
		public final String PASSWORD_CONF        = "/aacsLogin/password.conf";
		public final String LOGINER_CONF          = "/aacsLogin/logger.conf";
		
	/**
	* Initialize the logger and logger level.
	*
	* @param   lvl    String. Logging level.
	* @param   lvlStr String. Logger level value. 
	* @return              - LOGGER_NAME. log4j.
	*/
	@Test
	public void Init(String lvl, String lvlStr) {
}
}