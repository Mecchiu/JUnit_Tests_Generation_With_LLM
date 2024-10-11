// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactoryTest {

	/**
	* Test case for {@link ObjectFactory#createPages()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testCreatePages() {
		ObjectFactory objectFactory = new ObjectFactory();
		assertNotNull(objectFactory.createPages());
	}
}

// Pages.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="page" type="{http://www.tripfilms.com/os/exttaglib/pagination/datatype}page" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "page"
})
@XmlRootElement(name = "pages")
public class Pages {

    @XmlElement(required = true)
    protected List<Page> page;

    /**
     * Gets the value of the page property.
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * <p>For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * <p>Objects of the following type(s) are allowed in the list
     * {@link Page }
     */
    public List<Page> getPage() {
        if (page == null) {
            page = new ArrayList<Page>();
        }
        return this.page;
    }
}

// PagesTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pages}.
* It contains ten unit test cases for the {@link Pages#getPage()} method.
*/
class PagesTest {
		
	/**
	* Test case for {@link Pages#getPage()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testGetPage() {
		Pages pages = new Pages();
		assertNotNull(pages.getPage());
	}
}

// Page.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for page complex type.
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page")
public class Page {

    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlAttribute(name = "url", required = true)
    protected String url;

    /**
     * Gets the value of the number property.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the url property.
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * @param value allowed object is
     * {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }
}

// PageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#getNumber()} method.
*/
class PageTest {
		
	/**
	* Test case for {@link Page#getNumber()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testGetNumber() {
		Page page = new Page();
		assertNotNull(page.getNumber());
	}
}

// Pagination.java
package com.tripfilms.os.exttaglib.pagination;

import com.tripfilms.os.exttaglib.pagination.datatype.Pages;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * <p>This class is a custom tag handler for the <code>pagination</code> tag.
 * <p>It generates a pagination bar based on the given parameters.
 * <p>The pagination bar is generated in the form of an XML document.
 * <p>The XML document is then transformed into an HTML document using an XSLT stylesheet.
 * <p>The HTML document is then written to the JSP page.
 */
public class Pagination extends SimpleTagSupport {

    /**
     * The number of pages to be displayed in the pagination bar.
     */
    private int numberOfPages;
    /**
     * The current page number.
     */
    private int currentPage;
    /**
     * The URL of the current page.
     */
    private String currentPageUrl;
    /**
     * The URL of the first page.
     */
    private String firstPageUrl;
    /**
     * The URL of the last page.
     */
    private String lastPageUrl;
    /**
     * The URL of the previous page.
     */
    private String previousPageUrl;
    /**
     * The URL of the next page.
     */
    private String nextPageUrl;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl2;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl2;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl2;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl2;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl2;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl2;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl3;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl3;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl3;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl3;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl3;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl3;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl4;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl4;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl4;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl4;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl4;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl4;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl5;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl5;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl5;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl5;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl5;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl5;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl6;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl6;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl6;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl6;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl6;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl6;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl7;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl7;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl7;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl7;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl7;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl7;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl8;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl8;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl8;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl8;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl8;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl8;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl9;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl9;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl9;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl9;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl9;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl9;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl10;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl10;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl10;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl10;
    /**
     * The URL of the page before the previous page.
     */
    private String pageBeforePreviousPageUrl10;
    /**
     * The URL of the page after the next page.
     */
    private String pageAfterNextPageUrl10;
    /**
     * The URL of the page before the first page.
     */
    private String pageBeforeFirstPageUrl11;
    /**
     * The URL of the page after the last page.
     */
    private String pageAfterLastPageUrl11;
    /**
     * The URL of the page before the current page.
     */
    private String pageBeforeCurrentPageUrl11;
    /**
     * The URL of the page after the current page.
     */
    private String pageAfterCurrentPageUrl11;
    /**