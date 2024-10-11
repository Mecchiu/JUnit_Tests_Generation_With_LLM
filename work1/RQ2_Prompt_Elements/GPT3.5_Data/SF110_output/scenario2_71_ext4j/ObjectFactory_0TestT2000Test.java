// Test case 1: Test if createPage() method returns a non-null object
@Test
void testCreatePageNotNull() {
    ObjectFactory factory = new ObjectFactory();
    assertNotNull(factory.createPage());
}

// Test case 2: Test if createPage() method returns an instance of Page class
@Test
void testCreatePageInstanceOfPage() {
    ObjectFactory factory = new ObjectFactory();
    assertTrue(factory.createPage() instanceof Page);
}

// Test case 3: Test if createPage() method returns a Page object with default values
@Test
void testCreatePageDefaultValues() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    assertEquals(1, page.getPageNumber());
    assertEquals(10, page.getPageSize());
    assertEquals(0, page.getTotalCount());
}

// Test case 4: Test if createPage() method returns a Page object with specified page number
@Test
void testCreatePageWithPageNumber() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageNumber(5);
    assertEquals(5, page.getPageNumber());
}

// Test case 5: Test if createPage() method returns a Page object with specified page size
@Test
void testCreatePageWithPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageSize(20);
    assertEquals(20, page.getPageSize());
}

// Test case 6: Test if createPage() method returns a Page object with specified total count
@Test
void testCreatePageWithTotalCount() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setTotalCount(100);
    assertEquals(100, page.getTotalCount());
}

// Test case 7: Test if createPage() method returns a Page object with specified page number and page size
@Test
void testCreatePageWithPageNumberAndPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageNumber(3);
    page.setPageSize(15);
    assertEquals(3, page.getPageNumber());
    assertEquals(15, page.getPageSize());
}

// Test case 8: Test if createPage() method returns a Page object with specified page number and total count
@Test
void testCreatePageWithPageNumberAndTotalCount() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageNumber(2);
    page.setTotalCount(50);
    assertEquals(2, page.getPageNumber());
    assertEquals(50, page.getTotalCount());
}

// Test case 9: Test if createPage() method returns a Page object with specified page size and total count
@Test
void testCreatePageWithPageSizeAndTotalCount() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageSize(25);
    page.setTotalCount(200);
    assertEquals(25, page.getPageSize());
    assertEquals(200, page.getTotalCount());
}

// Test case 10: Test if createPage() method returns a Page object with specified page number, page size and total count
@Test
void testCreatePageWithPageNumberPageSizeAndTotalCount() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageNumber(4);
    page.setPageSize(30);
    page.setTotalCount(120);
    assertEquals(4, page.getPageNumber());
    assertEquals(30, page.getPageSize());
    assertEquals(120, page.getTotalCount());
}
}