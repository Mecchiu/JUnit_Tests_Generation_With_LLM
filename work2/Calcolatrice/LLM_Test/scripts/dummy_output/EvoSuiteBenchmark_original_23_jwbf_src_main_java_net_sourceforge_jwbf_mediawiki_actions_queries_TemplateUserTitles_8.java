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
	 * Test of {@link #processAllReturningText(String)} method.
	 * @throws VersionException
	 * 		if the mediaWiki is not properly formatted or the MediaWiki is a bot.
	*/
	@Test
	public void testProcessAllReturningText1() throws VersionException {
		String response = processAllReturningText("http://foosy.net/");
		assertTrue(response.isEmpty());
	}
	
	/**
	 * Test of {@link #processAllReturningText(String)} method.
	 * @throws VersionException
	 * 		if the mediaWiki is not properly formatted or the MediaWiki is a bot.
	*/
	@Test
	public void testProcessAllReturningText2() throws VersionException {
		MediaWiki mediaWiki = new MediaWiki(this.getClass().getSuperclass().getName());
		MediaWikiBot mediaWikiBot = mediaWiki.getBot();
		MediaWikiAction mwAction = new MediaWikiAction(mediaWikiBot);
		String response = mwAction.processAllReturningText("http://foosy.net/");
		assertTrue(!response.isEmpty());
	}
	/**
	 * Test of {@link #processAllReturningText(String)} method.
	 * @throws VersionException
	 * 		if the mediaWiki is not properly formatted.
	*/
	@Test
	public void testProcessAllReturningText3() throws VersionException {
		String response = new MediaWikiAction(this.getClass().getSuperclass().getName()).processAllReturningText("http://foosy.net/");
		assertTrue(!response.isEmpty());
	}
	
	/**
	 * Test of {@link #processAllReturningText(String)} method.
	 * @throws VersionException
	 * 		if the mediaWiki is not properly formatted.
	*/
	@Test
	public void testProcessAllReturningText4() throws VersionException {
		MediaWiki mediaWiki = new MediaWiki(this.getClass().getSuperclass().getName());
		MediaWikiBot mediaWikiBot = mediaWiki.getBot();
		mediaWikiBot.clearAllQueries();
		mediaWikiBot.addQuery(new MediaWikiBot.Query(0, new SupportedBy(this.getClass().getSuperclass().getName(),supportedByApiVersion(0))));
		String response = new MediaWikiAction(this.getClass().getSuperclass().getName()).processAllReturningText("http://foosy.net/");
		assertTrue(!response.isEmpty());
	}
}