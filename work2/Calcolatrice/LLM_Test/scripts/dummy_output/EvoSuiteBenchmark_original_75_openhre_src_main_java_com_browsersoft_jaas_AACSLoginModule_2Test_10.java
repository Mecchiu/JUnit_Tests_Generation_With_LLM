package com.browsersoft.jaas;
private static final int TEST_USER_ID = 33;
		private static final String TEST_USER_NAME = "testUser";
		private static final String TEST_PASSWARD = "testPassword";
		private static final String TEST_PROPERTIES =
                  "com.browsersoft.aacs.Properties";
		private static final String TEST_SUBNET = "192.168.1";
		private static final int TEST_SUBNET_PORT = 2222;
		private String PASSWORD = "secret";
		private String PROPERTIESFILE = "log_property_file";
		
		String getPASSWORD() { return PASSWORD; }
		String getPROPERTIES() { return PROPERTIES; }
		String getPROPERTIESFILE() { return PROPERTIESFILE; }
		String getTEST_USERID() { return TEST_USERID; }
		String getTEST_USERNAME() { return TEST_USERNAME; }
		String getTEST_PASSWORD() { return TEST_PASSWORD; }
		String getTEST_SUBNET() { return TEST_SUBNET; }
		int getTEST_SUBNET_PORT() { return TEST_SUBNET_PORT; }
}

/**
 * Unit test suite for {@link AACSLoginModule}.
 * ClassName AACSLoginModule_2Test
 * @author grodecki
 * @version $Revision: 1.1 $ $Date: 2006/11/06 19:52:19 $
 */
public final class AACSLoginModule_2Test {
		private static final String TEST_PASSWORD = "secret";
		private static final String TEST_PROPERTIES =
                  "com.browsersoft.aacs.Properties";
		private static final String TEST_SUBNET = "192.168.1";
		private static final int TEST_SUBNET_PORT = 11111;
		private AACSLoginModule login = null;
		private JivePrincipal userToLogin = null;

		public void testAACSLoginModule_abort_when_login_failed() throws LoginException {
		login = new AACSLoginModule(TEST_PROPERTIES);
		//fail("testAACSLoginModule_abort_when_login_failed not called");
		try {
			login.abort();
			fail("testAACSLoginModule_abort_when_login_failed called");
		} catch(LoginException e) {
			//ignore
		}
	}
				/*
		 * Test method for {@link JiveLoginModule#login(Map,Subject) login}
		 *
		 * <p>It tests the method that creates a new principal instance
		 * from the <b>login</b> parameter and saves the new principal in
		 * the given <b>subject</b>.
		 *
		* <p>It returns successfully if the login succeeds.
		* @throws LoginException if the login didn't succeed.
		*/
	@Test
	public void testLogin() throws LoginException {
		//create a new instance of login
	    login = new AACSLoginModule(TEST_PROPERTIES);
        //login fails by calling Login.init(java.security.Principal)
	    assertTrue("login failed", login.getLogin() instanceof AACSLoginModule.AACSLoginModule_2Test);
	    //save an instance of user that is the new login subject
	    userToLogin = new JivePrincipal("root");
	    subject = new TestSubject();
	    assertTrue("Login not succesful", login.login(
	    subject, userToLogin) == null);
	}
		/*
		 * Test method for {@link JiveLoginModule#getPassword() getPassword}
		 */
	@Test
	public void testGetPassword() {
		//login by calling login(java.security.Principal,java.security.PrivateCredentialEntry)
		login = new AACSLoginModule(TEST_PROPERTIES);
		PASSWORD = "testPassword";
		//getPassword returns PASSWORD
	}

	/*
	 * Test method for {@link AACSLoginModule#getPROPERTIES() getPROPERTIES}
	 */
	@Test
	public void testGetPROPERTIES() {
		//login by calling login(java.security.Principal,java.security.PrivateCredentialEntry)
		login = new AACSLoginModule(TEST_PROPERTIES);
		System.out.println("\n************* getPROPERTIES: " + "***\n");
		PROPERTIES = LoginModule.readPropertyFile(PROPERTIESFILE);
		
		//getPassword returns the properties map
		assertEquals("LoginModule returns incorrect set\n",PROPERTIES,login.getPROPERTIES());
	}

	/*
	 * Test method for {@link AACSLoginModule#getPROPERTIES() getPROPERTIES()}
	 */
	@Test
	public void testGetUserid() {
		//login by calling login(java.security.Principal,java.security.PrivateCredentialEntry)
		login = new AACSLoginModule(TEST_PROPERTIES);
		System.out.println("\n************* getPROPERTIES: " + "***\n");
		//getPassword returns null since this user doesn't have a "id" property
		assertNull("LoginModule returned property from getPassword() but