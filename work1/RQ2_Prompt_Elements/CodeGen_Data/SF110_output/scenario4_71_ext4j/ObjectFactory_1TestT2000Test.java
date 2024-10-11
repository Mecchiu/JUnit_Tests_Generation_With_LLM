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

	/**
	 * Executes {@link ObjectFactory#createStaticPage()} method test.
	 * @throws Exception if a test fails
	 */
	@Test
	public void testCreateStaticPage() throws Exception {
		
		try { // the test 
			ObjectFactory.createStaticPage();
		}
		catch (ClassCastException cce){
			
			System.err.println("The created object has the wrong class");
			cce.printStackTrace();
			fail("The created object has the wrong class");
		}
	}
	
	/**
	 * Executes {@link ObjectFactory#createPagination()} method test.
	 * @throws Exception if a test fails
	 */
	@Test
	public void testCreatePagination() throws Exception {
		
		try { // the test 
			ObjectFactory.createPagination();
		}
		catch (ClassCastException cce){
			
			System.err.println("The created object has the wrong class");
			cce.printStackTrace();
			fail("The created object has the wrong class");
		}
	}
	
	/**
	 * Executes {@link ObjectFactory#createPages()} method test.
	 * @throws Exception if a test fails
	 */
	@Test
	public void testCreatePages() throws Exception {
		
		try { // the test 
			ObjectFactory.createPages();
		}
		catch (ClassCastException cce){
			
			System.err.println("The created object has the wrong class");
			cce.printStackTrace();
			fail("The created object has the wrong class");
		}
	}
}
