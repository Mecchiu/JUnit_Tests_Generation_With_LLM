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
		File original = new File("C:\\Users\\User\\Desktop\\test.txt");
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
		File original = new File("C:\\Users\\User\\Desktop\\test test.txt");
		File renamed = policy.rename(original);
		assertEquals("test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and underscores.
	*/
	@Test
	void testRename_AlphanumericWithUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test_test.txt");
		File renamed = policy.rename(original);
		assertEquals("test_test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces and underscores.
	*/
	@Test
	void testRename_AlphanumericWithSpacesAndUnderscores() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test_test test.txt");
		File renamed = policy.rename(original);
		assertEquals("test_test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and dots.
	*/
	@Test
	void testRename_AlphanumericWithDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test.test.txt");
		File renamed = policy.rename(original);
		assertEquals("test.test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces and dots.
	*/
	@Test
	void testRename_AlphanumericWithSpacesAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test.test test.txt");
		File renamed = policy.rename(original);
		assertEquals("test.test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, underscores and dots.
	*/
	@Test
	void testRename_AlphanumericWithUnderscoresAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test_test.test.txt");
		File renamed = policy.rename(original);
		assertEquals("test_test.test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces, underscores and dots.
	*/
	@Test
	void testRename_AlphanumericWithSpacesUnderscoresAndDots() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test_test.test test.txt");
		File renamed = policy.rename(original);
		assertEquals("test_test.test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains alphanumeric characters, spaces, underscores, dots and non-alphanumeric characters.
	*/
	@Test
	void testRename_AlphanumericWithSpacesUnderscoresDotsAndNonAlphanumeric() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\test_test.test test!@#$%^&*()_+-=[]{};':\",./<>?.txt");
		File renamed = policy.rename(original);
		assertEquals("test_test.test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters.
	*/
	@Test
	void testRename_NonAlphanumeric() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("C:\\Users\\User\\Desktop\\!@#$%^&*()_+-=[]{};':\",./<>?.txt");
		File renamed = policy.rename(original);
		assertEquals("", renamed.getName());
	}
}