// ObjectFactory_0Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPage()} method.
*/
class ObjectFactory_0Test {
		
	/**
	 * @throws Exception
	 * 
	 */
	@Test
	 public void test()
	 throws Exception
	 {
		assertEquals("First Page", this.createPage().toString(), "\ntest for page.toString()");
	 }
	 
}