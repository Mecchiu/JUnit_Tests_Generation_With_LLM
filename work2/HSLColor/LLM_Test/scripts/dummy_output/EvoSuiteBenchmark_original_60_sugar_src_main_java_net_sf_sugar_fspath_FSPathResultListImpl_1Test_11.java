// FSPathResultListImpl_1Test.java
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
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		/**
		 * Tests whether the {@link FSPathResultListImpl#delete()} returns a success or failures.
		 * {@link FSPathResultListImpl#delete()} should fail as a deletion of a file which doesn't exist.
		*/
		@Test
		void testDeleteSuccess()
		{
			FSPathResult modifiedItem1 = new FSPathResultImpl(new File(
            "/file/a-file/in-non-exist-directory/in-subdir/an-in-non-exist-file.log"));
}
}