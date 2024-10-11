// MediaWikiBot_1Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLogin;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWikiBot}.
* It contains one unit test case for the {@link MediaWikiBot#getArticle(String)} method.
*/
class MediaWikiBot_1Test {
		
	/**
	 * Tests if the article has the correct text:
	 *
	 * if all following conditions are fulfilled, this method returns
	* the correct article:
	* - a content:
	* - a simple article with
	* content is the one
	* - a "main page" article with the correct
	* text in title:
	*/
	@Test
	void testGetArticle_simple_title() throws ProcessException, ActionException, JwbfException {
		// given
		final String article = "Hello";
		final Article simpleArticle = new SimpleArticle(article, article.substring(0, 1)).makeSimpleArticle();
		final String text = "Some Article Text";

		// when / then
		final String expected = article + " Article Title";
		final Article actual = MediaWikiBot.getArticle(simpleArticle);
		assertEquals(expected, actual.getText());
	}
	
	@Test
	void testGetArticle_simple_title_with_simpleArticle(){
		final String article = "Hello";
		final Article simpleArticle = new SimpleArticle(article, article.substring(0, 1)).makeSimpleArticle();
		final String text = "Some Article Title";

		// when / then
		final String expected = String.format("The %s has the title: '%s'", article, text.substring(0, 1));
		final Article actual = MediaWikiBot.getArticle(simpleArticle);
		assertEquals(expected, actual.getText());
	}

	@Test
	void testGetArticle_siteinfo_page_name(){
		final String article = "Hello";
}
}