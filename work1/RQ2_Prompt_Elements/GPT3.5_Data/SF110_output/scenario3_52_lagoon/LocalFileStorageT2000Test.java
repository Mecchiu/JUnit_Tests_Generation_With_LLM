// Here's an implementation of the LocalFileStorageTest class:

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LocalFileStorageTest {

    @Test
    void testFileLastModified_fileExists() throws IOException {
        // Create a temporary file and get its last modified time
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        FileTime expectedLastModified = Files.getLastModifiedTime(tempFile.toPath());

        // Call the fileLastModified method and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(tempFile.getAbsolutePath());
        assertEquals(expectedLastModified.to(TimeUnit.MILLISECONDS), actualLastModified);

        // Delete the temporary file
        tempFile.delete();
    }

    @Test
    void testFileLastModified_fileDoesNotExist() {
        // Call the fileLastModified method with a non-existent file and assert that it returns 0
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified("nonexistent.txt");
        assertEquals(0, actualLastModified);
    }

    @Test
    void testFileLastModified_fileLastModifiedNotAvailable() throws IOException {
        // Create a temporary file and set its last modified time to null
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        tempFile.setLastModified(0);

        // Call the fileLastModified method and assert that it returns -1
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(tempFile.getAbsolutePath());
        assertEquals(-1, actualLastModified);

        // Delete the temporary file
        tempFile.delete();
    }

    @Test
    void testFileLastModified_directory() throws IOException {
        // Create a temporary directory and get its last modified time
        File tempDir = Files.createTempDirectory("test").toFile();
        FileTime expectedLastModified = Files.getLastModifiedTime(tempDir.toPath());

        // Call the fileLastModified method with the directory and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(tempDir.getAbsolutePath());
        assertEquals(expectedLastModified.to(TimeUnit.MILLISECONDS), actualLastModified);

        // Delete the temporary directory
        tempDir.delete();
    }

    @Test
    void testFileLastModified_symlinkToFile() throws IOException {
        // Create a temporary file and a symbolic link to it
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        File symlink = new File(tempFile.getParentFile(), "symlink.txt");
        Files.createSymbolicLink(symlink.toPath(), tempFile.toPath());

        // Get the expected last modified time of the file
        FileTime expectedLastModified = Files.getLastModifiedTime(tempFile.toPath());

        // Call the fileLastModified method with the symlink and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(symlink.getAbsolutePath());
        assertEquals(expectedLastModified.to(TimeUnit.MILLISECONDS), actualLastModified);

        // Delete the temporary file and symlink
        tempFile.delete();
        symlink.delete();
    }

    @Test
    void testFileLastModified_symlinkToDirectory() throws IOException {
        // Create a temporary directory and a symbolic link to it
        File tempDir = Files.createTempDirectory("test").toFile();
        File symlink = new File(tempDir.getParentFile(), "symlink");
        Files.createSymbolicLink(symlink.toPath(), tempDir.toPath());

        // Get the expected last modified time of the directory
        FileTime expectedLastModified = Files.getLastModifiedTime(tempDir.toPath());

        // Call the fileLastModified method with the symlink and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(symlink.getAbsolutePath());
        assertEquals(expectedLastModified.to(TimeUnit.MILLISECONDS), actualLastModified);

        // Delete the temporary directory and symlink
        tempDir.delete();
        symlink.delete();
    }

    @Test
    void testFileLastModified_absolutePath() throws IOException {
        // Create a temporary file and get its absolute path
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        String absolutePath = tempFile.getAbsolutePath();

        // Call the fileLastModified method with the absolute path and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(absolutePath);
        assertEquals(tempFile.lastModified(), actualLastModified);

        // Delete the temporary file
        tempFile.delete();
    }

    @Test
    void testFileLastModified_relativePath() throws IOException {
        // Create a temporary file and get its relative path
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        String relativePath = tempFile.getName();

        // Call the fileLastModified method with the relative path and assert that it returns the expected time
        LocalFileStorage storage = new LocalFileStorage();
        long actualLastModified = storage.fileLastModified(relativePath);
        assertEquals(tempFile.lastModified(), actualLastModified);

        // Delete the temporary file
        tempFile.delete();
    }

    @Test
    void testFileLastModified_nullPath() {
        // Call the fileLastModified method with a null path and assert that it throws an IllegalArgumentException
        LocalFileStorage storage = new LocalFileStorage();
        assertThrows(IllegalArgumentException.class, () -> storage.fileLastModified(null));
    }

    @Test
    void testFileLastModified_emptyPath() {
        // Call the fileLastModified method with an empty path and assert that it throws an IllegalArgumentException
        LocalFileStorage storage = new LocalFileStorage();
        assertThrows(IllegalArgumentException.class, () -> storage.fileLastModified(""));
    }

}