// LogEvents_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_1Test {

		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext2() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext3() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext4() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext5() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext6() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext7() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext8() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext9() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
		/**
		 * Test method for {@link LogEvents#hasNext()}.
		 * @throws VersionException 
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testHasNext10() throws VersionException, JDOMException, IOException, ActionException, ProcessException {
			
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
			LogEvents logEvents = new LogEvents(bot, "upload");
			
			assertTrue(logEvents.hasNext());
			
		}
		
}

// LogEvents_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1