// Here's an example implementation of the QSAdminAPITest class with ten unit test cases for the logon() method:

class QSAdminAPITest {

    @Test
    void testLogonWithValidCredentials() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", "password");
        assertTrue(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithInvalidCredentials() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", "wrongpassword");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithEmptyUsername() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "", "password");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithEmptyPassword() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", "");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithNullUsername() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, null, "password");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithNullPassword() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", null);
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithInvalidIpAddress() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("invalidipaddress", 9080, "admin", "password");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonWithInvalidPort() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 12345, "admin", "password");
        assertFalse(qsAdminApi.logon());
        qsAdminApi.close();
    }

    @Test
    void testLogonTwice() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", "password");
        assertTrue(qsAdminApi.logon());
        assertFalse(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogoffWithoutLogon() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080, "admin", "password");
        assertFalse(qsAdminApi.logoff());
        qsAdminApi.close();
    }
}