```java
    private SimpleUserMgr userMgr;

    @BeforeEach
    void setUp() {
        userMgr = new SimpleUserMgr();
        userMgr.init();
    }

    @Test
    void testGetUser_WithValidUserNameOrgEmail_ReturnsUser() {
        User user = userMgr.getUser("JohnDoe", "Organization1", "john.doe@example.com");
        assertNotNull(user);
    }

    @Test
    void testGetUser_WithInvalidUserName_ReturnsNull() {
        User user = userMgr.getUser("InvalidUser", "Organization1", "john.doe@example.com");
        assertNull(user);
    }

    @Test
    void testGetUser_WithInvalidOrg_ReturnsNull() {
        User user = userMgr.getUser("JohnDoe", "InvalidOrg", "john.doe@example.com");
        assertNull(user);
    }

    @Test
    void testGetUser_WithInvalidEmail_ReturnsNull() {
        User user = userMgr.getUser("JohnDoe", "Organization1", "invalid.email@example.com");
        assertNull(user);
    }

    @Test
    void testGetUser_WithNullUserName_ReturnsNull() {
        User user = userMgr.getUser(null, "Organization1", "john.doe@example.com");
        assertNull(user);
    }

    @Test
    void testGetUser_WithNullOrg_ReturnsNull() {
        User user = userMgr.getUser("JohnDoe", null, "john.doe@example.com");
        assertNull(user);
    }

    @Test
    void testGetUser_WithNullEmail_ReturnsNull() {
        User user = userMgr.getUser("JohnDoe", "Organization1", null);
        assertNull(user);
    }

    @Test
    void testGetUser_WithAllNullParameters_ReturnsNull() {
        User user = userMgr.getUser(null, null, null);
        assertNull(user);
    }

    @Test
    void testGetUser_WithEmptyParameters_ReturnsNull() {
        User user = userMgr.getUser("", "", "");
        assertNull(user);
    }
}
```