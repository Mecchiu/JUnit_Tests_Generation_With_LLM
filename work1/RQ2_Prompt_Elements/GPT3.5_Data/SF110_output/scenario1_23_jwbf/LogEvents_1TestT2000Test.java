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

    public LogItem next() {
        prepareCollection();
        return logIterator.next();
    }

    @Override
    public Iterator<LogItem> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        prepareCollection();
        return logIterator.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Vector<LogItem> logCollection = null;
    private Iterator<LogItem> logIterator = null;

    private final String logtype;
    private final String user;
    private final String title;
    private final String start;
    private final String end;
    private final int limit;

    /**
     * generates a logevents request
     *
     * @param logtype the type of the log
     * @param user the user name
     * @param title the title of the page
     * @param start the start timestamp
     * @param end the end timestamp
     * @param limit the limit of the log entries
     */
    public LogEvents(String logtype, String user, String title, String start, String end, int limit) {
        this.logtype = logtype;
        this.user = user;
        this.title = title;
        this.start = start;
        this.end = end;
        this.limit = limit;
    }

    /**
     * generates a logevents request
     *
     * @param logtype the type of the log
     * @param user the user name
     * @param title the title of the page
     * @param start the start timestamp
     * @param end the end timestamp
     */
    public LogEvents(String logtype, String user, String title, String start, String end) {
        this(logtype, user, title, start, end, 10);
    }

    /**
     * generates a logevents request
     *
     * @param logtype the type of the log
     * @param user the user name
     * @param title the title of the page
     */
    public LogEvents(String logtype, String user, String title) {
        this(logtype, user, title, null, null, 10);
    }

    /**
     * generates a logevents request
     *
     * @param logtype the type of the log
     */
    public LogEvents(String logtype) {
        this(logtype, null, null, null, null, 10);
    }

    /**
     * generates a logevents request
     */
    public LogEvents() {
        this(null, null, null, null, null, 10);
    }

    private void prepareCollection() {
        if (logCollection == null) {
            try {
                logCollection = new Vector<LogItem>();
                String uS = "";
                if (user != null) {
                    uS = "&leuser=" + user;
                }
                String tS = "";
                if (title != null) {
                    tS = "&letitle=" + title;
                }
                String sS = "";
                if (start != null) {
                    sS = "&lefrom=" + start;
                }
                String eS = "";
                if (end != null) {
                    eS = "&leto=" + end;
                }
                String lS = "&lelimit=" + limit;
                String logtypeS = "";
                if (logtype != null) {
                    logtypeS = "&letype=" + logtype;
                }
                String url = "/api.php?action=query&list=logevents" + logtypeS + uS + tS + sS + eS + lS + "&format=xml";
                HttpAction hm = new Get(url);
                log.debug(url);
                bot.performAction(hm, false);
                String xml = hm.getResponseAsString();
                SAXBuilder builder = new SAXBuilder();
                Reader in = new StringReader(xml);
                InputSource is = new InputSource(in);
                Document doc = builder.build(is);
                Element root = doc.getRootElement();
                for (Object o : root.getChildren("item")) {
                    Element element = (Element) o;
                    logCollection.add(new LogItem(element));
                }
                logIterator = logCollection.iterator();
            } catch (IOException e) {
                log.error("A IOException occurred while preparing the log collection.", e);
            } catch (JDOMException e) {
                log.error("A JDOMException occurred while preparing the log collection.", e);
            } catch (ProcessException e) {
                log.error("A ProcessException occurred while preparing the log collection.", e);
            } catch (ActionException e) {
                log.error("A ActionException occurred while preparing the log collection.", e);
            } catch (VersionException e) {
                log.error("A VersionException occurred while preparing the log collection.", e);
            }
        }
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
     * It tests if the method