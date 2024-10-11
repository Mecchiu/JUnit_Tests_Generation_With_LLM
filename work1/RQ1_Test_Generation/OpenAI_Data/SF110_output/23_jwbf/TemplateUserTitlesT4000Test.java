// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {

		/**
		 * Test case for {@link TemplateUserTitles#processAllReturningText(String)}
		 * with the following test parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#getNextPageInfo()}</li>
		 * <li>{@link TemplateUserTitles#getTitleIterator()}</li>
		 * <li>{@link TemplateUserTitles#getTitleCollection()}</li>
		 * <li>{@link TemplateUserTitles#getVersion()}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#getVersion(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String