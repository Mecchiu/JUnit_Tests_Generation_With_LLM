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