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

// Test case 3: Test if the created Pages object has a non-null currentPage property
@Test
public void testCreatePagesCurrentPageNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertNotNull(pages.getCurrentPage());
}

// Test case 4: Test if the created Pages object has a non-null totalPages property
@Test
public void testCreatePagesTotalPagesNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertNotNull(pages.getTotalPages());
}

// Test case 5: Test if the created Pages object has a non-null pageSize property
@Test
public void testCreatePagesPageSizeNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertNotNull(pages.getPageSize());
}

// Test case 6: Test if the created Pages object has a non-null totalRecords property
@Test
public void testCreatePagesTotalRecordsNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertNotNull(pages.getTotalRecords());
}

// Test case 7: Test if the created Pages object has a currentPage property with default value 1
@Test
public void testCreatePagesCurrentPageDefaultValue() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertEquals(1, pages.getCurrentPage());
}

// Test case 8: Test if the created Pages object has a totalPages property with default value 0
@Test
public void testCreatePagesTotalPagesDefaultValue() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertEquals(0, pages.getTotalPages());
}

// Test case 9: Test if the created Pages object has a pageSize property with default value 10
@Test
public void testCreatePagesPageSizeDefaultValue() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertEquals(10, pages.getPageSize());
}

// Test case 10: Test if the created Pages object has a totalRecords property with default value 0
@Test
public void testCreatePagesTotalRecordsDefaultValue() {
    ObjectFactory factory = new ObjectFactory();
    Pages pages = factory.createPages();
    assertEquals(0, pages.getTotalRecords());
}
}