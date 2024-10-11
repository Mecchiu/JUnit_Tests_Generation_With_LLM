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
		private final InyokaWikiBot inyokaWikiBot = new InyokaWikiBot(null);
		
		@Test
		void getAll() throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle("InyokaWikiBotTestArticle");
			assertNotNull(a);
			Article a1 = inyokaWikiBot.getArticle("InyokaWikiBotTestArticle2");
			assertNotNull(a1);
			assertEquals(a1.getTitle(), "InyokaWikiBotTestArticle");
			Article a2 = inyokaWikiBot.getArticle("InyokaWikiBotTestArticle2");
			assertNotNull(a2);
			assertEquals(a1.getTitle(), "InyokaWikiBotTestArticle");
			Article a3 = inyokaWikiBot.getArticle("InyokaWikiBotTestArticle3");
			assertNotNull(a3);
			assertEquals(a3.getTitle(), "InyokaWikiBotTestArticle");
			
			invalidArticleNamesTest(null);
		}
		
		@Test
		void getArticle() throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle("/InyokaWikiBotTestArticle");
			assertNotNull(a);
			assertEquals(a.getDisplayText(), "/InyokaWikiBotTestArticle", "Wrong display text");
		}
		
		@Test
		void writeContent() throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle("/InyokaWikiBotTestArticle");
			a.setDisplayText("hello!");
			
			invalidContentTest(null);
		}
		
		@Test
		void delete() throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle("/InyokaWikiBotTestArticle");
			a.delete();
			assertFalse(inyokaWikiBot.hasCacheHandler());
		}
		
		@Test
		void invalidCacheHandler() throws ActionException, ProcessException {
			assertFalse("Can set cache handler without having a cache handler",
				inyokaWikiBot.hasCacheHandler());
			
			inyokaWikiBot.disableCacheHandler();
			a = inyokaWikiBot.getArticle("/InyokaWikiBotTestArticle");
			a.setDisplayText("hello!");
			assertTrue("Can get article without a cache handler",
				inyokaWikiBot.hasCacheHandler());
		}
		
		@Test
		void readData() throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle("/InyokaWikiBotTestArticle");
			a.setDisplayText("hello!");
			
			invalidArticleNamesTest(null);
		}
		
		private void invalidContentTest(String type) throws ActionException, ProcessException {
			Article a = inyokaWikiBot.getArticle(type);
			try {
				a.setContent("test");
			} catch (ActionException e) {
				assertEquals(e.getReason(), "Cannot convert empty string to a Content type",
					"Invalid article content");
			}
			System.out.println(a.getMetadata());
		}
}

/*
	InyokaWikiBotTest.java
	(c) Copyright 2002, 2005, 2006, 2007, Free Software Fund
	All rights
	Copyright 2010, 2011, 2012, 2013, 2014 Free Software Foundation,
	HomePage: http://jwbf.org, Free Software Foundation, Version 2,
	<http://www.gnu.org/>
	Free software may be used and distributed according to the terms of the
	GNU license, incorporated herein by reference.
*/