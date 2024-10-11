// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactoryTest {

	/**
	* Test case for {@link ObjectFactory#createStaticPage()} method.
	* It tests the {@link ObjectFactory#createStaticPage()} method.
	*/
	@Test
	void testCreateStaticPage() {
		ObjectFactory objectFactory = new ObjectFactory();
		StaticPage staticPage = objectFactory.createStaticPage();
		assertNotNull(staticPage);
	}
}

// StaticPage.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for StaticPage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StaticPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pageSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticPage")
public class StaticPage {

    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;
    @XmlAttribute(name = "pageSize", required = true)
    protected int pageSize;
    @XmlAttribute(name = "totalCount", required = true)
    protected int totalCount;

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
     * Gets the value of the totalCount property.
     *
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     *
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPageNumber()}, {@link StaticPage#setPageNumber(int)}, {@link StaticPage#getPageSize()}, {@link StaticPage#setPageSize(int)}, {@link StaticPage#getTotalCount()} and {@link StaticPage#setTotalCount(int)} methods.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPageNumber()} method.
	* It tests the {@link StaticPage#getPageNumber()} method.
	*/
	@Test
	void testGetPageNumber() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPageNumber(1);
		assertEquals(1, staticPage.getPageNumber());
	}
	
	/**
	* Test case for {@link StaticPage#setPageNumber(int)} method.
	* It tests the {@link StaticPage#setPageNumber(int)} method.
	*/
	@Test
	void testSetPageNumber() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPageNumber(1);
		assertEquals(1, staticPage.getPageNumber());
	}
	
	/**
	* Test case for {@link StaticPage#getPageSize()} method.
	* It tests the {@link StaticPage#getPageSize()} method.
	*/
	@Test
	void testGetPageSize() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPageSize(1);
		assertEquals(1, staticPage.getPageSize());
	}
	
	/**
	* Test case for {@link StaticPage#setPageSize(int)} method.
	* It tests the {@link StaticPage#setPageSize(int)} method.
	*/
	@Test
	void testSetPageSize() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPageSize(1);
		assertEquals(1, staticPage.getPageSize());
	}
	
	/**
	* Test case for {@link StaticPage#getTotalCount()} method.
	* It tests the {@link StaticPage#getTotalCount()} method.
	*/
	@Test
	void testGetTotalCount() {
		StaticPage staticPage = new StaticPage();
		staticPage.setTotalCount(1);
		assertEquals(1, staticPage.getTotalCount());
	}
	
	/**
	* Test case for {@link StaticPage#setTotalCount(int)} method.
	* It tests the {@link StaticPage#setTotalCount(int)} method.
	*/
	@Test
	void testSetTotalCount() {
		StaticPage staticPage = new StaticPage();
		staticPage.setTotalCount(1);
		assertEquals(1, staticPage.getTotalCount());
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
import com.tripfilms.os.exttaglib.pagination.datatype.StaticPage;

/**
 * <p>Tag handler class for the pagination tag.</p>
 *
 * <p>This tag handler class is used to generate the pagination links.</p>
 *
 * @author  <a href="mailto:sudhir.kumar@tripfilms.com">Sudhir Kumar</a>
 * @version 1.0
 */
public class PaginationTag extends TagSupport {

    /**
     * <p>The serial version UID.</p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>The static page.</p>
     */
    private StaticPage staticPage;

    /**
     * <p>The page number.</p>
     */
    private int pageNumber;

    /**
     * <p>The page size.</p>
     */
    private int pageSize;

    /**
     * <p>The total count.</p>
     */
    private int totalCount;

    /**
     * <p>The page link.</p>
     */
    private String pageLink;

    /**
     * <p>The page link parameter.</p>
     */
    private String pageLinkParameter;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValueSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValueSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValueSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparator;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorSuffix;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValuePrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefixSuffixSeparatorPrefix