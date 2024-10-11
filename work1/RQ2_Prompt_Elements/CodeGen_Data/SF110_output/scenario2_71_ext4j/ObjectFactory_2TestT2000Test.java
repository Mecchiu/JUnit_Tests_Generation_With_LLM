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

	private final ObjectFactory<?> factory = new ObjectFactory<?>();
	private final Pagination pagination = factory.createPagination();
	private final String defaultAttributeKey = pagination.getDefaultAttributeKey();
	private final String defaultAttributeName = pagination.getDefaultAttributeName();

	/**
	* Create a new test case
	*/
	public ObjectFactory_2Test() {
	}
	
	/**
	* Test 1 - Default Attribute should exist in list of defaultAttributes
	*/
	@Test
	public void testDefaultAttribute() {
		assertNotNull(defaultAttributeKey);
		assertTrue(defaultAttributeKey.length() > 0);
	}

	/**
	* Test 2 - Default Attribute should exist in list of defaultAttributes
	* TODO Fixme
	*/
	@Test
	public void testDefaultAttribute_Multiple() {
		
		assertNotNull(defaultAttributeName);
		assertTrue(defaultAttributeName.length() > 0);
	}

	/**
	* Test 3 - Default Attribute should be assigned to the Object
	* If it no value is assigned it return
	* @throws Exception - throws an Exception or not
	*/
	@Test
    public void testDefaultAttribute_NullValue() throws Exception {
		boolean result = factory.getDefaultAttribute(new Object(), null)!= null;
		assertTrue(result);
    }
	
}