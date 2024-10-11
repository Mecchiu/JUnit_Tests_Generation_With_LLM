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
		void testDoStartTag_8() {
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
		void testDoStartTag_9() {
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

    public static final int UNKNOWN = -1;

    public static final int UNAVAILABLE = 0;

    public static final int ADD = 1;

    public static final int REMOVE = 2;

    public static final int REMOTE_IMAGE = 3;

    private DownloadQueueBean downloadQueue = null;

    private ShortMetadataBean shortMetadata = null;

    private int downloadFolderType = UNAVAILABLE;

    public void setDownloadQueue(DownloadQueueBean downloadQueue) {
        this.downloadQueue = downloadQueue;
    }

    public void setShortMetadata(ShortMetadataBean shortMetadata) {
        this.shortMetadata = shortMetadata;
    }

    /**
     * This is perhaps poorly named, but this will return an
     * integer representing whether or not a metadata record may
     * be added to the download folder, removed from the download folder,
     * or if the download folder is unavailable for the metadata record.
     *
     * @return {@link #UNAVAILABLE DownloadFolderTag.UNAVAILABLE} or
     * {@link #ADD DownloadFolderTag.ADD} or {@link #REMOVE DownloadFolderTag.REMOVE} or
     * {@link #REMOTE_IMAGE DownloadFolderTag.REMOTE_IMAGE}.
     */
    public int getDownloadFolderType() {
        return downloadFolderType;
    }

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

    /**
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
    }

    /**
     * Resets the tag to its initial state.
     */
    private void resetTag() {
        downloadFolderType = UNAVAILABLE;
        downloadQueue = null;
        shortMetadata = null;
    }
}

// DownloadFolderActionTag_0Test.java
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
class DownloadFolderActionTag_0Test {
		
		/**
		* Test case for {@link DownloadFolderActionTag#doStartTag()} method.
		* This test case tests the scenario when the download folder type is unavailable.
		*/
		@Test
		void testDoStartTag_0() {
				DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
				DownloadQueueBean downloadQueue = new DownloadQueueBean();
				ShortMetadataBean shortMetadata = new ShortMetadataBean();
				shortMetadata.setFormat("web page");
				shortMetadata.setLocation("http://www.google.com");
				downloadFolderActionTag.setDownloadQueue(downloadQueue);
				downloadFolderActionTag.setShortMetadata(shortMetadata);
				int result = downloadFolderActionTag.doStartTag();
				assertEquals(TagSupport.EVAL_BODY_INCLUDE,