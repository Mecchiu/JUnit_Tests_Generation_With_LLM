// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {
private final String FILE_NAME = FileLocator.getFileName("/media/testfile1.txt");
		public static final String FILE_NAME_2 = FileLocator.getFileName("/media/testfile2.txt");
		private DownloadQueueBean dqb = new DownloadQueueBean();
		
		@Test
		public void test1(){
			assertEquals(3, dqb.getCount());
			assertTrue(dqb.isAvailable(FILE_NAME));
			assertTrue(dqb.isAvailable(FILE_NAME_2));
			assertFalse(dqb.isAvailable(FILE_NAME));
			assertFalse(dqb.isAvailable(FILE_NAME_2));
			
			long startTime = System.nanoTime();
			QueueBean result = dqb.getItem(FILE_NAME);
			assertNotNull(result);
			long duration = System.nanoTime() - startTime;
			System.out.print("Took " + duration + " " + result);
			assertTrue(duration<=20000);
		}
		
		@Test
		public void test2(){
			assertEquals(3, dqb.getCount());
			assertEquals(FileLocator.getLocalPath("static/images/download-48x48.png"), FILE_NAME_2);
			assertEquals(FileLocator.getLocalPath("static/images/download-48x48.png"), FileLocator.getLocalPath("/media/static/images/download-48x48.png"));
			assertEquals(FileLocator.getLocalPath("/var-6/static/images/download/static/images/download-48x48.png"), FileLocator.getLocalPath("/var-6/static/images/download/static/images/download-48x48.png"));
			assertEquals(FileLocator.getLocalPath("/var-6/static/images/download/static/images/download.png"), FileLocator.getLocalPath("/var-6/static/images/download/static/images/download-48x48.png"));
		}
		
		@Test
		public void test3(){
			assertEquals(3, dqb.getCount());
			assertEquals(FileLocator.getLocalPath("/media/testfile2.txt"), FileLocator.getLocalPath("/media/testfile1.txt"));
			assertFalse(dqb.isAvailable(null));
			assertFalse(dqb.isAvailable(""));
		}
		
		@Test
		public void test4(){
			// Set some more things up
			dqb.setDownloadLocation(FileLocator.getLocalPath("/media/"));
			assertEquals(FileLocator.getLocalPath("/media/testfile1.txt"), FILE_NAME);
			assertEquals(FileLocator.getLocalPath("/media/testfile2.txt"), "testfile2.txt");
			assertEquals(FileLocator.getLocalPath("/media/static/images"), "static");
        assertEquals(FileLocator.getLocalPath("/media/static/images/download/static"), "static");
			assertEquals(FileLocator.getLocalPath("/var-6/static"), "static");
			System.out.println(FileLocator.getLocalPath("/media/testfile2.txt"));
			assertEquals(FileLocator.getLocalPath("/var-6/static/images/download"), "static/images");
		}
}