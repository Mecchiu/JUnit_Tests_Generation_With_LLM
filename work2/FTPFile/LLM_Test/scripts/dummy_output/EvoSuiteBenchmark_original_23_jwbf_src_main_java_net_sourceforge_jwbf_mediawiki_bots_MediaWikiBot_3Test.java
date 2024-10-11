package net.sourceforge.jwbf.mediawiki.bots;
java
@Slf4j
public class MediaWikiBot_3Test {

    @Test
    public void testGetArticle_NullName() {
        MediaWikiBot bot = new MediaWikiBot();
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(null));
    }

    @Test
    public void testGetArticle_EmptyName() {
        MediaWikiBot bot = new MediaWikiBot();
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(""));
    }

    @Test
    public void testGetArticle_InvalidName() {
        MediaWikiBot bot = new MediaWikiBot();
        assertThrows(ActionException.class, () -> bot.getArticle("Invalid[]Name"));
    }

    @Test
    public void testGetArticle_ValidName() {
        MediaWikiBot bot = new MediaWikiBot();
        Article article = bot.getArticle("Main Page");
        assertNotNull(article);
    }

    @Test
    public void testGetArticle_ValidNameWithProperties() {
        MediaWikiBot bot = new MediaWikiBot();
        Article article = bot.getArticle("Main Page", GetRevision.CONTENT);
        assertNotNull(article);
    }

    @Test
    public void testGetArticle_InvalidProperties() {
        MediaWikiBot bot = new MediaWikiBot();
        assertThrows(ActionException.class, () -> bot.getArticle("Main Page", 123));
    }

    @Test
    public void testGetArticle_ValidNameAndProperties() {
        MediaWikiBot bot = new MediaWikiBot();
        Article article = bot.getArticle("Main Page", GetRevision.CONTENT | GetRevision.COMMENT);
        assertNotNull(article);
    }

    @Test
    public void testGetArticle_ValidNameAndInvalidProperties() {
        MediaWikiBot bot = new MediaWikiBot();
        assertThrows(ActionException.class, () -> bot.getArticle("Main Page", GetRevision.CONTENT | 123));
    }

    @Test
    public void testGetArticle_ValidNameAndDefaultProperties() {
        MediaWikiBot bot = new MediaWikiBot();
        Article article = bot.getArticle("Main Page");
        assertNotNull(article);
    }
}
