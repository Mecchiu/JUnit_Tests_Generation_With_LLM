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
		 * Tests for the {@link LogEvents#next()} method
		 */
		@Test
        public void test1() throws ActionException, IOException, JDOMException {
            // We create a MediaWikiBot and wait for a while
            final MediaWikiBot bot = new MediaWikiBot("junit", "http://localhost:6040/");
			List<LogItem> logItems = new Vector<LogItem>();
			getLogItems("LogEventsList.php?action=query",logItems);

			// Then send the command to MediaWiki 1.12+
            bot.send(getRequestParams("command=query&list=logevents&user=shen@mediawiki.org"));

		}
        public void getLogItems(String cmd,List<LogItem> logItems) throws IOException,
		JDOMException,
		ActionException {
	        final StringBuilder sb = new StringBuilder("<?xml version=\"1.0\"?>\n");
	        sb.append( "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"" );
	        sb.append( "     xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" );
	        sb.append( "     xsi:schemaLocation=\"http://schemas.xmlsoap.org/soap/envelope/ http://schemas.xmlsoap.org/soap/envelope/\">" );
			sb.append( "<s:Body>");
			sb.append( "<l:LogQueryResult xmlns:l=\"http://www.w3.org/2006/12/logger/logs\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"" );
			sb.append( "     xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" );
			sb.append( "     xsi:schemaLocation=\"http://www.w3.org/2006/12/logger/logs http://dummy.log.dummy.com/" );
			sb.append("                 http://dummy.log.dummy.com/x" );
			sb.append( "                 logger:x-service:jwbfxml  http://dummy.log.dummy.com/" );
			sb.append("                 logger:x-service:jwbfxml  http://dummy.log.dummy.com/x" );
			sb.append( "     xmlns:d=\"http://dummy.log.dummy.com\"" );
			sb.append( "     xmlns:x=\"http://www.w3.org/2006/12/logger/x-services\"" );
			sb.append( "                 logger:x-service:jwbmlog  http://dummy.log.dummy.com/" );
}
}