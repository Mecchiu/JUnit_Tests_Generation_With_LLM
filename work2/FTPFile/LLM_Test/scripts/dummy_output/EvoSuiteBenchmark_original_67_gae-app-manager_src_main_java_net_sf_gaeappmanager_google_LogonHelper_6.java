// LogonHelperTest.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogonHelper}.
* It contains one unit test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {
		
    /**
     * Test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
     */
//    public void testLoginToGoogleAppEngine() throws Exception {
//        String userid = "example.org/app";
//        String password = "password";
//        String source = "Test Test";
//        String aclstring = "private";
//
//        logonHelperThread = startLoginToGoogleAppEngine(userid, password, source);
//        assertNotNull(logonHelperThread);
//        assertNotNull(logonHelperThread.getLoginInfo());
//        assertNotNull(logonHelperThread.currentAuthToken);
//        assertEquals(userid, logonHelperThread.user);
//
//        logonHelperThread = startLoginToGoogleAppEngine(null, null, source);
//        logonHelperThread.stopLogon();
//        assertNull(logonHelperThread.currentAuthToken);
//    }

    /**
     * Test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} with
     * password = null.
     */
//    public void testLoginToGoogleAppEngineNullPassword() throws Exception {
//        String userid = "example.org/app";
//        String source = "Test Test";
//        String aclstring = "private";
//
//        logonHelperThread = startLoginToGoogleAppEngine(userid, null, source);
//        assertNotNull(logonHelperThread);
//        assertNotNull(logonHelperThread.getLoginInfo());
//        assertNotNull(logonHelperThread.currentAuthToken);
//        assertEquals(userid, logonHelperThread.user);
//
//        logonHelperThread = startLoginToGoogleAppEngine(null, null, source);
//        logonHelperThread.stopLogon();
//        assertNull(logonHelperThread.currentAuthToken);
//    }

    /**
     * Test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} with
     * userid null.
     */
//    public void testLoginToGoogleAppEngineNullUser() throws Exception {
//        String userid = "example.org/app";
//        String source = "Test Test";
//        String aclstring = "private";
//
//        logonHelperThread = startLoginToGoogleAppEngine(null, userid, source);
//        assertNotNull(logonHelperThread);
//        assertNotNull(logonHelperThread.getLoginInfo());
//        assertNotNull(logonHelperThread.currentAuthToken);
//        assertEquals(userid, logonHelperThread.user);
//
//        logonHelperThread = startLoginToGoogleAppEngine(null, null, source);
//        logonHelperThread.stopLogon();
//        assertNull(logonHelperThread.currentAuthToken);
//    }

    /**
     * Test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} with
     * userid = null and password = null.
     */
    public void testLoginToGoogleAppEngineNullPasswordNull() throws Exception {
        String userid = "example.org/app";
        String source = "Test Test";
        String aclstring = "private";
        String aclhash = "1b4d56478f2da4e7f914b7c3a45bcc1e";

        logonHelperThread = startLoginToGoogleAppEngine(userid, password, source);
        assertNotNull(logonHelperThread);
        assertNotNull(logonHelperThread.getLoginInfo());
        assertNotNull(logonHelperThread.currentAuthToken);
        assertEquals(userid, logonHelperThread.user);
        assertEquals(aclstring, logonHelperThread.aclstring);
        assertEquals(aclhash, logonHelperThread.aclhash);
        assertEquals(userid, logonHelperThread.currentAuthToken.getUserId());
    }

    /**
     * Test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} with
     * userid = null and password = null and source = "Test Test".
     */
    public void testLoginToGoogleAppEngineNullPasswordNullAndSource() throws Exception {
        String userid = "example.org/app";
        String password = null;
        String source = "Test Test";
        String aclstring = "private";
        String aclhash = "1b4d56478f2da4e7f914b7c3a45bcc1e";

        logonHelperThread = startLoginToGoogleAppEngine(userid, password, source);
        assertNotNull(logonHelperThread);
        assertNotNull(logonHelperThread.getLoginInfo());
        assertNotNull(logonHelperThread.currentAuthToken);
        assertEquals(userid, logonHelperThread.user);
        assertEquals(aclstring, logonHelperThread.aclstring);
        assertEquals(aclhash, logonHelperThread.aclhash);
        assertEquals(userid, logonHelperThread.currentAuthToken.getUserId());
    }

    @Test
    void testLoginToGoogleAppEngineSuccess() throws Exception {
        String userid = "example.org/app";
        String password = "password";
        String source = "Test Test";
}
}