// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {
@Test
    	public void testRemoveAllFromQueue(){
    		Collection<String> content = new TreeSet<>();
    		File file = new File("testfiles/downloadQueue/org/heal/module/download/DownloadQueueBean_0Test__01.pk");
    		content.add(DownloadQueueBean_0Test$1.content);
    		content.add("DownloadQueueBean_0Test__01.jq_file");
    		ContentSetBean contentSet = new ContentSetBean(20000, content);
    		PackageBean packageBean = new PackageBean(20000, ".org");
    		Collection<File> files = new TreeSet<>();
    		files.add(file);
    		packageBean.setFiles(files);
    		file.delete();
    		assertEquals(1, file.length());
    		assertEquals('_1', file.getName().substring(0, 4));
    		assertEquals("java", file.getName().substring(0, 3));
    		assertEquals("DownloadQueueBean_0Test__01.jq_file", contentSet.getFile().name());
    		assertEquals("org", packageBean.getName());
    		packageBean.setPackageName(null);
    		assertEquals(1,packageBean.getPackages().size());
    		packageBean.removeAllFromQueue();
    		assertTrue(packageBean.getPackages().isEmpty());
    		assertTrue(packageBean.getPackageName()==null);
    		assertEquals(0, packageBean.getPackages().size());
    		assertEquals(-1, packageBean.getLastContentId());
    		Thread.sleep(1000);
    		packageBean.addPackage(packageBean.getPackageName());
    		assertEquals(1, packageBean.getPackages().size());
    		assertEquals(1, packageBean.getLastContentId());
    	}
    	
}
/**
* 
*
*/
class DownloadQueueBean_0Item implements Serializable {
    	private static final long serialVersionUID = 1L;
    	private ContentID contentID;
    	private String package_url;
    	private String file_path;
    	private String file_checksum;
    	private File file_checksum_file;
		public String getFile_checksum() {
			return file_checksum;
		}
		public void setFile_checksum(String file_checksum) {
			this.file_checksum = file_checksum;
		}
		public ContentID getContentID() {
			return contentID;
		}
		public void setContentID(ContentID contentID) {
			this.contentID = contentID;
		}
		public String getFile_path() {
			return file_path;
		}
		public void setFile_path(String file_path) {
			this.file_path = file_path;
		}
		public PackageBean getPackage(String package_name) {
			return new PackageBean(contentID);
		}
        public ContentID getLastContentId() {
            return contentID;
        }
        public void add(ContentID content) {
            contentID = contentID.addContent(content);
        }
    }
}
