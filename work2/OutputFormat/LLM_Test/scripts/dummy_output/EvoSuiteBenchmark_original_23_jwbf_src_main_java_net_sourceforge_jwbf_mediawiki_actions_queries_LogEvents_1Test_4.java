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
* It contains one unit test case for the {@link LogEvents#next()} method.
*/
class LogEvents_1Test {
		/**
		 * Basic constructor
		 */
		LogEvents_1Test() {
		}
		/**
		 * Test the {@link LogEvents#LogItems()} accessor method.
		 * Note: The accessors must all work on read-only resources.
		 * @throws Exception thrown if error
		 */
		@Test
		void testAccessors() throws Exception {
				/*
				 * Test the accessors
				 */
				LogItem logItems = new LogItem(getLog(1L), null);
				assertTrue("Empty logItems result", ((Collection) logItems.getDataList().get(0)).isEmpty());
				logItems.getLogItem(0L).getLogItem(0L);
				assertTrue("Empty logItems result", ((Collection) logItems.getDataList().get(0)).isEmpty());
				logItems.getLogItem(0L).getLogItem(1L);
				assertTrue("Empty logItems result", ((Collection) logItems.getDataList().get(0)).isEmpty());
				logItems.getLogItem(2L);
				assertTrue("Empty logItems result", ((Collection) logItems.getDataList().get(0)).isEmpty());
				logItems.getDataList().get(1L);
				assertTrue("logItem must not be empty",!((Collection) logItems.getDataList().get(0)).isEmpty());
				assertEquals("Only one logItem should exist", 1L, (long) logItems.getLogItem(0L).getDataList().size());
				assertEquals("logItems[0] must not be equal to itself", "foo", logItems.getLogItem(0L).getLogItem(0L).getTitle());
				assertEquals("logItems[0] must not be equal to itself", "foo", logItems.getLogItem(1L).getLogItem(0L).getTitle());
				assertEquals("logItems[0] must not be equal to themselves", "foo", logItems.getLogItem(2L).getLogItem(0L).getTitle());

				/*
				 * Test the read-read operations
				 */
				Collection<LogItem> dataListToTest = new Vector<>();
				for (long timestamp = 1L; timestamp <= 2L; timestamp++) {
						dataListToTest.add(logItems.getLogItem(timestamp));
				}

				// read all logs in the list
				logItems.getLogItem(1L).getLogItem(1L); // OK
				logItems.getLogItem(2L).getLogItem(2L); // OK
				logItems.getLogItem(3L).getLogItem(3L); // OK
				logItems.getLogItem(4L).getLogItem(4L); // OK

				// read the oldest log item (to be sure)
				LogItem oldestLog = new LogItem(dataListToTest.iterator().next());
				logItems.getLogItem(oldestLog.getTimestamp().longValue()); // ok

}
}