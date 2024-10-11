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

	@Test
	public void testProcessAllReturningText() throws VersionException {
		// Get a random one
		String testDataString = "https://mediawiki.org|test_string";
		String result = MediaWiki.processAllReturningText(testDataString);
		
		// Check result
		assertTrue(!result.isEmpty());
		assertTrue(!result.startsWith("mediawiki"));
		assertTrue(!result.endsWith("test_string"));
		assertEquals("ok", result);
		assertEquals("ok", MediaWiki.removeMediawikiParameters(result));
		
		// Process it
		mediawikiRetriever = new MediaWikiBot("https://mediawiki.org");
		mWebAction = MediaWiki.processAllReturningText(testDataString);
		
		// Find the result
		result = mediawikiRetriever.get();
		ArrayList<String> articles = new ArrayList<>();
		parseArticleTitles(result);
		
		// Check the content
		int aIdxFound = 0;
		
		if (!result.startsWith("mediawiki")) {
			testDataString =  "?action=articleinfo&mwindex=all&tmplatid=wikimediawiki&tmplat=all";

			result = MediaWiki.processAllReturningText(testDataString);
			
			if (!result.equals("") &&!result.startsWith("mediawiki")) {
				testDataString = result;
				aIdxFound = 1;
				
				// Get the first article
				mWebAction = MediaWiki.processAllReturningText(testDataString);
				
				parseArticleTitles(mWebAction);
				articles = new ArrayList<>(titleCollection);
				assertEquals("found article found?", aIdxFound, articles.size());
			}
		}
		
		// Check for a specific page
		String pageContent = mWebAction.getContent();
		Matcher matcher = MWPagePattern.matcher(pageContent);
		
		// Check for the number of iterations
		int iterations = 0;
		
		do {
			iterations++;
			
		// Check for hasMore
		if (iterations % 2 == 0) {
			// Use a different result
			
			// Get the next page in the article
			mWebAction = MediaWiki.processAllReturningText(testDataString);
			
			// Check if the result matches the next iteration
			if (matcher.matches()) {
				
				// Try to extract the title
				String title = matcher.group(1);
				
				// Try to process and extract it a specific case
				String content = MediaWiki.processAllReturningText(testDataString);
				
				// Check this content and content of the new query result
				if (content.equals(result) && matcher.group(7).equalsIgnoreCase("mediawiki")) {
					pageContent = content;
					matcher = MWPagePattern.matcher(pageContent);
					result = mediawikiRetriever.get();
					assertTrue(pageContent.startsWith(result));
				}
			}
		}
		}
		while (matcher.matches() &&!"ok".equals(result));
		
		// Check the result
		assertTrue(!result.startsWith("ok"));
		assertTrue(aIdxFound >= 0);
		assertEquals(expectedTotalCount, articles.size());
	}
	
	private