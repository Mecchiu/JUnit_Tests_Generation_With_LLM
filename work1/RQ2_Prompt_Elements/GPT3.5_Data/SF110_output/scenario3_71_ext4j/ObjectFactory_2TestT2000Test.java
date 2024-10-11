// Test case 1: Test if createPagination() method returns a non-null object
@Test
public void testCreatePaginationNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertNotNull(pagination);
}

// Test case 2: Test if createPagination() method returns an instance of Pagination class
@Test
public void testCreatePaginationInstance() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertTrue(pagination instanceof Pagination);
}

// Test case 3: Test if the value of 'currentPage' attribute of Pagination object is set to 1 by default
@Test
public void testCreatePaginationCurrentPage() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(1, pagination.getCurrentPage());
}

// Test case 4: Test if the value of 'pageSize' attribute of Pagination object is set to 10 by default
@Test
public void testCreatePaginationPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(10, pagination.getPageSize());
}

// Test case 5: Test if the value of 'totalRecords' attribute of Pagination object is set to 0 by default
@Test
public void testCreatePaginationTotalRecords() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getTotalRecords());
}

// Test case 6: Test if the value of 'totalPages' attribute of Pagination object is set to 0 by default
@Test
public void testCreatePaginationTotalPages() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getTotalPages());
}

// Test case 7: Test if the value of 'startRecord' attribute of Pagination object is set to 0 by default
@Test
public void testCreatePaginationStartRecord() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getStartRecord());
}

// Test case 8: Test if the value of 'endRecord' attribute of Pagination object is set to 0 by default
@Test
public void testCreatePaginationEndRecord() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(0, pagination.getEndRecord());
}

// Test case 9: Test if the value of 'records' attribute of Pagination object is an empty list by default
@Test
public void testCreatePaginationRecords() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertTrue(pagination.getRecords().isEmpty());
}

// Test case 10: Test if the value of 'sortField' attribute of Pagination object is set to an empty string by default
@Test
public void testCreatePaginationSortField() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals("", pagination.getSortField());
}
}