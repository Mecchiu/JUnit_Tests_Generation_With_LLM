// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {

	@Test
	void testSetHeaders() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers.length, 10);
	}
}

// HttpAnalyzer.java
package httpanalyzer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author vlad
 */
public class HttpAnalyzer {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.google.com/search?q=httpclient";
    private static final String GET_URL_PARAM_KEY = "q";
    private static final String GET_URL_PARAM_VALUE = "httpclient";

    public static void main(String[] args) throws IOException, URISyntaxException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpRequestBase request = new HttpGet(GET_URL);
        request.setHeader("User-Agent", USER_AGENT);
        HttpResponse response = client.execute(request);
        System.out.println("GET Response Status:: "
                + response.getStatusLine().getStatusCode());
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        System.out.println("Response String: " + responseString);
        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
            System.out.println("Key : " + header.getName()
                    + " ,Value : " + header.getValue());
        }
    }
}

// HttpAnalyzerTest.java
package httpanalyzer;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzer}.
* It contains ten unit test cases for the {@link HttpAnalyzer#main(String[])} method.
*/
class HttpAnalyzerTest {
		
	@Test
	void testMain() throws IOException, URISyntaxException {
		HttpClientBuilder.create().build();
		HttpRequestBase request = new HttpGet(HttpAnalyzer.GET_URL);
		request.setHeader("User-Agent", HttpAnalyzer.USER_AGENT);
		HttpResponse response = HttpClientBuilder.create().build().execute(request);
		assertEquals(response.getStatusLine().getStatusCode(), 200);
		Header[] headers = response.getAllHeaders();
		assertEquals(headers.length, 10);
	}
}

// HttpClientBuilder.java
package httpanalyzer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author vlad
 */
public class HttpClientBuilder {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.google.com/search?q=httpclient";
    private static final String GET_URL_PARAM_KEY = "q";
    private static final String GET_URL_PARAM_VALUE = "httpclient";

    public static void main(String[] args) throws IOException, URISyntaxException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpRequestBase request = new HttpGet(GET_URL);
        request.setHeader("User-Agent", USER_AGENT);
        HttpResponse response = client.execute(request);
        System.out.println("GET Response Status:: "
                + response.getStatusLine().getStatusCode());
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        System.out.println("Response String: " + responseString);
        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
            System.out.println("Key : " + header.getName()
                    + " ,Value : " + header.getValue());
        }
    }
}

// HttpClientBuilderTest.java
package httpanalyzer;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpClientBuilder}.
* It contains ten unit test cases for the {@link HttpClientBuilder#main(String[])} method.
*/
class HttpClientBuilderTest {
		
	@Test
	void testMain() throws IOException, URISyntaxException {
		HttpClientBuilder.create().build();
		HttpRequestBase request = new HttpGet(HttpClientBuilder.GET_URL);
		request.setHeader("User-Agent", HttpClientBuilder.USER_AGENT);
		HttpResponse response = HttpClientBuilder.create().build().execute(request);
		assertEquals(response.getStatusLine().getStatusCode(), 200);
		Header[] headers = response.getAllHeaders();
		assertEquals(headers.length, 10);
	}
}

// HttpGet.java
package httpanalyzer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author vlad
 */
public class HttpGet {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.google.com/search?q=httpclient";
    private static