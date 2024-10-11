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
		private final ObjectFactory object = new ObjectFactory();
	
        @Test
        public void createPage() throws Exception {
        	Pagination result = object.createPage();
        	assertNotNull(result);
        	assertNotNull(result.getPagination());
        }

        @Test
        public void createStaticPage() throws Exception {
        	StaticPage result = object.createStaticPage();
        	assertNotNull(result);
        	assertNotNull(result.getStaticPage());
        }

        @Test
        public void createPagination() throws Exception {
        	Pagination result = object.createPagination();
        	assertNotNull(result);
        	assertNotNull(result.getPagination());
        }

        @Test
        public void createPages() throws Exception {
        	Pages result = object.createPages();
        	assertNotNull(result);
        	assertNotNull(result.getPages());
        }
            
}