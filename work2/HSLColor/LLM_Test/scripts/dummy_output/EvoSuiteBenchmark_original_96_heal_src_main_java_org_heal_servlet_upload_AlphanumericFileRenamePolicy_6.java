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
	* Constructor for {@link AlphanumericFileRenamePolicyTest}.
	*/
	public AlphanumericFileRenamePolicyTest() {
	}
	
	/**
	* Test of {@link AlphanumericFileRenamePolicy#rename(File)}
     */
	@Test
	public void rename_1() throws Exception {
		File file = newFile("test/");
		AlphanumericFileRenamePolicy rename = new AlphanumericFileRenamePolicy();

		String result = rename.rename(file);
		
		System.out.println(result);
		
		file.delete();
		assertNull(rename.rename(file));
	}

	/**
	* Constructor for {@link AlphanumericFileRenamePolicyTest}.
	*/
	public static class AlphanumericFileRenamePolicyTestInitStub extends AlphanumericFileRenamePolicyTest {
		
	}

	/**
	* Test of {@link AlphanumericFileRenamePolicy#rename(File)}
     */
	@Test
	public void rename_2() throws Exception {

	}

}