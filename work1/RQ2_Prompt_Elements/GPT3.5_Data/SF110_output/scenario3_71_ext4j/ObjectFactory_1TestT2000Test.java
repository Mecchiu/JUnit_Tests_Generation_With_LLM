// Test case for ObjectFactory.createStaticPage()
@Test
void testCreateStaticPage() {
    ObjectFactory factory = new ObjectFactory();
    StaticPage staticPage = factory.createStaticPage();
    assertNotNull(staticPage);
    assertEquals(StaticPage.class, staticPage.getClass());
} 

// Additional test cases for other factory methods can be added here
}