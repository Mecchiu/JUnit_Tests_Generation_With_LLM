// TracWikiBotTest.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains one unit test case for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {
		/**
		 * A unit test for <a
		 * href="http://trac.edgewall.org/wiki/TracWiki?action=read&ref=file&path=T%20Test%202%20Data%20F%20for%20the%20%20%25%25#%25%25%25Data">T%20Test%202%20Data%20F%20for%20the%20%
		 * % 25%25%25#%25%25Data</a>
		*/
		@Test
		void readContentTest() throws MalformedURLException, ActionException, ProcessException {
				WikiBot wikiBot = new TracWikiBot("https://wiki.edgewall.org
				/wiki/T%20Test%202%20Data%20F%20for%20the%20%25%25%25data", "test");
				String w_test = wikiBot.readContent("TEST");
			String w_test2 = wikiBot.readContent("TEST");
		}
		
}