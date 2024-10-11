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
/**
		 * Create a new instance of the test class with a modified
		 * original file reference.
		 */
	@Test
	void setOriginalTest() {
		AlphanumericFileRenamePolicy actual = new AlphanumericFileRenamePolicy();
		actual.setOriginal(new File(""));
		
		String testOriginal =
				stripSpecialCharacters(
						actual.getOriginal()
					.toString());
		
		assertEquals("Original file reference", testOriginal);

		String testRef = actual.rename(new File(""));
		
		assertEquals("Stripped Reference", testRef);
		
		File notStripped = new File("");
		notStripped.delete();
		
		assertEquals("Original reference", actual.getOriginal());
	}
						/**
						* Test of {@link AlphanumericFileRenamePolicy#stripSpecialCharacters(String)}.
						*/
	@Test
	void stripSpecialCharactersTest() {
		AlphanumericFileRenamePolicy actual = new AlphanumericFileRenamePolicy();
		actual.setOriginal(new File(""));
		
		String test = actual.getOriginal().toString();
		
		actual.setOriginal(new File("Foo"));
		actual.stripSpecialCharacters(test);
		
		String expectedTest =
				stripSpecialCharacters(
						actual.getOriginal().toString());
		expectedTest.equals("Foo");
		
		assertEquals("Stripped Reference", actual.getOriginal());
	}
	
}// AlphanumericFileRenamePolicyTest



