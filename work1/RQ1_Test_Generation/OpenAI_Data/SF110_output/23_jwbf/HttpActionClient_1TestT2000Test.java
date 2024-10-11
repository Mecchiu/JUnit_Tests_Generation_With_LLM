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
* It contains ten unit test cases for the {@link HttpActionClient#get(Get)} method.
*/
class HttpActionClient_1Test {

		private static final String TEST_URL = "http://localhost:8080/";
		
		private static final String TEST_URL_WITH_PATH = "http://localhost:8080/test/";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE = "http://localhost:8080/test/test.html";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM = "http://localhost:8080/test/test.html?test=test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT = "http://localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT = "http://localhost:8080/test/test.html#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT = "http://localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER = "http://user@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT_AND_HOST_AND_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_PORT_AND_USER_AND_PASSWORD_AND_PROTOCOL_AND_QUERY_AND_FRAGMENT = "http://user:password@localhost:8080/test/test.html?test=test#test";
		
		private static final String TEST_URL