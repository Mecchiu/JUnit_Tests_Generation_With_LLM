// MediaWikiBot_0Test.java
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
* It contains one unit test case for the {@link MediaWikiBot#getArticle(String, int)} method.
*/
class MediaWikiBot_0Test {
		/**
		* @throws Exception (should be thrown by the unit tests)
		*/
	@Test
	void test0() throws Exception {
		// create a new instance of MediaWikiBot to be tested
		MediaWikiBot bot = new MediaWikiBot();
		// do nothing
	}

		/**
		* @throws Exception (should be thrown by the unit tests)
		*/
	@Test
	private void test1() throws Exception {
		MediaWikiBot bot = new MediaWikiBot();
		// just create the correct request
		String name = "Main Page";
		int properties = MediaWiki.Version.VERSION1;
		StringBuilder sb = new StringBuilder();
		sb.append(MediaWiki.getArticle(name, properties));
		// do nothing
		assertEquals("Main Page", sb.toString());
	}

		/**
		* @throws Exception (should be thrown by the unit tests)
		*/
	@Test
	public void test2() throws Exception {
		String name = "Main Page";
		int properties = MediaWiki.Version.VERSION1;
		StringBuilder sb = new StringBuilder();
		sb.append(MediaWiki.getArticle(name, properties));
		// just create the correct request
		sb.append("\n\n");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("\0");
		StringBuilder sb3 = new StringBuilder();
		sb3.append(sb.toString());
		// do nothing
}
}