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
     * Test of createPage method, of class com.tripfilms.os.exttaglib.pagination.datatype.
     */
    @Test
    public void testCreatePage_1() {
        System.out.println("createPage_1");
        Page page = null;
        page = ObjectFactory.createPage();
        assertNotNull(page);
    }

    /**
     * Test of createStaticPage method, of class com.tripfilms.os.exttaglib.pagination.datatype.
     */
    @Test
    public void testCreateStaticPage_1() {
        System.out.println("createStaticPage_1");
        StaticPage staticpage = null;
        staticpage = ObjectFactory.createStaticPage();
        assertNotNull(staticpage);
    }

    /**
     * Test of createPagination method, of class com.tripfilms.os.exttaglib.pagination.datatype.
     */
    @Test
    public void testCreatePagination_1() {
        System.out.println("createPagination_1");
        Pagination pagination = null;
        pagination = ObjectFactory.createPagination();
        assertNotNull(pagination);
    }

    /**
     * Test of createPages method, of class com.tripfilms.os.exttaglib.pagination.datatype.
     */
    @Test
    public void testCreatePages_1() {
        System.out.println("createPages_1");
        Pages pages = null;
        pages = ObjectFactory.createPages();
        assertNotNull(pages);
    }
    
}