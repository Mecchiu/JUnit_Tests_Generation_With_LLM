```java
@Slf4j
class LogEvents_1Test {

    @Test
    void testHasNextWhenLogIteratorHasNext() {
        LogEvents logEvents = createLogEventsWithLogIterator(true);
        assertTrue(logEvents.hasNext());
    }

    @Test
    void testHasNextWhenLogIteratorDoesNotHaveNext() {
        LogEvents logEvents = createLogEventsWithLogIterator(false);
        assertFalse(logEvents.hasNext());
    }

    private LogEvents createLogEventsWithLogIterator(boolean hasNext) {
        LogEvents logEvents = new LogEvents(createMockMediaWikiBot(), "move");
        Collection<LogItem> logItems = new Vector<>();
        logItems.add(new LogItem());
        Iterator<LogItem> logIterator = logItems.iterator();
        logEvents.logIterator = logIterator;
        if (!hasNext) {
            logEvents.hasMoreResults = false;
        }
        return logEvents;
    }

    private MediaWikiBot createMockMediaWikiBot() {
        return new MediaWikiBot();
    }
}
```