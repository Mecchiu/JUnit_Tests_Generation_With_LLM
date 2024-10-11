// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_1Test {
		
	private final String str = "{<page/name/foo>}";
/** @Test1 */

@Test
	public void staticPageTest() {
		Page t= ObjectFactory.createStaticPage();
        assertNotNull(t);
        assertEquals("foo",t.getName());
        assertNotNull(t.getPage());
	}    
    
    /** @Test1 */
    
@Test
	public void emptyPaginationTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNull(t.getTotalCount());
        assertNull(t.getPage());
	}    

    /** @Test1 */
    
@Test
	public void pagesTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}   

    /** @Test1 */
    
@Test
	public void emptyPagesTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
    }

    /** @Test1 */
    
@Test
	public void emptyFirstPageTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}

    /** @Test1 */
    
@Test
	public void nullFirstPageTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}

    
    /** @Test1 */
    
@Test
	public void nullLastPageTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}

    /** @Test1 */
    
@Test
	public void nullLastPageNumberTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}

    /** @Test1 */
    
@Test
	public void nullTotalPageTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
	}

    /** @Test1 */
    
@Test
	public void nullTotalPageNumberTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
	}

    /** @Test1 */
    
@Test
	public void nullPagesTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
	}   

    
    /** @Test1 */
    
@Test
	public void nullFilterTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNotNull(t.getPages());
	}   

    
    /** @Test1 */
    
@Test
	public void nullFilterNumberTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
	}   

    
    /** @Test1 */
    
@Test
	public void emptyPagesNumberTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
    }

    
    /** @Test1 */
    
@Test
	public void nullPageNumberTest() {
		Pagination t= ObjectFactory.createPagination();
        assertNotNull(t);
        assertNotNull(t.getTotalCount());
        assertNull(t.getPages());
    }

    
}