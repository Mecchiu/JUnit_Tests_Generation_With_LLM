Here's an example implementation of the `MapFilesListerTest` class with ten unit test cases for the `ListMaps` method:

```
class MapFilesListerTest {
    private static final String TEST_DIR = "test/maps";
    private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);

    @Test
    void testListMapsReturnsEmptyListWhenDirectoryIsEmpty() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/empty");
        assertTrue(maps.isEmpty());
    }

    @Test
    void testListMapsReturnsOnlyXMLFiles() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/mixed");
        for (File map : maps) {
            assertTrue(map.getName().endsWith(".xml"));
        }
    }

    @Test
    void testListMapsReturnsAllXMLFiles() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/all_xml");
        assertEquals(3, maps.size());
    }

    @Test
    void testListMapsReturnsNoNonXMLFiles() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/no_xml");
        assertTrue(maps.isEmpty());
    }

    @Test
    void testListMapsReturnsFilesInAlphabeticalOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/alphabetical");
        assertEquals("map1.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map3.xml", maps.get(2).getName());
    }

    @Test
    void testListMapsReturnsFilesInReverseAlphabeticalOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/reverse_alphabetical");
        assertEquals("map3.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map1.xml", maps.get(2).getName());
    }

    @Test
    void testListMapsReturnsFilesInCreationOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/creation_order");
        assertEquals("map1.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map3.xml", maps.get(2).getName());
    }

    @Test
    void testListMapsReturnsFilesInReverseCreationOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/reverse_creation_order");
        assertEquals("map3.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map1.xml", maps.get(2).getName());
    }

    @Test
    void testListMapsReturnsFilesInModificationOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/modification_order");
        assertEquals("map1.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map3.xml", maps.get(2).getName());
    }

    @Test
    void testListMapsReturnsFilesInReverseModificationOrder() {
        MapFilesLister lister = new MapFilesLister();
        List<File> maps = lister.ListMaps(TEST_DIR + "/reverse_modification_order");
        assertEquals("map3.xml", maps.get(0).getName());
        assertEquals("map2.xml", maps.get(1).getName());
        assertEquals("map1.xml", maps.get(2).getName());
    }
}
```

Note that this implementation assumes the existence of a `test/maps` directory with subdirectories containing the test cases. You may need to modify the directory paths to match your own project structure.