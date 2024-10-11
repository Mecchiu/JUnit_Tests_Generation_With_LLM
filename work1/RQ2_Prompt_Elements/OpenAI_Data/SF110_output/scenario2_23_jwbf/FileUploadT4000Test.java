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
* It contains ten unit test cases for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUploadTest {

		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testHasMoreMessages_LoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is null.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, null);
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is null.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, null);
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is empty.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", ""));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is empty.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", ""));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is not empty.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileNotEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is not empty.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileNotEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is not empty and the file name is null.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileNotEmpty_FileNameNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile(null, "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is not empty and the file name is null.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileNotEmpty_FileNameNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile(null, "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is not empty and the file name is empty.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileNotEmpty_FileNameEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is not empty and the file name is empty.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileNotEmpty_FileNameEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
}

// FileUpload.java
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

/**
 * <p>
 * To allow your bot to upload media in your MediaWiki. Add at least the following line
 * to your MediaWiki's LocalSettings.php:<br>
 *
 * <pre>
 * $wgEnableUploads = true;
 * </pre>
 *
 * For more details see also
 * <a href="http://www.mediawiki.org/wiki/Help:Configuration_settings#Uploads">Upload Config</a>
 *
 * @author Justus Bisser
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class FileUpload extends MWAction {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasMoreMessages() {
        return first || second;
    }
}

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
* It contains ten unit test cases for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUploadTest {
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in.
		 */
		@Test
		void testHasMoreMessages_LoggedIn() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("test.txt", "test"));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is null.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, null);
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is null.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileNull() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, null);
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is empty.
		 */
		@Test
		void testHasMoreMessages_NotLoggedIn_FileEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", ""));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is logged in and the file is empty.
		 */
		@Test
		void testHasMoreMessages_LoggedIn_FileEmpty() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				bot.login("username", "password");
				FileUpload fileUpload = new FileUpload(bot, new SimpleFile("", ""));
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		 * Test case for {@link FileUpload#hasMoreMessages()} method.
		 * It tests the case when the bot is not logged in and the file is not empty.
		 */
		@Test
		void