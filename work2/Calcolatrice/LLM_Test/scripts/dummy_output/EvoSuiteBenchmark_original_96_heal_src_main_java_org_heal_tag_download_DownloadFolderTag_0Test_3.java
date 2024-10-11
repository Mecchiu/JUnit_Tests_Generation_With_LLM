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
		// Private tests

    private final DownloadQueueBean dqb;

		// Public tests

    /**
     * This is the only instantiable instance of this Test.
     * @param dqb
     */
	public DownloadFolderTag_0Test(final DownloadQueueBean dqb) {
		this.dqb = dqb;
	}

    // Public instance test methods

    /**
     * Tests {@link #doStartTag()}.
     */
    @Test
    public void doStartTag_1Tag() throws Throwable {
        final int dqd1 = doStartTag();

        assertEquals(1, dqd1);
    }

    /**
     * Initializes the tag.
     */
    private void doStartTag()  {

        final List children = new ArrayList();

        children.add(new TaggedObjectBean("1", "org.heal.tag.DownloadQueueBean"));

        final DownloadQueueBean dqb1 = new DownloadQueueBean((shortMetadata = new ShortMetadataBean()), new ArrayList(), children);

        this.dqb = dqb1;

        assertNotSame(dqb, dqb1);
    }

    // Private instance test methods

    /**
     * Tests {@link #getDownloadQueue()#getDownloadQueue()}.
     */
    @Test
    public void getDownloadQueue_1Tag() throws Throwable {
    	final DownloadQueueBean dqb = new DownloadQueueBean((shortMetadata = new ShortMetadataBean()), new ArrayList(), null);

        final DownloadQueueBean dqb1 = this.dqb.getDownloadQueue();

        assertNotNull(dqb1);
        assertSame(dqb1, dqb);
        assertFalse(dqb1 == dqb);
        dqb1.setDownloadQueue(this.dqb);

        final DownloadQueueBean dqb2 = dqb1.getDownloadQueue();

        assertNotNull(dqb2);
        assertSame(dqb1, dqb2);
        assertFalse(dqb2 == dqb);
        dqb2.setDownloadQueue(null);

    }
    /**
     * Tests {@link #getShortMetadata()#getShortMetadata()}.
     */
    @Test
    public void getShortMetadata_1Tag() throws Throwable {
    	final shortMetadata = new ShortMetadataBean();

    	final DownloadQueueBean dqb1 = new DownloadQueueBean(null, null, null);

        final long val1 = dqb1.getShortMetadata().getLength();

        final DownloadQueueBean dqb2 = (DownloadQueueBean) dqb.getShortMetadata().getFirstEntryFrom(this.dqb, dqb1.getShortMetadata());

        final long val2 = dqb2.getShortMetadata().getLength();

        assertNotNull(dqb1);
        assertSame(dqb1, dqb2);
        assertNotNull(dqb2);
        assertTrue(val1 > 0);
        assertTrue(val2 > 0);
    }

    /**
     * Tests {@link #getDownloadQueue()}.
     */
    @Test
    public void getDownloadQueue_2Tag() throws Throwable {
    	final DownloadQueueBean dqb = new DownloadQueueBean((shortMetadata = new ShortMetadataBean()), new ArrayList(), null);


    	final DownloadQueueBean dqb1 = dqb.getDownloadQueue();

        assertNotSame(dqb1, dqb);
        assertNotSame(dqb, dqb1);

        assertNotNull(dqb);
        assertSame(dqb1, dqb);
        assertNotNull(hashCode(dqb1));
        assertFalse(hashCode(dqb) == hashCode(dqb1));
    }
    /**
     * Tests {@link #getShortMetadata()}.
     */
    @Test
    public void getShortMetadata_2Tag() throws Throwable {
    	final shortMetadata = new ShortMetadataBean();

    	final DownloadQueueBean dqb1 = new DownloadQueueBean(null, null, null);

        final long val1 = dqb1.getShortMetadata().getLength();

        final DownloadQueueBean dqb2 = new DownloadQueueBean(null, null, null);

        final long val2 = dqb2.getShortMetadata().getLength();

    	assertNotSame(dqb1, dqb2);
    	assertNotSame(dqb2, dqb1);
    	assertNotSame(dqb1, dqb2);
    	assertTrue(val1 > 0);
    	assertTrue(val2 > 0);
    }
}