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
	void testLoginToGoogleAppEngine() throws Exception {
    	
		HttpClient httpClient = new DefaultHttpClient();
		Cookie[] cookies = httpClient.getCookieStore().getCookie(null);
		
		List<Cookie> listCookie = new ArrayList<Cookie>();
		for(Cookie c : cookies){
			listCookie.add(c);
		}

        String email = "doe-@gamelist.com";
		Cookie cookie = new Cookie("gmail.id", email);
        listCookie.add(cookie);

        HttpGet method = new HttpGet("https://xkcdg.google.com/images/src/main/images/logo.png");
        method.setHeader("User-Agent", "Mozilla/5.0");

        HttpResponse response = httpClient.execute(method);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
    
        StringBuilder sb = new StringBuilder();
        String line;
    
    
        while ((line = reader.readLine())!= null) {
 
            sb.append(line);
            sb.append("\n");
        }

        //assert sb.toString().contains("email");

        List<NameValuePair> paramsList = new ArrayList();
        paramsList.add(new BasicNameValuePair(EmailHeader, email));
        String result = httpClient.execute(MethodType.POST, url(false), paramsList);
			
        String[] resultTokens = result.split("\n");
        List<String> resultList = new ArrayList<String>();
		for (String temp : resultTokens) {
			String[] resultArr = temp.split("[=;]");
			resultList.add(resultArr[0]);
		}
        
        List<LogonException> exceptionDetailList = new ArrayList<LogonException>();
        List<String> tokenList= null;
}
}