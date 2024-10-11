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
	public void testRename_Alphanumeric() {
		File original = new File("test.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and spaces.
	*/
	@Test
	public void testRename_AlphanumericWithSpaces() {
		File original = new File("test test.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and underscores.
	*/
	@Test
	public void testRename_AlphanumericWithUnderscores() {
		File original = new File("test_test.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test_test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and periods.
	*/
	@Test
	public void testRename_AlphanumericWithPeriods() {
		File original = new File("test.test.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test.test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters, spaces, underscores and periods.
	*/
	@Test
	public void testRename_AlphanumericWithSpacesUnderscoresAndPeriods() {
		File original = new File("test test_test.test.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test test_test.test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only alphanumeric characters and non-alphanumeric characters.
	*/
	@Test
	public void testRename_AlphanumericWithNonAlphanumeric() {
		File original = new File("test!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("test.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters.
	*/
	@Test
	public void testRename_NonAlphanumeric() {
		File original = new File("!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals(".txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters and spaces.
	*/
	@Test
	public void testRename_NonAlphanumericWithSpaces() {
		File original = new File("!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~ !@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals(".txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters and underscores.
	*/
	@Test
	public void testRename_NonAlphanumericWithUnderscores() {
		File original = new File("!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~_!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals("_.txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters and periods.
	*/
	@Test
	public void testRename_NonAlphanumericWithPeriods() {
		File original = new File("!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals(".txt", renamed.getName());
	}
	
	/**
	* Test case for {@link AlphanumericFileRenamePolicy#rename(File)} method.
	* It tests the case when the file name contains only non-alphanumeric characters, spaces, underscores and periods.
	*/
	@Test
	public void testRename_NonAlphanumericWithSpacesUnderscoresAndPeriods() {
		File original = new File("!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~ !@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~_!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?`~.txt");
		AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
		File renamed = policy.rename(original);
		assertEquals(".txt", renamed.getName());
	}
}