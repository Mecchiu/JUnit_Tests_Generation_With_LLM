// Here's a sample code for the FSPathResultListImpl_0Test class

package net.sf.sugar.fspath;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class FSPathResultListImpl_0Test {

    @Test
    void testEach() throws IOException {
        // Create a mock callback object
        Callback callback = mock(Callback.class);

        // Create a new FSPathResultListImpl object
        FSPathResultListImpl resultList = new FSPathResultListImpl();

        // Add some FSPathResult objects to the list
        resultList.add(new FSPathResult(new File("file1.txt")));
        resultList.add(new FSPathResult(new File("file2.txt")));
        resultList.add(new FSPathResult(new File("file3.txt")));

        // Call the each() method with the mock callback object
        resultList.each(callback);

        // Verify that the callback's call() method was called for each FSPathResult object in the list
        verify(callback).call(resultList.get(0));
        verify(callback).call(resultList.get(1));
        verify(callback).call(resultList.get(2));
    }

    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
        // Create a new FSPathResultListImpl object
        FSPathResultListImpl resultList = new FSPathResultListImpl();

        // Add some FSPathResult objects to the list
        resultList.add(new FSPathResult(new File("file1.txt")));
        resultList.add(new FSPathResult(new File("file2.txt")));
        resultList.add(new FSPathResult(new File("file3.txt")));

        // Call the delete() method
        FSPathResultModificationList deletedFiles = resultList.delete();

        // Verify that the deletedFiles list contains the expected number of successes and failures
        assertEquals(3, deletedFiles.getSuccesses().size());
        assertEquals(0, deletedFiles.getFailures().size());
    }

    @Test
    void testCopy() throws IOException, OperationNotPermittedException {
        // Create a new FSPathResultListImpl object
        FSPathResultListImpl resultList = new FSPathResultListImpl();

        // Add some FSPathResult objects to the list
        resultList.add(new FSPathResult(new File("file1.txt")));
        resultList.add(new FSPathResult(new File("file2.txt")));
        resultList.add(new FSPathResult(new File("file3.txt")));

        // Call the copy() method with a destination directory path
        FSPathResultModificationList copiedFiles = resultList.copy("/path/to/destination");

        // Verify that the copiedFiles list contains the expected number of successes and failures
        assertEquals(3, copiedFiles.getSuccesses().size());
        assertEquals(0, copiedFiles.getFailures().size());
    }

    @Test
    void testRename() throws IOException, OperationNotPermittedException {
        // Create a new FSPathResultListImpl object
        FSPathResultListImpl resultList = new FSPathResultListImpl();

        // Add some FSPathResult objects to the list
        resultList.add(new FSPathResult(new File("file1.txt")));
        resultList.add(new FSPathResult(new File("file2.txt")));
        resultList.add(new FSPathResult(new File("file3.txt")));

        // Call the rename() method with a match expression and a replace expression
        FSPathResultModificationList renamedFiles = resultList.rename("(.*)\\.txt", "$1_renamed.txt");

        // Verify that the renamedFiles list contains the expected number of successes and failures
        assertEquals(3, renamedFiles.getSuccesses().size());
        assertEquals(0, renamedFiles.getFailures().size());
    }

    @Test
    void testMove() throws IOException, OperationNotPermittedException {
        // Create a new FSPathResultListImpl object
        FSPathResultListImpl resultList = new FSPathResultListImpl();

        // Add some FSPathResult objects to the list
        resultList.add(new FSPathResult(new File("file1.txt")));
        resultList.add(new FSPathResult(new File("file2.txt")));
        resultList.add(new FSPathResult(new File("file3.txt")));

        // Call the move() method with a destination directory path
        FSPathResultModificationList movedFiles = resultList.move("/path/to/destination");

        // Verify that the movedFiles list contains the expected number of successes and failures
        assertEquals(3, movedFiles.getSuccesses().size());
        assertEquals(0, movedFiles.getFailures().size());
    }
}