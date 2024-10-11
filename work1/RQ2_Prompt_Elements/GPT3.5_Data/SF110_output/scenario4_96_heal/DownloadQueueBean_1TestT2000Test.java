import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_1Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
    }

    @Test
    void testClearPackageFileSettings() {
        downloadQueueBean.setPackageFileLocation("test/location");
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullLocation() {
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullURL() {
        downloadQueueBean.setPackageFileLocation("test/location");
        downloadQueueBean.setPackageFileCreated();
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNoPackageFile() {
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithModifiedPackage() {
        downloadQueueBean.setPackageFileLocation("test/location");
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithUnmodifiedPackage() {
        downloadQueueBean.setPackageFileLocation("test/location");
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullLocationAndURL() {
        downloadQueueBean.setPackageFileCreated();
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullLocationAndModifiedPackage() {
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullURLAndModifiedPackage() {
        downloadQueueBean.setPackageFileLocation("test/location");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }

    @Test
    void testClearPackageFileSettingsWithNullLocationAndUnmodifiedPackage() {
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageFileCreated();
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertFalse(downloadQueueBean.isPackageModifiedSinceFileCreated());
    }
}