// Here's a sample test class for the FSPathResultListImpl's delete() method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

class FSPathResultListImpl_1Test {

    @Test
    void testDeleteSingleFile() throws IOException, OperationNotPermittedException {
        File file = File.createTempFile("test", ".txt");
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file));
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getSuccesses().contains(file));
        assertFalse(file.exists());
    }

    @Test
    void testDeleteMultipleFiles() throws IOException, OperationNotPermittedException {
        File file1 = File.createTempFile("test1", ".txt");
        File file2 = File.createTempFile("test2", ".txt");
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file1));
        resultList.add(new FSPathResult(file2));
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getSuccesses().contains(file1));
        assertTrue(deletionList.getSuccesses().contains(file2));
        assertFalse(file1.exists());
        assertFalse(file2.exists());
    }

    @Test
    void testDeleteNonExistentFile() throws IOException, OperationNotPermittedException {
        File file = new File("nonexistent.txt");
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file));
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getFailures().contains(file));
        assertFalse(file.exists());
    }

    @Test
    void testDeleteDirectory() throws IOException, OperationNotPermittedException {
        File dir = new File("testdir");
        dir.mkdir();
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(dir));
        assertThrows(OperationNotPermittedException.class, () -> resultList.delete());
        assertTrue(dir.exists());
        dir.delete();
    }

    @Test
    void testDeleteNonFileObject() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult("not a file"));
        assertThrows(OperationNotPermittedException.class, () -> resultList.delete());
    }

    @Test
    void testDeleteEmptyList() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getSuccesses().isEmpty());
        assertTrue(deletionList.getFailures().isEmpty());
    }

    @Test
    void testDeleteMixedList() throws IOException, OperationNotPermittedException {
        File file1 = File.createTempFile("test1", ".txt");
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file1));
        resultList.add(new FSPathResult("not a file"));
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getSuccesses().contains(file1));
        assertTrue(deletionList.getFailures().size() == 1);
        assertFalse(file1.exists());
    }

    @Test
    void testDeleteReadOnlyFile() throws IOException, OperationNotPermittedException {
        File file = File.createTempFile("test", ".txt");
        file.setReadOnly();
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file));
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getFailures().contains(file));
        assertTrue(file.exists());
        file.setWritable(true);
        file.delete();
    }

    @Test
    void testDeleteIOException() throws IOException, OperationNotPermittedException {
        File file = File.createTempFile("test", ".txt");
        file.setWritable(false);
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file));
        assertThrows(IOException.class, () -> resultList.delete());
        assertTrue(file.exists());
        file.setWritable(true);
        file.delete();
    }

    @Test
    void testDeleteException() throws IOException, OperationNotPermittedException {
        File file = File.createTempFile("test", ".txt");
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(file) {
            @Override
            public File getFile() {
                throw new RuntimeException("Test exception");
            }
        });
        FSPathResultModificationList deletionList = resultList.delete();
        assertTrue(deletionList.getFailures().contains(file));
        assertTrue(file.exists());
        file.delete();
    }
}