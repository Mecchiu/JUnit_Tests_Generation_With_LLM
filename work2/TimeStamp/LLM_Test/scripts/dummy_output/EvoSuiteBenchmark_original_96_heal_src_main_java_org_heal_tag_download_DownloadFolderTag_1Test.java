package org.heal.tag.download;
java
class DownloadFolderTag_1Test {

    @Test
    void testDoEndTagResetTagState() {
        DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
        downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
        downloadFolderTag.setShortMetadata(new ShortMetadataBean());
        downloadFolderTag.doStartTag();

        downloadFolderTag.doEndTag();

        assertEquals(DownloadFolderTag.UNKNOWN, downloadFolderTag.getDownloadFolderType());
        assertNull(downloadFolderTag.downloadQueue);
        assertNull(downloadFolderTag.shortMetadata);
    }

    @Test
    void testDoEndTagResetTagStateMultipleTimes() {
        DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
        downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
        downloadFolderTag.setShortMetadata(new ShortMetadataBean());
        downloadFolderTag.doStartTag();

        downloadFolderTag.doEndTag();
        downloadFolderTag.doEndTag();
        downloadFolderTag.doEndTag();

        assertEquals(DownloadFolderTag.UNKNOWN, downloadFolderTag.getDownloadFolderType());
        assertNull(downloadFolderTag.downloadQueue);
        assertNull(downloadFolderTag.shortMetadata);
    }

    @Test
    void testDoEndTagResetTagStateWithoutCallingDoStartTag() {
        DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
        downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
        downloadFolderTag.setShortMetadata(new ShortMetadataBean());

        downloadFolderTag.doEndTag();

        assertEquals(DownloadFolderTag.UNKNOWN, downloadFolderTag.getDownloadFolderType());
        assertNull(downloadFolderTag.downloadQueue);
        assertNull(downloadFolderTag.shortMetadata);
    }

    @Test
    void testDoEndTagResetTagStateWithoutSettingDownloadQueueAndShortMetadata() {
        DownloadFolderTag downloadFolderTag = new DownloadFolderTag();

        downloadFolderTag.doEndTag();

        assertEquals(DownloadFolderTag.UNKNOWN, downloadFolderTag.getDownloadFolderType());
        assertNull(downloadFolderTag.downloadQueue);
        assertNull(downloadFolderTag.shortMetadata);
    }
}
