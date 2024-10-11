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

    /** Test for the {@link DownloadFolderTag#doStartTag()}. */
    @Test
    public void doStartTag_01() throws Exception{
		
    	final DownloadQueueBean queue = FileLocator.getBean(DownloadQueueBean.class);
    	
		final ShortMetadataBean shortMetadata = queue.getShortMetadata();
		final String shortMetadataBean_0 = shortMetadata.getShortMetadataBean();
    	assertNotNull(shortMetadataBean_0);
		assertNotNull(shortMetadata);

//		TestBean tb0 = new TestBean();
//		TestBean tb1 = new TestBean();
//		TestBean tb2 = new TestBean();
//
//
//		tb1.tag = "testfolder";
//		tb2.tag = "downloadfolder";
//		tb1.add(TestBean.class, "testfile1");
//		tb2.add("downloadfile2", 1.0f);
//
//		queue.add(tb1);
//		queue.add(tb2);
//		queue.save();

    	new DownloadFolderTag_1Test();
    	
    	final String shortMetadataBean_1 = shortMetadata.getShortMetadataBean();
    	assertNotNull(shortMetadataBean_1);
		assertNotNull(shortMetadata);
	}

//	class DownloadFolderTag_1Test public class DownloadFolderTag_1Test extends DownloadFolderTag {
//
//
//    public void testDoStartTag()throws Exception{
//        DownloadQueueBean queue = FileLocator.getBean(DownloadQueueBean.class);
//        new DownloadFolderTag_1Test();
//	}

}

class DownloadFolderTag_1TaggingTest extends TagSupport {
	
	private final DownloadQueueBean queue = FileLocator.getBean(DownloadQueueBean.class);

	private DownloadFolderTag download = null;
	
    public void doStartTag() throws Exception {
        assertNotNull(queue);
        assertNotNull(download);
        
        final ShortMetadataBean shortMetadata = queue.getShortMetadata();
        final String shortMetadataBean_0 = shortMetadata.getShortMetadataBean();
        assertNotNull(shortMetadataBean_0);
        assertNotNull(shortMetadata);
        
    	download.setDownloadFolderType("download");
    }

	public String getDownloadFolderType(){
        return (String) download.get("downloadFolderType");
    }

    public void setDownloadFolderType( String download ){
        download.put("downloadFolderType", download);
    }

	public DownloadQueueBean getQueue(){
		return queue;
	}

	public void init(DownloadQueueBean queue) {
	    assertNotNull(queue);
	}
	
}

