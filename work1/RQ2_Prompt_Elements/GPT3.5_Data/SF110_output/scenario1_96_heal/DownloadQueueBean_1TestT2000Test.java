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
    void testClearPackageFileSettingsWithEmptyValues() {
        downloadQueueBean.setPackageFileLocation("");
        downloadQueueBean.setPackageURL("");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithOnlyLocation() {
        downloadQueueBean.setPackageFileLocation("test/location");
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
    void testClearPackageFileSettingsWithOnlyURL() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL("test/url");
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithOnlyModifiedSinceFileCreated() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL(null);
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
        downloadQueueBean.setPackageFormat(-1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithOnlyPackageFormat() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL(null);
        downloadQueueBean.setPackageModifiedSinceFileCreated(false);
        downloadQueueBean.setPackageFormat(1);

        assertTrue(downloadQueueBean.clearPackageFileSettings());
        assertNull(downloadQueueBean.getPackageFileLocation());
        assertNull(downloadQueueBean.getPackageURL());
        assertTrue(downloadQueueBean.isPackageModifiedSinceFileCreated());
        assertEquals(-1, downloadQueueBean.getPackageFormat());
    }

    @Test
    void testClearPackageFileSettingsWithAllValuesAlreadyNull() {
        downloadQueueBean.setPackageFileLocation(null);
        downloadQueueBean.setPackageURL(null);
        downloadQueueBean.setPackageModifiedSinceFileCreated(true);
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