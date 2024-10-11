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
		
	public InyokaWikiBotTest() {
		super(InyokaWikiBot.class);
	}

	@Test
	public void test_getArticle() throws ActionException, ProcessException {
		String title = "Title";
		String url = "http://wiki.ubuntuusers.de";
		Userinfo user = new Userinfo("user", "passwd");
		Set<String> types = new java.util.HashSet<>(
				new String[] { WikiBot.WikibotType.WIKI, WikiBot.WikibotType.ARTICLE }
		);
		Map<String, String> properties = new java.util.HashMap<String, String>();
		properties.put(WikiBot.WikibotProperties.HOST, url);

		// set up test case
		return;
	}

	@Test
	public void test_readData() throws ActionException, ProcessException {
		String title = "Title";
		String url = "http://wiki.ubuntuusers.de";
		Userinfo user = new Userinfo("user", "passwd");
		Map<String, String> properties = new java.util.HashMap<String, String>();
		properties.put(WikiBot.WikibotProperties.HOST, url);
		SimpleArticle article = new SimpleArticle();
		article.setTitle(title);
		article.setUrl(new java.net.URI(url));

		// set up test case
		return;
	}
	
	@Test
	public void test_getWikiType() throws ActionException, ProcessException {
		String url = "http://wiki.ubuntuusers.de";
		Article article = getArticle("title");
		assertNotNull("getNewsArticle() should not return null", article);
		
		InyokaWikiBot wiki = (InyokaWikiBot) article.getWiki();
		assertNotNull("InyokaWikiBot should not be null", wiki);
		assertEquals("InyokaWikiBot wiki doesn't match",
				wiki.getClass().getName(), InyokaWikiBot.class.getName());
		
		assertEquals("InyokaWikiBot wiki doesn't match",
				wiki.getWikiType(), WikiBot.WikibotType.ARTICLE);
	}

}