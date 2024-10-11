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
		
    private Page createPage() {
		return new Page();
	}

	private Pagination createPagination(int pageNumber) {
    	return new Pagination(new String[]{"#pageNumber"});
	}

	@Test
	public void testCreatePages() {
		assertEquals(2, createPages().getClass().getEnclosingClass().getMethods().length);
	}

	@Test
	public void testCreatePagination() {
		assertEquals(0, createPagination("0").getClass().getEnclosingClass().getMethods().length);
		assertEquals("100", createPagination("100").getClass().getEnclosingClass().getMethods()[0].getAnnotation(XmlRegistry.class).getName());
	}

	@Test
	public void testCreateStaticPage() {
		assertEquals(0, createStaticPage().getClass().getEnclosingClass().getMethods().length);
		assertEquals("staticPage", createStaticPage().getClass().getEnclosingClass().getMethods()[0].getName());
	}
}