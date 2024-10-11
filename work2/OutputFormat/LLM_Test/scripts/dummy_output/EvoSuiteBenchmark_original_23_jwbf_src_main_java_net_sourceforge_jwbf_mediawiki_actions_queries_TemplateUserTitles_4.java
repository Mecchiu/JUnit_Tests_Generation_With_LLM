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
		private static final String PAGE = "/wikipedia/api/0?format=item";
		private static final String USER = "test";
		private static final String TEXT = "Hello World!";
		private static final String TEXT2 = "Hello World!";
		private static String PAGE_CONTENT = null;
		private static boolean USER_CONTACTED_AT_END;

		/**
		 * Test that returns text content while processing all return
		 * text.
		 *
		 * @throws UnknownWikiVersionException if the version is not supported
		 * @throws VersionException if some other error occurs
		 */
		@Test
		void testGetAllReturningText() {

			/**
			 * Test that returns text content while processing all text.
			 */
			LOGGER.debug("Testing processing all text: "+PAGE_CONTENT);
			String mwResponse = processAllReturningText(PAGE_CONTENT);
			assertNotNull("PAGE content should not be null!", mwResponse);
		}

		/**
		 * Test that returns text content while processing all new text.
		 *
		 * @throws UnknownWikiVersionException if the version is not supported
		 * @throws VersionException if some other error occurs
		 */
		@Test
		void testGetNewOnly() {

			/**
			 * Setup MediaWiki before asking this to check its version.
			 */
			LOGGER.debug("Initialise MediaWiki!");
			PAGE_CONTENT = PAGE;
			String mwResponse = processAllReturningText(PAGE_CONTENT);
			assertNotNull("PAGE content should not be null!", mwResponse);
			LOGGER.debug("Check the MediaWiki version of the wiki!");
			String wikiVersion = getWikiVersion();
			assertNotNull("We got a response from the wiki", wikiVersion);

			LOGGER.info("\n\n\n\nTesting whether the MediaWiki wiki version ({}) is still supported in MediaWiki (1.2a+)!\n", wikiVersion);
			if (!wikiVersion.equals(MW1_12)) { // MediaWiki 1.12 is required
				String wikiStatus = MediaWiki.versionToStatus(wikiVersion);
				assertNotNull("We got status for the wiki version ("+wikiVersion+") from MediaWiki (1.2a+), not a success, which implies that the wiki is not supported!");
				assertTrue("The MediaWiki wiki status (1.2a+) should have been 'error'!", wikiStatus.equals(MediaWiki.Status.ERROR));
			}

			// The MediaWiki wiki version should still be
			// not having the "w00t" tag in the text
			assertTrue("The MediaWiki wiki tag should contain a <tr>!");
			assertTrue("The MediaWiki wiki tag should contain a <br />!", mwResponse.contains("</tr>"));
			assertFalse("The MediaWiki wiki tag should not contain a </tr>!", mwResponse.contains("</tr>"));

			LOGGER.info("\n\n\n\nTesting asking MediaWiki wiki that doesn't provide us with a version of 1.11.xx!\n");
			MediaWiki mw = new MediaWiki();
			mw.setBaseURL(getBaseURL());
			mw.setToken("token");
			String mwResponse = mw.ask(TEXT);
			assertTrue("Getting a MediaWiki wiki shouldn't produce the expected error message, but "+mwResponse, false);
			LOGGER.info("Ok, we still ask a wiktion without a wiki tag");
}
}