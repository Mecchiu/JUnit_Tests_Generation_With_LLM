```java
import org.junit.jupiter.api.Test;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class Login_1Test {

    @Test
    void testGetPropsWithConfigFile() {
        Properties props = Login.getProps("AACS");
        assertNotNull(props);
    }

    @Test
    void testGetPropsWithoutConfigFile() {
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    @Test
    void testInit() {
        Login.init();
        assertNotNull(Login.getProps());
    }

    @Test
    void testGetSecurityLogFilePath() {
        String securityLogFilePath = Login.getSecurityLogFilePath();
        assertNotNull(securityLogFilePath);
    }

    @Test
    void testLoadProperties() {
        Properties props = new Properties();
        Login.loadProperties(props, "AACS");
        assertNotNull(props);
    }

    @Test
    void testSetUsername() {
        Login login = new Login();
        login.setUsername("testUser");
        assertEquals("testUser", login.getUsername());
    }

    @Test
    void testSetIpAddr() {
        Login login = new Login();
        login.setIpAddr("127.0.0.1");
        assertEquals("127.0.0.1", login.getIpAddr());
    }

    @Test
    void testSetPassword() {
        Login login = new Login();
        login.setPassword("password123");
        assertEquals("password123", login.getPassword());
    }

    @Test
    void testSetUserId() {
        Login login = new Login();
        login.setUserId("12345");
        assertEquals("12345", login.getUserId());
    }
}
```