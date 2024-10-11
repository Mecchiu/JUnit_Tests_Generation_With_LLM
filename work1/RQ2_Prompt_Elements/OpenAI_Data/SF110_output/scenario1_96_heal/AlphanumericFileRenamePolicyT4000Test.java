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
		File original = new File("abc123.txt");
		File renamed = policy.rename(original);
		assertEquals(original, renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters.
	*/
	@Test
	void testRename_NonAlphanumeric() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("!@#$%^&*()_+-=[]{};':\",./<>?`~.txt");
		File renamed = policy.rename(original);
		assertEquals(new File(".txt"), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains both alphanumeric and non-alphanumeric characters.
	*/
	@Test
	void testRename_Mixed() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("abc123!@#$%^&*()_+-=[]{};':\",./<>?`~.txt");
		File renamed = policy.rename(original);
		assertEquals(new File("abc123.txt"), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and the file extension is empty.
	*/
	@Test
	void testRename_Alphanumeric_EmptyExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("abc123");
		File renamed = policy.rename(original);
		assertEquals(original, renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters and the file extension is empty.
	*/
	@Test
	void testRename_NonAlphanumeric_EmptyExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("!@#$%^&*()_+-=[]{};':\",./<>?`~");
		File renamed = policy.rename(original);
		assertEquals(new File(""), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains both alphanumeric and non-alphanumeric characters and the file extension is empty.
	*/
	@Test
	void testRename_Mixed_EmptyExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("abc123!@#$%^&*()_+-=[]{};':\",./<>?`~");
		File renamed = policy.rename(original);
		assertEquals(new File("abc123"), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and the file extension is null.
	*/
	@Test
	void testRename_Alphanumeric_NullExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("abc123");
		original.setPath("abc123");
		File renamed = policy.rename(original);
		assertEquals(original, renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters and the file extension is null.
	*/
	@Test
	void testRename_NonAlphanumeric_NullExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("!@#$%^&*()_+-=[]{};':\",./<>?`~");
		original.setPath("!@#$%^&*()_+-=[]{};':\",./<>?`~");
		File renamed = policy.rename(original);
		assertEquals(new File(""), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains both alphanumeric and non-alphanumeric characters and the file extension is null.
	*/
	@Test
	void testRename_Mixed_NullExtension() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = new File("abc123!@#$%^&*()_+-=[]{};':\",./<>?`~");
		original.setPath("abc123!@#$%^&*()_+-=[]{};':\",./<>?`~");
		File renamed = policy.rename(original);
		assertEquals(new File("abc123"), renamed);
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name is null.
	*/
	@Test
	void testRename_Null() {
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File original = null;
		File renamed = policy.rename(original);
		assertNull(renamed);
	}
}