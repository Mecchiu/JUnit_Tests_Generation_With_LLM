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
	 * A unit test for the method where the list of fspath results <b>passed</b>
	 * to the {@link #each(Callback)} method.
	 * @author kbishop
	 * @since 1.0
	 */
	@Test
	public void each_passed() throws IOException, OperationNotPermittedException {
				// test data
		long start; long end;
		String fileType;
		long start_size, end_size;
		long total_size;
		int retries = 0;
		int loops = 10;
		int attempts = 2;
}
}