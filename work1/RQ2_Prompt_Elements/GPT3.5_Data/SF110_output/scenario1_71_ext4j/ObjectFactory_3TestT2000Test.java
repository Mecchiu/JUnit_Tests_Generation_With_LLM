// Test case for ObjectFactory.createPages() method
public class ObjectFactory_3Test {

    @Test
    public void testCreatePages() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        assertNotNull(pages);
    }

    @Test
    public void testCreatePagesPageNumber() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setPageNumber(1);
        assertEquals(1, pages.getPageNumber());
    }

    @Test
    public void testCreatePagesPageSize() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setPageSize(10);
        assertEquals(10, pages.getPageSize());
    }

    @Test
    public void testCreatePagesTotalPages() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setTotalPages(5);
        assertEquals(5, pages.getTotalPages());
    }

    @Test
    public void testCreatePagesTotalRecords() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setTotalRecords(50);
        assertEquals(50, pages.getTotalRecords());
    }

    @Test
    public void testCreatePagesHasNextPage() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setHasNextPage(true);
        assertTrue(pages.isHasNextPage());
    }

    @Test
    public void testCreatePagesHasPreviousPage() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.setHasPreviousPage(true);
        assertTrue(pages.isHasPreviousPage());
    }

    @Test
    public void testCreatePagesRecords() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        assertNotNull(pages.getRecords());
    }

    @Test
    public void testCreatePagesRecordsEmpty() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        assertTrue(pages.getRecords().isEmpty());
    }

    @Test
    public void testCreatePagesRecordsSize() {
        ObjectFactory factory = new ObjectFactory();
        Pages pages = factory.createPages();
        pages.getRecords().add(new Object());
        pages.getRecords().add(new Object());
        assertEquals(2, pages.getRecords().size());
    }
}