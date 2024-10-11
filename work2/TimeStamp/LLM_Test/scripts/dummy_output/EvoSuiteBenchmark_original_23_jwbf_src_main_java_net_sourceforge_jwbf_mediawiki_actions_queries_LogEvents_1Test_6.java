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
		 * @throws JDOMException
		 * @throws IOException
		 * @throws JDOMException
		 * @throws JDOMException
		 * @throws VersionException
		 * @throws ProcessException
		 * @throws VersionException
		 * @see LogEvents#next()
		 */
		@Test
		public void logEvents_1() throws VersionException, ProcessException, VersionException, IOException {
	    logEvents(null);
	    validate("http://log.wikipedia.org/wiki/List_of_Event_Types");
	}

	    /**
	     * @throws VersionException
	     * @see LogEvents#next()
	     */
	    @Test(expected=VersionException.class)
	    public void logEvents_1withNullWiki() throws VersionException, ProcessException, IOException {
	    	logEvents(null);
	    }

	    /**
	     * @throws VersionException
	     * @see LogEvents#next()
	     */
	    @Test(expected=VersionException.class)
	    public void logEvents_2withWrongWiki() throws VersionException, ProcessException, IOException {
	    	logEvents("");
	    }

	    /**
	     * @throws VersionException
	     * @see LogEvents#next()
	     */
	    private void validate(String wiki) throws VersionException, ProcessException, IOException {
	    	log(null, wiki, null, null);
	    }

	    private void log(LogItem li, String wiki, String le, String leuser) throws VersionException, ProcessException, IOException {
	    	String result = execute("http://log.wikipedia.org/wiki/" + wiki + "/";
	    		    			   + "?format=json", -1);
			LogEvent lev = MediaWikiBot.parseLogEvent(li, wiki, result);
			log((String)null, null, result, lev);
	    }
}

// Logs.java