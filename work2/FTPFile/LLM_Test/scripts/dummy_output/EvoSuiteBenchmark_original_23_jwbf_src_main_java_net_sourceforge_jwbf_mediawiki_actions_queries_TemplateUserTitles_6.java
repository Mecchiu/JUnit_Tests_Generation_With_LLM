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
		
	public TemplateUserTitlesTest() { }

	@Test
	void test() throws VersionException {
		// Given a MediaWiki-bot
		final MediaWikiBot mwb = MediaWikiBot
			.forVersion(Version.MW1_10)
			.withConfigName("TestBot")
				// create a MediaWiki-bot, that will reply to the test message via
				// {@link #createUserTitles(String a)}. After execution it will
				// answer the test message with the results of processing
				// "TemplateUserTitles[test, 1]"
				.createBot();
		// When sending the message
		mwb.post(new HttpAction<Void>("/1", null, "TemplateUserTitles[test, 1]"), null, null);

		// THEN it should return the expected text
		final String body = mwb.getMessageContent(null);
		// check if there is the body content
		final Matcher matcher = Pattern.compile(".*?\"TemplateUserTitles\"").matcher(body);
		assertTrue(matcher.matches());
		final String expected = ".*TemplateUserTitles.*(?<!TemplateUserTitles[test, 1]).+?</"
				+ "\"TemplateUserTitles[test, 1]\"";
		assertEquals(expected, matcher.group(1).replaceAll("\\<.*?\\>",""));
	}

	private static final Collection<String> all = new ArrayList<>();
	private static final Collection<String> allWithVersion = new ArrayList<>();

	// tests for {@link TemplateUserTitles#processAllReturningText(String)}
	/**
	* Test case executed for most MediaWiki-versions - including MediaWiki 1.9.0.
	*
	* @param s
	*/
	public static final void test(String s) throws VersionException {
		// Given mwb:
		final MediaWiki mwb = MediaWiki.build(Version.MW1_09)
			// create a MediaWiki-bot, that will reply to the test message via
			// {@link #createUserTitles(String a)}. After execution it will
			// answer the test message with the results of processing
			// "TemplateUserTitles[test, 1]".
			.createBot();
	}

	// tests for {@link TemplateUserTitles#processAllReturningText(String)}
	/**
	* Test case executed for the minimum MediaWiki-version 1.10.
	*
	* @param s
	*/
	public static final void test1(String s) throws VersionException {
		// Given the MediaWikiBot created by {@link #createBot()}
		final MediaWiki mwb = MediaWiki.forVersion(Version.MW1_10)
			.withConfigName("TestBot")
				// create a MediaWiki-bot, that will reply to the test message via
				// {@link #createUserTitles(String a)}. After execution it will
				// answer the test message with the results of processing
				// "TemplateUserTitles[test, 1]";
			.createBot();
		// When sending the message
		mwb.post(new HttpAction<Void>("/1", null, "TemplateUserTitles[test, 1]"), null, null);

		// THEN it should return the expected text
		final String body = mwb.getMessageContent(null);

		// check if there is the body content
}
}