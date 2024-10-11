// HttpActionClient_1Test.java
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
* It contains one unit test case for the {@link HttpActionClient#get(Get)} method.
*/
class HttpActionClient_1Test {
/*
		 * Test class where the default request is read-only from the get(action) method.
        */
    @Test
    public void testGetReadOnlyAction() throws IOException, CookieException, ClientProtocolException, ProcessException {
        HttpGet get = new HttpGet(new URL(JWBF.URL.concat("/action")));
        byte[] aResponse = get.getEntity().getContent();
        assertArrayEquals(aResponse, getAction());
    }

    /*
        * Test class where the content of the get(action) method is read-write.
        */
    @Test
    public void testGetWriteReadAction() throws IOException, CookieException, ClientProtocolException, ProcessException {
        HttpGet get = new HttpGet(new URL(JWBF.URL.concat("/action")));
        get.setHeader("Cookie", "jwbf_action=1234567890");
        byte[] aResponse = getAction().getBytes();
        assertArrayEquals(aResponse, getAction());
    }
    /*
        * Test class where the content of the get(action) method is read-write.
        */
    @Test
    public void testGetReadWriteAction() throws IOException, CookieException, ClientProtocolException, ProcessException {
        HttpGet get = new HttpGet(new URL(JWBF.URL.concat("/action")));
        get.setHeader("Cookie", "jwbf_action=1234567890");
        get.setEntity(new StringBody("this is written, body content!"));
        byte[] aResponse = getAction().getBytes();
        assertArrayEquals(aResponse, getAction());
    }
    /**
    * Test class where the content of the action is read-once.
    */
    private byte[] getAction() throws HttpStatusException, ClientProtocolException, IOException {
        String[] arg = new String[]{
                "action=1234567890"
            };
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(JWBF.URL.concat("/action"));
        get.setHeader("Cookie", "jwbf_action=" + arg[0]);
        setKeepAliveParams(get);

        setRequestHeaders(get.getRequestHeaders(), arg[0]);
        getAction(get, client);
        setRequestHeaders(get.getRequestHeaders(), null);
        return get.getEntity().getContent();
    }
    /**
    * Set request headers.
    *
    * If there are no parameter named jwbf_action, then this method checks if
    * {@link ActionException} is in thrown. If it is found, the
    * {@link ActionException#setRequestHeaders} method is called with the parameters
    * set by the first parameter and returns the argument as the second argument.
    *
    *
    *
    * @param headers HTTP Header Map
    * @param action Action name
    * @param request HTTP request object
    */
    public void setRequestHeaders(Map<String, String> headers, String action) {
        if (headers == null) {
            throw new ActionException("There is no Action Object to set request headers");
        } else {
            for (String name: headers.keySet()) {
                action = name + "=" + action;
                System.out.println("Putting: " + name + "=" + headers.get(name));
                getRequestHeaders(headers, name);
            }
            System.out.println(action);
        }
    }
    /**
    * Set request headers.
    *
    * If there are no parameter named jwbf_action, then this method checks if
    * {@link ActionException