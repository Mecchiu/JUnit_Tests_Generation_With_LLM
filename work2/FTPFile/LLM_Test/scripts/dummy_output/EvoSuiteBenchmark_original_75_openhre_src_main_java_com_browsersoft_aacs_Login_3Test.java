 package com.browsersoft.aacs;
java
class Login_3Test {
    @Test
    void testAuthorize_NullUserMgr() {
        Login login = new Login();
        assertThrows(LoginException.class, login::authorize);
    }
    @Test
    void testAuthorize_NullPassword() {
        Login login = new Login();
        login.setUserMgr(new SimpleUserMgr());
        assertThrows(LoginException.class, login::authorize);
    }
    @Test
    void testAuthorize_PasswordValidityCheck() throws LoginException {
        Login login = new Login();
        login.setUserMgr(new SimpleUserMgr());
        login.setUserId("testUser");
        login.setPassword("testPassword");
        User user = new User();
        user.setPassvalidstart("20220101");
        login.getUserMgr().addUser(user);
        assertThrows(LoginException.class, login::authorize);
    }
    @Test
    void testAuthorize_IPBasedFiltering() throws LoginException {
        Login login = new Login();
        login.setUserMgr(new SimpleUserMgr());
        login.setUserId("testUser");
        login.setPassword("testPassword");
        User user = new User();
        user.setAllowedips(new HashSet<>());
        user.setIpAddr("192.168.1.1");
        login.getUserMgr().addUser(user);
        assertThrows(LoginException.class, login::authorize);
    }
    @Test
    void testAuthorize_IPBasedFiltering_ActiveGroups() throws LoginException {
        Login login = new Login();
        login.setUserMgr(new SimpleUserMgr());
        login.setUserId("testUser");
        login.setPassword("testPassword");
        User user = new User();
        user.setAllowedips(new HashSet<>());
        user.setIpAddr("192.168.1.1");
        user.setGroups(new HashSet<>());
        login.getUserMgr().addUser(user);
        assertThrows(LoginException.class, login::authorize);
    }
    @Test
    void testAuthorize_ValidAuthorization() throws LoginException {
        Login login = new Login();
        login.setUserMgr(new SimpleUserMgr());
        login.setUserId("testUser");
        login.setPassword("testPassword");
        User user = new User();
        user.setPassvalidstart("20230101");
        user.setAllowedips(new HashSet<>());
        user.setIpAddr("192.168.1.1");
        user.setGroups(new HashSet<>());
        login.getUserMgr().addUser(user);
        User authorizedUser = login.authorize();
        assertNotNull(authorizedUser);
    }
    @Test
    void testAuthorize_IPRangeCheck() {
        Login login = new Login();
        int currentip = Integer.parseInt("3232235777");
        Set allowedips = new HashSet<>();
        allowedips.add("192.168.1.0/24");
        assertTrue(login.ipRangeCheck(allowedips, currentip));
    }
    @Test
    void testAuthorize_IPRangeCheck_NoIPRange() {
        Login login = new Login();
        int currentip = Integer.parseInt("3232235777");
        Set allowedips = new HashSet<>();
        assertFalse(login.ipRangeCheck(allowedips, currentip));
    }
    @Test
    void testAuthorize_IPRangeCheck_InvalidIP() {
        Login login = new Login();
        int currentip = Integer.parseInt("3232235777");
        Set allowedips = new HashSet<>();
        allowedips.add("10.0.0.0/8");
        assertFalse(login.ipRangeCheck(allowedips, currentip));
    }
}