import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_0Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
    }

    @Test
    void testRemoveAllFromQueue() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.addToQueue("contentId3");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueEmptyQueue() {
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueNullQueue() {
        downloadQueueBean.setContentSet(null);

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueNoModification() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.addToQueue("contentId3");

        downloadQueueBean.setPackageModifiedSinceFileCreated(false);

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueOneContent() {
        downloadQueueBean.addToQueue("contentId1");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueDuplicateContent() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId1");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueDifferentContent() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.addToQueue("contentId3");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueWithNullContent() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue(null);
        downloadQueueBean.addToQueue("contentId3");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueWithEmptyContent() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("");
        downloadQueueBean.addToQueue("contentId3");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testRemoveAllFromQueueWithWhitespaceContent() {
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("   ");
        downloadQueueBean.addToQueue("contentId3");

        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertTrue(downloadQueueBean.getContentSet().isEmpty());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }
}