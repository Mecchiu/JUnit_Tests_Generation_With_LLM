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
		FileUploadTest() {}

		/**
		* Test method for {@link FileUpload#FileUpload(MediaWiki)}.
		*/
		@SuppressWarnings("javadoc") // the MediaWiki bot.
		@Test
		public void test()
		throws VersionException, FileNotFoundException, ProcessException, ActionException, VersionException,
		     ProcessException {
			// We test by calling {@link FileUpload#hasMoreMessages()}
			FileUpload testFile = new FileUpload();

			// We expect the test file to be called with version 1.11
			assertFalse(testFile.hasMoreMessages());

			// The MediaWiki bot starts by calling {@link FileUpload#start()}
			// and we expect it to be called with version 1.12
			testFile = new FileUpload();
			testFile.start();

			// We expect the test file to be called with version 1.13
			assertTrue(testFile.hasMoreMessages());
		}
}