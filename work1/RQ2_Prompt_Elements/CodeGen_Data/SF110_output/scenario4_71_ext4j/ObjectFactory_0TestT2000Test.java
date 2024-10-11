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

    @Test
    public void test1() {
        Page testObject;
        
        testObject = ObjectFactory.createPage();
        assertNotNull(testObject);
    }
	@Test
	public void test2() {
		Pages testObject;
		
		testObject = ObjectFactory.createPagination();
		assertNotNull(testObject);
	}
	@Test
	public void test3() {
		Pages testObject;
		
		testObject = ObjectFactory.createPages();
		assertNotNull(testObject);
	}
	@Test
	public void test4() {
		Pages testObject;
		
		testObject = ObjectFactory.createStaticPage();
		assertNotNull(testObject);
	}

}