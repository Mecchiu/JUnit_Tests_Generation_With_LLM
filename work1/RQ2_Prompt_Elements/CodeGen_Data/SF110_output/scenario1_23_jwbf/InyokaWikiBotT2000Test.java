// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
/**
	* Test method for
	* {@link InyokaWikiBot#getArticle(String)}
	* with a malformed URI
	* throws ActionException.
	* with a null key
	* throws MalformedURLException.
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleMalformedURI() throws ActionException, MalformedURLException {
		getArticle((String) null);
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.core.bots.WikiBot#getArticle(String)}.
	* with a malformed URI
	* throws MalformedURLException.
	* with a null key
	* throws ActionException.
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleMalformedURIWithoutKey() throws ActionException, MalformedURLException{
		getArticle("This is a test");
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.core.bots.WikiBot#getArticleByTitle(String)}.
	* with a null title.
	* throws MalformedURLException.
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleByTitleWithNullTitle() throws MalformedURLException, ActionException {
		getArticleByTitle((String) null);
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.core.bots.WikiBot#getArticleByTitle(String)}.
	* with a null version
	* throws ActionException.
	* with a title that's not in the Wiki
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleByTitleWithNullVersion() throws ActionException, MalformedURLException {
		getArticleByTitle((String) null, "Tabs are not supported yet");
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.core.bots.WikiBot#getArticleByTitle(String)}.
	* with a null user
	* throws ActionException.
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleByTitleWithNullUser() throws ActionException, MalformedURLException {
		getArticleByTitle((String) null, "someuser");
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.core.bots.WikiBot#getArticle(String)}.
	* with a null content object
	* throws ActionException.
	* with a null title
	* throws ActionException.
	* with a null body
	*/
	@Test(expected=ActionException.class)
	public void testGetArticleByTitleWithNullContentObject() throws ActionException {
		getArticleByTitle((String) null, "somecontent", (String) null);
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.minimal.simplebot.InyokaWikiBot#getLastRevision()}.
	* has no content object.
	*/
	@Test
	public void testGetLastRevisionWithNoContentObject() throws MalformedURLException {
		assertNull(getLastRevision());
	}
	
	/**
	* Test method for
	* {@link net.sourceforge.jwbf.minimal.simplebot.InyokaWikiBot#getLastRevision()}.
	* with a null content object
	*/
	@Test
	public void testGetLastRevisionWithNullContentObject() throws MalformedURLException {
		assertNull(getLastRevision());
	}
}
