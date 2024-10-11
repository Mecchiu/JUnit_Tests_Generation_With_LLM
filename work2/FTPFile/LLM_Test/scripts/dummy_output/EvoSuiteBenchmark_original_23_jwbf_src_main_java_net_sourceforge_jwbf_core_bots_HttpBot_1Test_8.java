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
		static final String URL =
				"http://www.mywap.de/?action=action&"
				+"title=News&version=0.1.0";
		String url;

		void createURLURL(){
			httpAction(GET);
			url = "http://www.mywap.de/?action=" + getUrl();
		}
		static void httpAction(GetPage goTo, ContentProcessable p) throws MalformedURLException{
			httpActionClient("GET", goTo, p);
			//throw p.getException();
		}
		static void httpAction(GetPage goTo, ContentProcessable p) throws IOException{
			httpActionClient("GET", goTo, p);
		}
		static void httpActionClient(ContentProcessable action, GetPage goTo, ContentProcessable p) throws MalformedURLException, IOException, ActionException{
			cc = new HttpActionClient(action, new URL(URL));
			cc.performAction();
			URL got = cc.getURL();
			if (got == null)
				throw new ActionException(p, "Cannot get target url");
			else  {
			  assertEquals(URL, got);
			}
		}
		static void goToAndTest(String method, String url) throws MalformedURLException, MalformedURLException, ActionException, IOException{
			String url_url2 = "http://www.mywap.de/index.php?"
					+ "action=" + method
					+ "&title="
					+ "Main&version="
					+ "0.1.0";
			GetPage goTo = new Get(url_url2);
			ContentProcessable p = new ContentProcessable();
			goToAndTest(p, goTo);

		}
		static void goToAndTest(ContentProcessable p, String url_to) throws MalformedURLException, MalformedURLException, ActionException, IOException{
			doTestCase(url_to, false, p);
		}
		void doTestCase(String url_to, boolean isGet, ContentProcessable p){
			//System.out.println("URL = " + url_to);
			//System.out.println("to = " + isGet);
			if (isGet)
				createURLURL();
			try {
				assertNotNull(getPage(url_to));
			} catch (ActionException ae) {
				throw ae;
			}
			String s = getPage(url_to).toString();
			//System.out.println("Got content:\n" + s);
			assertNotNull(s);
		}

}