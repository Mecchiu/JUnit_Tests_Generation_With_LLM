// PostModifyContent_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains one unit test case for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {

    //@Test
        public void postModifyArticle() throws ProcessException, VersionException, IOException, JwbfException {
            // Write two articles
            final SimpleArticle firstArticle = SimpleArticle.builder().title("First").build();
            ContentAccessable firstAccess = ContentAccessable.builder().content("text/html", firstArticle.rawContentContent(null)).build();
            final SimpleArticle secondArticle = SimpleArticle.builder().title("Second").build();

            // Create bot
            final MediaWikiBot bot = MediaWikiBot.builder().author("test").build();

            // Create PostRequest and Post action
            final PostRequest postRequest = new PostRequest(bot);
            final Post post = Post.builder().action(postRequest).title("Title").post(1, null).content("first content", null).build();
            final PostRequest deleteRequest = new PostRequest(bot);
            final PostModifyContent postModifyRequest = new PostModifyContent(bot, postRequest, post);

            // Prepare Post Modify content
            final Hashtable props = new Hashtable();
            props.put("_REQUESTOR", bot.getUsername());
            props.put("" + SupportedBy.BOTTOM, "true");
            props.put("_REQUESTID", "test");
            props.put("_SUBJECT", "This is a test");
            final Hashtable metadata = new Hashtable();
            metadata.put("_REQUESTID", "test");
            metadata.put("_SUBJECT", "One of these is a test", "wiki.core.title");

            // Check result (and set metadata in order to test the code for other cases)
            boolean done = false;
            while (!done) {
                final PostModifyContent postModifyContent = new PostModifyContent(bot, postModifyRequest, null);

                // Check status of content (we don't care which of the posts the bot may create (that is, just for this test), so check it here)
                final boolean result = postModifyContent.hasMoreMessages();
                done = postModifyContent.hasMoreMessages()!= null && result;

                // Check if some content is created
                final boolean check = result;

                // Get result
                final boolean success = check && postModifyRequest.hasMoreMessages();
                final boolean remove = postModifyRequest.hasMoreMessages() &&!check;

                // Check if the right set is given to the test
                if ((success && postModifyRequest.hasMoreMessages()) || (success && remove)) {
                    log.info("[Post Modify Content]: Article has been created with {} more messages", success);
                } else {
                    log.error("[Post Modify Content]: Article not created");
                }

                // Save result in a result variable
                postModifyRequest = result? postModifyRequest : postModifyRequest.getParent();
            }
        }

    }
	
	
	@Slf4j
	@Test
	public void postModifyArticle2() throws ProcessException, VersionException,
			JwbfException {
		// Write two articles
		final SimpleArticle firstArticle = SimpleArticle.builder().title("First").build();
		ContentAccessable firstAccess = ContentAccess