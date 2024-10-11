// LogEvents_0Test.java
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
* It contains one unit test case for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_0Test {
		/**
		 * {@inheritDoc}
		 */
		@Test
		public void hasNextTest() {
			// Fetch current time
			final long start = System.currentTimeMillis();
			final long end = start + 1000;
			final Document doc = createDoc(start, end);
			try {
				// Check if the element contains events
				assertNotNull(doc.getRootElement().getChildCount());
				final Element logs = doc.getRootElement().getChild(0);
				assertNotNull(logs.getChild(0));
				assertNotNull(logs.getChild(1));
				final String logType = logs.getChild(0).getChild(0).getText();
				assertTrue(logType, "LogType not empty");
				// Check whether there are any events
				final Element events = logs.getChild(1);
				assertNotNull(events);
				final Iterator<Element> eventsIter = events.getChildren("event");
				logType = "LogEvents";
				assertTrue(eventsIter.hasNext());
				final Element event = eventsIter.next();
				assertTrue(event.getText(), "event element not empty");
				final Element text = event.getChild("text");
				assertNotNull(text);
				final Document inner = new Document(text);
				final Document eventToParse = inner!= null && inner.getRootElement()!= null? inner : doc;
				assertTrue("Document is empty", eventToParse.getRootElement().getText().length() > 10);
			} catch (JDOMException | IOException e) {
				e.printStackTrace();
				fail(e.getLocalizedMessage());
			}
		}
		Document createDoc(final long start, final long end) {
			try {
				final SAXBuilder builder = new SAXBuilder();
				final InputSource is = new InputSource(new StringReader(TestQuery.toString()));
				final Element docs = builder.build(is);
				assertNotNull(docs);
				final Element root = docs.getRootElement();
				if (root.getAttributeValue("action")!= null && root.getAttributeValue("action")
					.equals("query") && root.getAttributeValue("version")!= null) {
					final Document doc = new Document(root,
						document(new URLRef(root.getAttributeValue("url"), root.getChild(0)))); // document starts
																							// at time 0.
				}
					return doc;
			} catch (JDOMException | VersionException ex) {
				ex.printStackTrace();
				fail();
			} catch (IOException ex) {
				ex.printStackTrace();
				fail();
			}
			return null;
		}
		Document document(final URLRef ref) throws JDOMException {
}
}