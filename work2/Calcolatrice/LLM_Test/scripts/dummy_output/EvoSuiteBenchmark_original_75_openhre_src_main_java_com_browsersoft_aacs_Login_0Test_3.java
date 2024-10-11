// Login_0Test.java
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
* It contains one unit test case for the {@link Login#getProps(String)} method.
*/
class Login_0Test {
		
	String xacmlData;
	RequestBuilder reqBuilder;
	
	String fileDir;
	
	
	public Login_0Test() {

	}
	public String getXacmlData() 
			throws LoginException{
	
		return xacmlData;
	}
	public void setXacmlData(String theXacmlData) 
			throws LoginException{
	
		xacmlData = theXacmlData;
	}

    
	public void setFileDir(String theFileDir) 
			throws LoginException{
	
	this.fileDir=theFileDir;
	}
	public RequestBuilder getReqBuilder()
			throws LoginException {
		
		return reqBuilder;
	}
	public void setReqBuilder(RequestBuilder theReqBuilder) 
			throws LoginException {}
	
}

// login.java

/**
* Login unit
*/
public class Login_0UnitTest {


	{

		File dir = new File ("target", "unitTestXacml");
		FileAppender fapp = null;
}
}