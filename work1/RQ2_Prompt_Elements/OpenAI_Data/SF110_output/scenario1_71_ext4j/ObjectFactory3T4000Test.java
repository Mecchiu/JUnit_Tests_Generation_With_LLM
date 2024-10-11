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
	* Test case for {@link ObjectFactory#createPages()}.
	*/
	@Test
	void testCreatePages() {
		ObjectFactory objectFactory = new ObjectFactory();
		Pages pages = objectFactory.createPages();
		assertNotNull(pages);
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
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
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
 *
 *
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
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Page }
     *
     *
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
	* Test case for {@link Pages#getPage()}.
	*/
	@Test
	void testGetPage() {
		Pages pages = new Pages();
		List<Page> pageList = new ArrayList<Page>();
		pages.setPage(pageList);
		assertEquals(pageList, pages.getPage());
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
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
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
 *
 *
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
     *
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
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
	* Test case for {@link Page#getNumber()}.
	*/
	@Test
	void testGetNumber() {
		Page page = new Page();
		page.setNumber(1);
		assertEquals(1, page.getNumber());
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
 * <p>Tag handler class for the pagination tag.</p>
 *
 * @author <a href="mailto:fzammetti@omnytex.com">Frank W. Zammetti</a>.
 */
public class Pagination extends SimpleTagSupport {

  /**
   * The number of pages to display.
   */
  private int numberOfPages;

  /**
   * The current page.
   */
  private int currentPage;

  /**
   * The base URL to use for the links.
   */
  private String baseUrl;

  /**
   * The number of pages to display on either side of the current page.
   */
  private int pagesToDisplay;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClass;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssId;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyle;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStylePrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabled;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabled;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabled;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsis;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsisCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsisCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsisCurrent;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsisFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsisFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsisFirst;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsisLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsisLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsisLast;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsisPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsisPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsisPrevious;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssClassDisabledEllipsisNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssIdDisabledEllipsisNext;

  /**
   * The number of pages to display on either side of the current page.
   */
  private String cssStyleDisabledEllipsisNext;

  /**
   * The number of pages to display on either side of the current page.
