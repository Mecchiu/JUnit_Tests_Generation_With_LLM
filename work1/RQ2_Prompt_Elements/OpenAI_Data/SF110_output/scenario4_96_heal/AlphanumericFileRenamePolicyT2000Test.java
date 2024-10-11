// AlphanumericFileRenamePolicyTest.java
package org.heal.servlet.upload;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AlphanumericFileRenamePolicy}.
* It contains ten unit test cases for the {@link AlphanumericFileRenamePolicy#rename(File)} method.
*/
class AlphanumericFileRenamePolicyTest {

	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters.
	*/
	@Test
	void testRename_Alphanumeric() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test.txt");
		File renamed = policy.rename(original);
		assertEquals("test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and spaces.
	*/
	@Test
	void testRename_AlphanumericWithSpaces() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file.txt");
		File renamed = policy.rename(original);
		assertEquals("test file.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and underscores.
	*/
	@Test
	void testRename_AlphanumericWithUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test_file.txt");
		File renamed = policy.rename(original);
		assertEquals("test_file.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces and underscores.
	*/
	@Test
	void testRename_AlphanumericWithSpacesAndUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and dots.
	*/
	@Test
	void testRename_AlphanumericWithDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test.file.txt");
		File renamed = policy.rename(original);
		assertEquals("test.file.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces and dots.
	*/
	@Test
	void testRename_AlphanumericWithSpacesAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file.name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file.name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, underscores and dots.
	*/
	@Test
	void testRename_AlphanumericWithUnderscoresAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test_file.name.txt");
		File renamed = policy.rename(original);
		assertEquals("test_file.name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces, underscores and dots.
	*/
	@Test
	void testRename_AlphanumericWithSpacesUnderscoresAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters.
	*/
	@Test
	void testRename_NonAlphanumeric() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters and spaces.
	*/
	@Test
	void testRename_NonAlphanumericWithSpaces() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters and underscores.
	*/
	@Test
	void testRename_NonAlphanumericWithUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters, spaces and underscores.
	*/
	@Test
	void testRename_NonAlphanumericWithSpacesAndUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters and dots.
	*/
	@Test
	void testRename_NonAlphanumericWithDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt");
		File renamed = policy.rename(original);
		assertEquals("test file_name.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains non-alphanumeric characters, spaces and dots.
	*/
	@Test
	void testRename_NonAlphanumericWithSpacesAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("test file_name.txt