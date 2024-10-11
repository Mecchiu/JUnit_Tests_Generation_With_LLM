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
		
	/**
	 * Test method for {@link LogEvents#hasNext()}.
	 */
	@Test
	public void hasNext_should_returnTrue_if_is_allowed() {
    	assertNotNull(LogEvents_0Test.hasNext());
  	}
	
	/**
	 * Test method for {@link LogEvents#hasNext()}.
	 */
	@Test
	public void hasNext_should_returnFalse_if_user_is_not_allowed() {
		String msg = "test:user is not allowed to log log entry.";
		assertFalse(LogEvents_0Test.hasNext());
		LogEvents.hasNext.setExpectedUser("unittest");
		assertFalse(LogEvents_0Test.hasNext());
		msg = "test:user does not have rights to log log entry.";
		assertFalse(LogEvents_0Test.hasNext());
		LogEvents.hasNext.setExpectedUser("unittest");
		assertFalse(LogEvents_0Test.hasNext());
	}
	
	/**
	 * Test method for {@link LogEvents#hasNext()}.
	 */
	@Test
	public void hasNext_should_returnFalse_if_is_allowed_and_is_allowed() {
    	assertFalse(LogEvents_0Test.hasNext());
		LogEvents.hasNext.setExpectedUser("unittest");
		assertFalse(LogEvents_0Test.hasNext());
		LogEvents.hasNext.setExpectedUser("unittest");
		assertFalse(LogEvents_0Test.hasNext());
		LogEvents.hasNext.setExpectedUser("unittest");
		assertFalse(LogEvents_0Test.hasNext());
	}
	
	/**
	 * Test method for {@link LogEvents#hasNext()}.
	 */
	@Test
	public void hasNext_should_returnFalse_if_is_allowed_and_is_not_allowed() {
			
	}	

	/**
	 * Test method for {@link LogEvents#next()}.
	 */
	@Test(expected = NoSuchElementException.class)
	public void next_should_throw_an_ioexception_if_next_is_an_element_other_than_list() {
		assertEquals("LogItemTest", Iterators.nextIn(LogItem.class));
	}

	/**
	 * Test method for {@link LogEvents#next()}.
	 */
	@Test(expected = NoSuchElementException.class)
	public void next_should_throw_an_iexceotion_of_log_entry_if_next_is_an_element_other_than_log_item() {
		assertEquals("unittest", Iterators.nextIn((LogItem) null)); // throws NullPointerException on non-collection
	}
	
	@Test
	public void next_should_invoke_next() {
		// given
	   
}
}