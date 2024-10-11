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
	* Test case for {@link Pages#getPage()}.
	*/
	@Test
	void testGetPage() {
		Pages pages = new Pages();
		List<Page> page = new ArrayList<Page>();
		pages.setPage(page);
		assertEquals(page, pages.getPage());
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
 * <p>Tag handler class for the pagination tag.
 * <p>It contains ten methods.
 */
public class Pagination extends SimpleTagSupport {

    private String url;
    private int currentPage;
    private int totalPages;
    private int maxPages;
    private int maxPageLinks;
    private String cssClass;
    private String cssStyle;
    private String cssClassCurrent;
    private String cssStyleCurrent;
    private String cssClassPrevious;
    private String cssStylePrevious;
    private String cssClassNext;
    private String cssStyleNext;
    private String cssClassFirst;
    private String cssStyleFirst;
    private String cssClassLast;
    private String cssStyleLast;
    private String cssClassEllipsis;
    private String cssStyleEllipsis;
    private String previousText;
    private String nextText;
    private String firstText;
    private String lastText;
    private String ellipsisText;
    private String xml;

    /**
     * Sets the value of the url property.
     * @param url allowed object is
     * {@link String }
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets the value of the currentPage property.
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Sets the value of the totalPages property.
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Sets the value of the maxPages property.
     */
    public void setMaxPages(int maxPages) {
        this.maxPages = maxPages;
    }

    /**
     * Sets the value of the maxPageLinks property.
     */
    public void setMaxPageLinks(int maxPageLinks) {
        this.maxPageLinks = maxPageLinks;
    }

    /**
     * Sets the value of the cssClass property.
     * @param cssClass allowed object is
     * {@link String }
     */
    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    /**
     * Sets the value of the cssStyle property.
     * @param cssStyle allowed object is
     * {@link String }
     */
    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    /**
     * Sets the value of the cssClassCurrent property.
     * @param cssClassCurrent allowed object is
     * {@link String }
     */
    public void setCssClassCurrent(String cssClassCurrent) {
        this.cssClassCurrent = cssClassCurrent;
    }

    /**
     * Sets the value of the cssStyleCurrent property.
     * @param cssStyleCurrent allowed object is
     * {@link String }
     */
    public void setCssStyleCurrent(String cssStyleCurrent) {
        this.cssStyleCurrent = cssStyleCurrent;
    }

    /**
     * Sets the value of the cssClassPrevious property.
     * @param cssClassPrevious allowed object is
     * {@link String }
     */
    public void setCssClassPrevious(String cssClassPrevious) {
        this.cssClassPrevious = cssClassPrevious;
    }

    /**
     * Sets the value of the cssStylePrevious property.
     * @param cssStylePrevious allowed object is
     * {@link String }
     */
    public void setCssStylePrevious(String cssStylePrevious) {
        this.cssStylePrevious = cssStylePrevious;
    }

    /**
     * Sets the value of the cssClassNext property.
     * @param cssClassNext allowed object is
     * {@link String }
     */
    public void setCssClassNext(String cssClassNext) {
        this.cssClassNext = cssClassNext;
    }

    /**
     * Sets the value of the cssStyleNext property.
     * @param cssStyleNext allowed object is
     * {@link String }
     */
    public void setCssStyleNext(String cssStyleNext) {
        this.cssStyleNext = cssStyleNext;
    }

    /**
     * Sets the value of the cssClassFirst property.
     * @param cssClassFirst allowed object is
     * {@link String }
     */
    public void setCssClassFirst(String cssClassFirst) {
        this.cssClassFirst = cssClassFirst;
    }

    /**
     * Sets the value of the cssStyleFirst property.
     * @param cssStyleFirst allowed object is
     * {@link String }
     */
    public void setCssStyleFirst(String cssStyleFirst) {
        this.cssStyleFirst = cssStyleFirst;
    }

    /**
     * Sets the value of the cssClassLast property.
     * @param cssClassLast allowed object is
     * {@link String }
     */
    public void setCssClassLast(String cssClassLast) {
        this.cssClassLast = cssClassLast;
    }

    /**
     * Sets the value of the cssStyleLast property.
     * @param cssStyleLast allowed object is
     * {@link String }
     */
    public void setCssStyleLast(String cssStyleLast) {
        this.cssStyleLast = cssStyleLast;
    }

    /**
     * Sets the value of the cssClassEllipsis property.
     * @param cssClassEllipsis allowed object is
     * {@link String }
     */
    public void setCssClassEllipsis(String cssClassEllipsis) {
        this.cssClassEllipsis = cssClassEllipsis;
    }

    /**
     * Sets the value of the cssStyleEllipsis property.
     * @param cssStyleEllipsis allowed object is
     * {@link String }
     */
    public void setCssStyleEllipsis(String cssStyleEllipsis) {
        this.cssStyleEllipsis = cssStyleEllipsis;
    }

    /**
     * Sets the value of the previousText property.
     * @param previousText allowed object is
     * {@link String }
     */
    public void setPreviousText(String previousText) {
        this.previousText = previousText;
    }

    /**
     * Sets the value of the nextText property.
     * @param nextText allowed object is
     * {@link String }
     */
    public void setNextText(String nextText) {
        this.nextText = nextText;
    }

    /**
     * Sets the value of the firstText property.
     * @param firstText allowed object is
     * {@link String }
     */
    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    /**
     * Sets the value of the lastText property.
     * @param lastText allowed object is
     * {@link String }
     */
    public void setLastText(String lastText) {
        this.lastText = lastText;
    }

    /**
     * Sets the value of the ellipsisText property.
     * @param ellipsisText allowed object is
     * {@link String }
     */
    public void setEllipsisText(String ellipsisText) {
        this.ellipsisText = ellipsisText;
    }

    /**
     * Sets the value of the xml property.
     * @param xml allowed object is
     * {@link String }
     */
    public void setXml(String xml) {
        this.xml = xml;
    }

    /**
     * Writes the pagination to the output stream.
     * @throws JspException if an error occurs
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        try {
            if (xml != null) {
                out.println(xml);
            } else {
                out.println(getHtml());
            }
        } catch (IOException e) {
            throw new JspException(e);
        }
    }

    /**
     * Returns the pagination as an HTML string.
     * @return the pagination as an HTML string
     */
    public String getHtml() {
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(Pages.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.marshal(getPages(), writer);
       