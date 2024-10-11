// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {
		
	public ObjectFactory_3Test() {
	}

	/**
	 * Test case for the {@link Page#Page(int, String...)} constructor.
	 */
	@Test
	public void testcase1()
	{
		Page page = new Page(3, "The first page");

		assertNotNull("Create page return null.", page);
		assertEquals("Create page return value.", 3, page.getId());
		assertEquals("Create page return value.", "The first page", page.getContent());
	}

	/**
	 * Test case for the {@link Pages#Pages(Page...)} constructor
	 * which initializes all input parameters to null
	 * and the return value of {@link Pages#Pages(Page...)} is
	 * a Pages object.
	 */
	@Test
	public void testcase2()
	{
		Pages pages = new Pages(new Page(3), "The second page");

		assertNotNull("Create pages return null", pages);
		assertEquals("Create pages return value.", 3, pages.getId());
		assertEquals("Create pages return value.", "The second page", pages.getContent());
	}

	/**
	 * Test case for the {@link Page#Page(Pages...)} constructor
	 * which initializes all input parameters to null
	 * and the return value of {@link Page#Page(Pages...)} is
	 * a Page object.
	 */
	@Test
	public void testcase3()
	{
		Page page = new Page(new Page(3), "The third page");

		assertNotNull("Create page return null.", page);
		assertEquals("Create page return value.", 3, page.getId());
		assertEquals("Create page return value.", "The third page", page.getContent());
	}

}