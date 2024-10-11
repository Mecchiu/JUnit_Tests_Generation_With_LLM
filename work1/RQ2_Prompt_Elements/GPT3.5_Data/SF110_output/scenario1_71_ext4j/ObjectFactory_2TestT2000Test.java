// Test case 1: Test if createPagination() method returns a non-null object
@Test
public void testCreatePaginationNotNull() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertNotNull(pagination);
}

// Test case 2: Test if createPagination() method returns an object of type Pagination
@Test
public void testCreatePaginationType() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertTrue(pagination instanceof Pagination);
}

// Test case 3: Test if the Pagination object returned by createPagination() method has default values
@Test
public void testCreatePaginationDefaultValues() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    assertEquals(1, pagination.getPageNumber());
    assertEquals(10, pagination.getPageSize());
    assertNull(pagination.getSortBy());
    assertFalse(pagination.isAscending());
}

// Test case 4: Test if the setPageNumber() method sets the page number correctly
@Test
public void testSetPageNumber() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setPageNumber(5);
    assertEquals(5, pagination.getPageNumber());
}

// Test case 5: Test if the setPageSize() method sets the page size correctly
@Test
public void testSetPageSize() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setPageSize(20);
    assertEquals(20, pagination.getPageSize());
}

// Test case 6: Test if the setSortBy() method sets the sort by field correctly
@Test
public void testSetSortBy() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setSortBy("name");
    assertEquals("name", pagination.getSortBy());
}

// Test case 7: Test if the setAscending() method sets the ascending flag correctly
@Test
public void testSetAscending() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setAscending(true);
    assertTrue(pagination.isAscending());
}

// Test case 8: Test if the setDescending() method sets the ascending flag to false
@Test
public void testSetDescending() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setDescending();
    assertFalse(pagination.isAscending());
}

// Test case 9: Test if the copy() method creates a new Pagination object with the same values
@Test
public void testCopy() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination1 = factory.createPagination();
    pagination1.setPageNumber(3);
    pagination1.setPageSize(15);
    pagination1.setSortBy("date");
    pagination1.setAscending(false);
    
    Pagination pagination2 = pagination1.copy();
    assertEquals(pagination1.getPageNumber(), pagination2.getPageNumber());
    assertEquals(pagination1.getPageSize(), pagination2.getPageSize());
    assertEquals(pagination1.getSortBy(), pagination2.getSortBy());
    assertEquals(pagination1.isAscending(), pagination2.isAscending());
}

// Test case 10: Test if the toString() method returns a string representation of the Pagination object
@Test
public void testToString() {
    ObjectFactory factory = new ObjectFactory();
    Pagination pagination = factory.createPagination();
    pagination.setPageNumber(2);
    pagination.setPageSize(25);
    pagination.setSortBy("title");
    pagination.setAscending(true);
    
    String expected = "Pagination [pageNumber=2, pageSize=25, sortBy=title, ascending=true]";
    assertEquals(expected, pagination.toString());
}