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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {

		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction2() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new Get(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction3() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction4() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new Get(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction5() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction6() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new Get(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction7() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction8() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new Get(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction9() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction10() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new Get(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
}

// HttpBot_2Test.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_2Test {
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction() throws IOException, ActionException, ProcessException {
				HttpBot bot = new HttpBot("http://www.google.com/");
				String result = bot.performAction(new GetPage(""));
				assertTrue(result.contains("<title>Google</title>"));
		}
		
		/**
		* Test