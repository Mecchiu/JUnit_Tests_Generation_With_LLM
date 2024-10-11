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
		assertTrue(page instanceof Page);
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
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
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
 *
 *
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
     *
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     *
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     *
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     *
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalPages property.
     *
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     *
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the totalResults property.
     *
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     *
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
* It contains ten unit test cases for the {@link Page#getPageNumber()}, {@link Page#setPageNumber(int)},
* {@link Page#getPageSize()}, {@link Page#setPageSize(int)}, {@link Page#getTotalPages()},
* {@link Page#setTotalPages(int)}, {@link Page#getTotalResults()} and {@link Page#setTotalResults(int)} methods.
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
	
	/**
	* Test case for {@link Page#setPageNumber(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetPageNumber() {
		Page page = new Page();
		page.setPageNumber(1);
		assertEquals(1, page.getPageNumber());
	}
	
	/**
	* Test case for {@link Page#getPageSize()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetPageSize() {
		Page page = new Page();
		page.setPageSize(10);
		assertEquals(10, page.getPageSize());
	}
	
	/**
	* Test case for {@link Page#setPageSize(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetPageSize() {
		Page page = new Page();
		page.setPageSize(10);
		assertEquals(10, page.getPageSize());
	}
	
	/**
	* Test case for {@link Page#getTotalPages()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetTotalPages() {
		Page page = new Page();
		page.setTotalPages(10);
		assertEquals(10, page.getTotalPages());
	}
	
	/**
	* Test case for {@link Page#setTotalPages(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetTotalPages() {
		Page page = new Page();
		page.setTotalPages(10);
		assertEquals(10, page.getTotalPages());
	}
	
	/**
	* Test case for {@link Page#getTotalResults()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetTotalResults() {
		Page page = new Page();
		page.setTotalResults(100);
		assertEquals(100, page.getTotalResults());
	}
	
	/**
	* Test case for {@link Page#setTotalResults(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetTotalResults() {
		Page page = new Page();
		page.setTotalResults(100);
		assertEquals(100, page.getTotalResults());
	}
}

// PaginationTag.java
package com.tripfilms.os.exttaglib.pagination;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import com.tripfilms.os.exttaglib.pagination.datatype.Page;

/**
 * This class is a custom tag that generates a pagination bar.
 * It extends the {@link TagSupport} class.
 *
 * @author  <a href="mailto:felipe@tripfilms.com">Felipe S. F. Leao</a>
 * @version 1.0
 */
public class PaginationTag extends TagSupport {

    private static final long serialVersionUID = 1L;
    private Page page;
    private String url;
    private String cssClass;
    private String cssClassSelected;
    private String cssClassDisabled;
    private String cssClassPrevious;
    private String cssClassNext;
    private String cssClassFirst;
    private String cssClassLast;
    private String previousLabel;
    private String nextLabel;
    private String firstLabel;
    private String lastLabel;
    private String previousTitle;
    private String nextTitle;
    private String firstTitle;
    private String lastTitle;
    private String previousDisabledTitle;
    private String nextDisabledTitle;
    private String firstDisabledTitle;
    private String lastDisabledTitle;
    private String previousDisabledLabel;
    private String nextDisabledLabel;
    private String firstDisabledLabel;
    private String lastDisabledLabel;
    private String previousDisabledCssClass;
    private String nextDisabledCssClass;
    private String firstDisabledCssClass;
    private String lastDisabledCssClass;
    private String previousDisabledCssClassSelected;
    private String nextDisabledCssClassSelected;
    private String firstDisabledCssClassSelected;
    private String lastDisabledCssClassSelected;
    private String previousDisabledCssClassDisabled;
    private String nextDisabledCssClassDisabled;
    private String firstDisabledCssClassDisabled;
    private String lastDisabledCssClassDisabled;
    private String previousCssClassSelected;
    private String nextCssClassSelected;
    private String firstCssClassSelected;
    private String lastCssClassSelected;
    private String previousCssClassDisabled;
    private String nextCssClassDisabled;
    private String firstCssClassDisabled;
    private String lastCssClassDisabled;
    private String previousCssClass;
    private String nextCssClass;
    private String firstCssClass;
    private String lastCssClass;
    private String previousTitleSelected;
    private String nextTitleSelected;
    private String firstTitleSelected;
    private String lastTitleSelected;
    private String previousTitleDisabled;
    private String nextTitleDisabled;
    private String firstTitleDisabled;
    private String lastTitleDisabled;
    private String previousLabelSelected;
    private String nextLabelSelected;
    private String firstLabelSelected;
    private String lastLabelSelected;
    private String previousLabelDisabled;
    private String nextLabelDisabled;
    private String firstLabelDisabled;
    private String lastLabelDisabled;
    private String previousCssClassSelectedDisabled;
    private String nextCssClassSelectedDisabled;
    private String firstCssClassSelectedDisabled;
    private String lastCssClassSelectedDisabled;
    private String previousTitleSelectedDisabled;
    private String nextTitleSelectedDisabled;
    private String firstTitleSelectedDisabled;
    private String lastTitleSelectedDisabled;
    private String previousLabelSelectedDisabled;
    private String nextLabelSelectedDisabled;
    private String firstLabelSelectedDisabled;
    private String lastLabelSelectedDisabled;
    private String previousCssClassDisabledSelected;
    private String nextCssClassDisabledSelected;
    private String firstCssClassDisabledSelected;
    private String lastCssClassDisabledSelected;
    private String previousTitleDisabledSelected;
    private String nextTitleDisabledSelected;
    private String firstTitleDisabledSelected;
    private String lastTitleDisabledSelected;
    private String previousLabelDisabledSelected;
    private String nextLabelDisabledSelected;
    private String firstLabelDisabledSelected;
    private String lastLabelDisabledSelected;
    private String previousCssClassDisabledDisabled;
    private String nextCssClassDisabledDisabled;
    private String firstCssClassDisabledDisabled;
    private String lastCssClassDisabledDisabled;
    private String previousTitleDisabledDisabled;
    private String nextTitleDisabledDisabled;
    private String firstTitleDisabledDisabled;
    private String lastTitleDisabledDisabled;
    private String previousLabelDisabledDisabled;
    private String nextLabelDisabledDisabled;
    private String firstLabelDisabledDisabled;
    private String lastLabelDisabledDisabled;
    private String previousCssClassSelectedSelected;
    private String nextCssClassSelectedSelected;
    private String firstCssClassSelectedSelected;
    private String lastCssClassSelectedSelected;
    private String previousTitleSelectedSelected;
    private String nextTitleSelectedSelected;
    private String firstTitleSelectedSelected;
    private String lastTitleSelectedSelected;
    private String previousLabelSelectedSelected;
    private String nextLabelSelectedSelected;
    private String firstLabelSelectedSelected;
    private String lastLabelSelectedSelected;
    private String previousCssClassDisabledDisabledSelected;
    private String nextCssClassDisabledDisabledSelected;
    private String firstCssClassDisabledDisabledSelected;
    private String lastCssClassDisabledDisabledSelected;
    private String previousTitleDisabledDisabledSelected;
    private String nextTitleDisabledDisabledSelected;
    private String firstTitleDisabledDisabledSelected;
    private String lastTitleDisabledDisabledSelected;
    private String previousLabelDisabledDisabledSelected;
    private String nextLabelDisabledDisabledSelected;
    private String firstLabelDisabledDisabledSelected;
    private String lastLabelDisabledDisabledSelected;
    private String previousCssClassDisabledSelectedSelected;
    private String nextCssClassDisabledSelectedSelected;
    private String firstCssClassDisabledSelectedSelected;
    private String lastCssClassDisabledSelectedSelected;
    private String previousTitleDisabledSelectedSelected;
    private String nextTitleDisabledSelectedSelected;
    private String firstTitleDisabledSelectedSelected;
    private String lastTitleDisabledSelectedSelected;
    private String previousLabelDisabledSelectedSelected;
    private String nextLabelDisabledSelectedSelected;
    private String firstLabelDisabledSelectedSelected;
    private String lastLabelDisabledSelectedSelected;
    private String previousCssClassSelectedDisabledSelected;
    private String nextCssClassSelectedDisabledSelected;
    private String firstCssClassSelectedDisabledSelected;
    private String lastCssClassSelectedDisabledSelected;
    private String previousTitleSelectedDisabledSelected;
    private String nextTitleSelectedDisabledSelected;
    private String firstTitleSelectedDisabledSelected;
    private String lastTitleSelectedDisabledSelected;
    private String previousLabelSelectedDisabledSelected;
    private String nextLabelSelectedDisabledSelected;
    private String firstLabelSelectedDisabledSelected;
    private String lastLabelSelectedDisabledSelected;
    private String previousCssClassSelectedSelectedSelected;
    private String nextCssClassSelectedSelectedSelected;
    private String firstCssClassSelectedSelectedSelected;
    private String lastCssClassSelectedSelectedSelected;
    private String previousTitleSelectedSelectedSelected;
    private String nextTitleSelectedSelectedSelected;
    private String firstTitleSelectedSelectedSelected;
    private String lastTitleSelectedSelectedSelected;
    private String previousLabelSelectedSelectedSelected;
    private String nextLabelSelectedSelectedSelected;
    private String firstLabelSelectedSelectedSelected;
    private String lastLabelSelectedSelectedSelected;
    private String previousCssClassDisabledDisabledDisabled;
    private String nextCssClassDisabledDisabledDisabled;
    private String firstCssClassDisabledDisabledDisabled;
    private String lastCssClassDisabledDisabledDisabled;
    private String previousTitleDisabledDisabledDisabled;
    private String nextTitleDisabledDisabledDisabled;
    private String firstTitleDisabledDisabledDis