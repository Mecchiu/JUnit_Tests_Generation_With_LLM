// Test case 1: Test if createPage() method returns a non-null object
@Test
public void testCreatePageNotNull() {
    ObjectFactory factory = new ObjectFactory();
    assertNotNull(factory.createPage());
}

// Test case 2: Test if createPage() method returns an instance of Page class
@Test
public void testCreatePageInstanceOfPage() {
    ObjectFactory factory = new ObjectFactory();
    assertTrue(factory.createPage() instanceof Page);
}

// Test case 3: Test if createPage() method returns a unique object each time it is called
@Test
public void testCreatePageUnique() {
    ObjectFactory factory = new ObjectFactory();
    assertNotSame(factory.createPage(), factory.createPage());
}

// Test case 4: Test if createPage() method returns an object with default values for all fields
@Test
public void testCreatePageDefaultValues() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    assertEquals(0, page.getPageNumber());
    assertEquals(10, page.getPageSize());
    assertNull(page.getSortBy());
    assertFalse(page.isAscending());
}

// Test case 5: Test if createPage() method returns an object with specified page number
@Test
public void testCreatePageWithPageNumber() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageNumber(2);
    assertEquals(2, page.getPageNumber());
}

// Test case 6: Test if createPage() method returns an object with specified page size
@Test
public void testCreatePageWithPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setPageSize(20);
    assertEquals(20, page.getPageSize());
}

// Test case 7: Test if createPage() method returns an object with specified sort by field
@Test
public void testCreatePageWithSortBy() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setSortBy("name");
    assertEquals("name", page.getSortBy());
}

// Test case 8: Test if createPage() method returns an object with specified ascending order
@Test
public void testCreatePageWithAscending() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setAscending(true);
    assertTrue(page.isAscending());
}

// Test case 9: Test if createPage() method returns an object with descending order when ascending is set to false
@Test
public void testCreatePageWithDescending() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    page.setAscending(false);
    assertFalse(page.isAscending());
}

// Test case 10: Test if createPage() method returns an object with default values when no values are set
@Test
public void testCreatePageNoValuesSet() {
    ObjectFactory factory = new ObjectFactory();
    Page page = factory.createPage();
    Page defaultPage = new Page();
    assertEquals(defaultPage, page);
}
}