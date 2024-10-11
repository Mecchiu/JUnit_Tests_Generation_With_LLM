package net.sourceforge.jwbf.mediawiki.actions.editing;
java
@Slf4j
class GetApiToken_1Test {

    @Test
    void testHasMoreMessagesFirstTime() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_12, new Userinfo());
        assertTrue(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesSecondTime() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_12, new Userinfo());
        getApiToken.getNextMessage();
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesMultipleTimes() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_12, new Userinfo());
        getApiToken.getNextMessage();
        getApiToken.getNextMessage();
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesNoMessages() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_12, new Userinfo());
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesFirstTimeMW116() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_16, new Userinfo());
        assertTrue(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesSecondTimeMW116() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_16, new Userinfo());
        getApiToken.getNextMessage();
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesMultipleTimesMW116() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_16, new Userinfo());
        getApiToken.getNextMessage();
        getApiToken.getNextMessage();
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesNoMessagesMW116() {
        GetApiToken getApiToken = new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MW1_16, new Userinfo());
        assertFalse(getApiToken.hasMoreMessages());
    }

    @Test
    void testHasMoreMessagesUnsupportedVersion() {
        assertThrows(VersionException.class, () -> {
            new GetApiToken(GetApiToken.Intoken.DELETE, "Title", MediaWiki.Version.UNKNOWN, new Userinfo());
        });
    }
}
