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
		/**
		* Tests if the method {@link PostModifyContent#hasMoreMessages()} returns a value of
		* {@link Boolean#FALSE}.
		*/
      @Test
      public void testHasMoreMessages() {
			PostModifyContent ppoc = new PostModifyContent("Content of article");
			ppoc.add(new SimpleArticle("content of article", new Hashtable(), new HashSet()));
			ppoc.add(new SimpleArticle("content of article", new Hashtable(), new HashSet()));
			boolean resultOfHasMoreMessages = ppoc.hasMoreMessages();
			assertTrue(resultOfHasMoreMessages);
      }

      /**
       * Tests if the method {@link PostModifyContent#hasMoreMessages()} returns a value of
       * {@link Boolean#FALSE} if the method
       * {@link PostModifyContent#setMoreMessages(Set)} was called more times than
       * when the method
       * {@link PostModifyContent#add(SimpleArticle)} was called.
       */
		@Test
      public void testHasMoreMessagesWithSameAsAdditionOfArticle() {
			PostModifyContent pmod = new PostModifyContent("Content of article");
			ppod.add(new SimpleArticle("content of article", new Hashtable(), new HashSet()));
			ppod.add(new SimpleArticle("content of article", new Hashtable(), new HashSet()));
			boolean resultOfHasMoreMessages = pmod.hasMoreMessages();
			assertTrue(resultOfHasMoreMessages);
      }

			/**
		* Tests if the method {@link PostModifyContent#hasMoreMessages()} returns NOT {@link Boolean#FALSE}.
		*/
		@Test
      public void testNoMoreMessages() {
			PostModifyContent pmod = new PostModifyContent("Content of article");
			ppod.add(new SimpleArticle("content of article", new Hashtable(), new HashSet()));
			boolean resultOfNoMoreMessages = pmod.hasMoreMessages();
			assertTrue(resultOfNoMoreMessages);
      }
}

@Slf4j
/**
* This action was in the old XML format, it does a check against the new XML format.
*/
@Slf4j
public class PostModifyContent_1Test extends PostModifyContent{

    @Override
    public boolean hasMoreMessages() {
    	return false;
    }

    @Test
    public void testPostingTheMoreMessagesAreAdded() throws VersionException, VersionException, ContentAccessException {
        PostModifyContent pmod1 = new PostModifyContent(Version.createFromVersions("1.7"));
	    Set<SimpleArticle> moreMessages = pmod1.process(new Get()
		       .forVersion(Version.createFromVersions("1.7"))
		       .and(SupportedBy.CONTENT_DISPLAY)
	       .get().value());
	    assertFalse(moreMessages.isEmpty());
    }

    @Test
    public void testAddingMoreMessages() throws ActionException {
}
}