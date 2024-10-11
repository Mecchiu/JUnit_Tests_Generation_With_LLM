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

	@Inject
	private HttpActionClient aactionc;

	@Test
	public void testGetArticle() throws ActionException, ProcessException {
		assertEquals("testGetArticle", "Main Page", getArticle("Main Page").getTitle());
	}
	
	@Test
	public void testPostEdit1() throws ActionException, ProcessException, MediaWikiException {
		PostEditData data = new PostEditData();
		data.text = "testEdit" + String.valueOf(random(500));
		PostEditResult result = aactionc.postContent(data);
		assertEquals("testPostEdit1-1", data.getTitle(), result.getTitle());
		assertEquals("testPostEditX", "testEdit", result.getText());
	}

	@Test
	public void testPostEdit2() throws ActionException, ProcessException, MediaWikiException {
		PostEditData data1 = new PostEditData();
		data1.text = "testEdit" + String.valueOf(random(500));
		PostEditResult result1 = aactionc.postContent(data1);
		PostEditData data2 = new PostEditData();
		data2.text = "testEdit" + String.valueOf(random(567));
		PostEditResult result2 = aactionc.postContent(data2);
		assertNull(result1);
		assertEquals(result2.getTitle(), data1.getTitle());
		assertEquals(result2.getText(), data1.getText());
	}

	@Test
	public void testPostEdit2WithDifferentParameters() throws ActionException, ProcessException, MediaWikiException {
		PostEditData data1 = new PostEditData();
		data1.text =