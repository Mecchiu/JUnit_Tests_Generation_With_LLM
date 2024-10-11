Here's an example implementation of the `MapFilesListerTest` class with ten unit test cases for the `ListMaps` method:

```
class MapFilesListerTest {
    private static final String TEST_DIR = "test/maps";
    private static final String NON_EXISTENT_DIR = "nonexistent";
    private static final String EMPTY_DIR = "test/empty";
    private static final String NON_XML_FILE = "test/maps/not_a_map.txt";
    private static final String XML_FILE = "test/maps/map.xml";
    private static final String MULTIPLE_XML_FILES_DIR = "test/maps/multiple";
    private static final String SUBDIR_XML_FILE = "test/maps/subdir/map.xml";
    private static final String SUBDIR_NON_XML_FILE = "test/maps/subdir/not_a_map.txt";
    private static final String SUBDIR_EMPTY_DIR = "test/maps/subdir/empty";

    private MapFilesLister lister = new MapFilesLister();

    @Test
    void testListMapsNonExistentDir() {
        Vector<File> files = lister.ListMaps(NON_EXISTENT_DIR);
        assertTrue(files.isEmpty());
    }

    @Test
    void testListMapsEmptyDir() {
        Vector<File> files = lister.ListMaps(EMPTY_DIR);
        assertTrue(files.isEmpty());
    }

    @Test
    void testListMapsNonXmlFile() {
        Vector<File> files = lister.ListMaps(NON_XML_FILE);
        assertTrue(files.isEmpty());
    }

    @Test
    void testListMapsSingleXmlFile() {
        Vector<File> files = lister.ListMaps(XML_FILE);
        assertEquals(1, files.size());
        assertEquals(XML_FILE, files.get(0).getPath());
    }

    @Test
    void testListMapsMultipleXmlFiles() {
        Vector<File> files = lister.ListMaps(MULTIPLE_XML_FILES_DIR);
        assertEquals(2, files.size());
        assertTrue(files.contains(new File(MULTIPLE_XML_FILES_DIR + "/map1.xml")));
        assertTrue(files.contains(new File(MULTIPLE_XML_FILES_DIR + "/map2.xml")));
    }

    @Test
    void testListMapsSubdirXmlFile() {
        Vector<File> files = lister.ListMaps(SUBDIR_XML_FILE);
        assertEquals(1, files.size());
        assertEquals(SUBDIR_XML_FILE, files.get(0).getPath());
    }

    @Test
    void testListMapsSubdirNonXmlFile() {
        Vector<File> files = lister.ListMaps(SUBDIR_NON_XML_FILE);
        assertTrue(files.isEmpty());
    }

    @Test
    void testListMapsSubdirEmptyDir() {
        Vector<File> files = lister.ListMaps(SUBDIR_EMPTY_DIR);
        assertTrue(files.isEmpty());
    }

    @Test
    void testListMapsNullDir() {
        assertThrows(NullPointerException.class, () -> lister.ListMaps(null));
    }
}
```

Note that this implementation assumes the following directory structure:

```
test/
└── maps/
    ├── empty/
    ├── map.xml
    ├── multiple/
    │   ├── map1.xml
    │   └── map2.xml
    └── subdir/
        ├── empty/
        ├── map.xml
        └── not_a_map.txt
```