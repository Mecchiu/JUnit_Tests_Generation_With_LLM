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
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new GetPage("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_2() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_3() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_4() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_5() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_6() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_7() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_8() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_9() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_10() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
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
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new GetPage("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_2() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_3() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_4() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_5() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_6() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_7() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_8() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_9() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String result = bot.performAction(action);
				
				assertNotNull(result);
				
		}
		
		/**
		* Test method for {@link HttpBot#performAction(ContentProcessable)}.
		* @throws IOException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testPerformAction_10() throws IOException, ActionException, ProcessException {
				
				HttpBot bot = new HttpBot("http://www.google.com");
				
				ContentProcessable action = new Get("http://www.google.com");
				
				String