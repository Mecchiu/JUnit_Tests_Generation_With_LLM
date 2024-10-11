package org.quickserver.net.qsadmin;
java
public class QSAdminAPI_0Test {

    @Test
    void testLogon_Success() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertDoesNotThrow(() -> qsAdminApi.logon());
    }

    @Test
    void testLogon_Failure() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon("InvalidUser", "InvalidPassword"));
    }

    @Test
    void testLogon_NullUsername() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon(null, "password"));
    }

    @Test
    void testLogon_NullPassword() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon("username", null));
    }

    @Test
    void testLogon_EmptyUsername() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon("", "password"));
    }

    @Test
    void testLogon_EmptyPassword() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon("username", ""));
    }

    @Test
    void testLogon_InvalidHost() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("invalidhost", 9080);
        assertThrows(IOException.class, () -> qsAdminApi.logon());
    }

    @Test
    void testLogon_InvalidPort() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9999);
        assertThrows(IOException.class, () -> qsAdminApi.logon());
    }

    @Test
    void testLogon_CloseAfterLogon() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertDoesNotThrow(() -> {
            qsAdminApi.logon();
            qsAdminApi.close();
        });
    }

    @Test
    void testLogon_LogoffAfterLogon() {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        assertDoesNotThrow(() -> {
            qsAdminApi.logon();
            qsAdminApi.logoff();
        });
    }
}
