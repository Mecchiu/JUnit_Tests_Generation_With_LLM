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
// Login.java
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

public class Login {

    /**
     * Authenticate the user by checking the password
     * and then Authorize them.
     *
     * @return user
     */
    public User authenticate() throws LoginException {
        user = null;
        if (userMgr == null)
            throw new LoginException("UserMgr undefined");
        if (password == null)
            throw new LoginException("Password not supplied");
        if (!userMgr.checkSecret(userid, password, authType)) {
            cat.warn("Invalid Password! User: " + username + ",userid: " + userid);
            throw new LoginException("Password invalid");
        }
        user = userMgr.getUser();
        user.setIpAddr(this.ipAddr);
        authorize();
        return user;
    }
}

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
	 * The XML data file to load from a source file.
	*/
	private final String input_filename = "src/test/data/test_login.xml";
	
    /**
	 * The password for the {@link Login_4Test#input_filename} file, which is parsed as the
	 * <strong>XML</strong> content.
	*/
    private final String input_password = "password";
    
	/**
	 * The {@link Properties} class to store the properties of the {@link SimpleDateFormat} used
	 * in tests.
	*/
	private final Properties input_properties = new Properties();
    
	/**
	 * The {@link SimpleLayout} used when loading {@link String}s directly in a
	 * {@link Logger}.
	*/
	private final SimpleLayout _layout = new SimpleLayout();
	
    {
		input_properties.put("password", input_password);
        input_properties.put("userid", userid);
        input_properties.put("authType", authType);
        input_properties.put("location", "user");
    }
	/**
	 * Returns the name of the {@link XMLFileInputLoader} being used.
	 */
	private static String fileLoaderName() {
		if (_layout.isLayoutTabbed()) {
			return "MYSCHEMA";
		} else {
			return "META-INF";
		}
	}
	//Constructor
	/**
	 * Test case for a login with an {@link XACML} provider that uses a file input loader.
	 */
	@Test
	public void login_4TestXACMLFile_01() throws ParseException {
		input_properties.put("location", fileLoaderName());
		user = authenticate();
        assertNotNull("expected user", user);
	}

	//Method
	/**
	 * Attempts to create the request context containing an entry for a {@link User#getFirstName()}
	 * entry.
	 */
	private void create_create_context() throws LoginException {
		create_contextForUser(user);
	}
	
	/**
	 * Convenience method for validating the request credentials using the {@link #create_create_context()}
	 * method.
	 */
	private void validate_returnsUser(User user) throws LoginException {
		RequestCtx reqctx = RequestBuilder.create(new String[] {"user/entry"}).setInput(
            (String) user.getFirstName()).setOutput(() -> (Calendar) String.valueOf("2007-08-11"));
		reqctx.validate();
	}
	
	/**
	 * Validates a {@link Set} of strings for the {@link #create_create_context()} method.
	 */
    private void validate_returnsUser(Set results) throws LoginException {
        assertNotNull("result string", results);
        Iterator it = results.iterator();
        while (it.hasNext()) {
            if (it.next().toString().equals(user.toString()))
                return;
        }
        assertFalse("result set", results.isEmpty());
        assertTrue("return set", results.size() > 1);
    }
	//Test case for login with XACML
	@Test
	public void login_4TestXACMLFile_02() throws ParseException, LoginException {
		create_create_context();
		user = authenticate();
		validate_returnsUser(user);
    }

    }
    //Logger.
    private static final Logger LOG = Logger.getLogger("com.browsersoft.aacs.Login");
    
    /**
     * Return the path to the credentials file for tests.
     */
    public static String getXMLFilePath() {
        return fileLoaderName() + "/" + "xacml/xacml-1.11.xml";
    }

    //Properties.
    private static final String userID = "userid";
    private static final String userType = "user_type";
    private static final String authType = "authType";
    private static final String password = "password";
    private static final String ipAddr = "ipAddr";
    private static final String userManagerName = "user_manager";
    private static final String userManagerURL = "user_manager.org";
    private static final String authToken = "userid";
    private static final boolean useCache = false;
}