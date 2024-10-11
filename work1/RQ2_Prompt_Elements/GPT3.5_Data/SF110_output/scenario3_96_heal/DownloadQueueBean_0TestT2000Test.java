import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_0Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
    }

    @Test
    void testRemoveAllFromQueue() {
        // Test removing all metadata ids from an empty queue
        assertTrue(downloadQueueBean.removeAllFromQueue());

        // Test removing all metadata ids from a non-empty queue
        Collection<String> contentIds = new TreeSet<>();
        contentIds.add("123");
        contentIds.add("456");
        contentIds.add("789");
        downloadQueueBean.setContentIds(contentIds);
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentIds().isEmpty());

        // Test removing all metadata ids from a queue that already has no metadata ids
        assertFalse(downloadQueueBean.removeAllFromQueue());
    }
}