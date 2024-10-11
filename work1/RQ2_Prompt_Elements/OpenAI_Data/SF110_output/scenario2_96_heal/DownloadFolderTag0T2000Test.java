// DownloadFolderTagTest.java
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
class DownloadFolderTagTest {

		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is web page.
		*/
		@Test
		public void testDoStartTag_webPage() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.google.com");
				downloadFolderTag.setFileLocator(locator);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.UNAVAILABLE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is image.
		*/
		@Test
		public void testDoStartTag_image() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.google.com");
				downloadFolderTag.setFileLocator(locator);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is not starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_notStartingWithServerBaseURL() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.yahoo.com");
				downloadFolderTag.setFileLocator(locator);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.google.com");
				downloadFolderTag.setFileLocator(locator);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.ADD, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL and the metadata is already queued.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL_alreadyQueued() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				shortMetadata.setMetadataId(1);
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadQueue.addToQueue(1);
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.google.com");
				downloadFolderTag.setFileLocator(locator);
				int result = downloadFolderTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
				assertEquals(DownloadFolderTag.REMOVE, downloadFolderTag.getDownloadFolderType());
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL and the metadata is not already queued.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL_notAlreadyQueued() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("image");
				shortMetadata.setLocation("http://www.google.com");
				shortMetadata.setMetadataId(1);
				downloadFolderTag.setShortMetadata(shortMetadata);
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				downloadFolderTag.setDownloadQueue(downloadQueue);
				FileLocator locator = new FileLocator();
				locator.setServerBaseURL("http://www.google.com");
				