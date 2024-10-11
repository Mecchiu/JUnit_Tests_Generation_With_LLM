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
		
    /**
     * This is where the real meat starts.
     */
    @Test
    public void testDoStartTag() throws Exception {
        
        // create a download queue bean
        new FileLocator().makeQueue(new Long(0), null);
     
        // create a short metadata bean
        new ShortMetadataBean();
        ShortMetadataBean.generate();
        
        // create the downloadQueue that will be used by default.
        downloadQueue = new DownloadQueueBean();
        
        // create the short metadata.
        ShortMetadataBean.generate();
        
        // construct the tag
        DownloadFolderTag_1Test cb = new DownloadFolderTag_1Test();
        cb.setDownloadQueue(new DownloadQueueBean());
        cb.setShortMetadata(new ShortMetadataBean());
        
        // perform the test
        TagSupport.doStartTag(cb, null);
        
        /**
         * This should produce the following output, the following output is the set:
         *
         * @see org.heal.test.tag.DownloadFolderTag#DO_START_TAG
         * @see org.heal.test.tag.DownloadFolderTag#DO_BEFORE
         * @see org.heal.test.tag.DownloadFolderTag#DO_AFTER
         */
        System.out.println("doStartTag -> TagOutput(0)");
        TagSupport.doEndTag(cb, null);
        
        /**
         * This should produce the following output, the following output is the set:
         *
         * @see org.heal.test.tag.DownloadFolderTag#DO_BEGIN_TAG
         * @see org.heal.test.tag.DownloadFolderTag#DO_AFTER
         */
        
    }
}

class DownloadFolderTag_1Test extends TagSupport {
	
	/**
	 * This is used to reset the internal state of the tag.
	 */
	public void resetTag() {
		downloadQueue 	= null;
		shortMetadata 	= null;
        doStartTag() 	= false;
        doEndTag()   = false;
	}
      
	/**
	 * This is called if the tag has been destroyed, and should reset
	 * the internal state to the default values, without resetting any
	 * state that may have been there previously.
	 */
	
	public void doEndTag() {
        
        
		if (doStartTag()) {
			
			// noop
			
		}else if (doEndTag()) {
			
			System.out.println("doEndTag -> NoReset"); 
	
		}else {
			
			throw new RuntimeException("Resetting the download folder tag did not end the element with doEndTag()");  
        }
        
	}
	
	/**
	 * This is used by the tag tag to initialize the state of the tag, and should reset
	 * to the default values.
	 */
	protected void doStartTag() {
        
        
		if (doStartTag()) {
			
	        resetTag();
			
		}else if (doEndTag()) {
			
			System.out.println("doEndTag -> DoStartTag"); 
	        
		}else {
			
			throw new RuntimeException("Stopping the download folder tag failed with"
	        		+"doEndTag");  
	        
		}
		
	}
	
	/**
	 * This is called by the tag tag with a set of attributes that we do not use.
	 */
	protected void doEndTag() {
		
	}
	
}