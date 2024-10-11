// HttpActionClientTest.java
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
class HttpActionClientTest {

		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object is null.
		* It is expected that an {@link IllegalArgumentException} is thrown.
		*/
		@Test
		void testPerformAction_NullContentProcessable() {
				HttpActionClient httpActionClient = new HttpActionClient();
				assertThrows(IllegalArgumentException.class, () -> {
						httpActionClient.performAction(null);
				});
		}
		
		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object has no more messages.
		* It is expected that an empty string is returned.
		*/
		@Test
		void testPerformAction_NoMoreMessages() {
				HttpActionClient httpActionClient = new HttpActionClient();
				ContentProcessable contentProcessable = new ContentProcessable() {
						@Override
						public boolean hasMoreMessages() {
								return false;
						}
						
						@Override
						public HttpAction getNextMessage() {
								return null;
						}
						
						@Override
						public void processReturningText(String s, HttpAction ha) {
						}
				};
				assertEquals("", httpActionClient.performAction(contentProcessable));
		}
		
		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object has more messages.
		* It is expected that an {@link IllegalArgumentException} is thrown.
		*/
		@Test
		void testPerformAction_HasMoreMessages() {
				HttpActionClient httpActionClient = new HttpActionClient();
				ContentProcessable contentProcessable = new ContentProcessable() {
						@Override
						public boolean hasMoreMessages() {
								return true;
						}
						
						@Override
						public HttpAction getNextMessage() {
								return null;
						}
						
						@Override
						public void processReturningText(String s, HttpAction ha) {
						}
				};
				assertThrows(IllegalArgumentException.class, () -> {
						httpActionClient.performAction(contentProcessable);
				});
		}
		
		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object has more messages and the {@link HttpAction} object is null.
		* It is expected that an {@link IllegalArgumentException} is thrown.
		*/
		@Test
		void testPerformAction_HasMoreMessages_NullHttpAction() {
				HttpActionClient httpActionClient = new HttpActionClient();
				ContentProcessable contentProcessable = new ContentProcessable() {
						@Override
						public boolean hasMoreMessages() {
								return true;
						}
						
						@Override
						public HttpAction getNextMessage() {
								return null;
						}
						
						@Override
						public void processReturningText(String s, HttpAction ha) {
						}
				};
				assertThrows(IllegalArgumentException.class, () -> {
						httpActionClient.performAction(contentProcessable);
				});
		}
		
		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object has more messages and the {@link HttpAction} object is not null.
		* It is expected that an {@link IllegalArgumentException} is thrown.
		*/
		@Test
		void testPerformAction_HasMoreMessages_NotNullHttpAction() {
				HttpActionClient httpActionClient = new HttpActionClient();
				ContentProcessable contentProcessable = new ContentProcessable() {
						@Override
						public boolean hasMoreMessages() {
								return true;
						}
						
						@Override
						public HttpAction getNextMessage() {
								return new HttpAction() {
										@Override
										public String getRequest() {
												return "";
										}
										
										@Override
										public Map<String, String> getParams() {
												return new HashMap<>();
										}
										
										@Override
										public Map<String, String> getFiles() {
												return new HashMap<>();
										}
								};
						}
						
						@Override
						public void processReturningText(String s, HttpAction ha) {
						}
				};
				assertThrows(IllegalArgumentException.class, () -> {
						httpActionClient.performAction(contentProcessable);
				});
		}
		
		/**
		* Test case for {@link HttpActionClient#performAction(ContentProcessable)} method.
		* It tests the case when the {@link ContentProcessable} object has more messages and the {@link HttpAction} object is not null.
		* It is expected that an {@link IllegalArgumentException} is thrown.
		*/
		@Test
		void testPerformAction_HasMoreMessages_NotNullHttpAction_Get() {
				HttpActionClient httpActionClient = new HttpActionClient();
				ContentProcessable contentProcessable = new ContentProcessable() {
						@Override
						public boolean hasMoreMessages() {
								return true;
						}
						
						@Override
						public HttpAction getNextMessage() {
								return new Get() {
										@Override
										public String getRequest() {
			