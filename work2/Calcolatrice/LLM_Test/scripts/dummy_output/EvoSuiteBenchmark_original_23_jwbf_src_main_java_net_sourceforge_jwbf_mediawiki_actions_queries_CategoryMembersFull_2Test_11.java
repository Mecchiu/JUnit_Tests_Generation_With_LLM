// CategoryMembersFull_2Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {
		
//-------------------------------------------------------------------------------------------
// Setup
//-------------------------------------------------------------------------------------------
    private static String base = "/api/queries/";
    private MediaWikiBot bot;
    private CategoryMembersFull cml;
    
//-------------------------------------------------------------------------------------------
// Test cases with the correct implementation
//-------------------------------------------------------------------------------------------
    @Test
    @Slf4j
    void testBasic() throws ActionException, Get, ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
    }

    @Test
    public void testNext() throws ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        assertTrue(cml.getCategory().isPresent());
        assertEquals(cml.getCategory().get(), CategoryItem.fromJSON(cml.getWiki()).get().getCategory().get());
    }
    
//-------------------------------------------------------------------------------------------
// Test cases with the incorrect implementation
//-------------------------------------------------------------------------------------------
    @Test
    public void testIncomplete() throws ProcessException, JwbfException {
        bot = MediaWikiBot.create(base); 
        try {
            cml = new CategoryMembersFull(bot);
        } catch (ActionException ex) {
            assertEquals(ExceptionUtils.getMessage(ex), "No category items found");
        }
    }

    @Test
    public void testIncomplete2() throws ProcessException {
        bot = MediaWikiBot.create(base); 
        try {
            cml = new CategoryMembersFull(bot);
        } catch (ActionException ex) {
            assertEquals(ExceptionUtils.getMessage(ex), "No category items found");
        }
    }

//-------------------------------------------------------------------------------------------
// Test cases with different implementations (moves to the next category)
//-------------------------------------------------------------------------------------------
    @Test
    void testDifferent() throws ActionException, Get, ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        bot.invokeWithUrl(base+"category/categoryitem2/0/wiki/");
        assertNotEquals(cml.getCategory().get(), null);
        bot.invokeWithUrl(base+"category/category_2/0/wiki");
    }

    @Test
    void testSame() throws ActionException, Get, ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        bot.invokeWithUrl(base+"category/categoryitem2/0/wiki");
        assertNotEquals(cml.getCategory().get(), null);
    }

    @Test
    public void testDifferent2() throws ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        bot.invokeWithUrl(base+"category/category_2/0/wiki");
        assertNotEquals(cml.getCategory().get(), null);
    }

    @Test
    public void testSameAndDifferent() throws ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        bot.invokeWithUrl(base+"category/categoryitem2/0/wiki");
        assertNotEquals(cml.getCategory().get(), null);
//        
        cml.next();
        assertNotEquals(cml.getCategory().get(), null);
//        
        bot.invokeWithUrl(base+"category/category_2/0/wiki");
        assertNotEquals(cml.getCategory().get(), null);
    }

    @Test
    public void testGet() throws ProcessException {
        bot = MediaWikiBot.create(base); 
        cml = new CategoryMembersFull(bot);
        cml.next();
        bot.invokeWithUrl(base+"category/category_2/0/wiki");
        assertEquals(cml.getCategory().get(), null);
    }

}