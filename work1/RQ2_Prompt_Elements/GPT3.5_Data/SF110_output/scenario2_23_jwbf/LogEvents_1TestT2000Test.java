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

    /**
     * {@inheritDoc}
     */
    public LogItem next() {
        prepareCollection();
        return logIterator.next();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator<LogItem> iterator() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        prepareCollection();
        return logIterator.hasNext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<LogItem> getCollection() {
        return logItems;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected HttpAction prepareCollection() {
        if (logItems == null) {
            logItems = new Vector<LogItem>();
            String uS = "";
            try {
                uS = getUrl();
                HttpAction hm = new Get(uS);
                String s = "";
                try {
                    s = getBot().performAction(hm);
                } catch (ActionException e) {
                    log.error("Error in http request: " + e.getMessage());
                    log.debug("Error in http request: " + e.getMessage(), e);
                    return hm;
                } catch (IOException e) {
                    log.error("Error in http request: " + e.getMessage());
                    log.debug("Error in http request: " + e.getMessage(), e);
                    return hm;
                } catch (ProcessException e) {
                    log.error("Error in http request: " + e.getMessage());
                    log.debug("Error in http request: " + e.getMessage(), e);
                    return hm;
                }
                SAXBuilder builder = new SAXBuilder();
                Reader in = new StringReader(s);
                Document doc;
                try {
                    doc = builder.build(new InputSource(in));
                } catch (JDOMException e) {
                    log.error("Error in parsing xml: " + e.getMessage());
                    log.debug("Error in parsing xml: " + e.getMessage(), e);
                    return hm;
                }
                Element root = doc.getRootElement();
                for (Object o : root.getChildren()) {
                    Element element = (Element) o;
                    if (element.getQualifiedName().equalsIgnoreCase("item")) {
                        logItems.add(new LogItem(element));
                    }
                }
                logIterator = logItems.iterator();
            } catch (VersionException e) {
                log.error("VersionException: " + e.getMessage());
                log.debug("VersionException: " + e.getMessage(), e);
            }
        }
        return null;
    }
}

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
* It contains ten unit test cases for the {@link LogEvents#next()} method.
*/
class LogEvents_1Test {

    /**
     * Test case for the {@link LogEvents#next()} method.
     * It tests if the method returns the correct log item.
     */
    @Test
    public void testNext() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#next()} method.
     * It tests if the method throws a {@link NoSuchElementException} when there are no more log items.
     */
    @Test
    public void testNextNoSuchElementException() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#next()} method.
     * It tests if the method throws a {@link VersionException} when the version of MediaWiki is not supported.
     */
    @Test
    public void testNextVersionException() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#hasNext()} method.
     * It tests if the method returns true when there are more log items.
     */
    @Test
    public void testHasNextTrue() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#hasNext()} method.
     * It tests if the method returns false when there are no more log items.
     */
    @Test
    public void testHasNextFalse() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#hasNext()} method.
     * It tests if the method throws a {@link VersionException} when the version of MediaWiki is not supported.
     */
    @Test
    public void testHasNextVersionException() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#remove()} method.
     * It tests if the method throws an {@link UnsupportedOperationException}.
     */
    @Test
    public void testRemoveUnsupportedOperationException() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#getCollection()} method.
     * It tests if the method returns the correct collection of log items.
     */
    @Test
    public void testGetCollection() {
        // TODO implement test
    }

    /**
     * Test case for the {@link LogEvents#prepareCollection()} method.
     * It tests if the method returns null when the log items