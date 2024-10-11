// Test case for ObjectFactory.createPage() method
public class ObjectFactory_0Test {

    @Test
    public void testCreatePage() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        assertNotNull(page);
        assertEquals(0, page.getPageNumber());
        assertEquals(0, page.getPageSize());
        assertNull(page.getSortBy());
        assertNull(page.getSortOrder());
        assertNull(page.getFilter());
    }

    @Test
    public void testCreatePageWithPageNumber() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        page.setPageNumber(1);
        assertEquals(1, page.getPageNumber());
    }

    @Test
    public void testCreatePageWithPageSize() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        page.setPageSize(10);
        assertEquals(10, page.getPageSize());
    }

    @Test
    public void testCreatePageWithSortBy() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        page.setSortBy("name");
        assertEquals("name", page.getSortBy());
    }

    @Test
    public void testCreatePageWithSortOrder() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        page.setSortOrder("asc");
        assertEquals("asc", page.getSortOrder());
    }

    @Test
    public void testCreatePageWithFilter() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        Filter filter = new Filter();
        filter.setField("name");
        filter.setValue("John");
        page.setFilter(filter);
        assertEquals(filter, page.getFilter());
    }

    @Test
    public void testCreatePageWithNullFilter() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        page.setFilter(null);
        assertNull(page.getFilter());
    }

    @Test
    public void testCreatePageWithEmptyFilter() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        Filter filter = new Filter();
        page.setFilter(filter);
        assertNull(page.getFilter().getField());
        assertNull(page.getFilter().getValue());
    }

    @Test
    public void testCreatePageWithFilterField() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        Filter filter = new Filter();
        filter.setField("name");
        page.setFilter(filter);
        assertEquals("name", page.getFilter().getField());
        assertNull(page.getFilter().getValue());
    }

    @Test
    public void testCreatePageWithFilterValue() {
        ObjectFactory factory = new ObjectFactory();
        Page page = factory.createPage();
        Filter filter = new Filter();
        filter.setValue("John");
        page.setFilter(filter);
        assertNull(page.getFilter().getField());
        assertEquals("John", page.getFilter().getValue());
    }
}