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
        HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("Email", userid));
        nameValuePairs.add(new BasicNameValuePair("Passwd", password));
        nameValuePairs.add(new BasicNameValuePair("service", "ah"));
        nameValuePairs.add(new BasicNameValuePair("source", source));
        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse response = client.execute(post);
        InputStream inputStream = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        String authToken = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Auth=")) {
                authToken = line.substring(5);
            }
        }
        reader.close();
        inputStream.close();
        return authToken;
    }

    private static String getAuthToken(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        String authToken = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Auth=")) {
                authToken = line.substring(5);
            }
        }
        reader.close();
        inputStream.close();
        return authToken;
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
* It contains ten unit test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {
    
    @Test
    void testLoginToGoogleAppEngineWithValidCredentials() throws Exception {
        String authToken = LogonHelper.loginToGoogleAppEngine("validuser@gmail.com", "validpassword", "validsource");
        assertNotNull(authToken);
    }
    
    @Test
    void testLoginToGoogleAppEngineWithInvalidCredentials() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("invaliduser@gmail.com", "invalidpassword", "validsource");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithEmptyUserId() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("", "validpassword", "validsource");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithEmptyPassword() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("validuser@gmail.com", "", "validsource");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithEmptySource() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("validuser@gmail.com", "validpassword", "");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithNullUserId() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine(null, "validpassword", "validsource");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithNullPassword() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("validuser@gmail.com", null, "validsource");
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithNullSource() {
        assertThrows(Exception.class, () -> {
            LogonHelper.loginToGoogleAppEngine("validuser@gmail.com", "validpassword", null);
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithInvalidUrl() {
        assertThrows(Exception.class, () -> {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLoginInvalid");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("Email", "validuser@gmail.com"));
            nameValuePairs.add(new BasicNameValuePair("Passwd", "validpassword"));
            nameValuePairs.add(new BasicNameValuePair("service", "ah"));
            nameValuePairs.add(new BasicNameValuePair("source", "validsource"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = client.execute(post);
            InputStream inputStream = response.getEntity().getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            String authToken = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Auth=")) {
                    authToken = line.substring(5);
                }
            }
            reader.close();
            inputStream.close();
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithNullResponse() {
        assertThrows(Exception.class, () -> {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("Email", "validuser@gmail.com"));
            nameValuePairs.add(new BasicNameValuePair("Passwd", "validpassword"));
            nameValuePairs.add(new BasicNameValuePair("service", "ah"));
            nameValuePairs.add(new BasicNameValuePair("source", "validsource"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = null;
            InputStream inputStream = response.getEntity().getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            String authToken = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Auth=")) {
                    authToken = line.substring(5);
                }
            }
            reader.close();
            inputStream.close();
        });
    }
    
    @Test
    void testLoginToGoogleAppEngineWithNullInputStream() {
        assertThrows(Exception.class, () -> {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("Email", "validuser@gmail.com"));
            nameValuePairs.add(new BasicNameValuePair("Passwd", "validpassword"));
            nameValuePairs.add(new BasicNameValuePair("service", "ah"));
            nameValuePairs.add(new BasicNameValuePair("source", "validsource"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = client.execute(post);
            InputStream inputStream = null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            String authToken = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Auth=")) {
                    authToken = line.substring(5);
                }
            }
            reader.close();
            inputStream.close();
        });
    }
}