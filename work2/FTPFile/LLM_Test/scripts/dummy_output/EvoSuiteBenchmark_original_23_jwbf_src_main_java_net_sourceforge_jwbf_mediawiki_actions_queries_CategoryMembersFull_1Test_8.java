// CategoryMembersFull_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains one unit test case for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {
		
	@Test
	@Slf4j 
	public void hasNextOnHasMore() {
		log.debug("This MediaWiki instance is testing hasNext() on an empty list.");
		Get action = new Get(
			Integer.parseInt(ActionDefinition.getRandomInt(1325)),
			Integer.parseInt(ActionDefinition.getRandomInt(2787)),
			Integer.parseInt(ActionDefinition.getRandomInt(1640)),
		);
		assertFalse(MediaWikiBot.bot.actionExecution.execute(action));
	}

	@Test
	@Slf4j
	public void hasNextOnHasMore() {
		log.debug("This MediaWiki instance is testing hasNext() on a list with an item added.");
		// We have to use the MediaWikiBot.bot.page method to make sure no one
		// does:
		final MediaWikiBot bot = MediaWikiBot.bot();
		final Get action = new Get(
			Integer.parseInt(ActionDefinition.getRandomInt(1325)),
			Integer.parseInt(ActionDefinition.getRandomInt(2787)),
			Integer.parseInt(ActionDefinition.getRandomInt(1640)),
		);
		bot.addPage(action, "home");
		Collection<CategoryItem> expected = new ArrayList<>();
		expected.add(new CategoryItem(Integer.toString(ACTION_ID), "Home"));
		assertTrue("MediaWiki instance is testing hasNext() on a list with an item added.",
			MediaWikiBot.bot.actionExecution.execute(action).isEmpty());
		actual = MediaWikiBot.bot.get(action);
		assertEquals("MediaWikiBot.bot.get() did not return the list.", expected, actual);
	}

	@Test
	@Slf4j
	public void hasNextOnHasMore() {
		log.debug("The MediaWiki Bot does not have " +
			"public content for this MediaWiki instance.");
		MediaWikiBot.bot = null;
		assertFalse("There is no MediaWiki at this " +
			"Time as a bot may be null.", MediaWikiBot.bot);
		// Same logic with MediaWikiBot.addPage
		final Get action = new Get(
			Integer.parseInt(ActionDefinition.getRandomInt(1325)),
			Integer.parseInt(ActionDefinition.getRandomInt(2787)),
			Integer.parseInt(ActionDefinition.getRandomInt(1640)),
		);
		assertFalse("There is no MediaWiki at this " +
			"Time as it may be " +
			"the end of the content.", MediaWikiBot.bot.actionExecution.execute(action).isEmpty());
		MediaWikiBot.bot = MediaWikiBot.create(
			Integer.parseInt(ActionDefinition.getRandomInt(1325)),
			Integer.parseInt(ActionDefinition.getRandomInt(2787)),
			Integer.parseInt(ActionDefinition.getRandomInt(1640)),
		);
		actual = MediaWikiBot.bot.get(action);
		assertEquals("MediaWikiBot.bot.get() did not return the list.",
			new ArrayList<>(expected), actual);
		
	}
	
	@Test
	@Slf4j
	public void hasNextOnHasMore_1() throws ProcessException, JwbfException {
		log.debug("Test of MediaWiki on an empty list.");
		CreateAction action = new CreateAction(
			Integer.parseInt(ActionDefinition.getRandomInt(1325)),
			Integer.parseInt(ActionDefinition.getRandomInt(2787)),
			Integer.parseInt(ActionDefinition.getRandomInt(1640)),
		);
		action.setVersion(MW1_11);
		assertTrue("There is no MediaWiki instance as a bot may be created.",
			MediaWikiBot.bot.actionExecution.execute(action).isEmpty());
	}

}