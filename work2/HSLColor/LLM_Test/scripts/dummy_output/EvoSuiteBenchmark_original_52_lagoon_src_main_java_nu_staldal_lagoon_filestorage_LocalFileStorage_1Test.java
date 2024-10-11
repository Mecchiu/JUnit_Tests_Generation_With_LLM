package nu.staldal.lagoon.filestorage;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalFileStorage_1Test {

    @Test
    void testFileLastModified_FileExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/test_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_FileNotExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/non_existing_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_SubDirectoryExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/subdir/test_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_SubDirectoryNotExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/non_existing_subdir/test_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_InvalidPath() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("invalid_path");
        fileStorage.close();
        assertEquals(-1, lastModified);
    }

    @Test
    void testFileLastModified_EmptyPath() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("");
        fileStorage.close();
        assertEquals(-1, lastModified);
    }

    @Test
    void testFileLastModified_NullPath() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified(null);
        fileStorage.close();
        assertEquals(-1, lastModified);
    }

    @Test
    void testFileLastModified_RootDirectory() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_ExistingFile() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/test_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }

    @Test
    void testFileLastModified_NonExistingFile() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        fileStorage.open("test_directory", new LagoonContext(), null);
        long lastModified = fileStorage.fileLastModified("test_directory/non_existing_file.txt");
        fileStorage.close();
        assertEquals(0, lastModified);
    }
}
