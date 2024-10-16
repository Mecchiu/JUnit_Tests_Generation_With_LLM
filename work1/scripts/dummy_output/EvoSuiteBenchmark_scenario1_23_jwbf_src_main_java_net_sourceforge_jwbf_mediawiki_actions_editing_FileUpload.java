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
		* It tests if the method returns true if the first and second boolean variables are true.
		*/
		@Test
		void testHasMoreMessages_1() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = true;
				fileUpload.second = true;
				assertTrue(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first boolean variable is true and the second boolean variable is false.
		*/
		@Test
		void testHasMoreMessages_2() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = true;
				fileUpload.second = false;
				assertTrue(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first boolean variable is false and the second boolean variable is true.
		*/
		@Test
		void testHasMoreMessages_3() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = false;
				fileUpload.second = true;
				assertTrue(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first and second boolean variables are false.
		*/
		@Test
		void testHasMoreMessages_4() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = false;
				fileUpload.second = false;
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first boolean variable is true and the second boolean variable is null.
		*/
		@Test
		void testHasMoreMessages_5() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = true;
				fileUpload.second = null;
				assertTrue(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first boolean variable is null and the second boolean variable is true.
		*/
		@Test
		void testHasMoreMessages_6() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = null;
				fileUpload.second = true;
				assertTrue(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first boolean variable is null and the second boolean variable is false.
		*/
		@Test
		void testHasMoreMessages_7() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = null;
				fileUpload.second = false;
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first boolean variable is false and the second boolean variable is null.
		*/
		@Test
		void testHasMoreMessages_8() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = false;
				fileUpload.second = null;
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns false if the first boolean variable is null and the second boolean variable is null.
		*/
		@Test
		void testHasMoreMessages_9() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = null;
				fileUpload.second = null;
				assertFalse(fileUpload.hasMoreMessages());
		}
		
		/**
		* Test case for {@link FileUpload#hasMoreMessages()} method.
		* It tests if the method returns true if the first boolean variable is null and the second boolean variable is true.
		*/
		@Test
		void testHasMoreMessages_10() {
				FileUpload fileUpload = new FileUpload();
				fileUpload.first = null;
				fileUpload.second = true;
				assertTrue(fileUpload.hasMoreMessages());
		}
}