// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
		 public void testWikiBot(WikiBot bot) throws MalformedURLException, ProcessException {
		    	assertEquals("Wiki, Ubuntu Users",bot.getWikiType());
                 //bot.addWebHandler(new WebHandler(){
             	 bot.addWebHandler(new WikiHandler(bot, "/wiki"));
		 }
		}

		public void testAction(
				HttpBot bot,
				PostAction action,
				String wikiType,
				String username,
				String password,
				String page) throws MalformedURLException, ProcessException {
		    	InyokaWikiBot bot2 = new InyokaWikiBot(wikiType);
			    /* InyokaWikiBotTest.testWikiBot(bot2)
                    */
				assertEquals(wikiType, bot2.getWikiType());
          /* InyokaWikiBotTest.testAction(
                action,
                bot2,
                "Wiki");
        /* InyokaWikiBotTest.testAction(
                action, bot2, "Wiki");
        */
                ActionException e = null;
		    if (ActionException.NO_REVISION_HANDLER_FOUND_ACTION.equals(action))
		    	e = checkPage(bot, "http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&", page);	
		    else
		    	e= checkPage(bot, "");

		    if ( (e == null) && (ActionException.NO_REVISION_HANDLER_FOUND_ACTION.equals(action)))
			    System.err.println("Test passed: "+ActionException.NO_REVISION_HANDLER_FOUND_ACTION );
		    else
		    	throw e;
		}

        // TODO
	}

	public static void main(String args[]) throws MalformedURLException, ProcessException {
        if (args.length > 0) {
            wikiType = args[0];
        }
        if (args.length > 1) {
            logger.setLevel(Level.parse(args[1]));
        }
        new InyokaWikiBotTest().testAction(new InyokaWikiBotTest().getArticle(null),GetRevision.POST_ACTION,wikiType, "Tom", "Tom", "hello");
	}

	public static final Logger logger = Logger.getLogger(InyokaWikiBotTest.class.getName());

	public static class WikiHandler extends HttpBot { // TODO: do not need another one
        public WikiHandler(InyokaWikiBot botOne) {
             super(botOne.getWiki(), InyokaWikiBotTest.class.getName());
             initialize();
        }
		   
        private void initialize() { // TODO: do not need another one
            setWebHandler("/"+inYokaWikiUrl.substring(inYokaWikiUrl.lastIndexOf('/', inYokaWikiUrl.length()-1)),this);
			 setWebHandler(botOne.getWikiUrl(), this);
			
		}
}