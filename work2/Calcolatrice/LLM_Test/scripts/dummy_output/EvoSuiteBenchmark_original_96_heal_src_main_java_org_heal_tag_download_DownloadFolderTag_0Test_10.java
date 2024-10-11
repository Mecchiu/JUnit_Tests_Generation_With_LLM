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
		private DownloadQueueBean downloadQueue;
		private DownloadQueueBean downloadQueue2;
		private DownloadQueueBean downloadQueue3;
		private ShortMetadataBean shortMetadata;
		
/**
* Test method for {@link nc.ualberta.cs.cmput301w16t16.DownloadFolderTag#doStartTag()}.
*
* Pre conditions:
* <ul>
* <li>The attributes for the tag are set as per their corresponding test cases.</li>
* <li>No internal state is set.</li>
* <li>No internal state is set.</li>
* </ul>
* Post conditions:
* <ul>
* <li>{@link #downloadQueue set} and {@link #downloadQueue2 set} to the
*    {@link DownloadQueueBean}, used by the first test implementation.</li>
* <li>{@link #shortMetadata set} and {@link #shortMetadata set} to the
*    {@link ShortMetadataBean}.</li>
* </ul>
* After the test has been executed, it will set the tag attribute to reflect the
* internal state of the test case where it was created.
*/
@Test
public class DownloadFolderTag_0Test {
	
		/**
		* Test method for {@link nc.ualberta.cs.cmput301w16t16.DownloadFolderTag#doStartTag()}.
		*/
		@Test
		public void testDoStartTag() throws Exception 
		{
			
			String localFile = FileLocator.getFile("", "DownloadFolderTag_0Test.java", false).toURI().toString();
			downloadQueue = FileLocator.getFile(localFile, "DownloadQueue.class", false);
			assertNotNull(downloadQueue);  // TODO: check if this works  - it is not a valid className in the VM, we throw an error

			resetTag();
		}
		
		/**
		* Testing default constructor as per
		* {@link nc.ualberta.cs.cmput301w16t16.DownloadFolderTag#getDownloadQueue()}.
		*/
		private void resetTag(){
			downloadQueue = null;
			downloadQueue2 = null;
			downloadQueue3 = null;
			shortMetadata = null;
		}
	}
}