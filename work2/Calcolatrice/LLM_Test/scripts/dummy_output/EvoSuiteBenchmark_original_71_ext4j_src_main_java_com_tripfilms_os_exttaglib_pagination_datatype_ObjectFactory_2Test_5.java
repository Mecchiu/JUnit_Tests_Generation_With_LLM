// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {
		
	@Test
	public void testCreatePagination() {
		try {
			ObjectFactory o = new ObjectFactory();
			Page p = o.createPage();
			assertEquals(p,new Page(){"test","test",1,2,4,true,new PageInfo("1", "test", "test", null, true, false)});
		}
		catch (Exception e){
			assertTrue(e instanceof ClassCastException);
		}
	}	
	
	/**
	* Create an instance of {@link PageInfo }
	*/
	@Test
	public void testPageInfo() {
		try {
			ObjectFactory o = new ObjectFactory();
			// check if null is returned
			Page p = o.createPagination();
			assertEquals(false,p.hasMore());
			assertEquals(null,p.next());
			assertEquals(false,p.hasPrev());
			assertEquals(p.hasNext(),p.hasPrev());
			assertEquals(false,p.hasPrevPage());
			assertEquals(true,p.hasPrev());
			assertEquals(false,p.isFirst());
			assertEquals(false,p.hasPrev());
			assertEquals(false,p.hasMore());
			
			p = o.createPagination();
			// check if null is returned
			p.next();
			p = o.createPagination();
			assertEquals(true,p.hasMore());
			p.next();
			p = o.createPagination();
			assertEquals(false,p.hasMore());
			assertEquals(true,p.hasMore());
			
			p = o.createPagination();
			// check if null is returned
			p.prev();
			p = o.createPagination();
			assertEquals(true,p.hasMore());
			p.prev();
			p = o.createPagination();
			assertEquals(false,p.hasMore());
			p = o.createPagination();
			p.prev();
			
			p = o.createPagination();
			// check if null is returned
			p.prev();
			p = o.createPagination();
			assertEquals(true,p.hasMore());
			p.prev();
			p = o.createPagination();
			// check if null is returned
			p.clear();
			assertEquals(false,p.hasMore());
			
			p = o.createPagination();
			// check if null is returned
			p.clear();
			// check if null is returned
			p = o.createPagination();
			//check if null is returned
			p = o.createPagination();
			p.clear();
			
			p = o.createPagination();
			// check if null is returned
			p.clear();
			p = o.createPagination();
			p = o.createPagination();
			// check if null is returned
			p = o.createPagination();
			p.clear();
			p = o.createPagination();
			assertEquals(false,p.hasMore());
		}
		catch (Exception e){
			fail(e.getMessage());
		}
	}	

}