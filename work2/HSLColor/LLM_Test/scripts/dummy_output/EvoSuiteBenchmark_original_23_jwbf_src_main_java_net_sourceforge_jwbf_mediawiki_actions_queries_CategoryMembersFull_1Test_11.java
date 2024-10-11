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
		
/**
 * Tests the implementation of the {@link CategoryMembersFull} with an empty
 * list
 * of categories.
*/
  @Test
  public void test() {
    assertNull("hasNext() should return null.",
      new CategoryMembersFull().hasNext());
  }

/**
 * Tests method {@link Iterable#iterator()}.
 */
  @Test
  public void testIterator() {
    final CategoryMembersFull action = new CategoryMembersFull();
    final Iterator it = action.iterator();
    assertFalse("iterator() should return an empty collection.", it.hasNext());
    action.setCategories(new ArrayList<CategoryItem>());
    final ArrayList<CategoryItem> expected = new ArrayList<CategoryItem>();
    final CategoryItems expected2 = new CategoryItems();
    action.getCategories().add(expected2);
    expected2.extendCollection((Collection) action.getCategories());
    assertTrue("return from iterator should return the next collection of objects.", it.hasNext());
    assertEquals("Returned collection does not match expected.",
      expected, it.next());
  }
	
/**
 * Tests the creation of a MediaWikiBot using the various combinations of
 * available configurations.
 */
  @Test
  public void testMediaWikiBot() throws ProcessException, JwbfException {
    final MediaWikiBot mediawiki = MediaWikiBot.createMediaWikiBot(MediaWiki.class);
    log.debug("Created MediaWikiBot with default configuration!");

    final MediaWikiMediaWikiBot mediaWikiBot = new MediaWikiMediaWikiBot(mediawiki) {
	  @Override
      void execute() throws ProcessException, JwbfException
  {
    	log.debug("Executing first " + MediaWikiBot.getClass().getName() + ".");
 
    	log.debug("MediaWikiBot is a MediaWikiBot!");
    	
    	log.debug("MediaWikiBot has configurations: " + MediaWikiBot.getSupportedConfigurationNames());

    	for (int i = 0; i < MediaWikiBot.getSupportedConfigurationNames().length; i++) {
      		String currentConfigurationName = MediaWikiBot.getSupportedConfigurationNames()[i].toString();
      		log.debug("Setting MediaWikiBot configuration name '" + currentConfigurationName + "' to MediaWikiBot.");
      		mediawiki.createConfiguration(currentConfigurationName,
      				new SupportedBy(
	    				new String[] { "query" },
	    				new String[] { MediaWikiBot.QUIET, MediaWikiBot.FALSECONTEXT }));
      	}
  		
    	log.debug("MediaWikiBot has configuration names: " + MediaWikiBot.getSupportedConfigurationNames());

      // MediaWikiBot does not support the following context settings.
    	//mediawiki.createConfiguration(
    	//"user-1-2-0",
    	//SupportedBy.CONTEXT_PREFIX, 
    	//"context-1-0-1");

    	mediawiki.createConfiguration("user-1-2-0", new SupportedBy(
	     		new String[] { MediaWikiBot.QUERY,
	      				MediaWikiBot.QUIRES },
	      		SupportedBy.CONTEXT_PREFIX, 
	      		"context-1-0-1"));

      }
    };
    
    assertTrue("The MediaWikiBot is a MediaWikiBot and not the MediaWikiBot does not know about the " +
      		"default Wikipedia configuration!", 
      mediawiki.supportsConfiguration(MediaWiki.DEFAULT_CONFIGURATION_NAME));
    
    mediawiki.setConfiguration("user-1-2-0",
      new SupportedBy[] { MediaWikiBot.QUERY,
      				MediaWikiBot.QUIRES },
      SupportedBy.CONTEXT_PREFIX);
    
    assertTrue("The MediaWikiBot is a MediaWikiBot and not the MediaWikiBot supports the " +
    		"default \"query\" configuration.",
      mediawiki.supportsConfiguration(MediaWiki.DEFAULT_CONFIGURATION_NAME));
    
    // This should fail because the current configuration name is in use in the
    // previous configuration.
    
    // mediawiki.setConfiguration("user-1-2-0", new SupportedBy[] { MediaWikiBot.QUERY }, SupportedBy.NONE);
    //
    // assertTrue("This should fail because the previous configuration name is in use in the " +
    // "current configuration.",
    // MediaWikiBot.supports
}
}