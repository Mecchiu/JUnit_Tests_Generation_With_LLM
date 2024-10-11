package net.kencochrane.a4j;
java
class A4j_5Test {
    
    @Test
    void testAuthorSearch() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "1";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithEmptyAuthorName() {
        A4j a4j = new A4j();
        String authorName = "";
        String page = "1";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithNullAuthorName() {
        A4j a4j = new A4j();
        String authorName = null;
        String page = "1";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertNull(productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithEmptyPage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithNullPage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = null;
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertNull(productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithInvalidPage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "abc";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithNegativePage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "-1";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithZeroPage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "0";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithSpecialCharactersInAuthorName() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling & Co.";
        String page = "1";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }

    @Test
    void testAuthorSearchWithSpecialCharactersInPage() {
        A4j a4j = new A4j();
        String authorName = "J.K. Rowling";
        String page = "!@#$%";
        ProductInfo productInfo = a4j.AuthorSearch(authorName, page);
        
        assertNotNull(productInfo);
        assertEquals(authorName, productInfo.getSearchTerm());
        assertEquals(page, productInfo.getPage());
    }
}
