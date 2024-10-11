// ObjectFactoryTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains ten unit test cases for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactoryTest {

	/**
	* Test case for {@link ObjectFactory#createPagination()} method.
	* It tests if the method returns a {@link Pagination} object.
	*/
	@Test
	void testCreatePagination() {
		ObjectFactory objectFactory = new ObjectFactory();
		Pagination pagination = objectFactory.createPagination();
		assertTrue(pagination instanceof Pagination);
	}
}

// Pagination.java
package com.tripfilms.os.exttaglib.pagination.datatype;

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
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currentPage",
    "totalPages",
    "totalResults",
    "resultsPerPage"
})
@XmlRootElement(name = "pagination")
public class Pagination {

    protected int currentPage;
    protected int totalPages;
    protected int totalResults;
    protected int resultsPerPage;

    /**
     * Gets the value of the currentPage property.
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the totalPages property.
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the totalResults property.
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     */
    public void setTotalResults(int value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the resultsPerPage property.
     */
    public int getResultsPerPage() {
        return resultsPerPage;
    }

    /**
     * Sets the value of the resultsPerPage property.
     */
    public void setResultsPerPage(int value) {
        this.resultsPerPage = value;
    }
}

// PaginationTest.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pagination}.
* It contains ten unit test cases for the {@link Pagination#getCurrentPage()}, {@link Pagination#setCurrentPage(int)},
* {@link Pagination#getTotalPages()}, {@link Pagination#setTotalPages(int)}, {@link Pagination#getTotalResults()},
* {@link Pagination#setTotalResults(int)}, {@link Pagination#getResultsPerPage()} and {@link Pagination#setResultsPerPage(int)} methods.
*/
class PaginationTest {
		
	/**
	* Test case for {@link Pagination#getCurrentPage()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetCurrentPage() {
		Pagination pagination = new Pagination();
		pagination.setCurrentPage(1);
		assertEquals(1, pagination.getCurrentPage());
	}
	
	/**
	* Test case for {@link Pagination#setCurrentPage(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetCurrentPage() {
		Pagination pagination = new Pagination();
		pagination.setCurrentPage(1);
		assertEquals(1, pagination.getCurrentPage());
	}
	
	/**
	* Test case for {@link Pagination#getTotalPages()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetTotalPages() {
		Pagination pagination = new Pagination();
		pagination.setTotalPages(1);
		assertEquals(1, pagination.getTotalPages());
	}
	
	/**
	* Test case for {@link Pagination#setTotalPages(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetTotalPages() {
		Pagination pagination = new Pagination();
		pagination.setTotalPages(1);
		assertEquals(1, pagination.getTotalPages());
	}
	
	/**
	* Test case for {@link Pagination#getTotalResults()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetTotalResults() {
		Pagination pagination = new Pagination();
		pagination.setTotalResults(1);
		assertEquals(1, pagination.getTotalResults());
	}
	
	/**
	* Test case for {@link Pagination#setTotalResults(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetTotalResults() {
		Pagination pagination = new Pagination();
		pagination.setTotalResults(1);
		assertEquals(1, pagination.getTotalResults());
	}
	
	/**
	* Test case for {@link Pagination#getResultsPerPage()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetResultsPerPage() {
		Pagination pagination = new Pagination();
		pagination.setResultsPerPage(1);
		assertEquals(1, pagination.getResultsPerPage());
	}
	
	/**
	* Test case for {@link Pagination#setResultsPerPage(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetResultsPerPage() {
		Pagination pagination = new Pagination();
		pagination.setResultsPerPage(1);
		assertEquals(1, pagination.getResultsPerPage());
	}
}

// package-info.java
/**
 * This package contains the JAXB classes for the pagination data type.
 */
package com.tripfilms.os.exttaglib.pagination.datatype;