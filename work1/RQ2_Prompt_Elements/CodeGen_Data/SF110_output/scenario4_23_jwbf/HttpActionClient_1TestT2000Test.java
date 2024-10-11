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
/**
		* Test method for {@link net.sourceforge.jwbf.core.actions.HttpActionClient#performAction(net.sourceforge.jwbf.core.actions.ContentProcessable)</tt>.
		*/
		@Test
		public void testPerformAction() throws IOException, ActionException, ProcessException {
            Action action = new HttpAction();
			final HttpUriRequest request = action.newRequest();
            Map<String, String> headers = new HashMap<>();

            prepareCookie("/my/cookie", "/my/cookie");
            action.performAction(request, contentProcessable -> {
                    if (!processed(request, contentProcessable)) {
                        return;
                    }
                    prepareHeaders(request.getFirstHeader("User-Agent").getValue());
                    prepareCookie("/my/another/cookie", "/my/another/cookie");
                    prepareCookie("/my/cwe", "/my/cwe");
                    prepareCookie("/my/anothercookie", "/my/anothercookie");
                    return done(request, null, contentProcessable);
            });

		}
    }
}
