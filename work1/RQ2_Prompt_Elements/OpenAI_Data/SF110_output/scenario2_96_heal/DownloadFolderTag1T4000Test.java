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
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTagTest {

	/**
	* Test case for {@link DownloadFolderTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderTag tag = new DownloadFolderTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
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
     * Resets the internal state of the tag.
     *
     * @return Always returns <code>TagSupport.EVAL_PAGE</code>
     */
    public int doEndTag() {
        // In case the servlet container re-uses this object
        resetTag();
        return EVAL_PAGE;
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
* It contains ten unit test cases for the {@link DownloadFolderActionTag#doEndTag()} method.
*/
class DownloadFolderActionTagTest {
		
	/**
	* Test case for {@link DownloadFolderActionTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderActionTag tag = new DownloadFolderActionTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
	}
}

// DownloadFolderActionTag.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * A tag which is basically acts as a container