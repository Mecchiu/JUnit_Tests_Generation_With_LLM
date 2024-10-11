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
 *       &lt;attribute name="page" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

    @XmlAttribute(name = "page", required = true)
    protected int page;
    @XmlAttribute(name = "url", required = true)
    protected String url;

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
	* It tests the {@link StaticPage#getPage()} method.
	*/
	@Test
	void testGetPage() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPage(1);
		assertEquals(1, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#getUrl()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#getUrl()} method.
	* It tests the {@link StaticPage#getUrl()} method.
	*/
	@Test
	void testGetUrl() {
		StaticPage staticPage = new StaticPage();
		staticPage.setUrl("http://www.tripfilms.com");
		assertEquals("http://www.tripfilms.com", staticPage.getUrl());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#setPage(int)} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#setPage(int)} method.
	* It tests the {@link StaticPage#setPage(int)} method.
	*/
	@Test
	void testSetPage() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPage(1);
		assertEquals(1, staticPage.getPage());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#setUrl(String)} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#setUrl(String)} method.
	* It tests the {@link StaticPage#setUrl(String)} method.
	*/
	@Test
	void testSetUrl() {
		StaticPage staticPage = new StaticPage();
		staticPage.setUrl("http://www.tripfilms.com");
		assertEquals("http://www.tripfilms.com", staticPage.getUrl());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#toString()} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#toString()} method.
	* It tests the {@link StaticPage#toString()} method.
	*/
	@Test
	void testToString() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPage(1);
		staticPage.setUrl("http://www.tripfilms.com");
		assertEquals("StaticPage{page=1, url=http://www.tripfilms.com}", staticPage.toString());
	}
}

// StaticPageTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StaticPage}.
* It contains ten unit test cases for the {@link StaticPage#equals(Object)} method.
*/
class StaticPageTest {
		
	/**
	* Test case for {@link StaticPage#equals(Object)} method.
	* It tests the {@link StaticPage#equals(Object)} method.
	*/
	@Test
	void testEquals() {
		StaticPage staticPage = new StaticPage();
		staticPage.setPage(1);
		staticPage.setUrl