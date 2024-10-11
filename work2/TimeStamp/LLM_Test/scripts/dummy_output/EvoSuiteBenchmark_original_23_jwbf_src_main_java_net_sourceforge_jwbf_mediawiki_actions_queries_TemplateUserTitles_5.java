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
		static MediaWiki bot;
		static String response;		
	@Test
	public void testAllReturningText() throws VersionException, MediaWikiBotException {
		
		// create a MWNamespace user
		MediaWikiBot.createNewNamespace(bot, "NamespaceOne");
		
		// insert the new MediaWiki namespace into the bot.
		bot.insertToNamespace(MWNamespace1.NEW_MEDIAWIKI_NS, "Namespace1", false);

		// call the MediaWiki-api
		
		// get the response from the MediaWiki
		// using the MediaWiki-bot to get the response from the MediaWiki-api
		
		// get the response from the MediaWiki
		response = bot.getResponse();
		log.info("response: {}", response);		
	}

	@Test
	public void testNoReturningNamespaces() throws VersionException, MediaWikiBotException {

		// create a User
		
		// add the default namespace
		bot.insertToNamespace(MWNamespace1.NEW_MEDIAWIKI_NS, "NamespaceOne");
		
		// call the MediaWiki-api
		
		// get the response from the MediaWiki
		response = bot.getResponse();
		log.info("response: {}", response);				

		// create a new namespace
}
}