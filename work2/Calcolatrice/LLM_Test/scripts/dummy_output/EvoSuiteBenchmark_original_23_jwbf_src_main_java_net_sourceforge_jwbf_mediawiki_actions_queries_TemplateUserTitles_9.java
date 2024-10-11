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
     * test method is testing the methods according to the MediaWiki-Version.
     * @see https://wbf.org/api/mediawiki/v1/query/article-contributions#templateuseritles
     */
    @Test
    public void testAllMethods() throws VersionException {
        final MediaWiki bot = new MediaWiki();

        final Pattern p = Pattern.compile("\\b"
            + Pattern.quote(".*")
            + "(?:\\b"
            + Pattern.quote("contributions")
            + ")*(.+)$");

        final Matcher m = p.matcher(bot.getUserAction().getText());
        // assertNoMatch(bot.getUserAction().getText());

        
        assertTrue(m.find());


        /**
	 * check if the first content is a User-Article
	 */
        Collection<String> texts = processAllReturningText(m.getGroup(1));
        assertNotNull(texts);
        assertFalse(texts.isEmpty());
        
        /**
         * test first content
         */
        String title = m.group(1);
        final String testText = m.group(2);
        final String testContent = title + ": " + testText;
        assertTrue(texts.contains(testContent));
        
        /**
         * test second content
         */
        String testContent1 = testContent;
        testContent1 = testContent1.replaceAll("\\b" + String.valueOf(p.matcher(testContent1).matches()? '.' : '-'), ". $");

        final String expectedResult = testContent + " : " + testContent1;

        assertEquals(expectedResult, titles.get(0).getContent());
        
        
        /**
         * test second content
         */
        String testContent2 = testText;
        testContent2 = testText.replaceAll("\\b" + String.valueOf(p.matcher(testContent2).matches()? '.' : '-'), ". $");

        final String expectedResult2 = testContent + " : " + testText;

        assertEquals(expectedResult2, titles.get(0).getContent());


        /**
         * test third content
         */
        String testContent3 = " ";
        testContent3 = testContent3.replaceAll("\\b" + String.valueOf(p.matcher(testContent3).matches()? '.' : '-'), ". $");

}
}