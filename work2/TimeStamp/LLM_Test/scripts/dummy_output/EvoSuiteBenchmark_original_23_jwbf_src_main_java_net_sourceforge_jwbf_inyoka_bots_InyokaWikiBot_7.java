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
		@Test
		void isCacheHandler() throws ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("https://ubuntuusers-de.wiki/InyokaBot");
				assertTrue("CacheHandler should be true",bot.hasCacheHandler());
	}

	/**
* Test class of {@link InyokaWikiBot}.
* It contains test cases for the {@link InyokaWikiBot#readData(String)} and
* {@link InyokaWikiBot#getWikiType()} methods.
* We test both methods and try to use the test data directly. If no test method is needed,
* the test cases will be run via reflection using the test classes that contain
* the InyokaWikiBot(s).
*/
class InyokaWikiBotTest_reflection {
		@Test
		void isCacheHandler() throws ActionException, ProcessException {
				InyokaWikiBot bot = new InyokaWikiBot("https://ubuntuusers-de.wiki/InyokaBot");
				assertNotNull("CacheHandler should not be null", bot.getCacheHandler());
				// test both methods and try to read it directly
				assertNotNull("Data should not be null", InyokaWikiBot.readData("InyokaWikiBot"));
				assertEquals("Unexpected wiki type: "+InyokaWikiBot.getWikiType(),
						InyokaWikiBot.getWikiType(), robot.getWikiType());
	}

	/**
* Test class of {@link InyokaWikiBot}.
* It contains tests for the {@link InyokaWikiBot#getWikiType()} method.
* Also the cache handling of the test cases is not tested
*/
	@Test
	void testGetRevision_cache() throws ActionException, ProcessException {
                InyokaWikiBot bot = new InyokaWikiBot("https://ubuntuusers-de.wiki/InyokaBot");
		GetRevision gv = bot.getRevision();
		// test both methods and try to read it directly
		assertNotNull(InyokaWikiBot.readData("InyokaWikiBot"));
		assertEquals(InyokaWikiBot.getRevision().toString(), gv.toString());
		gv = InyokaWikiBot.getRevision();
		assertEquals(InyokaWikiBot.getRevision().toString(), gv.toString());
	}

	/**
* Test class of {@link InyokaWikiBot}.
* It contains test cases for the {@link InyokaWikiBot#getArticle(String, int)} and
* {@link InyokaWikiBot#getRevision(String)} methods.
* We test the three methods but using reflection. If no test case is needed,
* the test cases will be run via reflection using the test classes that contain
* the InyokaWikiBot(s).
*/
	@Test
	void testGetArticle_reflection() throws ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("https://ubuntuusers-de.wiki/InyokaBot");
				// test both methods and try to get an article
	    Article av = bot.getArticle("foo");
	    assertNotNull(av);
	    // we have to use more than just the method testGetArticle_reflection, that has the cache handler
	    TestHtmlDoc.testGetHtmlDoc(av);
	    av = bot.getArticle("bar");
	    assertNull(av);
	}

    /**
* Test class of {@link InyokaWikiBot}.
* It contains test cases for the {@link InyokaWikiBot#getRevision(String)} and
* {@link InyokaWikiBot#getArticle(String, int)} methods.
* We test the three methods but using reflection. If no test case is needed,
* the test cases will be run via reflection using the test classes that contain
* the InyokaWikiBot(s).
*/
}
}