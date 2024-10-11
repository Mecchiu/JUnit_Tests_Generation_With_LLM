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
		
	private static String credentials;

	private static String token;
	
	private static DefaultHttpClient httpClient = new DefaultHttpClient();
	
	
	@Test
	@Parameters(
		{"username", "password", "destination", "source"}
	)
	void loginToGoogleAppEngine(String username, String password, String dest, String source) throws Exception {
		httpClient.getParams().setParameter(HTTPConnectionParams.CONNECTION_PROXY_AUTH, "true");
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("username", username));
		params.add(new BasicNameValuePair("password", password));
		params.add(new BasicNameValuePair("destination", dest));
		params.add(new BasicNameValuePair("destination", source));
		headersToPost(source, params);
		URL url = new URL("http://cloud-pushservice.appengine.google.com/login");
		List<String> cookies = new ArrayList<>();
		if (System.getenv("GOOGLE_APPLICATION_CREDENTIALS")!= null) {
			credentials = System.getenv("GOOGLE_APPLICATION_CREDENTIALS");
			if (credentials == null) {
				throw new IllegalStateException("Could't get GOOGLE_APPLICATION_CREDENTIALS environment variable");
			}
			if (credentials.equals("{}")) {
				throw new IllegalStateException("GOOGLE_APPLICATION_CREDENTIALS must not be '{}' (or is empty)");
			}
			String decodedCredentials = new String(credentials.getBytes(), HTTP.GZIP.length(), HTTP.GZIP.length());
			String encoded = encodeCredentials(Decoder.HEX_COMMENT, decodedCredentials);
			params.clear();
			params.add(new BasicNameValuePair("g", encoded));
			params.add(new BasicNameValuePair("c", "1"));
			headersToPost(source, params);
		}
		headersToPost(source, params);
		httpClient.getParams().setParameter(HTTPConnectionParams.USER_AGENT, "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2171.71 Safari/537.36");
		URL encodedUrl = new URL(url.toString() + httpClient.getParams().getParameter(HTTPConnectionParams.ACCEPT_ENCODING) + https?
			"https" : "http", null, encodedUrl.toString());
		httpGet(encodedUrl);
	}
	
	private static HttpGet httpGet(final String encodedUrl) {
		return new HttpGet(encodedUrl);
	}
	
	private static void headersToPost(String source, final List<NameValuePair> params) throws Exception {
		httpPostPost(source, new BasicNameValuePair("g", "1"), params);
	}
	
	private static void httpPostPost(String encodedUrl, NameValuePair g, NameValuePair C, final List<NameValuePair> params) throws Exception {
		if (params.isEmpty()) {
			httpPostPost("https://cloud-pushservice.appengine.google.com", g, C, null);
			return;
		}
		StringBuilder httpPostBody = new StringBuilder();
		for (NameValuePair o : params) {
			httpPostBody.append(o.getName()).append("=").append(o.getValue()).append(",");
		}
		int index = httpPostBody.toString().lastIndexOf("=");
		httpPostBody.deleteCharAt(index - 1);
		httpPostBody.insert(index, ",&");
		params.stream().skip(params.size()).findFirst().ifPresent(s -> httpPostBody.append(s.getName()).append("=\"").append(s.getValue()).append("\""));
		String httpPostUrl = "https://cloud-pushservice.appengine.google.com";
		httpPostUrl = httpPostUrl + "?" + httpPostBody.toString();
		final HttpPost httpPost = new HttpPost(httpPostUrl);
		final Iterable<NameValuePair> entity = new UrlEncodedFormEntity(httpPostBody.toString(), HTTP.GZIP);
		httpPost.setEntity(entity);
		httpPost.getParams().setParameter(HTTPConnectionParams.USER_AGENT, "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2171.71 Safari/537.36");
		for (int i=0;i<params.size();i++) {
			httpPost.addHeader(params.get(i).getName(), params.get(i).getValue());
		}
		try (InputStream in = httpPost.getEntity().getContent()) {
			httpGet(encodedUrl);
		}
	}

	private static String encodeCredentials(String comment, String encoded) {
		String encodedCredentials = null;
}
}