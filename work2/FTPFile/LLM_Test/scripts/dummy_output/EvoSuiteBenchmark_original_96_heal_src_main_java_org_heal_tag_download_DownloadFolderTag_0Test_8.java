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
		 * Tests a simple non-existent file
		 */
	@Test
	public void test001() {

		// Tag should start empty
		assertTrue(getTag().equals(""));

		// Tag should contain an action tag with action=DownloadQueueBean.ADD
		TagSupport.NestedTagAction action = getTag().getAction();
		assertTrue(action instanceof DownloadQueueBean.AddAction);

		// Set the number of times the action was retrieved
		DownloadQueueBean downloadQueue = (DownloadQueueBean) action.getAction();
		assertTrue(downloadQueue.getCount() > 1);

		// Set the number of times the action was retrieved
		ShortMetadataBean shortMeta = (ShortMetadataBean) action.getAction();
		assertTrue(shortMeta.getNumberOfRecords() > 1);

		// Get the child tag to which the action was applied
		TagSupport.NestedTagAction childAction =
			action.getAction().getAction(1).getAction(0).getAction(0);
		assertTrue(childAction instanceof DownloadQueueActionTag);

		// We should get an empty tag
		TagSupport.NestedTagAction emptyAction =
			action.getAction().getAction(1).getAction(0).getAction(0);
		assertTrue(emptyAction == null);

		// We should get a tag to tag this action
		TagSupport.NestedTagAction tag = (TagSupport.NestedTagAction)
				action.getAction().getAction(0).getAction(0);
		assertNotNull(tag);

		// Clear the children action
		action.getAction().clearChildren(action.getAction());

		// We should get a new tag
		TagSupport.NestedTagAction childAction2 =
				action.getAction().getAction(1).getAction(0).getAction(0);
		assertNotNull(childAction2);
	}

    // Tag should contain an action tag with action=ShortMetadataBean.SET
    @Test
    public void test002() {

        // Tag should contain an action tag with action=SHORT_METADATA_SET
        TagSupport.NestedTagAction action = getTag().getAction();

        assertNotNull(action);
        assertTrue(action instanceof ShortMetadataActionTag);
        assertEquals(action.getActionType(), ShortMetadataActionTag.class);

        action.setAction((ShortMetadataActionTag) action.getAction());
        assertEquals(action.getAction(), (ShortMetadataActionTag) action.getAction());

        // Clear the children action
        action.getAction().clearChildren(action.getAction());
    }

    // Tag should contain an action tag with action=NONE
    @Test
    public void test003() {

        /* We could also get an empty tag */
        TagSupport.NestedTagAction action = getTag().getAction();

        assertNotNull(action);
        assertTrue(action instanceof TagSupport.NestedTagAction);
        assertEquals(action.getActionType(), TagSupport.NestedTagAction.class);

        TagSupport.NestedTagAction emptyAction = (TagSupport.NestedTagAction) action.getAction();
        assertNull(emptyAction);

        // Clear the children action
        action.getAction().clearChildren(action);
    }

    // Tag should contain an action tag with action=FILE_LOCATOR.SET
    @Test
    public void test004() {

        // Tag should contain an action tag with action=FILE_LOCATOR_SET
        // This will construct a FileLocator object and perform a file download
        TagSupport.NestedTagAction action = getTag().getAction();

        assertNotNull(action);
        assertTrue(action instanceof FileLocatorActionTag);

        // Remove all the files from the current local directory
        FileLocator.resetFileLocator();
        assertNull(FileLocator.getFileLocator());

        action.setAction((FileLocatorActionTag) action.getAction());
        assertTrue(FileLocator.getFileLocator() == FileLocatorActionTag.FILE_LOCATOR);

        // Clear the children action
        action.getAction().clearChildren(action);
    }
}