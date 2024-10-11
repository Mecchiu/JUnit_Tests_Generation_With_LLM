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
		 * Testcase for the {@link LogEvents#next()} method
		 */

		@Test
		@Slf4j
		public void testNext1NoPage() {
			// Preparation
			String wikiContent = "<body>This is the contents of the testfile, without any content-type information.<body>";
			String testFile = "testFile.wik.mowiki";
			InputSource wikiSource = new InputSource(new StringReader(wikiContent));
			Document wikiDocument = new SAXBuilder().build(wikiSource);
			Element wikiBodyElement = wikiDocument.getRootElement();
			Element wikiTitleElement = wikiBodyElement.getChild("title");
			LogItem wikiLogEvent = new LogItem();
			wikiLogEvent.setFileName(testFile);
			wikiLogEvent.setTitle(wikiTitleElement.getText());
			wikiLogEvent.setComment("Contains some interesting content.");
			LogItem testItem = new LogItem((LogItem) wikiLogEvent, wikiBodyElement);
			// Invoke the method
			LogItem nextEvent = LogItems.next(testItem, wikiLogEvent, wikiBodyElement);
			assertEquals(expectedNextItem, nextEvent);
		}

		@Test
		@Slf4j
		public void testNext1WithPage() throws IOException, JDOMException, VersionException, ProcessException {
			// Prepare
			String wikiContent = "<body>This is the contents of the testfile, without any content-type information.<body>";
			String wikiPath = "test/testContent";
			String testFile = "testFile.wik.mowiki";
			InputSource wikiSource = new InputSource(new StringReader(wikiContent));
			Document wikiDocument = new SAXBuilder().build(wikiSource);
			Element wikiBodyElement = wikiDocument.getRootElement();
			Element wikiPageElement = wikiBodyElement.getChild("page");
			LogItem wikiLogEvent = new LogItem();
			wikiLogEvent.setTitle(wikiPageElement.getText());
			wikiLogEvent.setComment("Contains some interesting content.");
			LogItem testItem = new LogItem((LogItem) wikiLogEvent, wikiPageElement);
			// Invoke the method
			LogItem nextEvent = LogItems.next(testItem, wikiLogEvent, wordPage);
			// Compare results
			assertEquals(LOG_1, nextEvent.getLogType());
			assertNotNull(nextEvent.getLogSource());
			assertEquals(expectedPage, nextEvent.getLogSource().getFileName());
			assertEquals("Contains some interesting content.", nextEvent.getComment());
		}

		private static final Pattern datePattern = Pattern.compile("\\d\\d[\\-\\d]+");

		@Test
		@Slf4j
		public void testNext1WithPageWithDate() throws IOException, JDOMException, VersionException, ProcessException {
			// Prep
			String wikiContent = "<body>This is the contents of the testfile, without any content-type information.<body>";
}
}