// HttpActionClient_0Test.java
package net.sourceforge.jwbf.core.actions;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.JWBF;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.CookieException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpActionClient}.
* It contains one unit test case for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {

}

// HttpActionClient_1.java
// This test was generated from a file../httpactionclient/test.xml


@SuppressWarnings("javadoc")
public final class HttpActionClient_1 implements HttpActionClient {

    @Override
    public Map<String, String> getDefaultHeaderValues() {
        return null;
    }

    @Override
    public Class<ContentProcessable> getProcessable() {
        return ContentProcessable.class;
    }

    @Override
    public String performServiceContent() throws ActionException {
        return performAction(processable);
    }

    @Override
    public Map<String, String> additionalHeaderValues() {
        return null;
    }

    @Override
	public Map<String, String> getAllHeaderValues() {
	    return null;
	}

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public Map<String, String> getHeaderValues(String header) {
        return null;
    }

    @Override
    public Map<String, String> getHeaderValues(char header) {
        return null;
    }

    @Override
    public String getHeaderValue(String header) {
        return null;
    }

    @Override
    public String getHeaderValue(char header) {
        return null;
    }

    @Override
    public String getHeaderValue(String key, String value) {
        return null;
    }

    @Override
    public List<Cookie> getCookies(String header) {
        return null;
    }

    @Override
    public List<Cookie> getCookies() {
        return null;
    }

    @Override
    public String getQueryParams() {
        return null;
    }

    @Override
    public List<String> getQueryParamsAsList() {
        return null;
    }

    @Override
    public List<String> getQueryParamsAsMap() {
        return null;
    }

    @Override
    public List<Character> getParameterValues(String parameter) {
        return null;
    }

    @Override
    public List<Character> getParameterValues(char parameter) {
        return null;
    }

    @Override
    public Map<String, String> getParameterHeaders(String parameter) {
        return null;
    }

    @Override
    public Map<