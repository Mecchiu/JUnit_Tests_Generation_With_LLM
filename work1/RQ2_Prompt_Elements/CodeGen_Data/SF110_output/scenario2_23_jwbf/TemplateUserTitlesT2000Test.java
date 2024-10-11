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

    private final static String ARTICLE_WITH_PARENTHESES = "http://example.com/"+
        "?wsp=p[0|1|2|3|4|5|6|7|8|9|0]&text="+
        "http://example.com/1/2/3/5/7/8/9/0";

    private static final Pattern SPACE_CONTAINING_TEXT_PATTERN = Pattern.compile("(?<!\\[|\\]|\\.)");

    private final static int EXPECTED_PATTERN_NUMBER_OF_MATCHING_LETTERS = 6;

    @Test
    void test1() throws VersionException {
        final MediaWiki mediawiki = MediaWikiBot.instance();

        final String expectedP = "https://example.com";

        final Pattern pattern = getPattern();
                
        final boolean matchCount = MediaWiki.matchTitle(mediawiki, expectedP, pattern.matcher("{1}"));
        assertTrue(
            "This pattern did not match the expected wikitext, this is different that the test",
            matchCount
        );

        final boolean matchCount2 = MediaWiki.matchTitle(mediawiki, EXPECTED_PATTERN_NUMBER_OF_MATCHING_LETTERS + 1, pattern.matcher("{1}"));
        assertTrue(
            "This pattern did not match the expected wikitext, this is different that the test",
            matchCount2
        );
    }

    /* This method matches several different cases in order to use the expected wikitext pattern.
     * The result of this test is that the number of matches returned depends on the test cases which are
     * defined in the test above, so please try to match a case which should take 1 test case.
     */
    private static boolean matchTitle(final MediaWiki mediawiki, final String wikitext, final Matcher matcher) throws VersionException {
        final Matcher nn = new Matcher();

        log.info("Testing pattern " + matcher.pattern() + " in string " + wikitext);
        return nn.matches(wikitext);
    }
	
	private Pattern getPattern() {
        final Pattern pattern = Pattern.compile(
            "https?://example.com" +
            (supportedForUses? " [&@0-9A-Za-z]+?" : "") +
            (supportedForUses? ("://" + supportedHost + "?/article[0-9.]*") : (":article[0-9.]*") ),
            Pattern.CASE_INSENSITIVE
        );
		return pattern;
	}
   
    private void parseArticleTitles(String wikitext) throws VersionException {
        final Matcher patternMatcher = getPattern().matcher(wikitext);

        /* Check for "{" and "|"[ ] */
        final boolean matchCase = MediaWiki.matchTitle(mediawiki, patternMatcher.group(1), pattern.matcher("[0-9-]+"));
        final boolean matchParenthesis = MediaWiki.matchTitle(mediawiki, patternMatcher.group(2), pattern.matcher("\\b" + Pattern.quote(patternMatcher.group(2)) + "\\b"));

        assertTrue(
            "Match for the