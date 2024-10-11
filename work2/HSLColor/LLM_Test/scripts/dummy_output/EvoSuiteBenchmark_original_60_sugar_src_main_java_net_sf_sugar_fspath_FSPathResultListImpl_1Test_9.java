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
		private FSPathResultListImpl_1Test(){
			
		}
		@Test
		public void test_delete() throws IOException {
			File in = new File("fspath/in");
			File inDir = new File("fspath/in/dir1");
			File inDirCopy = new File("fspath/in/dir1");

			// copy inDir to the directory of inDirCopy
			// then delete inDirCopy and it's subdirectories
			delete(inDir.getPath());
			assertFalse(inDir.exists());
			assertFalse(inDir.isDirectory());
}
}