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
		
		InyokaWikiBot wiki;

	/**
	 * Test of the static set up of the method. The test is to run a single article
	 * from a given inyoka, with a given properties key.
	 */
	@Test
	void test_singleFile() throws MalformedURLException, ActionException, ProcessException,
		ActionException {
		SystemTester.runTest(InyokaWikiBot.class, "test_singleFile", null, null);
	}

}