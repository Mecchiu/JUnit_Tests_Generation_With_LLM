// PostModifyContentTest.java
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
* It contains ten unit test cases for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContentTest {

	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first and second are true.
	 */
	@Test
	void testHasMoreMessages_firstAndSecondTrue() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = true;
		postModifyContent.second = true;
		assertTrue(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is true and second is false.
	 */
	@Test
	void testHasMoreMessages_firstTrueAndSecondFalse() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = true;
		postModifyContent.second = false;
		assertTrue(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is false and second is true.
	 */
	@Test
	void testHasMoreMessages_firstFalseAndSecondTrue() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = false;
		postModifyContent.second = true;
		assertTrue(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first and second are false.
	 */
	@Test
	void testHasMoreMessages_firstAndSecondFalse() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = false;
		postModifyContent.second = false;
		assertFalse(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is true and second is null.
	 */
	@Test
	void testHasMoreMessages_firstTrueAndSecondNull() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = true;
		postModifyContent.second = null;
		assertTrue(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is null and second is true.
	 */
	@Test
	void testHasMoreMessages_firstNullAndSecondTrue() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = null;
		postModifyContent.second = true;
		assertTrue(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first and second are null.
	 */
	@Test
	void testHasMoreMessages_firstAndSecondNull() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = null;
		postModifyContent.second = null;
		assertFalse(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is false and second is null.
	 */
	@Test
	void testHasMoreMessages_firstFalseAndSecondNull() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = false;
		postModifyContent.second = null;
		assertFalse(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first is null and second is false.
	 */
	@Test
	void testHasMoreMessages_firstNullAndSecondFalse() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = null;
		postModifyContent.second = false;
		assertFalse(postModifyContent.hasMoreMessages());
	}
	
	/**
	 * Test case for {@link PostModifyContent#hasMoreMessages()} method.
	 * It tests the case when the first and second are null.
	 */
	@Test
	void testHasMoreMessages_firstAndSecondNull() {
		PostModifyContent postModifyContent = new PostModifyContent();
		postModifyContent.first = null;
		postModifyContent.second = null;
		assertFalse(postModifyContent.hasMoreMessages());
	}
}

// PostModifyContent.java
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

/**
 * Writes an article.
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_09, MW1_10, MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class PostModifyContent extends MWAction {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasMoreMessages() {
        return first || second;
    }
}

// PostModifyContentTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net