// HttpBot_1Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
public static void main(String args[]) {
			// check Java version
			String javaVer = System.getProperty("java.version");
			String ver = javaVer.substring(javaVer.length() - 3, javaVer.length());
			if ("1.4".compareTo(ver) < 0) {
				throw new RuntimeException("Unsupported Java version: " + ver);
			}
			// System.out.println("Android: " + Build.MODEL);

		}

        @Test
        public void testActionHttpGet() throws MalformedURLException, ActionException, ReadAccessViolation,
                ProcessException, IOException, InterruptedException {
            String content = HttpBot.performAction(Get.get())
               .getContent();
            assertEquals("Hello World!", content);
        }

        @Test
        public void testActionHttpGetJson() throws MalformedURLException, ActionException, ReadAccessViolation,
                ProcessException, IOException, InterruptedException {
            String input = "This is an empty string";
            byte[] inputBytes = input.getBytes();
            ContentProcessable processedInput = new WebActionClient()
               .getString(content = Get.get(),
                    "application/x-www-form-urlencoded", "", "",
                    new RequestListener(inputBytes, input.length())
                );
            assertEquals("Hello World!" + input,
                HttpBot.performAction(GetPage.get()).getContent());
        }

        @Test
        public void testActionHttpGetGetUrl() throws MalformedURLException, ActionException, ReadAccessViolation,
                ProcessException, IOException, InterruptedException {
            // this url is used to test the get http
            // it just needs to match the hostname
            final String input = "http://localhost:1234/this_is_a_test";
            byte[] inputBytes = input.getBytes();
            ContentProcessable processedInput = new WebActionClient()
               .getString(content = Get.get(),
                    "application/x-www-form-urlencoded", "", "",
                    new RequestListener(inputBytes, input.length())
                );

            assertEquals("Hello World!",
                HttpBot.performAction(GetPage.get()).getContent());
        }

        @Test
        public void testActionHttpGetPostPost() throws MalformedURLException, ActionException, ReadAccessViolation,
                ProcessException, IOException, InterruptedException {
            final String content = Build.version() + "," + Build.platformSuffix() + "," + Build.machineSuffix();
            final byte[] inputBytes = content.getBytes();
            final URL url = new URL("http://localhost:1234/this_is_a_test");

            ContentProcessable processedInput = new WebActionClient()
               .post(new RequestListener(inputBytes, input.length(), url), content);
            assertEquals("Hello World",
                HttpBot.performAction(GetPage.get()).getContent());
        }

        class RequestListener implements ContentProcessable {

            final byte[] content;
            final long len;
            final URL url;
            final ContentProcessable contentProcessable;

            public RequestListener(byte[] content, long len, URL url) {
                this.content = content;
                this.len = len;
                this.url = url;
            }

            public RequestListener(byte[] content, long len, ContentProcessable contentProcessable) {
                this(content, len, null);
                this.contentProcessable = contentProcessable;
            }
			@Override
			public void processContent(String content) throws IOException,
                                          InterruptedException {
				if (contentProcessable!= null) {
				    contentProcessable.processContent(content);
				} else {
                	System.out.println("WARNING: ContentProcessable not found");
				}
			}

            @Override
            public void processContent(byte[] content, long len) throws IOException,
                                           InterruptedException {
                if (contentProcessable!= null) {
                	contentProcessable.processContent(content);
                } else {
                	// it seems, the page content can be read by different threads when
                	// it is a post/post request, but not in the case when a content processable
                	// is found
                	System.out.println("WARNING: ContentProcessable not found");
                }
			}

            // The url which was passed to the constructor
            // it contains the hostname + domain / path so
            // it should be checked
            @Override
            public void processUrl(String urlString) {
                // if urlString contains hostname, it should be checked
                if (urlString.contains("localhost:1234")) {
                    url = null;
                } else {
                    url = new URL(urlString);
                }
			}
        }
}
