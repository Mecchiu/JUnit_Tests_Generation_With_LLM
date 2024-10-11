// CategoryMembersFull_0Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFull_0Test {
		
    @Test
    void test()
    throws Exception {
    	/*
    	 * Test methods for {@link CategoryMembersFull#iterator()} and {@link
    	 * CategoryMembersFull#hasNext()}.
    	 */
        final CategoryMembersFull testInstance = new CategoryMembersFull(new MediaWikiBot());
        final MediaWikiBot bot = testInstance.getBot();
        Collection<CategoryItem> catItems;
        String pageTitle;
        
        assertFalse(testInstance.hasNext());
        try {
            bot.sendNotificationsToUsers(null);
            bot.sendNotificationsToUsers("none");
            assertTrue(testInstance.hasNext());
        } catch (ProcessException e) {
        } catch (ActionException e) {
        }
        catItems = bot.getCategoryItems();
        pageTitle = bot.getPageTitle();
        assertNotNull(catItems);
        assertEquals(16, catItems.size());
        assertTrue(catItems.iterator().hasNext());
        testInstance.removeAll();
        assertFalse(testInstance.hasNext());
        catItems.clear();
    	
    	/*
    	 * Test constructor that can send requests to wiki.
    	 */
        final CategoryMembersFull testInstanceWithRequest = new CategoryMembersFull(new MediaWikiBot(new MediaWikiBot()));
        final MediaWikiBot botWithoutRequests = testInstanceWithRequest.getBot();
        final String pageTitleWithoutRequests = testInstanceWithRequest.getPageTitle();
        final String pageTitleWithRequests = testInstanceWithRequest.getPageTitleWithRequests();
        
        assertNotNull("Page Title is null."
               , pageTitleWithoutRequests);
        assertNotNull("Page Title with requests."
               , pageTitleWithRequests);
        assertTrue("Both pages title and requests are equal. Page title: " + pageTitleWithoutRequests
               , pageTitleWithoutRequests
                       .equals(pageTitleWithRequests));
        assertTrue("Both page title has no requests. Page title: " + pageTitleWithoutRequests
               , pageTitleWithoutRequests.equals(pageTitleWithRequests));
        assertNotNull("Bot without requests."
               , botWithoutRequests);
        assertTrue("Bot has no requests. Bot doesn't have them. Page title: "
                + botWithoutRequests.getPageTitle(), botWithoutRequests.getPageTitle()
               .matches(pageTitleWithRequests.replace("Page title in wikibase.",
                    "Page title in the wikibase.")));
    	/*
    	 * Test the remove method.
    	 */
        final CategoryMembersFull testInstanceWithoutRequest = new CategoryMembersFull(new MediaWikiBot());
        final MediaWikiBot botWithoutRequest = testInstanceWithoutRequest.getBot();
        testInstanceWithoutRequest.setPageTitle(pageTitleWithRequests);
        testInstanceWithoutRequest.remove();
        final MediaWikiBot robot = testInstanceWithoutRequest.getBot();
        robot.getBotStatus().get();
        assertTrue("There is no request to remove the category wiki.",
                botWithoutRequest.hasWiki());
        robot.getBlog().getWiki()
               .remove(Constants.REMOVE_CATEGORY);
        robot.getBotStatus().get();
        testInstanceWithoutRequest.remove();
        assertTrue("Can't be removed, request was not sent.",
                testInstanceWithoutRequest.getBot().getPageTitle().matches(
                    pageTitleWithoutRequests.replace("Page title in wikibase.", "Page title" + pageTitleWithoutRequests
                        + ".")));
        testInstanceWithoutRequest.remove();
        assertTrue("There no wiki for page title with requests.", botWithoutRequest
               .getBlog().hasWiki());
        testInstanceWithoutRequest.remove();
        assertTrue("Can't be removed, blog don't have the page title with requests.",
                testInstanceWithoutRequest.getBot().getPageTitle().matches(pageTitleWithRequests.replace("Page title in wikibase.", "Page title"
                                + pageTitleWithRequests
                        + ".")));
        testInstanceWithoutRequest.remove();
    	/*
    	 * Test {@link MediaWikiBot#getWiki()}.
    	 */
    	final MediaWikiBot mwBot = new MediaWikiBot();
    	final MediaWiki bot = new MediaWikiBot();
    	final CategoryItems categoryItems = new CategoryItems();
        bot.setWiki(mwBot);
}
}