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
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer totalResults;

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
     * @return possible object is {@link Integer }
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * @param value allowed object is {@link Integer }
     */
    public void setTotalResults(Integer value) {
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
    private String cssClassSelected;
    private String cssClassPrevious;
    private String cssClassNext;
    private String cssClassPreviousDisabled;
    private String cssClassNextDisabled;
    private String cssClassPreviousSelected;
    private String cssClassNextSelected;
    private String cssClassPreviousDisabledSelected;
    private String cssClassNextDisabledSelected;
    private String previousText;
    private String nextText;
    private String previousDisabledText;
    private String nextDisabledText;
    private String previousSelectedText;
    private String nextSelectedText;
    private String previousDisabledSelectedText;
    private String nextDisabledSelectedText;
    private String previousTitle;
    private String nextTitle;
    private String previousDisabledTitle;
    private String nextDisabledTitle;
    private String previousSelectedTitle;
    private String nextSelectedTitle;
    private String previousDisabledSelectedTitle;
    private String nextDisabledSelectedTitle;
    private String previousAlt;
    private String nextAlt;
    private String previousDisabledAlt;
    private String nextDisabledAlt;
    private String previousSelectedAlt;
    private String nextSelectedAlt;
    private String previousDisabledSelectedAlt;
    private String nextDisabledSelectedAlt;
    private String previousImage;
    private String nextImage;
    private String previousDisabledImage;
    private String nextDisabledImage;
    private String previousSelectedImage;
    private String nextSelectedImage;
    private String previousDisabledSelectedImage;
    private String nextDisabledSelectedImage;
    private String previousImageAlt;
    private String nextImageAlt;
    private String previousDisabledImageAlt;
    private String nextDisabledImageAlt;
    private String previousSelectedImageAlt;
    private String nextSelectedImageAlt;
    private String previousDisabledSelectedImageAlt;
    private String nextDisabledSelectedImageAlt;
    private String previousImageTitle;
    private String nextImageTitle;
    private String previousDisabledImageTitle;
    private String nextDisabledImageTitle;
    private String previousSelectedImageTitle;
    private String nextSelectedImageTitle;
    private String previousDisabledSelectedImageTitle;
    private String nextDisabledSelectedImageTitle;
    private String previousImageSrc;
    private String nextImageSrc;
    private String previousDisabledImageSrc;
    private String nextDisabledImageSrc;
    private String previousSelectedImageSrc;
    private String nextSelectedImageSrc;
    private String previousDisabledSelectedImageSrc;
    private String nextDisabledSelectedImageSrc;
    private String previousImageWidth;
    private String nextImage