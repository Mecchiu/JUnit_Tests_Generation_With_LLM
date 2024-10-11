import org.junit.jupiter.api.BeforeEach;

class DownloadQueueBean_1Test {

    private DownloadQueueBean downloadQueueBean;

    @BeforeEach
    void setUp() {
        downloadQueueBean = new DownloadQueueBean();
    }

    @Test
    void testClearPackageFileSettings() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithNullValues() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL(null);
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithModifiedSinceFileCreatedTrue() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
        downloadQueueBean.setPackageFormat(1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithPackageFormatSet() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithPackageFormatNotSet() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithPackageFileLocationSet() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL(null);
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithPackageURLSet() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithPackageFileLocationAndPackageURLSet() {
        downloadQueueBean.setPackageFileLocation(new File("test"));
        downloadQueueBean.setPackageURL("http://test.com");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsReturnsTrue() {
        assertTrue(downloadQueueBean.clearPackageFileSettings());
    }
}