```java
class DownloadQueueBean_4Test {

    @Test
    void testClearPackageFileSettings() {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        
        // Set initial package file settings
        downloadQueueBean.setPackageFileLocation("testLocation");
        downloadQueueBean.setPackageURL("testURL");
        downloadQueueBean.setPackageFormat(1);
        downloadQueueBean.setPackageFileCreated();
        
        // Clear package file settings
        boolean result = downloadQueueBean.clearPackageFileSettings();
        
        // Assert that package file settings are cleared successfully
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModified());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
        assertTrue(result);
    }

    // Add more test cases for clearPackageFileSettings method if needed
}
```
```