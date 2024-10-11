java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostModifyContent_0Test {

    @Test
    void testHasMoreMessages_FirstTrue() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        assertTrue(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_FirstFalseSecondTrue() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        assertTrue(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_FirstFalseSecondFalse() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        postModifyContent.getNextMessage();
        assertFalse(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_BothFalse() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        postModifyContent.getNextMessage();
        assertFalse(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_FirstTrueSecondFalse() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        assertFalse(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_BothTrue() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.hasMoreMessages();
        assertTrue(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_FirstTrueSecondTrue() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        assertTrue(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_FirstFalse() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.getNextMessage();
        assertFalse(postModifyContent.hasMoreMessages());
    }

    @Test
    void testHasMoreMessages_BothTrueSecondFalse() {
        MediaWikiBot bot = new MediaWikiBot();
        SimpleArticle article = new SimpleArticle();
        PostModifyContent postModifyContent = new PostModifyContent(bot, article);
        postModifyContent.hasMoreMessages();
        postModifyContent.getNextMessage();
        assertFalse(postModifyContent.hasMoreMessages());
    }
}
