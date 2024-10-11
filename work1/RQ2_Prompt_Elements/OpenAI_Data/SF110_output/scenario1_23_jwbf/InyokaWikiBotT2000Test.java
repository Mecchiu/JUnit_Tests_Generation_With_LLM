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
* It contains ten unit test cases for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {

	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is null.
	*/
	@Test
	void testGetArticle_Null() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle(null));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is empty.
	*/
	@Test
	void testGetArticle_Empty() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle(""));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a whitespace.
	*/
	@Test
	void testGetArticle_Whitespace() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle(" "));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a tab.
	*/
	@Test
	void testGetArticle_Tab() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\t"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a newline.
	*/
	@Test
	void testGetArticle_Newline() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\n"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a carriage return.
	*/
	@Test
	void testGetArticle_CarriageReturn() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\r"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a form feed.
	*/
	@Test
	void testGetArticle_FormFeed() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\f"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a backspace.
	*/
	@Test
	void testGetArticle_Backspace() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\b"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a vertical tab.
	*/
	@Test
	void testGetArticle_VerticalTab() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u000B"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a file separator.
	*/
	@Test
	void testGetArticle_FileSeparator() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u001C"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a group separator.
	*/
	@Test
	void testGetArticle_GroupSeparator() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u001D"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a record separator.
	*/
	@Test
	void testGetArticle_RecordSeparator() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u001E"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a unit separator.
	*/
	@Test
	void testGetArticle_UnitSeparator() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u001F"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a delete.
	*/
	@Test
	void testGetArticle_Delete() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u007F"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a non-breaking space.
	*/
	@Test
	void testGetArticle_NonBreakingSpace() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u00A0"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a soft hyphen.
	*/
	@Test
	void testGetArticle_SoftHyphen() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u00AD"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a zero-width space.
	*/
	@Test
	void testGetArticle_ZeroWidthSpace() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () -> bot.getArticle("\u200B"));
	}
	
	/**
	* Test case for the {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case that the article name is a zero-width non-joiner.
	*/
	@Test
	void testGetArticle_ZeroWidthNonJoiner() {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		assertThrows(ActionException.class, () ->