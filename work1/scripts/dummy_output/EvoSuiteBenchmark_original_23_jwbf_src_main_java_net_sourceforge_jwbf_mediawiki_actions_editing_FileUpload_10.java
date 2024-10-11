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
		
	private static final String TEST_PATH = "test-file-upload";
	private static final String TEST_DOC_CONTENT = "documentContent";

	public FileUploadTest() {
		super();
	}

	@Test
	void upload_1_11() throws FileNotFoundException, VersionException, ProcessException {
		final MediaWiki mediaWiki = MediaWiki.create();
		final MediaWiki bot = MediaWikiBot.createAndInit(mediaWiki, true);

		// The mock post:
		final SimpleFile content = new SimpleFile("docContent", "the content!");
		final SimpleFile expectedFile= new SimpleFile("TestUploadFile", "The mockFile");
		
		// A mock wiki action:
		final Get<SimpleFile> get = new Get<>(TEST_PATH);
		final Get<String> contentId = new Get<>(TEST_PATH + "/content/id");
		final Post<SimpleFile> action = new Post<>(new MediaWikiBot.DocumentAction(content, expectedFile), MockPost.class);

		final Get<Integer> versionId = new Get<>(TEST_PATH + "/version/id");
		final Post<Integer> action1 = new Post<>(new MediaWikiBot.StatusCheckAction(versionId), MockPost.class);

		final Get<String> actionName = new Get<>(TEST_PATH + "/action/name");
		final Get<String> contentType = new Get<>(TEST_PATH + "/content/type");
		
		// Invoke the action and assert it has been executed
		final MediaWikiBot.Response status = mediaWiki.invoke(action, get, null, null);
		assertTrue("Should have a status code of 200", status.hasReturnStatusCode(200));
		
		final MediaWikiBot.Response actionCheck = mediaWiki.invoke(action1, get, null, null);
		assertTrue("Should have a status code of 200", actionCheck.hasReturnStatusCode(200));
		
		// Check content on the wiki
		assertEquals("Wrong doc content", "The mockFile",
				get.getReturnContentAsString());

		return;
	}


	@Test
	void upload_1_12() throws FileNotFoundException, VersionException, ProcessException {
		final MediaWiki mediaWiki = MediaWiki.create();
		final MediaWiki bot = MediaWikiBot.createAndInit(mediaWiki, true);

		// The mock post:
		final SimpleFile content = new SimpleFile("docContent", "the content!");
		final SimpleFile expectedFile= new SimpleFile("TestUploadFile", "The mockFile");
		
		// The mocked version of a file
		final Version version = new Version(MW1_12, true);

		// A mock wiki action:
		final Get<SimpleFile> get = new Get<>(TEST_PATH);
		final Get<String> contentId = new Get<>(TEST_PATH + "/content/id");
		final Post<SimpleFile> action = new Post<>(new MediaWikiBot.DocumentAction(content, expectedFile), MockPost.class);

		final Get<Integer> versionId = new Get<>(TEST_PATH + "/version/id");
		final Post<Integer> action1 = new Post<>(new MediaWikiBot.StatusCheckAction(versionId), MockPost.class);

		final Get<String> actionName = new Get<>(TEST_PATH + "/action/name");
		final Get<String> contentType = new Get<>(TEST_PATH + "/content/type");

		// Invoke the action and assert it has been executed
}
}