// PostModifyContent_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains one unit test case for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {
		public postModifyContent_0Test() {
			super(2);
		}
		@Test
		void testHasMoreMessages() throws PostException, VersionException, ContentAccessable, IOException, JwbfException {
			log.info("Test hasMoreMessages");
			// 1. Post on wiki
			// Post.
			final ContentAccessable contentAccessable = MediaWiki.getWiki("en").postText("This is the text");
			assertFalse(contentAccessable.get().isPost());

			// 2. Post on wiki with default properties
			String text = "<p>This is a text</p>";
			final ContentAccessable firstContentAccessable = MediaWiki.getWiki("en").postTextContent("First title", text);
			assertFalse(firstContentAccessable.get().isPost());
			assertEquals(text, firstContentAccessable.get().getContentText());
			assertTrue(firstContentAccessable.get().getContentText().startsWith("First title"));

			// Post without language set
			text = "<p>This is a text</p>";
			final ContentAccessable secondContentAccessable = MediaWiki.getWiki("en").postTextContent("Fourth title", text);
			assertTrue(secondContentAccessable.get().isPost());
			assertTrue(secondContentAccessable.get().getLanguage().isEmpty());
			assertEquals(text, secondContentAccessable.get().getContentText());
			assertEquals("Second title", secondContentAccessable.get().getTitle());
			assertNotEquals("Second title", secondContentAccessable.get().getContent("Second title").getTitle());

			// 3. Post without lang on content access
			text = "<p>This is a text</p>";
			final ContentAccessable thirdContentAccessable = MediaWiki.getWiki("en").postTextContent("Fourth title", text);
			assertFalse(thirdContentAccessable.get().isPost());
			assertEquals("Fourth title", thirdContentAccessable.get().getTitle());
			assertTrue(thirdContentAccessable.get().getLanguage().isEmpty());
			assertEquals(text, thirdContentAccessable.get().getContentText());
			assertEquals("Second title", secondContentAccessable.get().getTitle());

			// 4. Post without lang on content access, with content on wiki
			text = "<p>This is a text</p>";
			final ContentAccessable fourthContentAccessable = MediaWiki.getWiki("en").postTextContent("Fourth title", text);
			assertFalse(fourthContentAccessable.get().isPost());
			assertEquals("Fourth title", fourthContentAccessable.get().getTitle());
			assertFalse(fourthContentAccessable.get().getLanguage().isEmpty());
			assertEquals(text, fourthContentAccessable.get().getContentText());
			assertNotEquals("Second title", secondContentAccessable.get().getTitle());

			// 5. Post without lang on content access, with content on wiki
			text = "<p>This is a text</p>";
			final ContentAccessable fifthContentAccessable = MediaWiki.getWiki("en").postTextContent("Fourth title", text);
			final SimpleArticle fifthArticle = fifthContentAccessable.get();

}
}