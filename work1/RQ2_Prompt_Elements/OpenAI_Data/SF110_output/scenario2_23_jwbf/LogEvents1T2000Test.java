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
		* It tests the case when the next log event is a block log event.
		*/
		@Test
		void testNext_BlockLogEvent() {
				
				// Create a mock MediaWikiBot object
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
				
				// Create a mock LogEvents object
				LogEvents logEvents = new LogEvents(bot);
				
				// Create a mock LogItem object
				LogItem logItem = new LogItem();
				
				// Set the log type of the mock LogItem object
				logItem.setLogType("block");
				
				// Set the log action of the mock LogItem object
				logItem.setLogAction("block");
				
				// Set the log action comment of the mock LogItem object
				logItem.setLogActionComment("blocked User:Test with an expiry time of indefinite (account creation disabled)");
				
				// Set the log timestamp of the mock LogItem object
				logItem.setLogTimestamp("2019-01-01T00:00:00Z");
				
				// Set the log user of the mock LogItem object
				logItem.setLogUser("Test");
				
				// Set the log user id of the mock LogItem object
				logItem.setLogUserId("1");
				
				// Set the log page id of the mock LogItem object
				logItem.setLogPageId("1");
				
				// Set the log page title of the mock LogItem object
				logItem.setLogPageTitle("Test");
				
				// Set the log comment of the mock LogItem object
				logItem.setLogComment("");
				
				// Set the log params of the mock LogItem object
				logItem.setLogParams("");
				
				// Set the log id of the mock LogItem object
				logItem.setLogId("1");
				
				// Set the log title of the mock LogItem object
				logItem.setLogTitle("Test");
				
				// Set the log type of the mock LogItem object
				logItem.setLogType("block");
				
				// Set the log action of the mock LogItem object
				logItem.setLogAction("block");
				
				// Set the log action comment of the mock LogItem object
				logItem.setLogActionComment("blocked User:Test with an expiry time of indefinite (account creation disabled)");
				
				// Set the log timestamp of the mock LogItem object
				logItem.setLogTimestamp("2019-01-01T00:00:00Z");
				
				// Set the log user of the mock LogItem object
				logItem.setLogUser("Test");
				
				// Set the log user id of the mock LogItem object
				logItem.setLogUserId("1");
				
				// Set the log page id of the mock LogItem object
				logItem.setLogPageId("1");
				
				// Set the log page title of the mock LogItem object
				logItem.setLogPageTitle("Test");
				
				// Set the log comment of the mock LogItem object
				logItem.setLogComment("");
				
				// Set the log params of the mock LogItem object
				logItem.setLogParams("");
				
				// Set the log id of the mock LogItem object
				logItem.setLogId("1");
				
				// Set the log title of the mock LogItem object
				logItem.setLogTitle("Test");
				
				// Set the log type of the mock LogItem object
				logItem.setLogType("block");
				
				// Set the log action of the mock LogItem object
				logItem.setLogAction("block");
				
				// Set the log action comment of the mock LogItem object
				logItem.setLogActionComment("blocked User:Test with an expiry time of indefinite (account creation disabled)");
				
				// Set the log timestamp of the mock LogItem object
				logItem.setLogTimestamp("2019-01-01T00:00:00Z");
				
				// Set the log user of the mock LogItem object
				logItem.setLogUser("Test");
				
				// Set the log user id of the mock LogItem object
				logItem.setLogUserId("1");
				
				// Set the log page id of the mock LogItem object
				logItem.setLogPageId("1");
				
				// Set the log page title of the mock LogItem object
				logItem.setLogPageTitle("Test");
				
				// Set the log comment of the mock LogItem object
				logItem.setLogComment("");
				
				// Set the log params of the mock LogItem object
				logItem.setLogParams("");
				
				// Set the log id of the mock LogItem object
				logItem.setLogId("1");
				
				// Set the log title of the mock LogItem object
				logItem.setLogTitle("Test");
				
				// Set the log type of the mock LogItem object
				logItem.setLogType("block");
				
				// Set the log action of the mock LogItem object
				logItem.setLogAction("block");
				
				// Set the log action comment of the mock LogItem object
				logItem.setLogActionComment("blocked User:Test with an expiry time of indefinite (account creation disabled)");
				
				// Set the log timestamp of the mock LogItem object
				logItem.setLogTimestamp("2019-01-01T00:00:00Z");
				
				// Set the log user of the mock LogItem object
				logItem.setLogUser("Test");
				
				// Set the log user id of the mock LogItem object
				logItem.setLogUserId("1");
				
				// Set the log page id of the mock LogItem object
				logItem.setLogPageId("1");
				
				// Set the log page title of the mock LogItem object
				logItem.setLogPageTitle("Test");
				
				// Set the log comment of the mock LogItem object
				logItem.setLogComment("");
				
				// Set the log params of the mock LogItem object
				logItem.setLogParams("");
				
				// Set the log id of the mock LogItem object
				logItem.setLogId("1");
				
				// Set the log title of the mock LogItem object
				logItem.setLogTitle("Test");
				
				// Set the log