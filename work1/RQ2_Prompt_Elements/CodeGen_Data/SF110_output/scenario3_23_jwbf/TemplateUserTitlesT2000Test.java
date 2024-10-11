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
private ArrayList<String> toBeRemoved;

		private final String wikidataKey = "https://mdn.wikimedia.org/w/api/1/dods/findall.json?";
        final Pattern pattern = Pattern.compile(wikidataKey);
		private final Pattern ncbiPidPattern = Pattern.compile("ncbi\\s+\\d+\\.\\d+");

	/**
	* Tests all possible values for the {@link MediaWiki#getVersion} action.
	*/
	@Test
	@Slf4j
	void testAllValues() {
		// TODO: not finished.
		if (log.isDebugEnabled())
			log.debug("unit test case for " + MediaWiki.getVersion() + " is skipped");
		else
			throw new IllegalStateException("unit test case for " + MediaWiki.getVersion() + " is skipped");
		// TODO: not finished.
	}

	/**
	* Test method for {@link MediaWiki#createTitleQuery(net.sourceforge.jwbf.core.actions.util.MediaWikiBot, net.sourceforge.jwbf.core.actions.MediaWiki.Version, java.lang.String)}.
	*/
	@Test
	@Slf4j
	public void testCreateTitleQuery() {
		// TODO: not finished.
	}

	/**
	* Tests if multiple template users can be found.
	*/
	@Test
	@Slf4j
	public void testMultipleTmpls() {
		// TODO: not finished.
	}

	/**
	* Test method for {@link MediaWiki#processAllReturningText(java.lang.String)}.
	*/
	@Test
	public void testprocessAllReturningText() throws VersionException {
		if (log.isDebugEnabled())
			log.debug("unit test case for processAllReturningText=" + MediaWiki.processAllReturningText
					+ " is skipped");
		else
			throw new IllegalStateException("unit test case for processAllReturningText="
					+ MediaWiki.processAllReturningText + " is skipped");
	}

	/**
	* Tests if a template user can be removed from the list after it is removed.
	*/
	@Test
	@Slf4j
	public void testRemovedTemplate() {
		// TODO: not finished.
	}

	/**
	* Tests if multiple template users can be removed from the list.
	*/
	@Test
	@Slf4j
	public void testMultipleRemovedTs() {
		// TODO: not finished.
	}

	private void deleteContent(final Collection<String> toBeDeleted, final String text) throws VersionException {
		final StringBuffer stringBuffer = new StringBuffer()
				.append("This is an automatically generated test set.")
				.append("It must not be modified externally.")
				.append("It's recommended you do not modify or add new test content and run the test by manually.")
				.append("This test is also a bit fuzzy and it will fail, especially if the list of templates contained in the wiki changes during the execution of this test or the execution is interrupted.")
				.append(text);
		final Matcher matcher = Pattern.compile("(/[^\"]*?.*?(\"|'.*?[^\']*')$").matcher(stringBuffer.toString());
		final Matcher m = ncbiPidPattern.matcher(stringBuffer.toString());

		assert