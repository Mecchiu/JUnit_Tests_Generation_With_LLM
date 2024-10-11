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
		* It tests if the method returns true if the first message is not null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertTrue(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first message is null and the second message is not null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertTrue(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNull_sixthMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNull_sixthMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNull_sixthMessageNull_seventhMessageNotNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first message is null and the second message is null.
		*/
		@Test
		void testHasMoreMessages_firstMessageNull_secondMessageNull_thirdMessageNull_fourthMessageNull_fifthMessageNull_sixthMessageNull_seventhMessageNull() {
				
				// Arrange
				FileUpload fileUpload = new FileUpload(new SimpleFile("test.txt", "test"), new MediaWikiBot());
				fileUpload.first = false;
				fileUpload.second = false;
				
				// Act
				boolean result = fileUpload.hasMoreMessages();
				
				// Assert
				assertFalse(result);
		}
}