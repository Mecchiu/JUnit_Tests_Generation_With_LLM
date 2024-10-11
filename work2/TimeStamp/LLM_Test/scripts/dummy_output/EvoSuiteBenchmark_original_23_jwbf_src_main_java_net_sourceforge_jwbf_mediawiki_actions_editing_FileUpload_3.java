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
	 * <p>
	 * Test method for {@link FileUpload#hasMoreMessages()}.
	* </p>
	* <p>
	 * The actual test is done by two threads. One for checking the result of the
	* method and another to receive the response which is then sent to the client. The
	* client receives the response but has to wait for the second thread to reply with
	* the response.
	* </p>
	* <p>
	 * If the server responds with a failure, then a test that is expected to fail fails
	* the test. If the response was a success, the test passes or fails as expected.
	* </p>
	* @throws FileNotFoundException If the test fails. 
	* An error shall be thrown. 
	* @throws IOException If the test fails or the server cannot be reached.
	* @throws ProcessException If the test fails or the server cannot be reached.
	*/
	@Test
	@Slf4j
	/*
	 * See https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Fork
	 * @test_method
	 */
	public void testHasMoreMessages() throws FileNotFoundException, IOException, ProcessException {
		final SimpleFile file = SimpleFile.of("/uploadtest/file.txt.test");

		// 1. The test thread
		final FileUploaded thread1 = new FileUploaded(file);
		thread1.run();

		// 2. Post the thread to do the actual test with the response
		Get <?> t = Get.build(POST, "/uploadtest/post.php");
		Post.build(t, thread1, file);
		thread1.join();

		t = Get.build(POST, "/uploadtest/file.php/get.php");
		FileUploaded thread2 = new FileUploaded(FileUploadedTest.class.getResourceAsStream("/uploadtest/file.txt.Test.get.php"));
		thread2.run();
		t = Get.build(POST, "/uploadtest/file.php/file.php/get.php");
		assertFalse(thread2.hasMoreMessages());
		postFileAndWaitForReply(thread1, thread2);

		// 3. A user gets notified, by reading the file sent
		t = Get.build(GET, "/uploadtest/file.php/get.php");
		Thread.sleep(100);
		Thread.sleep(12);
		String message = new String(t.getInputStream());

		// 4. After the file has been read, the user receives the message. Wait a bit
		// and check a reply after processing it.
		System.out.println(message);
		System.out.println("Message is "+message);
		Thread.sleep(500);
		assertTrue(thread2.hasMoreMessages());
		String file1 = new String(thread1.getInputStream());
		Thread.sleep(500);
		assertTrue(file1 == thread2.getRequestText());
		t = Get.build(POST, "/uploadtest/post.php");
		postFileAndWaitForReply(thread1, thread2);

		t = Get.build(POST, "/uploadtest/file.php/get.php");
		FileUploaded thread3 = new FileUploaded(FileUploadedTest.class.getResourceAsStream("/uploadtest/file.txt.Test.get.php"));
		thread3.run();

		// 5. We use a FileUploaded to receive a message
		// 6. We call the get
}
}