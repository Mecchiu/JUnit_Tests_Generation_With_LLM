// Test case 1: Test logout when userPrincipal is null
@Test
public void testLogout_userPrincipalNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.userPrincipal);
}

// Test case 2: Test logout when rolePrincipal is null
@Test
public void testLogout_rolePrincipalNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.rolePrincipal);
}

// Test case 3: Test logout when user is null
@Test
public void testLogout_userNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.user);
}

// Test case 4: Test logout when login is null
@Test
public void testLogout_loginNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.login);
}

// Test case 5: Test logout when password is null
@Test
public void testLogout_passwordNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.password);
}

// Test case 6: Test logout when password is not null
@Test
public void testLogout_passwordNotNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.password = new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};
    loginModule.logout();
    assertNull(loginModule.password);
}

// Test case 7: Test logout when commitSucceeded is false
@Test
public void testLogout_commitSucceededFalse() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.commitSucceeded = false;
    loginModule.logout();
    assertFalse(loginModule.succeeded);
}

// Test case 8: Test logout when commitSucceeded is true
@Test
public void testLogout_commitSucceededTrue() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.commitSucceeded = true;
    loginModule.logout();
    assertTrue(loginModule.succeeded);
}

// Test case 9: Test logout when username is null
@Test
public void testLogout_usernameNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.logout();
    assertNull(loginModule.username);
}

// Test case 10: Test logout when userPrincipal is not null
@Test
public void testLogout_userPrincipalNotNull() throws Exception {
    AACSLoginModule loginModule = new AACSLoginModule();
    loginModule.initialize(new Subject(), new TestCallbackHandler(), new HashMap<>(), new HashMap<>());
    loginModule.userPrincipal = new AACSPrincipal("testUser");
    loginModule.logout();
    assertNull(loginModule.userPrincipal);
}