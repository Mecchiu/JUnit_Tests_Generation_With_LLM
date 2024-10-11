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

	private static final Pattern pattern;
	private static final Matcher matcher;
	private static final SimpleFile file;

	static {
		// we create a single Pattern instance to be used by the
		// FileUpload constructor. A specific regex pattern
		// for Pattern instances is defined in {@link Pattern})
		pattern = Pattern.compile("(\\d+)");
		matcher = pattern.matcher("");
		file = new SimpleFile("file", "");
	}



	/**
	* Test method for {@link FileUpload#getFilesToUpload()}
	* @throws ProcessException exception thrown when error occur during execution
	* @throws FileNotFoundException exception thrown when there is some problem during file retrieval
	*/
	@Test
	public void testGetFilesToUpload() throws ProcessException, FileNotFoundException {
	String response = "";
	final FileUpload fileupload = new FileUpload();
	fileupload.setFile(file);
		try {
			response = fileupload.getFilesToUpload();
		} catch (ActionException e) {
            throw new ProcessException("Error during execution", e);
		}
		log.info("Expected result: "+response);
		log.info("Actual result: "+response);
		assertEquals(response, "");
	}
	/**
 	 * This test checks that MediaWiki's Configuration file contains the values that
 	 * have been exported to MediaWiki1.11+ (with some additional entries in it),
 	 * MediaWiki's Configuration file containing versions MediaWiki1.12+, MediaWiki's Configuration file containing versions MediaWiki1.13+, MediaWiki's Configuration contains MediaWiki1.14+, MediaWiki's Configuration has MediaWiki1.15+, MediaWiki's Configuration contains MediaWiki1.15+ and MediaWiki1.16+ extra keys.
	 * @throws VersionException version exception when the Configuration file was not correctly formatted
	 */
	@Test
	public void testGetFilesToUploadWithConfiguration() throws VersionException {
		final Version v = Version.getVersion("1.15");
		log.info("Version: "+v);
		final String content = "Content-Disposition: form-data; name=\"fileName\"\r\n\r\nfile.txt";
		final String filename = "file.txt";
		String response = "";
		log.debug("Content length is: "+content.length());
		response = String.format("name=%s&file=%s&content=%s",filename,filename,content);
		
        try {
			final HttpAction action = new HttpAction() {
				@Override
				protected HttpAction execute() throws ActionException {
					setRequestMethod("POST");
					setRequestBody(filename.length()+"");
					return postRequest();
				}
			};

			assertEquals(content,v.formatString());
			assertEquals(response,mw1_11 + "," + v.formatString());
			FileUpload fileupload = new FileUpload();
			fileupload.setRequestMethod("POST");
			fileupload.setRequestBody("test");
			response = action.doAction(fileupload);
			log.debug("getFilesToUpload() -> "+response);
			
			log.debug("Content length is: "+content.length());
			log.debug("File uploaded successfully");
			assertEquals(response,MW1_11 + "," + v.formatString());
			
		} catch (VersionException ve) {
			log.debug("getFilesToUpload() -> "+ve.getMessage());
			throw ve;
		}
	/**
 	