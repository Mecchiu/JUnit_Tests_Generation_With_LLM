// FSPathResultListImplTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImplTest {

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of a single file.
	 */
	@Test
	public void testDelete_SingleFile() throws Exception {
		System.out.println("delete_SingleFile");
		
		// Create a temporary file
		File tempFile = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Create a FSPathResultListImpl object
		FSPathResultListImpl instance = new FSPathResultListImpl();
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile));
		
		// Delete the temporary file
		FSPathResultModificationList result = instance.delete();
		
		// Check that the temporary file was deleted
		assertFalse(tempFile.exists());
		
		// Check that the FSPathResultModificationListImpl object contains one success
		assertEquals(1, result.getSuccesses().size());
		
		// Check that the FSPathResultModificationListImpl object contains no failures
		assertEquals(0, result.getFailures().size());
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of multiple files.
	 */
	@Test
	public void testDelete_MultipleFiles() throws Exception {
		System.out.println("delete_MultipleFiles");
		
		// Create a temporary file
		File tempFile1 = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Create a temporary file
		File tempFile2 = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Create a FSPathResultListImpl object
		FSPathResultListImpl instance = new FSPathResultListImpl();
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile1));
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile2));
		
		// Delete the temporary files
		FSPathResultModificationList result = instance.delete();
		
		// Check that the temporary file was deleted
		assertFalse(tempFile1.exists());
		
		// Check that the temporary file was deleted
		assertFalse(tempFile2.exists());
		
		// Check that the FSPathResultModificationListImpl object contains two successes
		assertEquals(2, result.getSuccesses().size());
		
		// Check that the FSPathResultModificationListImpl object contains no failures
		assertEquals(0, result.getFailures().size());
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of a single file that doesn't exist.
	 */
	@Test
	public void testDelete_SingleFileDoesntExist() throws Exception {
		System.out.println("delete_SingleFileDoesntExist");
		
		// Create a temporary file
		File tempFile = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Delete the temporary file
		tempFile.delete();
		
		// Create a FSPathResultListImpl object
		FSPathResultListImpl instance = new FSPathResultListImpl();
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile));
		
		// Delete the temporary file
		FSPathResultModificationList result = instance.delete();
		
		// Check that the temporary file was deleted
		assertFalse(tempFile.exists());
		
		// Check that the FSPathResultModificationListImpl object contains no successes
		assertEquals(0, result.getSuccesses().size());
		
		// Check that the FSPathResultModificationListImpl object contains one failure
		assertEquals(1, result.getFailures().size());
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of multiple files, one of which doesn't exist.
	 */
	@Test
	public void testDelete_MultipleFilesOneDoesntExist() throws Exception {
		System.out.println("delete_MultipleFilesOneDoesntExist");
		
		// Create a temporary file
		File tempFile1 = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Create a temporary file
		File tempFile2 = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Delete the temporary file
		tempFile2.delete();
		
		// Create a FSPathResultListImpl object
		FSPathResultListImpl instance = new FSPathResultListImpl();
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile1));
		
		// Add the temporary file to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempFile2));
		
		// Delete the temporary files
		FSPathResultModificationList result = instance.delete();
		
		// Check that the temporary file was deleted
		assertFalse(tempFile1.exists());
		
		// Check that the temporary file was deleted
		assertFalse(tempFile2.exists());
		
		// Check that the FSPathResultModificationListImpl object contains one success
		assertEquals(1, result.getSuccesses().size());
		
		// Check that the FSPathResultModificationListImpl object contains one failure
		assertEquals(1, result.getFailures().size());
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of a single file that is a directory.
	 */
	@Test
	public void testDelete_SingleFileIsDirectory() throws Exception {
		System.out.println("delete_SingleFileIsDirectory");
		
		// Create a temporary directory
		File tempDir = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Delete the temporary directory
		tempDir.delete();
		
		// Create the temporary directory
		tempDir.mkdir();
		
		// Create a FSPathResultListImpl object
		FSPathResultListImpl instance = new FSPathResultListImpl();
		
		// Add the temporary directory to the FSPathResultListImpl object
		instance.add(new FSPathResultImpl(tempDir));
		
		// Delete the temporary directory
		FSPathResultModificationList result = instance.delete();
		
		// Check that the temporary directory was deleted
		assertFalse(tempDir.exists());
		
		// Check that the FSPathResultModificationListImpl object contains one success
		assertEquals(1, result.getSuccesses().size());
		
		// Check that the FSPathResultModificationListImpl object contains no failures
		assertEquals(0, result.getFailures().size());
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case tests the deletion of multiple files, one of which is a directory.
	 */
	@Test
	public void testDelete_MultipleFilesOneIsDirectory() throws Exception {
		System.out.println("delete_MultipleFilesOneIsDirectory");
		
		// Create a temporary file
		File tempFile1 = File.createTempFile("FSPathResultListImplTest", ".tmp");
		
		// Create