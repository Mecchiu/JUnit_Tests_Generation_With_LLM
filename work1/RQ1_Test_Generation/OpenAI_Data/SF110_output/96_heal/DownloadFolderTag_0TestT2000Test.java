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
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {

		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_0() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.UNAVAILABLE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_1() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_2() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_3() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_4() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_5() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_6() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setDownloadQueue(downloadQueue);
				downloadFolderTag.setShortMetadata(shortMetadata);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_7() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google