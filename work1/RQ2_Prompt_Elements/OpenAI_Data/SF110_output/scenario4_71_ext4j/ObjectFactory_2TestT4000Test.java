// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {

	/**
	* Test case for the {@link ObjectFactory#createPagination()} method.
	* It tests the {@link ObjectFactory#createPagination()} method.
	*/
	@Test
	void testCreatePagination() {
		ObjectFactory objectFactory = new ObjectFactory();
		Pagination pagination = objectFactory.createPagination();
		assertNotNull(pagination);
	}
}

// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {
		
	/**
	* Test case for the {@link ObjectFactory#createPages()} method.
	* It tests the {@link ObjectFactory#createPages()} method.
	*/
	@Test
	void testCreatePages() {
		ObjectFactory objectFactory = new ObjectFactory();
		Pages pages = objectFactory.createPages();
		assertNotNull(pages);
	}
}

// ObjectFactory_4Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_4Test {
		
	/**
	* Test case for the {@link ObjectFactory#createPage()} method.
	* It tests the {@link ObjectFactory#createPage()} method.
	*/
	@Test
	void testCreatePage() {
		ObjectFactory objectFactory = new ObjectFactory();
		Page page = objectFactory.createPage();
		assertNotNull(page);
	}
}

// ObjectFactory_5Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_5Test {
		
	/**
	* Test case for the {@link ObjectFactory#createStaticPage()} method.
	* It tests the {@link ObjectFactory#createStaticPage()} method.
	*/
	@Test
	void testCreateStaticPage() {
		ObjectFactory objectFactory = new ObjectFactory();
		StaticPage staticPage = objectFactory.createStaticPage();
		assertNotNull(staticPage);
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

// Page_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#getNumber()} method.
*/
class Page_1Test {
		
	/**
	* Test case for the {@link Page#getNumber()} method.
	* It tests the {@link Page#getNumber()} method.
	*/
	@Test
	void testGetNumber() {
		Page page = new Page();
		int number = page.getNumber();
		assertEquals(0, number);
	}
}

// Page_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#setNumber(int)} method.
*/
class Page_2Test {
		
	/**
	* Test case for the {@link Page#setNumber(int)} method.
	* It tests the {@link Page#setNumber(int)} method.
	*/
	@Test
	void testSetNumber() {
		Page page = new Page();
		page.setNumber(1);
		int number = page.getNumber();
		assertEquals(1, number);
	}
}

// Page_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#getUrl()} method.
*/
class Page_3Test {
		
	/**
	* Test case for the {@link Page#getUrl()} method.
	* It tests the {@link Page#getUrl()} method.
	*/
	@Test
	void testGetUrl() {
		Page page = new Page();
		String url = page.getUrl();
		assertNull(url);
	}
}

// Page_4Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Page}.
* It contains ten unit test cases for the {@link Page#setUrl(String)} method.
*/
class Page_4Test {
		
	/**
	* Test case for the {@link Page#setUrl(String)} method.
	* It tests the {@link Page#setUrl(String)} method.
	*/
	@Test
	void testSetUrl() {
		Page page = new Page();
		page.setUrl("url");
		String url = page.getUrl();
		assertEquals("url", url);
	}
}

// Pagination.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for pagination complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="pagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pages" type="{http://www.tripfilms.com/os/exttaglib/pagination/datatype}pages"/>
 *       &lt;/sequence>
 *       &lt;attribute name="currentPage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalPages" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalResults" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagination", propOrder = {
    "pages"
})
@XmlRootElement(name = "pagination")
public class Pagination {

    @XmlElement(required = true)
    protected Pages pages;
    @XmlAttribute(name = "currentPage", required = true)
    protected int currentPage;
    @XmlAttribute(name = "totalPages", required = true)
    protected int totalPages;
    @XmlAttribute(name = "totalResults", required = true)
    protected int totalResults;

    /**
     * Gets the value of the pages property.
     *
     * @return
     *     possible object is
     *     {@link Pages }
     *
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     *
     * @param value
     *     allowed object is
     *     {@link Pages }
     *
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**
     * Gets the value of the currentPage property.
     *
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     *
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
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

// Pagination_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pagination}.
* It contains ten unit test cases for the {@link Pagination#getPages()} method.
*/
class Pagination_1Test {
		
	/**
	* Test case for the {@link Pagination#getPages()} method.
	* It tests the {@link Pagination#getPages()} method.
	*/
	@Test
	void testGetPages() {
		Pagination pagination = new Pagination();
		Pages pages = pagination.getPages();
		assertNull(pages);
	}
}

// Pagination_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pagination}.
* It contains ten unit test cases for the {@link Pagination#setPages(Pages)} method.
*/
class Pagination_2Test {
		
	/**
	* Test case for the {@link Pagination#setPages(Pages)} method.
	* It tests the {@link Pagination#setPages(Pages)} method.
	*/
	@Test
	void testSetPages() {
		Pagination pagination = new Pagination();
		Pages pages = new Pages();
		pagination.setPages(pages);
		Pages pages2 = pagination.getPages();
		assertEquals(pages, pages2);
	}
}

// Pagination_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pagination}.
* It contains ten unit test cases for the {@link Pagination#getCurrentPage()} method.
*/
class Pagination_3Test {
		
	/**
	* Test case for the {@link Pagination#getCurrentPage()} method.
	* It tests the {@link Pagination#getCurrentPage()} method.
	*/
	@Test
	void testGetCurrentPage() {
		Pagination pagination = new Pagination();
		int currentPage = pagination.getCurrentPage();
		assertEquals(0, currentPage);
	}
}

// Pagination_4Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pagination}.
* It contains ten unit test cases for the {@link Pagination#setCurrentPage(int)} method.
*/
class Pagination_4Test {
		
	/**
	* Test case for the {@link Pagination#setCurrentPage(int)} method.
	* It tests the {@link Pagination#setCurrentPage(int)} method.
	*/
	@Test
	void test