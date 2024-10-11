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
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator2() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator3() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator4() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator5() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator6() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator7() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator8() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator9() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()} method.
		 * It tests if the iterator returns the correct number of log events.
		 */
		@Test
		void testIterator10() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				int count = 0;
				while (iterator.hasNext()) {
						iterator.next();
						count++;
				}
				assertEquals(10, count);
		}
}