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

import com.tripfilms.os.exttaglib.pagination.datatype.Page;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * <p>Tag handler class for the pagination tag.</p>
 *
 * <p>This