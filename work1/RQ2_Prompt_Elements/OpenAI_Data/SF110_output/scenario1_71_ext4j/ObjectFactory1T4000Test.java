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
	* It tests if the method returns a new instance of {@link StaticPage} class.
	*/
	@Test
	void testCreateStaticPage() {
		ObjectFactory objectFactory = new ObjectFactory();
		StaticPage staticPage = objectFactory.createStaticPage();
		assertNotNull(staticPage);
		assertTrue(staticPage instanceof StaticPage);
	}
}

// StaticPage.java
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
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hasNext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasPrevious" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previousPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "page",
    "pageSize",
    "total",
    "totalPages",
    "hasNext",
    "hasPrevious",
    "nextPage",
    "previousPage",
    "firstPage",
    "lastPage"
})
@XmlRootElement(name = "staticPage")
public class StaticPage {

    protected int page;
    protected int pageSize;
    protected int total;
    protected int totalPages;
    protected boolean hasNext;
    protected boolean hasPrevious;
    protected int nextPage;
    protected int previousPage;
    protected int firstPage;
    protected int lastPage;

    /**
     * Gets the value of the page property.
     *
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     *
     */
    public void setPage(int value) {
        this.page = value;
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
     * Gets the value of the total property.
     *
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     */
    public void setTotal(int value) {
        this.total = value;
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
     * Gets the value of the hasNext property.
     *
     */
    public boolean isHasNext() {
        return hasNext;
    }

    /**
     * Sets the value of the hasNext property.
     *
     */
    public void setHasNext(boolean value) {
        this.hasNext = value;
    }

    /**
     * Gets the value of the hasPrevious property.
     *
     */
    public boolean isHasPrevious() {
        return hasPrevious;
    }

    /**
     * Sets the value of the hasPrevious property.
     *
     */
    public void setHasPrevious(boolean value) {
        this.hasPrevious = value;
    }

    /**
     * Gets the value of the nextPage property.
     *
     */
    public int getNextPage() {
        return nextPage;
    }

    /**
     * Sets the value of the nextPage property.
     *
     */
    public void setNextPage(int value) {
        this.nextPage = value;
    }

    /**
     * Gets the value of the previousPage property.
     *
     */
    public int getPreviousPage() {
        return previousPage;
    }

    /**
     * Sets the value of the previousPage property.
     *
     */
    public void setPreviousPage(int value) {
        this.previousPage = value;
    }

    /**
     * Gets the value of the firstPage property.
     *
     */
    public int getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     *
     */
    public void setFirstPage(int value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the lastPage property.
     *
     */
    public int getLastPage() {
        return lastPage;
    }

    /**
     * Sets the value of the lastPage property.
     *
     */
    public void setLastPage(int value) {
        this.lastPage = value;
    }

}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getPage()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getPage()} method.
	* It tests if the method returns the value of the {@link StaticPage#page} field.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		int page = 1;
		staticPage.setPage(page);
		assertEquals(page, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
*