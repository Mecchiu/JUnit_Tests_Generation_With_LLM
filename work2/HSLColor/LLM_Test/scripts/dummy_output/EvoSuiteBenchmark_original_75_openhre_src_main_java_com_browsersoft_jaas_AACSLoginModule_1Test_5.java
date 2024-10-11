// AACSLoginModule_1Test.java
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
* It contains one unit test case for the {@link AACSLoginModule#commit()} method.
*/
class AACSLoginModule_1Test {
		public static void main (String[] args) throws Exception {
				new AACSLoginModule_1Test().test();
		}
	private void test() throws Exception {
		LoginContext lc = new LoginContext("logincontextname",
				new MapLoginModule.MapCallbackHandler(
						new MapCallbackHandler.Callback[] {
							new MapCallbackHandler.Callback() {} }));
		lc.login();
	}
}