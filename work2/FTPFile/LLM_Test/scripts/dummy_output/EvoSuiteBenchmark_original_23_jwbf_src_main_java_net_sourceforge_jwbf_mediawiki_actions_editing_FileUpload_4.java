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
		
		private static final Path PATH = PathsTest.getDataRoot() + FileUploadTest.class.getName() + File.separator + "mediawiki-bot1.txt";

	/**
	 * {@link FileUpload#toGet}
	 */
	@Get(
		Version.VERSION_12
				+ "?action_params=<id>=<id>%7Db&content_revision_text=<revision>%7Db"
				+ "&action_params=<id>=<id>%7D&format=text"
	)
	public static class GetFileUploadTestCase extends FileUploadTest {
		private static final String REVISION = "revision";

		@Get
		public static FileUpload instance() throws VersionException, ProcessException {
			return Get.runTest(PATH, MediaWiki.VERSION_12, REVISION, FileUploadTest.class);
		}

		@Post
		public static FileUpload instance1() throws VersionException, ProcessException {
			return Post.runTest(PATH, MediaWiki.VERSION_12, REVISION, FileUploadTest.class);
		}
	}

	/**
	 * {@link FileUpload#toDoList}
	 */
	@Get(
		Version.VERSION_12
				+ "?action_params=<id>=<id>%7D&search_text=<search_text>%7D&format=text"
	)
	public static class ToDoListTestCase extends FileUploadTest {
		private static final String SEARCH_TEXT = "Search-text";
		private static final Path REVISION = PathsTest.getDataRoot() + FileUploadTest.class.getName() + File.separator + "revision.txt";

		@Get
		public static FileUpload instance() throws VersionException, ProcessException {
			return Get.runTest(PathsTest.getDataRoot() + FileUploadTest.class.getName() + File.separator + "toListTest.txt", MediaWiki.VERSION_12, SEARCH_TEXT, REVISION, FileUploadTest.class);
		}
	}

	/**
	 * {@link FileUpload#action.toDo}
	 */
	@Get
	public static class ToDoTestCase extends MediaWikiTest {

		@Post
		public static MediaWiki instance() throws VersionException, ProcessException {
			return Post.runTest(PATH, MediaWiki.VERSION_12, "", "");
		}

	}

	/**
	 * {@link FileUpload#uploadFromFile}
	 */
	@Get
	public static class UploadFromFile extends FileUploadTest {
		private static final String FILENAME = "uploadFromFile";
		private static final Path REVISION = PathsTest.getDataRoot() + FileUploadTest.class.getName() + File.separator + "revision_" + FILENAME;

		@Post
		public static MediaWiki instance() throws VersionException, ProcessException, FileNotFoundException {
			return Post.runTest(PATH, MediaWiki.VERSION_12, FILENAME, REVISION, MediaWikiTest.class);
		}
	}

	/**
	 * {@link FileUpload#uploadFromFile}
	 */
	@Post
	public static class UploadFromFailed extends MediaWikiTest {
		private static final String FILENAME = "uploadFromFailed";
		private static final Path REVISION = PathsTest.getDataRoot() + FileUploadTest.class.getName() + File.separator + "revision_" + FILENAME;

}
}