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

	/**
	 * A unit test that performs the following test in its main method.
	 */
    @Test
    public void performTest() throws Exception {

        try {
            log.info("Test started.");

            // Prepare the mediawiki bot.
            MediaWikiBot mediawikibot = MediaWikiBot.builder()
                   .withId("WikiBT_mw1_11")
                   .withChannelId("mediaWiki1_channel")
                   .withBotName("WikiBT", MediaWikiBot.Type.MUC)
                   .build();

            // Create a MediaWiki object.
            MediaWiki mediawiki = MediaWiki.builder()
                   .withId("WikiBT")
                   .withName("WikiBT", MediaWikiBot.Type.MUC)
                   .withUsername(mediawikibot.getBotName())
                   .withChannelId("mediaWiki1_channel")
                   .withTitle("CategoryManagerTest")
                   .addCategory("CategoryManager", "CategoryManager",
                            CategoryItem.builder().putTitle("TestTitle1").build())
                   .withCategory("CategoryManager", "CategorizationManager",
                            CategoryItem.builder().putTitle("TestTitle2").build())
                   .withCategory("CategoryManager", "CategoryManager",
                            CategoryItem.builder().putTitle("CategoryManagerTest2").build())
                   .withCategory("CategoryManager", "CategoryManager",
                            CategoryItem.builder().putTitle("TestCategory").build())
                   .build();

            // Add the MediaWiki bot (if the mediawikibot was created correctly) to the mediawikiobject.
            mediawiki.addBot(mediawikibot);
            log.info("End of test.");

            // Add a default channel to the MediaWikibot (as we don't know by now).
            mediawikibot.createDefaultChannel();

            // Create a MediaWiki object.
            MediaWiki mediawiki2 = MediaWiki.builder()
                   .withId("WikiBT2")
                   .withName("WikiBT2", MediaWikiBot.Type.MUC)
                   .withUsername(mediawikibot.getUsername())
                   .withChannelId("testChannel")
                   .withChannel("testChannel", "MediaWiki channel")
                   .build();

            // Create the MediaWiki to be tested!
            // Note that this will be a default channel.
            // However, you could also try adding a channel you created above!
            mediawiki2.addCategory("CategoryManager", "CategorizationManager",
                    CategoryItem.builder().putTitle("CategoryManagerTest2").build());

            // Make the MediaWiki object be ready.
            mediawiki2.prepareAsCurrent(mediawiki);

            // Add the MediaWiki bot (if the mediawikibot was created correctly) to the mediawiki object.
            mediawiki.addBot(mediawikibot, mediawiki2);

            // Get the MediaWiki object.
            MediaWiki mediawiki2_object = mediawiki.getObject(mediawiki2);

            // Create a MediaWiki object.
            MediaWiki mediawiki2_object_2 = MediaWiki.builder()
                   .withId("WikiBT2_mw1_12")
                   .withName("WikiBT2_mw1_12", MediaWikiBot.Type.MUC)
                   .withUsername(mediawikibot.getUsername())
                   .withChannelId("testChannel_mw2_channel")
                   .withChannel("testChannel_mw2_channel",
                            mediawiki2_object.getContentId(), 10)
                   .build();

            // Create the MediaWiki object.
            mediawiki2_object_2.createContent(mediawiki, mediawiki2_object);

            // Get the MediaWiki object.
            mediawiki2_object = mediawiki2_object.getObject(mediawiki2);

            // Get the MediaWiki object.
            data(mediawiki);

        } catch (ActionException e) {
            log.error(e.toString());
            Assert.fail(e);
        } catch (ProcessException e) {
            log.error(e.toString());
            Assert.fail(e);
        }
    }
}
