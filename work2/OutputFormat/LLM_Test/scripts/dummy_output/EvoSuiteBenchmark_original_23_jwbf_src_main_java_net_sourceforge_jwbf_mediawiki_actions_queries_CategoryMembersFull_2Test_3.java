// CategoryMembersFull_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains one unit test case for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {
		
	/**
	* Initializes the tests.
	* It consists of one test case for each {@link Version} of supported by this
	* class for the first version available with the MediaWiki-Action.
	*
	* @return The result of the test.
	* @throws MediaWikiException A MediaWiki exception with the errors raised by this
	* methods.
	*/
	@Test
	@JwbfException
	public void test() throws MediaWikiException {
		String result = next(Version.newInstance(0));
		assertTrue(result.matches("(?s).*has next.*"));
		result = next(Version.newInstance(1));
		assertTrue(result.matches("(?s).*has next.*"));
		result = next(Version.newInstance(MW1_14));
		assertFalse(result.matches("(?s).*has next.*"));
	}
	
	/**
	* Assertion method for the {@link #test()} method.
	* It takes in the {@code result} as parameter and will iterate over the
	* returned {@link String} collection of results.
	*
	* @param expected The {@code result} expected.  
	* @param actual The expected result.
	* @param testTheActualString A new {@link String} to assert.
	*/
	private void assertNextReturn(String expected, String actual, String testTheActualString) {
		
		boolean foundIt = false;
		if (expected.isEmpty() && actual.isEmpty()) {
			foundIt = true;
		} else {
//            String[] tests = expected.split(System.lineSeparator());
			if (expected.isEmpty()) {
				foundIt = false;
			}
			if (actual.isEmpty()) {
				foundIt = false;
			}
		}

		assertTrue("The actual result contains more than expected.", foundIt);
	}

	/**
	* Creates the actual mediawiki_action to make an HTTP request against the MediaWiki server.
	* It is recommended to call the mediawiki_action.next() method once per {@link Version}.
	*
	* @return The actual mediawiki_action.
	* @throws MediaWikiException A MediaWiki exception with the errors raised by this
	* methods.
	*/
	private HttpAction next() throws MediaWikiException {	
		return new HttpAction(JwbfWeb.getInstance().getConnectionWithTimeout(JwbfWeb.getInstance().getConnectionTimeout(), Version.newInstance(0)));
	}
	
	/**
	* Reads an instance of {@link MediaWikiBot} from the 
	* {@link MediaWikiBot#getBot()} method and gets a handle
	* for its {@link MediaWikiBot#next()}, checks for a {@link Boolean}
	* is set to {@code true} and returns
	* the corresponding {@link MediaWikiBot#getMediawikiBot()},
	* which points to the instance of this
	* class.
	*
	* @return An instance of MediaWikiBot.
	* @throws MediaWikiException A MediaWiki exception with the errors raised by this
	* methods.
	*/
	private MediaWikiBot getBotWithMediawikiBot() throws MediaWikiException {
		
		return MediaWikiBot.getBot(this);
	}
	
    @RunWith(Arquillian.class)
    @Slf4j
    public static class MediaWikiBotTestRule {

		/**
		* Reads a MediaWikiBot from the
		* MediaWikiBot#getBot(jwbf.jwbfweb.junit.extension.mediawiki.MediaWikiBot)
		* method in order to return an instance of MediaWikiBot,
		* which will be loaded by MediaWikiBotRunner's
		* process.
		*
		* @return MediaWikiBot The instance of MediaWikiBot.
		* @throws MediaWikiException A MediaWiki exception with the errors raised by this
		* methods.
		*/
		@Deployment( managed = false )
		public static final MediaWikiBotTestRule INSTANCE = new MediaWikiBotTestRule(null);

}
}