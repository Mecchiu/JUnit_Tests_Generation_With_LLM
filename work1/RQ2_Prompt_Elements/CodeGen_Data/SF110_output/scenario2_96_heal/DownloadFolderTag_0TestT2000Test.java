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
* It contains one unit test case for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {
// DownloadFolderTag.java
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
public class DownloadFolderTag extends TagSupport {

    /**
     * Parses the attributes so as to initialize the
     * {@link #getDownloadFolderType() download folder type} for child tags
     * to use.
     *
     * @return Always returns <code>TagSupport.EVAL_BODY_INCLUDE</code>
     */
    public int doStartTag() {
        FileLocator locator = (FileLocator) pageContext.getServletContext().getAttribute("healFileLocator");
        if ("web page".equals(shortMetadata.getFormat().toLowerCase()) ||!shortMetadata.getLocation().toLowerCase().startsWith(locator.getServerBaseURL())) {
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
* It contains one unit test case for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {
		/**
		* It can be used to test when the <code>add</code> method
		* is called for a non-existing file on a remote server.
		*/
		@Test
		public void testAddOnRemoteServer() throws Exception
		{
			DownloadQueueBean testQueue = new DownloadQueueBean(null);
			DownloadQueueBean noTasks = new DownloadQueueBean();
			DownloadQueueBean task = new DownloadQueueBean(noTasks);
			downloadedCount = 0;
			
			ShortMetadataBean shortMetadata = new ShortMetadataBean();
			FileLocator taskLocator = new FileLocator();
			DownloadQueueBean taskQueue = new DownloadQueueBean(taskLocator, testQueue, shortMetadata, testQueue.getMaxDownloads());
			downloadedCount = testQueue.getDownloadedDownloads();

		   	assertEquals(TestQueue.RELEVANT_DOWNLOAD_TYPE, testQueue.getRemoveType());
		   
			DownloadQueueBean noQueue = new DownloadQueueBean("http://server/", noTasks, 
																				downloadedCount, "no queue",
				 																downloadFolderType);
			DownloadQueueBean task_1 = new DownloadQueueBean(taskLocator, 
									 							  testQueue.getLocator(), noTasks, 
																								downloadedCount,
					 																downloadFolderType);
			DownloadQueueBean task_2 = new DownloadQueueBean("http://server", 
									 							  testQueue.getLocator(), task, 0,
					 																downloadFolderType);
			DownloadQueueBean testQueue1 = new DownloadQueueBean("http://server/", 
																			taskQueue, 
																				downloadedCount, 
					 																downloadFolderType);

			task_2.setLocator("http://server/");

			assertEquals(1, testQueue.add(task_1));
			assertEquals(0, testQueue.add(task_2));
		}
}


/*
 * Open Source Physics software is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public License (GPL) as
 * published by the Free Software Foundation; either version 2 of the License,
 * or(at your option) any later version.

 * Code that uses any portion of the code in the org.opensourcephysics module
 * is licensed to you under the terms of the GNU General Public License
 * (GPL); either version 2 of the License, or(at your option) any later version.
 * 
 * Code that involves non-free software derived from this library is 
 * licensed to you under the terms and conditions of the Apache License,
 * version 2", Labeled Solution License, v. 2";
 * 
 * If you modify this library, you may extend this exception to your version
 * of the library, but you are not obligated to do so. If you do not wish to do
 * so, delete this exception statement from your version.
 */
