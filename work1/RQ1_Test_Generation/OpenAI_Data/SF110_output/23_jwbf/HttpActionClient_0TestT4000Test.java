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
* It contains ten unit test cases for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {

		private static final String TEST_URL = "http://localhost/";
		
		private static final String TEST_URL_WITH_PATH = "http://localhost/path/";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE = "http://localhost/path/file.html";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM = "http://localhost/path/file.html?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR = "http://localhost/path/file.html?param=value#anchor";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR = "http://localhost/path/file.html#anchor";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT = "http://localhost/path/file.html?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_PARAM_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value?param=value";
		
		private static final String TEST_URL_WITH_PATH_AND_FILE_AND_ANCHOR_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT_AND_FRAGMENT = "http://localhost/path/file.html#anchor?param=value?param=value?param=value?param=value?param=value?param=value?param=