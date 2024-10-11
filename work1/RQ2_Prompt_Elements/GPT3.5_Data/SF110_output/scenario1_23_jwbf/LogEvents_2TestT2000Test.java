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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator returns the correct number of log items.
     */
    @Test
    void testIterator() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(10);

        // Execution
        Iterator<LogItem> iterator = logEvents.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }

        // Verification
        assertEquals(10, count);
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator returns the correct log items.
     */
    @Test
    void testIterator2() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(10);

        // Execution
        Iterator<LogItem> iterator = logEvents.iterator();
        Vector<LogItem> logItems = new Vector<>();
        while (iterator.hasNext()) {
            logItems.add(iterator.next());
        }

        // Verification
        assertEquals(10, logItems.size());
        assertEquals("upload", logItems.get(0).getType());
        assertEquals("newusers", logItems.get(1).getType());
        assertEquals("block", logItems.get(2).getType());
        assertEquals("block", logItems.get(3).getType());
        assertEquals("block", logItems.get(4).getType());
        assertEquals("block", logItems.get(5).getType());
        assertEquals("block", logItems.get(6).getType());
        assertEquals("block", logItems.get(7).getType());
        assertEquals("block", logItems.get(8).getType());
        assertEquals("block", logItems.get(9).getType());
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator returns the correct log items when the limit is set to 1.
     */
    @Test
    void testIterator3() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(1);

        // Execution
        Iterator<LogItem> iterator = logEvents.iterator();
        Vector<LogItem> logItems = new Vector<>();
        while (iterator.hasNext()) {
            logItems.add(iterator.next());
        }

        // Verification
        assertEquals(1, logItems.size());
        assertEquals("upload", logItems.get(0).getType());
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator returns the correct log items when the limit is set to 500.
     */
    @Test
    void testIterator4() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(500);

        // Execution
        Iterator<LogItem> iterator = logEvents.iterator();
        Vector<LogItem> logItems = new Vector<>();
        while (iterator.hasNext()) {
            logItems.add(iterator.next());
        }

        // Verification
        assertEquals(500, logItems.size());
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator returns the correct log items when the limit is set to 5000.
     */
    @Test
    void testIterator5() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(5000);

        // Execution
        Iterator<LogItem> iterator = logEvents.iterator();
        Vector<LogItem> logItems = new Vector<>();
        while (iterator.hasNext()) {
            logItems.add(iterator.next());
        }

        // Verification
        assertEquals(5000, logItems.size());
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator throws an exception when the bot is not set.
     */
    @Test
    void testIterator6() {
        // Setup
        LogEvents logEvents = new LogEvents();
        logEvents.setLimit(10);

        // Verification
        assertThrows(ProcessException.class, () -> {
            // Execution
            Iterator<LogItem> iterator = logEvents.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        });
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator throws an exception when the limit is set to 0.
     */
    @Test
    void testIterator7() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(0);

        // Verification
        assertThrows(IllegalArgumentException.class, () -> {
            // Execution
            Iterator<LogItem> iterator = logEvents.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        });
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator throws an exception when the limit is set to -1.
     */
    @Test
    void testIterator8() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(-1);

        // Verification
        assertThrows(IllegalArgumentException.class, () -> {
            // Execution
            Iterator<LogItem> iterator = logEvents.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        });
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator throws an exception when the limit is set to 5001.
     */
    @Test
    void testIterator9() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(5001);

        // Verification
        assertThrows(IllegalArgumentException.class, () -> {
            // Execution
            Iterator<LogItem> iterator = logEvents.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        });
    }

    /**
     * Test method for {@link LogEvents#iterator()}.
     * It tests if the iterator throws an exception when the bot is not logged in.
     */
    @Test
    void testIterator10() {
        // Setup
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        LogEvents logEvents = new LogEvents();
        logEvents.setBot(bot);
        logEvents.setLimit(10);
        bot.logout();

        // Verification
        assertThrows(ActionException.class, () -> {
            // Execution
            Iterator<LogItem> iterator = logEvents.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        });
    }
}