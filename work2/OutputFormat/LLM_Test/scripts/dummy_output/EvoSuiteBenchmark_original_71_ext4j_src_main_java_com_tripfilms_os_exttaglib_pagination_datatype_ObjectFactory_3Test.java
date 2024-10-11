package com.tripfilms.os.exttaglib.pagination.datatype;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObjectFactory_3Test {

    @Test
    void testCreatePages() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pages pages = objectFactory.createPages();
        assertNotNull(pages);
    }

    @Test
    void testCreatePage() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page = objectFactory.createPage();
        assertNotNull(page);
    }

    @Test
    void testCreateStaticPage() {
        ObjectFactory objectFactory = new ObjectFactory();
        StaticPage staticPage = objectFactory.createStaticPage();
        assertNotNull(staticPage);
    }

    @Test
    void testCreatePagination() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pagination pagination = objectFactory.createPagination();
        assertNotNull(pagination);
    }
}
