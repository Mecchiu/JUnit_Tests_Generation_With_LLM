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
		assertNotNull(pagination);
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
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "resultsPerPage",
    "startIndex",
    "endIndex"
})
@XmlRootElement(name = "pagination")
public class Pagination {

    protected int currentPage;
    protected int totalPages;
    protected int totalResults;
    protected int resultsPerPage;
    protected int startIndex;
    protected int endIndex;

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

    /**
     * Gets the value of the startIndex property.
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     */
    public void setEndIndex(int value) {
        this.endIndex = value;
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
* {@link Pagination#setTotalResults(int)}, {@link Pagination#getResultsPerPage()}, {@link Pagination#setResultsPerPage(int)},
* {@link Pagination#getStartIndex()}, {@link Pagination#setStartIndex(int)}, {@link Pagination#getEndIndex()} and
* {@link Pagination#setEndIndex(int)} methods.
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
	
	/**
	* Test case for {@link Pagination#getStartIndex()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetStartIndex() {
		Pagination pagination = new Pagination();
		pagination.setStartIndex(1);
		assertEquals(1, pagination.getStartIndex());
	}
	
	/**
	* Test case for {@link Pagination#setStartIndex(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetStartIndex() {
		Pagination pagination = new Pagination();
		pagination.setStartIndex(1);
		assertEquals(1, pagination.getStartIndex());
	}
	
	/**
	* Test case for {@link Pagination#getEndIndex()} method.
	* It tests if the method returns the correct value.
	*/
	@Test
	void testGetEndIndex() {
		Pagination pagination = new Pagination();
		pagination.setEndIndex(1);
		assertEquals(1, pagination.getEndIndex());
	}
	
	/**
	* Test case for {@link Pagination#setEndIndex(int)} method.
	* It tests if the method sets the correct value.
	*/
	@Test
	void testSetEndIndex() {
		Pagination pagination = new Pagination();
		pagination.setEndIndex(1);
		assertEquals(1, pagination.getEndIndex());
	}
}

// PaginationTag.java
package com.tripfilms.os.exttaglib.pagination;

import com.tripfilms.os.exttaglib.pagination.datatype.Pagination;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * <p>Tag handler class for the pagination tag.</p>
 * <p>It generates a pagination bar for the given pagination object.</p>
 */
public class PaginationTag extends TagSupport {
	
	/**
	* The pagination object.
	*/
	private Pagination pagination;
	
	/**
	* The pagination object setter.
	* @param pagination The pagination object.
	*/
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	/**
	* The pagination object getter.
	* @return The pagination object.
	*/
	public Pagination getPagination() {
		return pagination;
	}
	
	/**
	* The pagination tag start.
	* @return The pagination tag start.
	* @throws JspException If an error occurs.
	*/
	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("<div class=\"pagination\">");
			out.println("<ul>");
			if (pagination.getCurrentPage() > 1) {
				out.println("<li><a href=\"#\">&laquo;</a></li>");
			}
			for (int i = 1; i <= pagination.getTotalPages(); i++) {
				if (i == pagination.getCurrentPage()) {
					out.println("<li class=\"active\"><a href=\"#\">" + i + "</a></li>");
				} else {
					out.println("<li><a href=\"#\">" + i + "</a></li>");
				}
			}
			if (pagination.getCurrentPage() < pagination.getTotalPages()) {
				out.println("<li><a href=\"#\">&raquo;</a></li>");
			}
			out.println("</ul>");
			out.println("</div>");
		} catch (IOException e) {
			throw new JspException(e);
		}
		return SKIP_BODY;
	}
	
	/**
	* The pagination tag end.
	* @return The pagination tag end.
	* @throws JspException If an error occurs.
	*/
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}

// PaginationTagTest.java
package com.tripfilms.os.exttaglib.pagination;

import com.tripfilms.os.exttaglib.pagination.datatype.Pagination;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
* Test class of {@link PaginationTag}.
* It contains ten unit test cases for the {@link PaginationTag#doStartTag()} and {@link PaginationTag#doEndTag()} methods.
*/
class PaginationTagTest {
		
	/**
	* Test case for {@link PaginationTag#doStartTag()} method.
	* It tests if the method generates the correct pagination bar.
	* @throws JspException If an error occurs.
	*/
	@Test
	void testDoStartTag() throws JspException {
		PaginationTag paginationTag = new PaginationTag();
		Pagination pagination = new Pagination();
		pagination.setCurrentPage(1);
		pagination.setTotalPages(10);
		paginationTag.setPagination(pagination);
		JspWriter jspWriter = mock(JspWriter.class);
		paginationTag.setJspContext(new MockJspContext(jspWriter));
		try {
			paginationTag.doStartTag();
			verify(jspWriter).println("<div class=\"pagination\">");
			verify(jspWriter).println("<ul>");
			verify(jspWriter).println("<li><a href=\"#\">&laquo;</a></li>");
			for (int i = 1; i <= pagination.getTotalPages(); i++) {
				if (i == pagination.getCurrentPage()) {
					verify(jspWriter).println("<li class=\"active\"><a href=\"#\">" + i + "</a></li>");
				} else {
					verify(jspWriter).println("<li><a href=\"#\">" + i + "</a></li>");