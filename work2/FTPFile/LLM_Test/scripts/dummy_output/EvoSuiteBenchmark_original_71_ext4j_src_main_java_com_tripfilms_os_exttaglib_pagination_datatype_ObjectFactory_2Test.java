package com.tripfilms.os.exttaglib.pagination.datatype;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObjectFactory_2Test {

    @Test
    void testCreatePagination() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pagination pagination = objectFactory.createPagination();
        assertNotNull(pagination);
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
    void testCreatePages() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pages pages = objectFactory.createPages();
        assertNotNull(pages);
    }

    @Test
    void testCreatePaginationTwice() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pagination pagination1 = objectFactory.createPagination();
        Pagination pagination2 = objectFactory.createPagination();
        assertNotSame(pagination1, pagination2);
    }

    @Test
    void testCreatePageTwice() {
        ObjectFactory objectFactory = new ObjectFactory();
        Page page1 = objectFactory.createPage();
        Page page2 = objectFactory.createPage();
        assertNotSame(page1, page2);
    }

    @Test
    void testCreateStaticPageTwice() {
        ObjectFactory objectFactory = new ObjectFactory();
        StaticPage staticPage1 = objectFactory.createStaticPage();
        StaticPage staticPage2 = objectFactory.createStaticPage();
        assertNotSame(staticPage1, staticPage2);
    }

    @Test
    void testCreatePagesTwice() {
        ObjectFactory objectFactory = new ObjectFactory();
        Pages pages1 = objectFactory.createPages();
        Pages pages2 = objectFactory.createPages();
        assertNotSame(pages1, pages2);
    }

    @Test
    void testObjectFactoryConstructor() {
        ObjectFactory objectFactory = new ObjectFactory();
        assertNotNull(objectFactory);
    }
}
