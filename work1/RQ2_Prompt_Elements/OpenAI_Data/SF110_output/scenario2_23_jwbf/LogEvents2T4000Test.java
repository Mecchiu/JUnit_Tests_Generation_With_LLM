// LogEventsTest.java
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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEventsTest {

		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testIteratorNotLoggedIn10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertThrows(ActionException.class, () -> {
						logEvents.iterator();
				});
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testIteratorLoggedIn10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/api.php");
				bot.login("username", "password");
				LogEvents logEvents = new LogEvents(bot, "", "", "", "", "", "", "");
				assertNotNull(logEvents.iterator());
		}
}