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
	* Test get method.
	*/
	@Test
	public void testGet(){
		final Get get = MediaWiki.get("/", "embeddedin", SupportedBy.NOOP);
		assertNotNull(get);
	}
	
	/**
	* Test toString() method.
	*/
	@Test
	public void testToString(){
		final MediaWiki bot = new MediaWikiBot(Version.MW1_13);
		final String text = TemplateUserTitles.processAllReturningText(bot.submit("search")) ;
		
		System.out.println(text);
	}
}

/**
* Test default constructor
*/
@Test
@Slf4j
public class TemplateUserTitleParserTest extends TemplateUserTitles {

	/**
	* Test get and list method.
	*/
	@Test
	public void testGetList(){
		final MediaWiki bot = new MediaWikiBot(Version.MW1_13);
		final Collection<String> res = BotManagerService.get()
				.list("/", BotManagerService.PARSER_TEMPLATE)
				.get(1000)
				.get("templates");
	
		Collection<String> res1 = BotManagerService.get()
               .list("/", BotManagerService.PARSER_TEMPLATE)
               .get(1000)
               .get("templates");
	
        Collection<String> res2 = BotManagerService.get()
               .list("/", BotManagerService.PARSER_TEMPLATE)
               .get(1000)
               .list("templates", "templates");
	
		Collection<String> res3 = BotManagerService.get()
               .list("/", BotManagerService.PARSER_TEMPLATE)
               .get(1000)
               .list("templates", 0);
	
		Collection<String> res4 = BotManagerService.get()
               .list("/", BotManagerService.PARSER_TEMPLATE);
	
		Collection<String> res5 = BotManagerService.get()
               .list("/", BotManagerService.PARSER_TEMPLATE, SupportedBy.DEFAULT, -1, 0, "0");
	
		//String res5 = res.parallelStream()
		//		.map(TemplateUserTitles.processAllReturningText(text))
		//		.parallelStream()
		//			.filter(s -> s.startsWith("templates"))
		//			.collect(Collectors.joining(" "));
		
        //System.out.println(res);
        //System.out.println(res3);
        
        // check a special case with 0
        res4.remove("templates");
        //System.out.println("Res2: "+res2);
        //check a special case with 0-1
}
}