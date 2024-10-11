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
		 * Test if remove returns True
		 */
		@Test
		public void FSPathResult_1() throws IOException, OperationNotPermittedException {
			FSPathResultListImpl list = new FSPathResultListImpl();
			FSPathResult temp = list.createEntry(new File("logs/file"));

			assertEquals(false, list.remove(temp));

		}
	}