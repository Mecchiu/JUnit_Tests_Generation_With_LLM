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
		
  /** Constructor of <code>LogEvents_2Test</code> class.
   * @throws java.io.IOException Signals that an I/O exception has occurred.
   */
  LogEvents_2Test() throws JDOMException, IOException {
      
    logItem.clear();
    logItem.getParams().setType(LogItem.TEXT_TYPE.value);
    logItem.getParams().getParams().setValue("Foo");
    
    logItem.setPageType(LogItem.PAGE_TYPE.USER_WITH_ACCESS_LEVEL);
    // logItem.addPage(10);
    
    // add the logging information
    
  }
  @Test
  public void testlogEvents_1() {
  
    get(Action.ActionType.query)
     .logEvent("Content_20")
     .logEvent("Content_20", "Content")
     .process();
  }

  @Test
  public void testlogEvents_2() throws VersionException, IOException {

    logItem.clear();
    // logItem.setPageType(LogItem.PAGE_TYPE.WITH_BOT);
    logItem.setPageType(LogItem.PAGE_TYPE.WITH_BOT);
    logItem.setUserType("user@mediawiki.org");
  
    // set the params
 
    get(Action.ActionType.query)
     .logEvent("Content_20")
     .logEvent("Content_0")
     .process().getLastStatusCode();

  }

	/* test case: test log events from wiki's server */
  @Slf4j
  @Test
  public void testlogEventsFromWiki_1() throws VersionException, IOException {

    // add a logitem to page
    logItem.clear();
    logItem.setPageType(LogItem.PAGE_TYPE.WITH_WIKI_ENGINE);
    logItem.getParams().setType(LogItem.TEXT_TYPE.value);
    logItem.getParams().getParams().setValue("Page name");
    logItem.setUserType("user@mediawiki.org");

    // set content params
    get(Action.ActionType.query)
     .logEvent("Content_0")
     .logEvent("Content_0", "Some content")
     .process().getLastStatusCode();
  }

  @Slf4j
  @Test
  void testEmptyWikiWikiAsLastPage(@SupportedBy({"wiki"}) @SupportedBy({"wiki-login"}) PageType pageType) throws VersionException, IOException {
	    
    /* The logitem list is empty or has changed between wiki versions,
    * so lets check that the previous content from wiki is still there
    */
	
    logItem.clear();
    logItem.getParams().setPageType(pageType);
}
}