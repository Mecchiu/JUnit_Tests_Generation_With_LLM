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

	@Test
	void testDoEndTag() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		int result = downloadFolderTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
		
	@Test
	void testDoEndTag() {
		DownloadFolderActionTag downloadFolderActionTag = new DownloadFolderActionTag();
		int result = downloadFolderActionTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
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
 * @author Brad Schaefer (<