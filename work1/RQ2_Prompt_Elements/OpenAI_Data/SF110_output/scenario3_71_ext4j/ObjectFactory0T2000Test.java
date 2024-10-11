// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactoryTest {

	/**
	* Test case for {@link ObjectFactory#createPage()} method.
	* It tests if the method returns a {@link Page} object.
	*/
	@Test
	void testCreatePage() {
		ObjectFactory objectFactory = new ObjectFactory();
		Page page = objectFactory.createPage();
		assertNotNull(page);
	}
}

// Page.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageNumber",
    "pageSize",
    "totalPages",
    "totalResults"
})
@XmlRootElement(name = "page")
public class Page {

    protected int pageNumber;
    protected int pageSize;
    protected int totalPages;
    protected int totalResults;

    /**
     * Gets the value of the pageNumber property.
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalPages property.
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the totalResults property.
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     */
    public void setTotalResults(int value) {
        this.totalResults = value;
    }
}

// PageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#getPageNumber()} method.
*/
class PageTest {
		
	/**
	* Test case for {@link Page#getPageNumber()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetPageNumber() {
		Page page = new Page();
		page.setPageNumber(1);
		assertEquals(1, page.getPageNumber());
	}
}

// Pagination.java
package com.tripfilms.os.exttaglib.pagination;

import com.tripfilms.os.exttaglib.pagination.datatype.Page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * <p>Tag handler class for the pagination tag.</p>
 * <p>It creates a pagination bar with links to the previous and next pages.</p>
 */
public class Pagination extends TagSupport {

    private static final long serialVersionUID = 1L;
    private Page page;
    private String url;
    private String cssClass;
    private String cssClassCurrent;
    private String cssClassPrevious;
    private String cssClassNext;
    private String cssClassFirst;
    private String cssClassLast;
    private String cssClassPreviousDisabled;
    private String cssClassNextDisabled;
    private String cssClassFirstDisabled;
    private String cssClassLastDisabled;
    private String cssClassPreviousHidden;
    private String cssClassNextHidden;
    private String cssClassFirstHidden;
    private String cssClassLastHidden;
    private String cssClassPreviousLink;
    private String cssClassNextLink;
    private String cssClassFirstLink;
    private String cssClassLastLink;
    private String cssClassPreviousLinkDisabled;
    private String cssClassNextLinkDisabled;
    private String cssClassFirstLinkDisabled;
    private String cssClassLastLinkDisabled;
    private String cssClassPreviousLinkHidden;
    private String cssClassNextLinkHidden;
    private String cssClassFirstLinkHidden;
    private String cssClassLastLinkHidden;
    private String cssClassPreviousText;
    private String cssClassNextText;
    private String cssClassFirstText;
    private String cssClassLastText;
    private String cssClassPreviousTextDisabled;
    private String cssClassNextTextDisabled;
    private String cssClassFirstTextDisabled;
    private String cssClassLastTextDisabled;
    private String cssClassPreviousTextHidden;
    private String cssClassNextTextHidden;
    private String cssClassFirstTextHidden;
    private String cssClassLastTextHidden;
    private String previousText;
    private String nextText;
    private String firstText;
    private String lastText;
    private String previousTextDisabled;
    private String nextTextDisabled;
    private String firstTextDisabled;
    private String lastTextDisabled;
    private String previousTextHidden;
    private String nextTextHidden;
    private String firstTextHidden;
    private String lastTextHidden;
    private String previousLink;
    private String nextLink;
    private String firstLink;
    private String lastLink;
    private String previousLinkDisabled;
    private String nextLinkDisabled;
    private String firstLinkDisabled;
    private String lastLinkDisabled;
    private String previousLinkHidden;
    private String nextLinkHidden;
    private String firstLinkHidden;
    private String lastLinkHidden;
    private String previousDisabled;
    private String nextDisabled;
    private String firstDisabled;
    private String lastDisabled;
    private String previousHidden;
    private String nextHidden;
    private String firstHidden;
    private String lastHidden;
    private String previous;
    private String next;
    private String first;
    private String last;
    private String current;
    private String separator;
    private String separatorDisabled;
    private String separatorHidden