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
		
	/**
	 * Test for <code>createPages()</code> method.
	 * Create an instance of {@link ObjectFactory} and call its {@link #createPages()} method.
	 */
	@Test
	public void createPagesMethod() {
		Pagination result = ObjectFactory.createPagination();
		
		assertNotNull(result);
		assertNotNull(result.getPaginationList());
		assertEquals(1, result.getPaginationList().size());
		assertEquals(1, result.getPaginationList().get(0).getPaginationList().size());
		assertEquals("/pagination", result.getPaginationList().get(0).getPaginationList().get(0).getPath());
	}
	
	/**
	 * Test for <code>createPages()</code> method.
	 * Create an instance of {@link ObjectFactory} and call its {@link #createPages()} method.
	 */
	@Test(expected = ClassCastException.class)
	public void testObjectFactory_3() {
		ObjectFactory.createPages();
	}
}