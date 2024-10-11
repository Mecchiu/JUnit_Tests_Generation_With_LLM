// AACSLoginModuleTest.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModuleTest {
		
	/**
	* Test case for {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	*
	* @exception LoginException if the abort fails.
	* @return false if this LoginModule's own login and/or commit attempts
	* 	failed, and true otherwise.
	*/
	@Test
	public void testAbort() throws LoginException {
		// TODO Auto-generated method stub
		return;
	}
}

// AACSPrincipal.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;

/**
 * <p> This class implements the <code>Principal