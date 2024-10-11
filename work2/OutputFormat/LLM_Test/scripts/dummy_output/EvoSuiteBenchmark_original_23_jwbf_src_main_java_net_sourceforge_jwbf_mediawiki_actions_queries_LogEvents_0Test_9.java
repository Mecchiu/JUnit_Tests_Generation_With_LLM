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
		

	public void execute(Document document, String wikiAppendTo, int lastPageId, String version, boolean fullXML, String logType, String leuser, String letype) {
        try {
            Element log = new Element("event", MW1_11);
            Document document2 = new SAXBuilder().build(new InputSource(new StringReader(document.toString()))).getDocument();
            Element time = new Element("timestamp");
            time.setContent(String.format("[%s] %s %s %s", getTimeStamp(), wikiAppendTo, lastPageId, version));
            String timeStr = time.toString();
            log.addContent(timeStr);
            log.addContent(log.getChild(0).getContent());
            Collection<Element> items = log.getContent();
            String itemString = items.iterator().next().toString();
            String resultString = log.toString();
            logStringIs(resultString, this);
            logTimeIs(logTime(itemString), this);
        } catch (Exception ex) {
        	logCause(logCause(ex));
        }
	}

	@Test
	public void execute1() {
		logAction = true;
        Document document = new SAXBuilder().build(new InputSource(new StringReader("<root>"))).getDocument();
        Element rootElement = document.getRootElement();
        List<Element> events = rootElement.selectNodes("/log/event");
		assertTrue(events.size() == 8);
        boolean found1 = false, found2 = false;
		for (Iterator<Element> iterator = events.iterator(); iterator.hasNext();) {
    		Element event2 = iterator.next();
			if (iterator.hasPrevious()) {
				Element event1 = iterator.previous();
				found1 = event1.getChildSibling("timestamp").getContent().equals(event2.getChild("timestamp").getContent());
			}
    		found2 = event1.getContent().equals(rootElement.toString());
    		logger.info("event1 : " + event1.getContent() + ", found1 : " + found1
					+( found2? " (match)" : " (" + found1 +")"));
			if (iterator.hasNext()) {
				logger.info("event2 : " + iterator.next().getContent());
			} else {
				logger.error("event2 didn't exist");
			}
		}
		assertTrue(found1);
        assertTrue(found2);
	}
	@Test
    public void execute2() {
		if (getVersion()!= MW1_11) {
			throw new NoSuchMethodException("Method not implemented, please re-run TestExecute for this version");
		}
		
        Document document = new SAXBuilder().build(new InputSource(new StringReader("<root>"))).getDocument();
        Element rootElement = document.getRootElement();
}
}