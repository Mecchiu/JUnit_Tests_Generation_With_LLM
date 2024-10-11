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
		 * Tests {@link #FileUpload#hasMoreMessages()} method.
		 */
		@Test
		public void hasMoreMessagesTest() {
				// Given
				// - A list of SimpleFile objects,
				// - The list of simpleFile objects that will be contained in the
				//   test case.
				// - A list of SimpleFile Objects,
				// - A list of SimpleFile Objects that will be contained in the
				//   test case.
				//

				// When
				// - Execute the method under test
				// - Assert if the method has more messages.
				//
					assertTrue("We must return true", FileUpload.hasMoreMessages());
		}
		
		/**
		 * Tests the {@link #hasMoreMessages()} method under the {@link SimpleFile}
		 * objects in the list of SimpleFile objects that are contained in the test
		 * object {@link FileUploadTest#hasMoreMessagesTest}.
		 */
		@Test
		public void hasMoreMessagesTestOfListOfSimpleFiles() {
				// Given
				// - List of SimpleFile objects
				// - List of SimpleFile objects that
				//   will be contained in the test object.
				// - A list of SimpleFile Objects
				// - A list of SimpleFile Objects that
				//   will be contained in the test object.
				
				// When
				// - Execute the method under test
				// - Assert if the method has more messages.
				
				assertTrue("We must return true", FileUpload.hasMoreMessages(new SimpleFile[] { new SimpleFile(), new SimpleFile() }));
		}

	// File upload. 
		public static class FileUploadTest_EditingMediaWiki implements FileUpload {

		private static final Pattern PATTERN_FILE = Pattern.compile("(\\d+) (.+)\\.(.+)\\.txt$");
				
				private final SimpleFile FILE;

				public FileUploadTest_EditingMediaWiki(SimpleFile FILE) {
						this.FILE = FILE;
				}

				@Override
						public void execute() throws ActionException, ProcessException {
							// Given
							//- An instance of MediaWiki.
							//- Execute the method under test

							new MediaWikiBot(FILE.getWikiUrl()).editSimpleFile(new SimpleFile[] {FILE});

					String fileName = "filename" + new Date().getTime();
					new MediaWikiBot(FILE.getWikiUrl()).addFile(fileName, new SimpleFile[] { FileUploadTest_EditingMediaWiki.FILE });
				}

				@Override
				@Slf4j
						public Version getVersion() {
							Matcher matcher = PATTERN_FILE.matcher(this.FILE.getName());
							return SupportedBy.UNKNOWN;
				}

		}
}