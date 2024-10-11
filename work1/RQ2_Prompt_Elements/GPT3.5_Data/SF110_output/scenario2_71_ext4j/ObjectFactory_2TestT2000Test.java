// Test case 1: Test if createPagination() method returns a non-null object
@Test
void testCreatePaginationNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertNotNull(pagination);
}

// Test case 2: Test if createPagination() method returns an instance of Pagination class
@Test
void testCreatePaginationInstance() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertTrue(pagination instanceof Pagination);
}

// Test case 3: Test if the value of 'currentPage' attribute of Pagination object is set to 1 by default
@Test
void testCreatePaginationCurrentPage() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(1, pagination.getCurrentPage());
}

// Test case 4: Test if the value of 'pageSize' attribute of Pagination object is set to 10 by default
@Test
void testCreatePaginationPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(10, pagination.getPageSize());
}

// Test case 5: Test if the value of 'totalRecords' attribute of Pagination object is set to 0 by default
@Test
void testCreatePaginationTotalRecords() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getTotalRecords());
}

// Test case 6: Test if the value of 'totalPages' attribute of Pagination object is set to 0 by default
@Test
void testCreatePaginationTotalPages() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getTotalPages());
}

// Test case 7: Test if the value of 'startRecord' attribute of Pagination object is set to 0 by default
@Test
void testCreatePaginationStartRecord() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getStartRecord());
}

// Test case 8: Test if the value of 'endRecord' attribute of Pagination object is set to 0 by default
@Test
void testCreatePaginationEndRecord() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getEndRecord());
}

// Test case 9: Test if the value of 'sortColumn' attribute of Pagination object is set to null by default
@Test
void testCreatePaginationSortColumn() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertNull(pagination.getSortColumn());
}

// Test case 10: Test if the value of 'sortOrder' attribute of Pagination object is set to null by default
@Test
void testCreatePaginationSortOrder() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertNull(pagination.getSortOrder());
}