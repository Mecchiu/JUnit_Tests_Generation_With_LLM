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

		@Test
		void testDoStartTag() {
				DownloadFolderTag tag = new DownloadFolderTag();
				tag.setShortMetadata(new ShortMetadataBean());
				tag.setDownloadQueue(new DownloadQueueBean());
				tag.getShortMetadata().setFormat("web page");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
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
		
		@Test
		void testDoStartTag() {
				DownloadFolderActionTag tag = new DownloadFolderActionTag();
				tag.setShortMetadata(new ShortMetadataBean());
				tag.setDownloadQueue(new DownloadQueueBean());
				tag.getShortMetadata().setFormat("web page");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.UNAVAILABLE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOVE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().removeFromQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.ADD, tag.getDownloadFolderType());
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
		
		@Test
		void testDoStartTag() {
				DownloadFolderActionTag tag = new DownloadFolderActionTag();
				tag.setShortMetadata(new ShortMetadataBean());
				tag.setDownloadQueue(new DownloadQueueBean());
				tag.getShortMetadata().setFormat("web page");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.UNAVAILABLE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOTE_IMAGE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.com");
				tag.getDownloadQueue().addToQueue(1);
				assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
				assertEquals(DownloadFolderActionTag.REMOVE, tag.getDownloadFolderType());
				
				tag.getShortMetadata().setFormat("image");
				tag.getShortMetadata().setLocation("http://www.google.