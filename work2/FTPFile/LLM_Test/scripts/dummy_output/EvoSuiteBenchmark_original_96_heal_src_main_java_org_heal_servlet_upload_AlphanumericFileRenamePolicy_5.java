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
	 * Tests {@link AlphanumericFileRenamePolicy#rename(File)}.
	*/
	@Test
	void rename() {

		String filename = "AlphanumericFilename";

		AlphanumericFileRenamePolicy tb = new AlphanumericFileRenamePolicy(filename);

		File original = new File("fileName.txt");

		assertEquals( original.getName(), tb.rename( original ) );
	}

		
	/**
	 * Tests {@link AlphanumericFileRenamePolicy#stripSpecialCharacters(String)}
	 * @throws Exception
	 *
	 */
	@Test
	void stripSpecialCharacters() throws Exception {

        String s = "  *     *     #1   3*2   4*5    #2   3       #1   3   4  .+!?";
		String r = "AlphanumericFilename.txt";

		AlphanumericFileRenamePolicy tb = new AlphanumericFileRenamePolicy(r);

		File original = new File("");

		assertNull(tb.rename( original ));

		assertEquals( r + " should fail. It's a line starting here.", "AlphanumericFilename.txt", tb.rename( original ) );

		String r1 = r + " should fail. It's a line starting here.";

		assertEquals(r1,tb.rename(new File("")).getName());

		// TODO: Implement the following tests for the file object.
		// assertEquals( r1, tb.rename(original).getName() );
	}
}