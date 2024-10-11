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
		
	private static Class<?> cls;
	private static TagObject obj;
	
	
	/**
	 * Test for calling createPage method of {@link ObjectFactory}.
	 */
	@Test
	public void test01_01_createPagination() {
		assertEquals(1, (new ObjectFactory()).createPagination().getIndex());
		assertEquals("index0", obj.getIndex());
	}
	
	
	/**
	 * Test for calling createStaticPage method of {@link ObjectFactory}.
	 */
	@Test
	public void test02_02_createStaticPage() {
		assertFalse(obj.getStatic());
		obj = (TagObject) obj.getPagination().getStatic() ;
		assertTrue(obj.getStatic());
	}
	
	
	/**
	 * Test for calling createPagination method of {@link ObjectFactory}.
	 */
	@Test
	public void test03_03_createPagination() {
		assertEquals(1, (new ObjectFactory()).createPagination().getNum());
		assertEquals("num0", obj.getNum());
	}
	
	
	/**
	 * Test for calling createStaticPage method of {@link ObjectFactory}.
	 */
	@Test
	public void test04_04_createStaticPage() {
		assertFalse(obj.getStatic());
		obj = (TagObject) obj.getPagination().getStatic() ;
		assertTrue(obj.getStatic());
	}
	
	/**
	 * Test for calling createPage method of {@link ObjectFactory}.
	 */
	@Test
	public void test05_05_createPage() {
		Page p = (new ObjectFactory()).createPage(1);	
		assertEquals(1, p.getIndex());
		assertEquals("index1", p.getPageInfo().getIndex());
		assertEquals("page0", p.getPageInfo().getPageNo());
	}
	
	/**
	 * Test for calling createStaticPage method of {@link ObjectFactory}.
	 */
	@Test
	public void test06_06_createStaticPage() {
		assertFalse(obj.getStatic());
		obj = (TagObject) obj.getPagination().getStatic() ;
		assertTrue(obj.getStatic());
		obj = (TagObject) obj.getPagination().getStatic() ;
		assertTrue(obj.getStatic());
	}
	
	/**
	 * Test for calling createPagination method of {@link ObjectFactory}.
	 */
	@Test
	public void test07_07_createPagination() {
		Pagination page = (new ObjectFactory()).createPagination();
		assertEquals(1, page.getNum());
		assertEquals("num_1", page.getPageInfo().getPageNo());
		Page p = (new ObjectFactory()).createPagination(page.getPageInfo().getPageNo());
		assertEquals(page.getPageInfo(), p.getPageInfo());
	}
	
	
	/**
	 * Test for calling createPagination method of {@link ObjectFactory}.
	 */
	@Test
	public void test08_08_createPagination() {
		Page page = (new ObjectFactory()).createPagination();
		assertEquals(1, page.getNum());
		assertEquals("num_2", page.getPageInfo().getPageNo());
		Pagination page1 = (new ObjectFactory()).createPagination(page.getPageInfo().getPageNo());
		assertEquals(1, page1.getNum());
		assertEquals("numentagroup1", page1.getPageInfo().getPageNo());
		Page page2 = (new ObjectFactory()).createPagination(page1.getPageInfo().getPageNo());
		assertEquals(2, page2.getNum());
		assertEquals("numentagroup2", page2.getPageInfo().getPageNo());
	}
	
}