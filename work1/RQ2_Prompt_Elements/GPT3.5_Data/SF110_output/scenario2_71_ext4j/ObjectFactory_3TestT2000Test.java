// Test case 1: Test if createPages() method returns a non-null object
@Test
public void testCreatePagesNotNull() {
    ObjectFactory factory = new ObjectFactory();
    assertNotNull(factory.createPages());
}

// Test case 2: Test if createPages() method returns an instance of Pages class
@Test
public void testCreatePagesInstanceOfPages() {
    ObjectFactory factory = new ObjectFactory();
    assertTrue(factory.createPages() instanceof Pages);
}

// Test case 3: Test if createPages() method returns an object with default values
@Test
public void testCreatePagesDefaultValues() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertEquals(0, pages.getPageNumber());
    assertEquals(0, pages.getPageSize());
    assertEquals(0, pages.getTotalPages());
    assertEquals(0, pages.getTotalRecords());
}

// Test case 4: Test if createPages() method returns an object with specified page number
@Test
public void testCreatePagesWithPageNumber() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    pages.setPageNumber(2);
    assertEquals(2, pages.getPageNumber());
}

// Test case 5: Test if createPages() method returns an object with specified page size
@Test
public void testCreatePagesWithPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    pages.setPageSize(10);
    assertEquals(10, pages.getPageSize());
}

// Test case 6: Test if createPages() method returns an object with specified total pages
@Test
public void testCreatePagesWithTotalPages() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    pages.setTotalPages(5);
    assertEquals(5, pages.getTotalPages());
}

// Test case 7: Test if createPages() method returns an object with specified total records
@Test
public void testCreatePagesWithTotalRecords() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    pages.setTotalRecords(50);
    assertEquals(50, pages.getTotalRecords());
}

// Test case 8: Test if createPages() method returns an object with specified values
@Test
public void testCreatePagesWithValues() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    pages.setPageNumber(2);
    pages.setPageSize(10);
    pages.setTotalPages(5);
    pages.setTotalRecords(50);
    assertEquals(2, pages.getPageNumber());
    assertEquals(10, pages.getPageSize());
    assertEquals(5, pages.getTotalPages());
    assertEquals(50, pages.getTotalRecords());
}

// Test case 9: Test if createPages() method returns a new instance each time it is called
@Test
public void testCreatePagesNewInstance() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages1 = factory.createPages();
    Pages pages2 = factory.createPages();
    assertNotSame(pages1, pages2);
}

// Test case 10: Test if createPages() method returns an object with default values when called multiple times
@Test
public void testCreatePagesDefaultValuesMultipleCalls() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages1 = factory.createPages();
    Pages pages2 = factory.createPages();
    assertEquals(0, pages1.getPageNumber());
    assertEquals(0, pages1.getPageSize());
    assertEquals(0, pages1.getTotalPages());
    assertEquals(0, pages1.getTotalRecords());
    assertEquals(0, pages2.getPageNumber());
    assertEquals(0, pages2.getPageSize());
    assertEquals(0, pages2.getTotalPages());
    assertEquals(0, pages2.getTotalRecords());
}