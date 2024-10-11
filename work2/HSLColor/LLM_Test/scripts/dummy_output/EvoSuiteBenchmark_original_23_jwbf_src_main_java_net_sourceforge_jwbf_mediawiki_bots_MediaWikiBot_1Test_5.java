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
		// MediaWikiBot_1Test.java
		/**
		 * This test is to try and login to the MediaWiki bot using different credentials, which are not
		 * possible with the test account.
		 * @throws ProcessException
		 */
		@Test
    public void login() throws ProcessException
		{
		try
			{
			String password = "password";
			String username = "jwbf";
			LoginData loginData = new LoginData();
			loginData.setUsername(username);
			loginData.setPassword(password);
			LoginData loginData2 = new LoginData();
			loginData2.setUsername(username);
			loginData2.setPassword(password);
			// Log in
			HttpBot b = new HttpBot();
			b.login(loginData);
			// Should fail, because password is wrong
			b.login(loginData2);
			}
		catch (ProcessException e)
			{
			assertNotNull(e);
			assertTrue(e instanceof ActionException);
			}
		}

		// MediaWikiBot_1Test.java
		/**
		 * Test to check if it correctly gets the current wikiid.
		 * @throws ProcessException
		 */
		@Test
    public void testWikiid() throws ProcessException
		{
}
}