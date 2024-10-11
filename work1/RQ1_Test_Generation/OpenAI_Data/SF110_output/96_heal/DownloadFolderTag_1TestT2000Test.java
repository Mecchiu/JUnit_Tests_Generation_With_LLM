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
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {

		/**
		* Test case 1 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_1() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 2 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_2() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 3 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_3() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 4 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_4() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 5 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_5() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 6 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_6() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 7 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_7() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				downloadFolderTag.doStartTag();
				assertEquals(downloadFolderTag.getDownloadFolderType(), DownloadFolderTag.UNAVAILABLE);
		}
		
		/**
		* Test case 8 for method doEndTag.
		* The test case aims to test the situation that the download folder type is unavailable for the metadata record.
		* The test case is passed if the download folder type is unavailable for the metadata record.
		*/
		@Test
		public void testDoEndTag_8() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.set