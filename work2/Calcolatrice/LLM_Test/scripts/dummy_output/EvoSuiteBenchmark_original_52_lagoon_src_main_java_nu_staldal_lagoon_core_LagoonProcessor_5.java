// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		private static final int EXEC_TIMEOUT = 30000;

		/**
		* Test method initialization.
		*/
		@Test
		public void build() throws IOException {
			final Map<String,Set<String>> cache = new HashMap<>();

			File targetDir =
				new File(
					System.getProperty("java.io.tmpdir"))
					.getAbsoluteFile();

}
}