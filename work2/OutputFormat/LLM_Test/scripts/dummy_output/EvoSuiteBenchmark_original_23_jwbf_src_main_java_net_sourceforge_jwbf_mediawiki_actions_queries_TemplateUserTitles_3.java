// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains one unit test case for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {
		
	/**
     * test if getText returns the text of a specific article
     */
	@Test
	@SupportedBy(MediaWiki.class)
	public void testGetTextForSpecificArticle() throws VersionException {
		// execute
		final MediaWiki query = new MediaWikiParser(Version.fromString("1.10"))
			.load("article:Test Article");
		
		String text = query
			.getText("Test Article");
		
		// the text retrieved is the expected value
		assertEquals("Test Article", text);
	}
	
	@Test
	@SupportingBot(MediaWikiBot.class)
	@SupportedBy(MediaWiki.class)
	public void testLoadUsingOnlyArticles() throws VersionException, MediaWikiException {
		// execute
		final MediaWiki query = new MediaWikiParser(Version.fromString("1.10"))
			.load("article:Test Article");
		
		assertEquals("Test Article", query.getText("Test Article"));
	}
	
	@Test
	@Slf4j @SupportedBy(MediaWiki.class)
	public void testLoadUsingOnlyArticlesWithMatchingQuery() {
		doTestLoadUsingOnlyArticles(new String[] {"*" + MediaWiki.QUERY});
	}
	
	@Test
	@Slf4j @SupportedBy(MediaWiki.class)
	public void testLoadUsingOnlyArticlesWithFailedQuery() {
		doTestLoadUsingOnlyArticles(new String[] {"article with invalid language" + MediaWiki.QUERY});
	}
	
	@Test
	@Slf4j @SupportedBy(MediaWiki.class)
	public void testLoadUsingOnlyArticlesWithEmptyLanguage() {
		doTestLoadUsingOnlyArticles(new String[] {"article with empty language" + MediaWiki.QUERY});
	}
	
	@Test
	@Slf4j @SupportedBy(MediaWiki.class)
	public void testLoadUsingOnlyArticlesWithNoResults() {
		doTestLoadUsingOnlyArticles(new String[] {"article to test matching" + MediaWiki.QUERY, ""});
	}
	
	private void doTestLoadUsingOnlyArticles(final String[] queries) throws VersionException, MediaWikiException {
		// Execute query
		String result = new MediaWikiParser(Version.fromString("1.10"))
			.load(queries[0], MediaWiki.ArticleQuery.FLAG_RETURN_RESULT);
		
		log.info(result == null? "" : result);
		
		// The answer should be not null
		final String s = result!= null? result.toString() : "";
		
		// Test article
		final MediaWiki query = new MediaWikiParser(Version.fromString("1.18"))
			.load(queries[1], MediaWiki.ArticleQuery.FLAG_RETURN_RESULT);
		log.debug(query.getText("Test article"));
		
		// Try to retrieve the text from the article, but don't use it
		String s1 = query
			.getText("Test article", MediaWiki.ArticleQuery.FLAG_DISABLE_STORAGE);
		
		assertNotNull(s1, MediaWiki.ERROR, "unable to retrieve text from article");
		
		// The text should be the same
		assertEquals(s, s1);
	}
	
}