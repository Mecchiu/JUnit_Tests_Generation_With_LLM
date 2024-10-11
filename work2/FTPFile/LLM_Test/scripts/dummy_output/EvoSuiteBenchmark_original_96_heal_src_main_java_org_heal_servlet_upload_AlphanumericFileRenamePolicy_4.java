// AlphanumericFileRenamePolicyTest.java
package org.heal.servlet.upload;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AlphanumericFileRenamePolicy}.
* It contains one unit test case for the {@link AlphanumericFileRenamePolicy#rename(File)} method.
*/
class AlphanumericFileRenamePolicyTest {
		
	@Test
	public void test_normalFile() {
		File file = new File("test_file.txt");
		String str = "HELLO";
		String normalFile = "test_file.txt";
		
        assertEquals("test_stored_file", stripSpecialCharacters(normalFile));
		assertEquals(str, rename(file) );
	}

	@Test
	public void test_invalidFile() {
		File file = new File("test_file.txt");
		String str = "Hello";
		String invalidFile = "test_file.txt";
	
		try {
			assertEquals(str, rename(invalidFile));
		} catch (IllegalArgumentException e) {
			fail("rename(invalidFile) should return null");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_noFile() {
		String str = "HELLO";
		String validFile = "testFile.txt";
		String invalidFile = "";
	
		DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy("test_file.txt", validFile);
		assertEquals(str, policy.rename(new File(invalidFile)));
	}

	@Test
	public void test_emptyFile() {
		File file = new File("test_file.txt");
		String str = "";
	
		DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy(file.getName(), validFile);
		str = stripSpecialCharacters(str);
	
		assertEquals(str, policy.rename(new File("")));
	}

	@Test
	public void test_noFile() {
		String str = "";
		String validFile = "";
	
			DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy(validFile, validFile);
			assertEquals(str, policy.rename(new File("")));
	}
}