// MediaWiki_2Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {

	/**
	 * Test method for {@link MediaWiki#decode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testDecode() throws UnsupportedEncodingException {
		assertEquals("", MediaWiki.decode(""));
		assertEquals(" ", MediaWiki.decode(" "));
		assertEquals("a", MediaWiki.decode("a"));
		assertEquals("a b", MediaWiki.decode("a b"));
		assertEquals("a b c", MediaWiki.decode("a b c"));
		assertEquals("a b c d", MediaWiki.decode("a b c d"));
		assertEquals("a b c d e", MediaWiki.decode("a b c d e"));
		assertEquals("a b c d e f", MediaWiki.decode("a b c d e f"));
		assertEquals("a b c d e f g", MediaWiki.decode("a b c d e f g"));
		assertEquals("a b c d e f g h", MediaWiki.decode("a b c d e f g h"));
	}
}

// MediaWiki_3Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_3Test {
		
	/**
	 * Test method for {@link MediaWiki#encode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testEncode() throws UnsupportedEncodingException {
		assertEquals("", MediaWiki.encode(""));
		assertEquals("%20", MediaWiki.encode(" "));
		assertEquals("a", MediaWiki.encode("a"));
		assertEquals("a%20b", MediaWiki.encode("a b"));
		assertEquals("a%20b%20c", MediaWiki.encode("a b c"));
		assertEquals("a%20b%20c%20d", MediaWiki.encode("a b c d"));
		assertEquals("a%20b%20c%20d%20e", MediaWiki.encode("a b c d e"));
		assertEquals("a%20b%20c%20d%20e%20f", MediaWiki.encode("a b c d e f"));
		assertEquals("a%20b%20c%20d%20e%20f%20g", MediaWiki.encode("a b c d e f g"));
		assertEquals("a%20b%20c%20d%20e%20f%20g%20h", MediaWiki.encode("a b c d e f g h"));
	}
}

// MediaWiki_4Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_4Test {
		
	/**
	 * Test method for {@link MediaWiki#getCharset()}.
	 */
	@Test
	void testGetCharset() {
		assertEquals("UTF-8", MediaWiki.getCharset());
	}
}

// MediaWiki_5Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getBotGroups()} method.
*/
class MediaWiki_5Test {
		
	/**
	 * Test method for {@link MediaWiki#getBotGroups()}.
	 */
	@Test
	void testGetBotGroups() {
		assertEquals(new HashSet<String>(), MediaWiki.getBotGroups());
	}
}

// MediaWiki_6Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getVersion()} method.
*/
class MediaWiki_6Test {
		
	/**
	 * Test method for {@link MediaWiki#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		assertEquals(MediaWiki.Version.UNKNOWN, MediaWiki.getVersion());
	}
}

// MediaWiki_7Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setVersion(MediaWiki.Version)} method.
*/
class MediaWiki_7Test {
		
	/**
	 * Test method for {@link MediaWiki#setVersion(MediaWiki.Version)}.
	 */
	@Test
	void testSetVersion() {
		MediaWiki.setVersion(MediaWiki.Version.UNKNOWN);
	}
}

// MediaWiki_8Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setBotGroups(Set)} method.
*/
class MediaWiki_8Test {
		
	/**
	 * Test method for {@link MediaWiki#setBotGroups(Set)}.
	 */
	@Test
	void testSetBotGroups() {
		MediaWiki.setBotGroups(new HashSet<String>());
	}
}

// MediaWiki_9Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#setCharset(String)} method.
*/
class MediaWiki_9Test {
		
	/**
	 * Test method for {@link MediaWiki#setCharset(String)}.
	 */
	@Test
	void testSetCharset() {
		MediaWiki.setCharset("UTF-8");
	}
}

// MediaWiki_Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#MediaWiki()} method.
*/
class MediaWiki_Test {
		
	/**
	 * Test method for {@link MediaWiki#MediaWiki()}.
	 */
	@Test
	void testMediaWiki() {
		new MediaWiki();
	}
}

// MediaWikiBot.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.RequestBuilder;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetApiToken;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent.Delete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent.Undelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent.Watch;
import net.sourceforge.jwbf.mediawiki.actions.queries.AllPageTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.BacklinkTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembers;
import net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembers.CMType;
import net.sourceforge.jwbf.mediawiki.actions.queries.ImageInfo;
import net.sourceforge.jwbf.mediawiki.actions.queries.ImageUsageTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.LinksOnPage;
import net.sourceforge.jwbf.mediawiki.actions.queries.PrefixSearch;
import net.sourceforge.jwbf.mediawiki.actions.queries.RecentChangesTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.Search;
import net.sourceforge.jwbf.mediawiki.actions.queries.TemplateUserTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.queries.WatchList;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.RedirectFilter;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleRevision;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleUser;
import net.sourceforge.jwbf.mediawiki.contentRep.Userinfo.Gender;
import net.sourceforge.jwbf.mediawiki.live.auto.ParamHelper;
import net.sourceforge.jwbf.mediawiki.live.auto.ParamHelper.Type;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;
import org.apache.commons.httpclient.util.URIUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 * This class is the main class of the framework. It provides methods to login,
 * logout, read and write articles.
 *
 * @author Thomas Stock
 * @author Justus Bisser
 */
public class MediaWikiBot extends HttpBot {

    private static final Logger log = Logger.getLogger(MediaWikiBot.class);

    private static final String API_URL = "/api.php";

    private static final String INDEX_URL = "/index.php";

    private static final String LOGIN_URL = "/index.php?title=Special:Userlogin";

    private static final String LOGOUT_URL = "/index.php?title=Special:Userlogout";

    private static final String VERSION_URL = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_URL_MW1_15 = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_URL_MW1_16 = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_URL_MW1_17 = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_URL_MW1_18 = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_URL_MW1_19 = "/api.php?action=query&meta=siteinfo&siprop=general&format=xml";

    private static final String VERSION_