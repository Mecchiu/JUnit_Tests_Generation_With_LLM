// FSPathResultListImpl_0Test.java
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
* It contains one unit test case for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {
		/**
		* Test method for each(Result result).
		* This method should iterate over the results in the resulting list.
		* The last value should be added as a succeeded result.
		*
		* @throws IOException - TODO
		*/
		@Test
		public void testIterate() throws IOException {
			final File dir = new File("/tmp");
			final ArrayList<FSPathResult> list = new ArrayList<>();
}
}