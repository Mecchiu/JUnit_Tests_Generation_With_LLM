package org.heal.module.download;
java
class DownloadQueueBean_3Test {

    @Test
    void testRemoveAllFromQueue_EmptyQueue() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_NonEmptyQueue() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueNotModified() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        assertFalse(downloadQueueBean.removeAllFromQueue());
        assertEquals(2, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModified() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModifiedTwice() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.removeFromQueue("contentId1");
        downloadQueueBean.addToQueue("contentId3");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModifiedMultipleTimes() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.removeFromQueue("contentId1");
        downloadQueueBean.addToQueue("contentId3");
        downloadQueueBean.removeFromQueue("contentId2");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModifiedAndFormatSet() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModifiedAndFileLocationSet() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageFileLocation("path/to/package.zip");
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }

    @Test
    void testRemoveAllFromQueue_QueueModifiedAndURLSet() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.addToQueue("contentId1");
        downloadQueueBean.addToQueue("contentId2");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageURL("http://example.com/package.zip");
        downloadQueueBean.removeFromQueue("contentId1");
        assertTrue(downloadQueueBean.removeAllFromQueue());
        assertEquals(0, downloadQueueBean.getNumEntries());
    }
}
