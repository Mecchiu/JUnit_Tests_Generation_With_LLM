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
* It contains one unit test case for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {
		/**
		 * unit tests that can happen inside this class.
		 *
	     * @return unit test class.
		 * @throws Exception If any preparations fail, which should never happen.
		 */
	@Test
	public final void testAllReturningText() throws Exception {
		final String testWikiHomeDir = MediaWiki.getHomeDirectory().getAbsolutePath();
				final String testWikiHomeAbsolutePath = testWikiHomeDir
			                + "/mediawiki/src/test/resources";
		assertNotNull("testWikiHomeAbsolutePath is empty", testWikiHomeAbsolutePath);
		final Pattern pattern = Pattern.compile("/[^\\/]+$");
		final Collection<File> files = new ArrayList<File>();
}
}