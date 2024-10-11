// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains one unit test case for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {
		
	/**
	 * Test method for "TemplateUserActions.processAllReturningText"
	*/
	@Test
	@Slf4j
	public void testprocessAllReturningText_basic() throws VersionException {
		
		// construct the MediaWikiBot to use at this test
		MediaWikiBot bot = MediaWikiBot.build("MediaWikiBot-1.8.0", null);
						
		// define the method to be called
		MethodDescription getRequest = new MethodDescription("getRequest", MediaWiki.class) {
			
			@Override
			public Object invoke(Object self, Object[] args) throws Throwable {
				return "all-text";
			}};
		
		@MWAction
		Object response;
						
		@Get
		Object getRequest1;
		
		// call the MediaWiki action
		response = bot.action(getRequest);
		
		// the mediawiki-response should start with "request=all-text"
		assertEquals(MwQuery.class, response.getClass());
		
		// get the first method description for "request=all-text"
		MethodDescription allTextMethod = MediaWiki.class.getMethod("processAllReturningText", String.class);

		// when the "response" field contains the "getRequest1" method description
		// it should include that method description
		assertTrue(allTextMethod.desc().equals(getRequest1));
		
		// and the returned value should be "all-text"
		assertTrue(response.equals(allTextMethod));
		
	}
	
	/**
	 * Test method for "TemplateUserActions.processAllReturningText"
	 */
	@Test
	@Slf4j
	public void testprocessAllReturningText_invalid_methodName() throws VersionException {
		
		// construct the MediaWikiBot to use at this test
		MediaWikiBot bot = MediaWikiBot.build("MediaWikiBot-1.8.0", null);
						
		// define the method to be called
		MethodDescription invalidMethodName = new MethodDescription("invalidMethodName", MediaWiki.class, String.class, String.class, String.class);
		
		@Get
		String getRequest;
				
		// call the MediaWiki action
		try {
			bot.action(invalidMethodName, "all-text", "page", "lang", "nl");
		} catch (VersionException ex) {
			assertTrue(false);
		}
				
	}
	
	/**
	 * Test method for "TemplateUserActions.processAllReturningText"
	 */
	@Test
	@Slf4j
	public void testprocessAllReturningText_no_parameter() throws VersionException {
		
		// construct the MediaWikiBot to use at this test
		MediaWikiBot bot = MediaWikiBot.build("MediaWikiBot-1.8.0", null);
						
		@Get
		String getRequest;
				
		// call the MediaWiki action
		try {
			bot.action(getRequest);
			fail("expected exception with invalid parameter name 'param' (2)!");
		} catch (VersionException ex) {
			// expected, except the exception should be caught by this test
			assertTrue(false);
		}
	}
	
	/**
	 * Test method for "TemplateUserActions.processTemplate"
	 */
}