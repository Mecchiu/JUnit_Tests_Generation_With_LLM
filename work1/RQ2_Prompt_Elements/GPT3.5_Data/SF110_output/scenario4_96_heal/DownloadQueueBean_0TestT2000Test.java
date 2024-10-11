import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_0Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.addToQueue("contentId3");
    }

    @Test
    void testRemoveAllFromQueue() {
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueIsEmpty() {
        downloadQueueBean.removeAllFromQueue();
        assertFalse(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasOneEntry() {
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasTwoEntries() {
        downloadQueueBean.removeFromQueue("contentId1");
        downloadQueueBean.removeFromQueue("contentId2");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasThreeEntries() {
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasDuplicateEntries() {
        downloadQueueBean.addToQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasNullEntries() {
        downloadQueueBean.addToQueue(null);
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasMixedEntries() {
        downloadQueueBean.addToQueue(null);
        downloadQueueBean.addToQueue("contentId4");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueueWhenQueueHasNonStringEntries() {
        downloadQueueBean.addToQueue(123);
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }
}