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
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String, int)} method.
*/
class MediaWikiBot_0Test {

		private static final String TEST_WIKI_URL = "http://localhost/wiki/";
		private static final String TEST_WIKI_USERNAME = "username";
		private static final String TEST_WIKI_PASSWORD = "password";
		private static final String TEST_WIKI_DOMAIN = "domain";
		private static final String TEST_WIKI_ARTICLE_NAME = "Main Page";
		private static final int TEST_WIKI_ARTICLE_PROPERTIES = GetRevision.CONTENT | GetRevision.COMMENT | GetRevision.USER | GetRevision.TIMESTAMP | GetRevision.IDS | GetRevision.FLAGS;
		private static final String TEST_WIKI_ARTICLE_CONTENT = "This is the main page of the test wiki.";
		private static final String TEST_WIKI_ARTICLE_COMMENT = "This is the main page of the test wiki.";
		private static final String TEST_WIKI_ARTICLE_USER = "username";
		private static final String TEST_WIKI_ARTICLE_TIMESTAMP = "20160303030303";
		private static final int TEST_WIKI_ARTICLE_ID = 1;
		private static final int TEST_WIKI_ARTICLE_REVISION_ID = 1;
		private static final int TEST_WIKI_ARTICLE_FLAGS = 0;
		private static final String TEST_WIKI_ARTICLE_TEXT = "This is the main page of the test wiki.";
		private static final String TEST_WIKI_ARTICLE_TITLE = "Main Page";
		private static final String TEST_WIKI_ARTICLE_FULL_URL = "http://localhost/wiki/Main_Page";
		private static final String TEST_WIKI_ARTICLE_EDIT_URL = "http://localhost/wiki/Main_Page?action=edit";
		private static final String TEST_WIKI_ARTICLE_HISTORY_URL = "http://localhost/wiki/Main_Page?action=history";
		private static final String TEST_WIKI_ARTICLE_DELETE_URL = "http://localhost/wiki/Main_Page?action=delete";
		private static final String TEST_WIKI_ARTICLE_MOVE_URL = "http://localhost/wiki/Main_Page?action=move";
		private static final String TEST_WIKI_ARTICLE_PROTECT_URL = "http://localhost/wiki/Main_Page?action=protect";
		private static final String TEST_WIKI_ARTICLE_WATCH_URL = "http://localhost/wiki/Main_Page?action=watch";
		private static final String TEST_WIKI_ARTICLE_UNWATCH_URL = "http://localhost/wiki/Main_Page?action=unwatch";
		private static final String TEST_WIKI_ARTICLE_RAW_URL = "http://localhost/wiki/Main_Page?action=raw";
		private static final String TEST_WIKI_ARTICLE_RENDERED_URL = "http://localhost/wiki/Main_Page?action=rendered";
		private static final String TEST_WIKI_ARTICLE_PURGE_URL = "http://localhost/wiki/Main_Page?action=purge";
		private static final String TEST_WIKI_ARTICLE_INFO_URL = "http://localhost/wiki/Main_Page?action=info";
		private static final String TEST_WIKI_ARTICLE_PRINT_URL = "http://localhost/wiki/Main_Page?action=print";
		private static final String TEST_WIKI_ARTICLE_MARK_PATROL_URL = "http://localhost/wiki/Main_Page?action=markpatrol";
		private static final String TEST_WIKI_ARTICLE_FEED_URL = "http://localhost/wiki/Main_Page?action=feed";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchanges";
		private static final String TEST_WIKI_ARTICLE_FEED_NEW_PAGES_URL = "http://localhost/wiki/Main_Page?action=feed&feed=newpages";
		private static final String TEST_WIKI_ARTICLE_FEED_LONG_PAGES_URL = "http://localhost/wiki/Main_Page?action=feed&feed=longpages";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_LINKED_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangeslinked";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_LINKED_FROM_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangeslinkedfrom";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_LINKED_FROM_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangeslinkedfromself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_LINKED_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangeslinkedself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_LINKED_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselflinked";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_LINKED_FROM_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselflinkedfrom";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_LINKED_FROM_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselflinkedfromself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_LINKED_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselflinkedself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_LINKED_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfselflinked";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_LINKED_FROM_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfselflinkedfrom";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_LINKED_FROM_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfselflinkedfromself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_LINKED_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfselflinkedself";
		private static final String TEST_WIKI_ARTICLE_FEED_RECENT_CHANGES_SELF_SELF_SELF_URL = "http://localhost/wiki/Main_Page?action=feed&feed=recentchangesselfselfself";
		private static final String TEST_WIKI_ARTICLE_FE