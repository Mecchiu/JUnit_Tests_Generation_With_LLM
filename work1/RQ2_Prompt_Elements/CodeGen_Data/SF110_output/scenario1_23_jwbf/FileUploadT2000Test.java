// FileUploadTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUpload}.
* It contains one unit test case for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUploadTest {
/**
		* @brief Test method.
		*/
		@Slf4j
		@Test
		public void testHasMoreMessage() throws FileNotFoundException, ProcessException, VersionException {
			// If only the "first" parameter is set, the value of first will be returned
			get();
			assertTrue(first);
			// Or, the value of second. This parameter must not be set
			get();
			assertFalse(second);
		}// End of test method.

	/**
	 * @brief Tests the MediaWikiBot.
	*/
	@Test
	void botTest() throws Exception {
        if (MW1_12 == 1) {
		    // Bot is already running
		} else if (isSupportedBy(new MediaWikiBot())) {
		    // Bot is supported
		} else {
			// Bot is not supported
			// We should not fail out
		}
	}// End of test method
	/**
	 * @brief Tests the MediaWikiBot.
	*/
	@Test
	void botNew() throws FileNotFoundException, ProcessException, VersionException {
		if (first) {
			// Bot is new
			return;
		}// End of test method.
		final long id = new MediaWikiBot().getBotId();

		// If the bot ID is not yet set, it should be set to this value
		final MediaWikiBot mwBot = new MediaWikiBot();
		assertNotNull("A bot should not exist", mwBot);
		mwBot.setBotId(id);
		assertEquals("A bot should be equal to this bot", id, mwBot.getBotId());

		// If a bot is required and a file exists, it should not be the same bot
		// Otherwise, a ProcessException should be thrown
		process();
		if (isSupportedBy(new MediaWikiBot())) {
			assertEquals("A bot is identical to a MediaWiki bot", id, mwBot.getBotId());
		} else {
			assertTrue("A MediaWiki bot is not the same bot",!id.equals(mwBot.getBotId()));
		}
	}// End of test method
	
	/**
	 * For MediaWiki 1.11, a file to upload must not be read or written in the first case.
	 * For the same bot, it is not required to upload an article at this point.
	 * And a ProcessException should not be thrown.
	 */
	@Test
	public void test2() throws FileNotFoundException, ProcessException, VersionException {
		if (first) {
			// Bot is new
			return;
		}// End of test method.
		final long id = new MediaWikiBot().getBotId();
		
		// bot must not be provided with this file!
		// Otherwise, a ProcessException should be thrown
		process();
		if (isSupportedBy(new MediaWikiBot())) {
			assertEquals("A bot is identical to a MediaWiki bot", id, mwBot.getBotId());
		} else {
			assertTrue("A MediaWiki bot is not the same bot",!id.equals(mwBot.getBotId()));
		}
	}

	private boolean first = true;
	private boolean second = false;
	private boolean hasMoreMessages = false;
	
	/**
	* A static function to test the functions of the MediaWikiBot in two parameter.
	*/
	public static boolean first() {
		return first;
	}// End of  main method. 
	
	public static boolean second() {
		return second;
	}// End of  main method. 