// DownloadFolderTag_0Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {
		
    @Test
    public void testDoStartTag() throws Exception {
        assertEquals(new FileLocator("http://127.0.0.1:8151/"), FileLocator.getFileLocator("DownloadFolderTag_0Test.htm", "Hp"), "");
    }
    
    @Test
    public void testDoStartTag2() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/tag_vary.php?show=3");
        downloadQueueBean.setDisplayTag(Boolean.TRUE);
        downloadQueueBean.setCachedTag(Boolean.FALSE);
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }
    
    @Test
    public void testDoStartTag3() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/tag_vary.php");
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }
    
    @Test
    public void testDoStartTag4() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/tag_vary.php?show=3");
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }

    @Test
    public void testDoStartTag5() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/");
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }

    @Test
    public void testDoStartTag6() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/tag_vary.php");
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }

    @Test
    public void testDoStartTag7() throws Exception {
        DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
        downloadQueueBean.setUrlToDownload("http://127.0.0.1:8151/tag_vary.php?show=3");
        assertEquals(1, downloadQueueBean.getDownloadQueue().getDownloads().size());
    }

}