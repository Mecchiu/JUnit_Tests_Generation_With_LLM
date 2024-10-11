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
// LogonHelper.java
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

/**
 * Google login helper.
 *
 * Based on work of Cheers Geoff.
 *
 * http://groups.google.com/group/google-appengine
 * -java/browse_thread/thread/c96d4fff73117e1d?pli=1
 *
 * @author Alois Belaska
 */
public class LogonHelper {

    /**
     * Returns the ACSID string to be set as the Cookie field in the request
     * header.
     *
     * @param userid
     *            full gmail address for user
     * @param password
     *            password
     * @param source
     *            name of application requesting quota details
     * @return the ACSID field value
     * @throws Exception
     *             if any error occurs getting the ACSID
     */
    public static String loginToGoogleAppEngine(String userid, String password, String source) throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
            nvps.add(new BasicNameValuePair("Email", userid));
            nvps.add(new BasicNameValuePair("Passwd", password));
            nvps.add(new BasicNameValuePair("service", "ah"));
            nvps.add(new BasicNameValuePair("source", source));
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
            post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            HttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode()!= 200) {
                throw new Exception("Error obtaining ACSID");
            }
            String authToken = getAuthToken(response.getEntity().getContent());
            post.abort();
            HttpGet get = new HttpGet("https://appengine.google.com/_ah/login?auth=" + authToken);
            response = client.execute(get);
            for (Cookie cookie : client.getCookieStore().getCookies()) {
                if (cookie.getName().startsWith("ACSID")) {
                    return cookie.getValue();
                }
            }
            get.abort();
            throw new Exception("Did not find ACSID cookie");
        } finally {
            client.getConnectionManager().shutdown();
        }
    }

    private static String getAuthToken(InputStream inputStream) throws Exception {
        LineNumberReader reader = new LineNumberReader(new BufferedReader(new InputStreamReader(inputStream)));
        String line = reader.readLine();
        while (line!= null) {
            line = line.trim();
            if (line.startsWith("Auth=")) {
                return line.substring(5);
            }
            line = reader.readLine();
        }
        throw new Exception("Could not find Auth token");
    }

    private LogonHelper() {
    }
}

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
		
    @Test
    void loginToGoogleAppEngine() throws Exception {
        String userid = "admin@admin.com";
        String password = "password";
        String source = "Google App";
        String acsilogon = "ACS_SIGNATURE";
        String return_url = "http://example.com/ret";
        String access_granted_url = "http://example.com/test_url";
        String acs_signature = "ACS_SIGNATURE";
        String acs_credentials = "ACS_CREDENTIALS";
        String acs_scope = "ACS_SCOPE";
        String acs_ex = "ACS_EX";
        String acs_version = "ACS_VERSION";
        String acs_retries = "ACS_RETRIES";
        String acs_duration = "ACS_DURATION";
        String acs_dnd = "ACS_DND";
        String acs_cid = "ACS_CID";
        String acs_client_version = "ClientVersion";
        String acs_client_key = "Client_Key";
        String acs_id = "AG_ID";
        LogonHelper.LogonHelper.logonToGoogleAppEngine(userid, password, source);

        // Verify client_id and acs_cid values

        verifyFields("acs_cid", 2, "AG_ID", 3, "ClientID");
        verifyFields("acs_credentials", 8, "ACS_CREDENTIALS", "AUTH_TOKEN_CLIENT", "CLIENT_TOKEN_KEY");

        // Verify ACS key (AKA user@google.com)
        verifyKey("ACS_KEY", 8, "AUTH_TOKEN_CLIENT", "ACS_CREDENTIALS", "AUTH_TOKEN_USER");

        // Verify ACS signature
        verifySignature("ACS_SIGNATURE");



        // Verify return URL (AKA gmail.com/ret)
        verifyUrl("returnUrl", return_url, "http://example.com/ret");

//      System.out.println(acs_credentials);
        assertNotNull(acs_credentials);

        // Verify acs_scope
        verifyScope("acs_scope");
        assertNotNull(acs_scope);

        // Verify acs_ex
        verifyEx("acs_ex", 7);
        assertNotNull(acs_ex);

        // Verify acs_dnd
        verifyDnd("acs_dnd", 10, 10);
        assertNotNull(acs_dnd);

        // Verify acs_client_ex
        verifyClientEx("acs_ex", 10, 10);
        assertNotNull(acs_ex);
        assertNotNull(acs_ex);
        assertEquals("10", acs_ex);
        assertNotNull(acs_cid);
        assertNotNull(acs_client_version);
        assertNotNull(acs_client_key);

        // Verify acs_client_cid
        verifyClientCID("ACS_CID", 0, 20);
        assertNotNull(acs_cid);

        // Verify acs_client_ver
        verifyClientVer("ACS_CLIENT", 3, 4, 3