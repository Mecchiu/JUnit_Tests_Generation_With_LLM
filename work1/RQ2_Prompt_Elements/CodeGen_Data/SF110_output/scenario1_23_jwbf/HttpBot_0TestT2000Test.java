// HttpBot_0Test.java
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
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
HttpBot url=new HttpBot(new URL("http://localhost:80"));
		URL urlRef=url.getUrl();
        
		/**
		 * test of the getInstance method.
		 */
		@Test
		public void testGetInstance() throws MalformedURLException {
				assertNotNull(getInstance());
		}
		/**
		 * test of the getClass method.
		 */
		@Test
		public void testGetClass() {
				assertEquals(HttpBot.class, getInstance().getClass());
		}
        /**
		* test of the getActionClient method.
		*/
        @Test
		public void testGetActionClient() {
				assertNotNull(url.getActionClient());
		}
		/**
		* test of ContentProcessable interface.
		*/
        @Test
		public void testGetContentProcessable() {
				assertNotNull(getContentProcessable());
		}
        /**
		* test of IContentProcessable interface.
		*/
        @Test
		public void testInit() {
				assertNull(url.getContentProcessable());
		}
		/**
		* test of ContentProcessable interface.
		*/
        @Test
		public void testProcess() throws ActionException {
				ContentProcessable processable=getActionClient();
				assertNotNull(Processable.toProcessable(processable));
		}
        /**
		* test of ProcessException interface.
		*/
        @Test
		public void testProcessException() {
				//should return ActionException.EXAMPLE
				ActionException ex=new ActionException(new Page(-1, -1),
							new Error("an error message", -1));
				assertEquals(ActionException.EXAMPLE, ex);
		}
        /**
		* test of ActionException interface.
		*/
        @Test
		public void testProcessException2() {
				//should return ActionException.EXAMPLE
				ActionException ex=new ActionException(new Page(-1, -1),
							new Error("an error message", -1));
				assertEquals(ActionException.EXAMPLE, ex);
		}
        /**
		* test of ProcessException interface.
		*/
        @Test
		public void testProcessException3() {
				//should return HttpActionClient.EX_ACCESS_DENIED
				HttpActionClient.exception("an error message", new Error("an error message", -1));
				ActionException ex=new ActionException(new Page(-1, -1),
							new Error("an error message", -1));
				assertEquals(HttpActionClient.EX_ACCESS_DENIED, ex);
		}
        /**
		* test of ProcessException interface.
		*/
        @Test
		public void testProcessException4() {
				//should return NullPointerException
				HttpActionClient.exception("an error message", new Error("an error message", -1));
				ActionException ex=new ActionException();
				assertEquals(ActionException.EXAMPLE, ex);
		}
        /**
		* test of ProcessException interface.
		*/
        @Test
		public void testProcessException5() {
				//should return IOException
				Error error=new Error("an error message", -1);
				HttpActionClient.exception("an error message", error);
				ActionException ex=new ActionException();
				assertEquals(ActionException.EXAMPLE, ex);
		}
}
