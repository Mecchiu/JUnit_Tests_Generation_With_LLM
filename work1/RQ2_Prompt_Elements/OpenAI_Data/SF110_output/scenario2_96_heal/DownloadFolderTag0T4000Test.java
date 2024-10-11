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

// DownloadFolderActionTag.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * A tag which is basically acts as a container for attributes which
 * nested tags will utilize.
 *
 * @version 1.0
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 * @see org.heal.tag.download.DownloadFolderActionTag
 */
public class DownloadFolderActionTag extends TagSupport {

    /**
     * Parses the attributes so as to initialize the
     * {@link #getDownloadFolderType() download folder type} for child tags
     * to use.
     *
     * @return Always returns <code>TagSupport.EVAL_BODY_INCLUDE</code>
     */
    public int doStartTag() {
        FileLocator locator = (FileLocator) pageContext.getServletContext().getAttribute("healFileLocator");
        if ("web page".equals(shortMetadata.getFormat().toLowerCase()) || !shortMetadata.getLocation().toLowerCase().startsWith(locator.getServerBaseURL())) {
            if ("image".equals(shortMetadata.getFormat().toLowerCase())) {
                downloadFolderType = REMOTE_IMAGE;
            } else {
                downloadFolderType = UNAVAILABLE;
            }
        } else if (downloadQueue.isQueuedAlready(shortMetadata.getMetadataId())) {
            downloadFolderType = REMOVE;
        } else {
            downloadFolderType = ADD;
        }
        return TagSupport.EVAL_BODY_INCLUDE;
    }
}

// DownloadFolderActionTagTest.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderActionTag}.
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doStartTag()} method.
*/
class DownloadFolderActionTagTest {
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is web page.
		*/
		@Test
		public void testDoStartTag_webPage() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				downloadFolderActionTag.shortMetadata = new ShortMetadataBean();
				downloadFolderActionTag.shortMetadata.setFormat("web page");
				downloadFolderActionTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderActionTag.downloadQueue = new DownloadQueueBean();
				downloadFolderActionTag.pageContext = new MockPageContext();
				downloadFolderActionTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderActionTag.doStartTag());
				assertEquals(DownloadFolderActionTag.UNAVAILABLE, downloadFolderActionTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is image.
		*/
		@Test
		public void testDoStartTag_image() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				downloadFolderActionTag.shortMetadata = new ShortMetadataBean();
				downloadFolderActionTag.shortMetadata.setFormat("image");
				downloadFolderActionTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderActionTag.downloadQueue = new DownloadQueueBean();
				downloadFolderActionTag.pageContext = new MockPageContext();
				downloadFolderActionTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderActionTag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOTE_IMAGE, downloadFolderActionTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is not starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_notStartingWithServerBaseURL() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				downloadFolderActionTag.shortMetadata = new ShortMetadataBean();
				downloadFolderActionTag.shortMetadata.setFormat("text");
				downloadFolderActionTag.shortMetadata.setLocation("http://www.google.com");
				downloadFolderActionTag.downloadQueue = new DownloadQueueBean();
				downloadFolderActionTag.pageContext = new MockPageContext();
				downloadFolderActionTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderActionTag.doStartTag());
				assertEquals(DownloadFolderActionTag.UNAVAILABLE, downloadFolderActionTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				downloadFolderActionTag.shortMetadata = new ShortMetadataBean();
				downloadFolderActionTag.shortMetadata.setFormat("text");
				downloadFolderActionTag.shortMetadata.setLocation("http://localhost:8080/heal/");
				downloadFolderActionTag.downloadQueue = new DownloadQueueBean();
				downloadFolderActionTag.pageContext = new MockPageContext();
				downloadFolderActionTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderActionTag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, downloadFolderActionTag.downloadFolderType);
		}
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case is for the scenario when the format of the metadata is not web page and the location of the metadata is starting with the server base URL and the metadata is already queued.
		*/
		@Test
		public void testDoStartTag_notWebPage_startingWithServerBaseURL_alreadyQueued() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				downloadFolderActionTag.shortMetadata = new ShortMetadataBean();
				downloadFolderActionTag.shortMetadata.setFormat("text");
				downloadFolderActionTag.shortMetadata.setLocation("http://localhost:8080/heal/");
				downloadFolderActionTag.shortMetadata.setMetadataId(1);
				downloadFolderActionTag.downloadQueue = new DownloadQueueBean();
				downloadFolderActionTag.downloadQueue.add(1);
				downloadFolderActionTag.pageContext = new MockPageContext();
				downloadFolderActionTag.pageContext.getServletContext().setAttribute("healFileLocator", new FileLocator());
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, downloadFolderActionTag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOVE, downloadFolderActionTag.downloadFolderType);
		}
}

// DownloadFolderActionTag.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * A tag which is basically acts as a container for attributes which
 * nested tags will utilize.
 *
 * @version 1.0
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 * @see org.heal.tag.download.DownloadFolderActionTag
 */
public class DownloadFolderActionTag extends TagSupport {

    /**
     * Parses the attributes so as to initialize the
     * {@link #getDownloadFolderType() download folder type} for child tags
     * to use.
     *
     * @return Always returns <code>TagSupport.EVAL_BODY_INCLUDE</code>
     */
    public int doStart