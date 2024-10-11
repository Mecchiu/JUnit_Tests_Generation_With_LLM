// LogEvents.java
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

/**
 * List log events, filtered by time range, event type, user type, or the page
 * it applies to. Ordered by event timestamp. Parameters: letype (flt), lefrom
 * (paging timestamp), leto (flt), ledirection (dflt=older), leuser (flt),
 * letitle (flt), lelimit (dflt=10, max=500/5000)
 *
 * api.php ? action=query & list=logevents      - List last 10 events of any type
 *
 * TODO This is a semi-complete extension point
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class LogEvents extends MWAction implements Iterator<LogItem>, Iterable<LogItem> {

    public boolean hasNext() {
        prepareCollection();
        return logIterator.hasNext();
    }

    /**
     * Returns an iterator over the log items.
     *
     * @return an iterator over the log items
     */
    public Iterator<LogItem> iterator() {
        prepareCollection();
        return logItems.iterator();
    }
}

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
* It contains ten unit test cases for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_0Test {

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: empty collection.
     */
    @Test
    void testHasNextEmpty() {
        LogEvents logEvents = new LogEvents();
        assertFalse(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with one item.
     */
    @Test
    void testHasNextOneItem() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        assertTrue(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple items.
     */
    @Test
    void testHasNextMultipleItems() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        logEvents.logItems.add(new LogItem());
        assertTrue(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple items, but all have been iterated over.
     */
    @Test
    void testHasNextAllItemsIterated() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        logEvents.logItems.add(new LogItem());
        logEvents.logIterator = logEvents.logItems.iterator();
        logEvents.logIterator.next();
        logEvents.logIterator.next();
        assertFalse(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple items, but hasNext() has been called before.
     */
    @Test
    void testHasNextCalledBefore() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        logEvents.logItems.add(new LogItem());
        logEvents.logIterator = logEvents.logItems.iterator();
        logEvents.hasNext();
        assertTrue(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple items, but hasNext() has been called multiple times.
     */
    @Test
    void testHasNextCalledMultipleTimes() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        logEvents.logItems.add(new LogItem());
        logEvents.logIterator = logEvents.logItems.iterator();
        logEvents.hasNext();
        logEvents.hasNext();
        assertTrue(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple items, but hasNext() has been called after all items have been iterated over.
     */
    @Test
    void testHasNextCalledAfterAllItemsIterated() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(new LogItem());
        logEvents.logItems.add(new LogItem());
        logEvents.logIterator = logEvents.logItems.iterator();
        logEvents.logIterator.next();
        logEvents.logIterator.next();
        logEvents.hasNext();
        assertFalse(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with null items.
     */
    @Test
    void testHasNextNullItems() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(null);
        assertFalse(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with one null item.
     */
    @Test
    void testHasNextOneNullItem() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(null);
        logEvents.logItems.add(new LogItem());
        assertTrue(logEvents.hasNext());
    }

    /**
     * Test method for {@link LogEvents#hasNext()}.
     * Case: collection with multiple null items.
     */
    @Test
    void testHasNextMultipleNullItems() {
        LogEvents logEvents = new LogEvents();
        logEvents.logItems.add(null);
        logEvents.logItems.add(null);
        assertFalse(logEvents.hasNext());
    }
}