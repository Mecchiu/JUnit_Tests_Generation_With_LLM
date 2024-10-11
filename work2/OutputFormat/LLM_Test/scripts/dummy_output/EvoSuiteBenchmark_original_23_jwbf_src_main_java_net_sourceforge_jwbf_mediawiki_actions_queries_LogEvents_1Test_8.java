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
     * List events of the last 10 log items of any type of one.
     *
     * @throws IOException exception of an IO error
     */
    @Test
    public void list10RecentItems12() throws IOException {
    	
        // Generate the expected log entry
        String logEntry_4 = "Recent log entry_4. Log entry 1";
	    String logEntry_5 = "Recent log entry 5";
	    String logEntry_6 = "Recent log entry 6";
	    String logEntry_7 = "Recent log entry 7";
	    logEntry_6 = "Recent log entry 6";
	    logEntry_1 = "Recent log entry 1";
	    logEntry_7 = "Recent log entry 7";
	    logEntry_8 = "Recent log entry 8";
	    logEntry_9 = "Recent log entry 9";
	
        // Generate expected log items
        LogItem logItem_1 = new LogItem<LogEntryItem>(logEntry_1, Version.MW1_12, 0, Version.MW1_13, Version.MW1_12);
	    LogItem logItem_2 = new LogItem<LogEntryItem>(logEntry_9, Version.MW1_10, 0, Version.MW1_11, Version.MW1_10);
	    LogItem logItem_3 = new LogItem<LogEntryItem>(logEntry_5, Version.MW1_10, 0, Version.MW1_11, Version.MW1_10);
        logItem_2.setTimestamp(new Date());
        logItem_3.setTimestamp(new Date());
        LogTypeList logTypeList = new LogTypeList();
    	logTypeList.addUniqueChild("recent");
    	logTypeList.addUniqueChild("recently");
    	logTypeList.addUniqueChild("recently_old");
			
		// Execute API request
    	Collection<LogItem> items = new LogItemsList<>();
        items.add(logItem_1);
        items.add(logItem_2);
        items.add(logItem_3);
        items.add(logItem_4);
        items.add(logItem_5);
		
        // Execute web method "query" actions
        for (LogItem logItem_10 : items) {
	        logItem_10.setUser(logItem_1.getUser());
        }
        
        // Execute Get actions
        Get getAction = new Get();
        try {
            getAction.setApi("query");
            getAction.setQuery("&paging=1");
            getAction.setLimit(5000);
            getAction.setVersion(MW1_12);
            getAction.setVersionLimit(MW1_12);
            getAction.setVersionOffset(0);
            getAction.setLog(getAction.getSubset());            
        } catch (ActionException e) {
        	fail(e.getMessage());
        }
        
        // Exec
}
}