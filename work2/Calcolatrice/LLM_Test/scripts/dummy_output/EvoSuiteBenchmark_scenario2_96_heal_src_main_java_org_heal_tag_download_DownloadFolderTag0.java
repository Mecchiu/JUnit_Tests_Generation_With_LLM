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
				downloadFolderTag.shortMetadata = new ShortMetadataBean();
				downloadFolderTag.shortMetadata.setFormat("web page");
				downloadFolderTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.downloadQueue = new DownloadQueueBean();
				downloadFolderTag.pageContext = new MockPageContext();
				downloadFolderTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderTag.doStartTag());
				assertEquals(DownloadFolderTag.UNAVAILABLE, downloadFolderTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is image.
		*/
		@Test
		public void testDoStartTag_image() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				downloadFolderTag.shortMetadata = new ShortMetadataBean();
				downloadFolderTag.shortMetadata.setFormat("image");
				downloadFolderTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.downloadQueue = new DownloadQueueBean();
				downloadFolderTag.pageContext = new MockPageContext();
				downloadFolderTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderTag.doStartTag());
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, downloadFolderTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is not starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_notStartingWithServerBaseURL() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				downloadFolderTag.shortMetadata = new ShortMetadataBean();
				downloadFolderTag.shortMetadata.setFormat("text");
				downloadFolderTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderTag.downloadQueue = new DownloadQueueBean();
				downloadFolderTag.pageContext = new MockPageContext();
				downloadFolderTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderTag.doStartTag());
				assertEquals(DownloadFolderTag.UNAVAILABLE, downloadFolderTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				downloadFolderTag.shortMetadata = new ShortMetadataBean();
				downloadFolderTag.shortMetadata.setFormat("text");
				downloadFolderTag.shortMetadata.setLocation("http://localhost:8080/heal/");
				downloadFolderTag.downloadQueue = new DownloadQueueBean();
				downloadFolderTag.pageContext = new MockPageContext();
				downloadFolderTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderTag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, downloadFolderTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL and the metadata is already queued.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL_alreadyQueued() {
				DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
				downloadFolderTag.shortMetadata = new ShortMetadataBean();
				downloadFolderTag.shortMetadata.setFormat("text");
				downloadFolderTag.shortMetadata.setLocation("http://localhost:8080/heal/");
				downloadFolderTag.shortMetadata.setMetadataId(1);
				downloadFolderTag.downloadQueue = new DownloadQueueBean();
				downloadFolderTag.downloadQueue.add(1);
				downloadFolderTag.pageContext = new MockPageContext();
				downloadFolderTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderTag.doStartTag());
				assertEquals(DownloadFolderTag.REMOVE, downloadFolderTag.downloadFolderType);
		}
}