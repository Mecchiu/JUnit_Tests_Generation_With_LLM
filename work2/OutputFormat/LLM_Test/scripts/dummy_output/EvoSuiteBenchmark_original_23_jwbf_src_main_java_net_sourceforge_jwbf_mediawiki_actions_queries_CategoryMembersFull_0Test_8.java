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
		/**
         * Checks {@link CategoryMembers}.
         */
        @Test
        @Slf4j
        void iterator() throws JwbfException { //noredirect to test all supported versions of MediaWiki
                 assertTrue("CASetUp - CASetUp is not supported in MediaWiki v." + MW1_12,
                             SupportedBy.CASETUP);

                 // check cases for cases where the expected response cannot be read
                 assertFalse("Succeed", MediaWikiBot.SUCCEED);
                 assertFalse("NoWikiVersion", MediaWikiBot.HARNOCASETUP);
        }

        /**
         * {@link MediaWikiBot} has the following response for the full cat set up cases where
		 * no supported versions of MediaWiki is present in the {@link MediaWikiBot}:
		 * - CASetUp in MediaWiki V1.13.0 is supported
		 * - CASetUp in MediaWiki V1.16.0 is supported
		 * - CASetUp in MediaWiki V1.16.3 is supported
		 */
        @Test
        @Slf4j
        void checkMediaWikiVersion() throws ProcessException {
             //check cases when the MediaWiki version is not supported by the bot
             assertFalse(MediaWikiBot.SUCCEED, MediaWikiBot.MEDIAWIKI_VERSION.getSupported());

             //Test version for MediaWiki v.13.0
             Collection<String> validVersions = new ArrayList<>(2); validVersions.add("v.13.0");
             validVersions.add("");
             assertTrue("CASetUp - CASetUp is not supported in MediaWiki v." + validVersions,
                         SupportedBy.CASETUP);

             //check cases for cases where the expected response cannot be read
             assertFalse("Succeed", MediaWikiBot.SUCCEED);
             assertFalse("NoWikiVersion", MediaWikiBot.HARNOCASETUP);
        }

		/**
        */
        @Test
        @Slf4j
        void noCategoryItems() throws ProcessException {
             // check cases when the MediaWiki version is not supported by MediaWiki
             assertFalse(MediaWikiBot.SUCCEED, MediaWikiBot.MEDIAWIKI_VERSION.getSupported());

             //check cases when the MediaWiki v.11.1 is not supported by MediaWiki
             assertFalse(MediaWikiBot.SUCCEED, MediaWikiBot.MEDIAWIKI_VERSION.getSupported());

             //check cases when the MediaWiki v.12 is not supported by MediaWiki
             assertFalse(MediaWikiBot.SUCCEED, MediaWikiBot.MEDIAWIKI_VERSION.getSupported());

             //check cases when MediaWiki v.13.0 and MediaWiki v.16.1 are not supported
             ActionException ex = null;
             try {
                 //create MediaWiki 2.1 bot (and MediaWiki v.13.0)
                 log.debug("CASetUp - CASetUp is not supported in MediaWiki v." + "1.13.0");
                 createBot(VERSION_12);
                 log.debug("  CASetUp-2.1 - succesful ");
             } catch (ActionException ex1) {
                 ex = ex1;
                 log.debug("CASetUp - CASetUp is not supported in MediaWiki v." + "1.13.0");
             }

             ActionException ex2 = null;
             try {
                 //create MediaWiki v.12 bot (and MediaWiki v.13.0)
                 createBot(VERSION_12);
                 log.debug("  CASetUp-1.12 - succesful ");
             } catch (ActionException ex1) {
                 ex = ex1;
                 log.debug("  CASetUp-1.12 - Not supported ");
             }

             ActionException ex3 = null;
             try {
                 //create MediaWiki v.12 bot (and MediaWiki v.14.0)
                 createBot(VERSION_14);
                 log.debug("  CASetUp-1.14 - succesful ");
             } catch (ActionException ex1) {
                 ex = ex1;
                 log.debug("  CASetUp-1.14 - NOT supported ");
             }

             //check if the above cases failed
             if (ex!= null) {
                 throw new ProcessException(ex);
             }

		 }

		 //create MediaWiki version v.12/14 bots
}