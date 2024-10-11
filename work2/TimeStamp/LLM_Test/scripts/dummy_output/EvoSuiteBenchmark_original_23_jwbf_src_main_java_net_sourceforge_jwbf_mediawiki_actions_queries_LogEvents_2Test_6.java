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
* Unit Test case for {@link LogEvents#iterator()}
* This method is a general purpose method of test cases and might fail
* in some case. If a non-concise test is wanted, please use {@link String#valueOf(Object)}.
* It depends on version of MediaWiki.
*/
	@Test
	public void test$iterator() {
		// 1) create
		LogEvents eventTestsUtility = createEventList();
		// 2) execute
		Iterator<LogItem> result = eventTestsUtility.iterator();
		// 3) get the result
		assertTrue(result!= null);
		assertTrue(result.hasNext());
		assertTrue(result instanceof Iterator);
		Iterator<LogItem> iter = result;
		// 4) seek to the next position
		iter.next();
	}
	public static LogEvents createEventList() {
		// create instance of the expected class
		return new LogEvents();
	}

	/**
	 * Test the creation of a new instance of the class {@link LogEvents}.
	 */
	@Slf4j
	@Test // http://goo.gl/uHmOo
	void test$initialize() {
		// 1) create instance of LogEvents
		LogEvents eventTestsUtility = createEventList();
		// 2) set the created instance to a valid state
		// NOTE: we do this BEFORE writing the test as it does not work if this is disabled
		//for (Field f: LogEvent.class.getFields()) {
		//	System.out.println(f.getName());
		//}
		eventTestsUtility.setToValid();
		// 3) initialize the class
		// 5) run the test cases with the class
		// 4) execute the test cases
		// NOTE: we assume this run is not called via constructor
		assertNotNull(eventTestsUtility);
		assertNotNull(eventTestsUtility.getLogItemClass());
		assertEquals(eventTestsUtility.getLogItemClass(), LogItem.class);
		assertNotNull(eventTestsUtility.getLogFieldClass());
		assertEquals(eventTestsUtility.getLogFieldClass(), LogField.class);
		assertNotNull(eventTestsUtility.getLogEventClass());
		assertEquals(eventTestsUtility.getLogEventClass(), Event.class);
		assertNotNull(eventTestsUtility.getLogEventFieldClass());
		assertEquals(eventTestsUtility.getLogEventFieldClass(), EventField.class);
		assertNotNull(eventTestsUtility.getLogEventConstructorClass());
		assertEquals(eventTestsUtility.getLogEventConstructorClass(), EventConstructor.class);
		assertNotNull(eventTestsUtility.getLogEventConstructorFieldClass());
}
}