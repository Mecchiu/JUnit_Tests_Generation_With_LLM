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
* It contains ten unit test cases for the {@link LogEvents#next()} method.
*/
class LogEventsTest {

		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext2() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext3() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext4() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext5() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext6() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext7() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, nextLogItem);
				
		}
		
		/**
		 * Test case for {@link LogEvents#next()} method.
		 * It tests if the {@link LogEvents#next()} method returns the correct log item.
		 */
		@Test
		void testNext8() {
				
				// Create a new LogEvents object
				LogEvents logEvents = new LogEvents();
				
				// Create a new LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log item's attributes
				logItem.setAction("delete");
				logItem.setComment("test");
				logItem.setLogid(1);
				logItem.setLogtype("delete");
				logItem.setLogaction("delete");
				logItem.setLogparams("test");
				logItem.setNamespace(0);
				logItem.setPage("test");
				logItem.setTimestamp("2019-01-01T00:00:00Z");
				logItem.setTitle("test");
				logItem.setType("delete");
				logItem.setUser("test");
				
				// Create a new Vector object
				Vector<LogItem> logItems = new Vector<LogItem>();
				
				// Add the log item to the Vector object
				logItems.add(logItem);
				
				// Set the LogEvents object's logItems attribute
				logEvents.logItems = logItems;
				
				// Get the next log item
				LogItem nextLogItem = logEvents.next();
				
				// Check if the next log item is the same as the log item
				assertEquals(logItem, next