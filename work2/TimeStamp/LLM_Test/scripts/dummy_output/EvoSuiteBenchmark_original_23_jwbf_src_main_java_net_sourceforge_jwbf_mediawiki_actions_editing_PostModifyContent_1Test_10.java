// PostModifyContent_1Test.java
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
* It contains one unit test case for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContent_1Test {
		

	@Test
	void testValidCaseForSimpleArticleWhenValidSet() {
        log.info("testValidCaseForSimpleArticleWhenValidSet():");
		Publish post = new Publish(true, "title");
		
		Hashtable<Version, String> params = new Hashtable<Version, String>();
		params.put(Version.VERSION, "1.9");
		params.put(Version.PUBLIC, "");

		SimpleArticle article = new SimpleArticle();
		article.addPublish(post);
		article.addPublishAccess(new Get(null));
		article.addPublishContent(new Post(null, params));
		article.testPublish(null);
		
		assertEquals(true, isIntersectionEmpty(null, article));
		
	}
	
	@Test
	void testNotValidCaseForSimpleArticleWhenValidSet() {
        log.info("testNotValidCaseForSimpleArticleWhenValidSet():");
		Publish post = new Publish(false, "title");
		
		Hashtable<Version, String> params = new Hashtable<Version, String>();
		params.put(Version.VERSION, "1.9");
		params.put(Version.PUBLIC, "");

		SimpleArticle article = new SimpleArticle();
		article.addPublish(post);
		article.addPublishAccess(new Get(null));
		article.addPublishContent(new Post(null, params));
		
		assertEquals(false, isIntersectionEmpty(null, article));
		
	}

	@Test
	void testValidCaseForSimpleArticleWhenInvalidSet() {
        log.info("testValidCaseForSimpleArticleWhenInvalidSet():");
		Publish post = new Publish(true, "title");
		
		Hashtable<Version, String> params = new Hashtable<Version, String>();
		params.put(Version.VERSION, "1.9");
		params.put(Version.PUBLIC, "");

		SimpleArticle article = new SimpleArticle();
		article.addPublish(post);
		article.addPublishAccess(new Get(null));
		article.addPublishContent(new Post(null, params));
		
		assertEquals(true, isIntersectionEmpty(null, article));
		
	}
	
	@Test
	void testValidCaseForArticleWhenValidSet() {
        log.info("testValidCaseForArticleWhenValidSet():");
		Publish post = new Publish(true, "title");
		
		Hashtable<Version, String> params = new Hashtable<Version, String>();
		params.put(Version.VERSION, "1.9");
		params.put(Version.PUBLIC, "");
		params.put(Version.TEXT, "text");

		article = new SimpleArticle();
		article.addPublish(post);
		article.addPublishAccess(new Get(null));
		article.addPublishContent(new Post(null, params));
}
}