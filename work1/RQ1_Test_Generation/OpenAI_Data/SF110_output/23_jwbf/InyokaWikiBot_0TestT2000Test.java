// InyokaWikiBot_0Test.java
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
class InyokaWikiBot_0Test {

		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_1() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_2() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_3() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_4() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_5() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_6() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_7() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		@Test
		void testGetArticle_8() throws MalformedURLException, ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
				Article article = bot.getArticle("Startseite");
				assertNotNull(article);
				assertEquals("Startseite", article.getTitle());
				assertTrue(article.getText().contains("Willkommen bei Ubuntuusers.de"));
		}
		
		/**
		* Test method for {@link InyokaWikiBot#getArticle(String)}.
		* @throws MalformedURLException 
		* @throws ProcessException 
		* @throws ActionException 
		*/
		