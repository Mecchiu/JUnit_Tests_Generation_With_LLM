// LogEvents_2Test.java
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
* It contains one unit test case for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {
		
    /**
     * TODO Add test that requires multiple wiki bots
     */
    @Test
    public void testIterator() {
        try {
			String logEvent = "<lvevent timestamp='2010-11-21T20:29:39.895' url='http://testpage/' logtype='logs/vnd.wikipedia.wiktionary.logs/vnd.wikipedia.wiki/Test'>";

            Reader reader = new StringReader(logEvent);

            //
            // create the parser and parse the contents
            //

            SAXBuilder b = new SAXBuilder();
			System.out.println("Building parser....");
			Document doc = b.build(reader);
			System.out.println("Parser done!");

            //
            // parse the events array
            //

            Vector<LogItem> logItems = new Vector<>();
			Iterator<Element> e = doc.getRootElement().elementIterator();
			Element eRoot = null;

			while (e.hasNext()) {
				eRoot = e.next();
				logItems.add(new LogItem(eRoot.getChild("lvevent")));
			}

			//
			// test for empty log events
			//

			assertTrue((doc.removeRootElement() instanceof Document) == false);
			System.out.println("Test success!");

            //
            // test a full log item array
            //

            Iterator<LogItem> items = LogEvents_2Test.toIterator(logItems);

            //
            assertTrue(items.hasNext());
            System.out.println("Test no last event!");

            @SuppressWarnings("unused")
            LogItem l = items.next();
            System.out.println("No next log item!");

            e = items.next().elementIterator();
            assertTrue(e.hasNext());
            eRoot = e.next();

        } catch (JDOMException ex) {
            String exMessage = "JDOMException during parsing.";
            log(exMessage, ex);
            fail(exMessage);
        } catch (IOException ex) {
            String exMessage = "IOException during parsing.";
            log(exMessage, ex);
            fail(exMessage);
        } catch (ProcessException ex) {
            String exMessage = "Process Exception during parsing.";
            log(exMessage, ex);
            Fail(exMessage);
        }
    }


	boolean Test(Document doc) {
		assertEquals(doc.getRootElement().getName(), "lvevent");

				//
				// create the parser and parse the contents
				//

		Vector<LogItem> logItems = new Vector<>();
		Iterator<Element> e = doc.getRootElement().elementIterator();
		Element eRoot = null;

}
}