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
		private MediaWiki mediaWiki;
		private MediaWikiBot bot;
		private FileUpload fileUpload;
		@Test
		void shouldReceiveFile() throws FileNotFoundException, VersionException {
			try {
				fileUpload = new FileUpload(mediaWiki.getConfiguration().getCurrentSettings());
				fileUpload.setContent("file is uploaded");
				assertEquals(1, bot.getMessages().size());
			}
			catch (ActionException ex) {
				assertExceptionContains(FileNotFoundException.class, ex);
			}
		}
		@Test
		void shouldSkipWithoutFile() throws VersionException {
			fileUpload = new FileUpload(mediaWiki.getConfiguration().getCurrentSettings());
			fileUpload.setSkip(true);
			fileUpload.setContent("file is uploaded without file");
			assertEquals(1, bot.getMessages().size());
		}
		@Test
		void shouldSkipAndSkipWithoutContent() throws VersionException {
			fileUpload = new FileUpload(mediaWiki.getConfiguration().getCurrentSettings());
			fileUpload.setSkip(true);
			fileUpload.setSkipContentWithoutFile(true);
			fileUpload.setContent("file is uploaded without content");
			assertEquals(1, bot.getMessages().size());
		}
}

// MediaWikiTestTest.java