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
 * <p>This tag handler class is used to display the pagination links.</p>
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
    private String pageLinkParameterValue2;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue3;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue4;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue5;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue6;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue7;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue8;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue9;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue10;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue11;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue12;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue13;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue14;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue15;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue16;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue17;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue18;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue19;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue20;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue21;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue22;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue23;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue24;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue25;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue26;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue27;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue28;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue29;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue30;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue31;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue32;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue33;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue34;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue35;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue36;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue37;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue38;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue39;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue40;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue41;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue42;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue43;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue44;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue45;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue46;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue47;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue48;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue49;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue50;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue51;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue52;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue53;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue54;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue55;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue56;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue57;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue58;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue59;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue60;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue61;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue62;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue63;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue64;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue65;

    /**
     * <p>The page link parameter value.</p>
     */
    private String pageLinkParameterValue66;

    /**
     * <p>The page link parameter value