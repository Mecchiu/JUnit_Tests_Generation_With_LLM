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
private final String TESTS_DIR = "tests/";
		private static File TEST_DATA_FOLDER;
		public static Pattern TEST_DATA_PATTERN;
		public static File CLASSES_FOLDER;
		public static File CLASSES_MAPPINGS_FOLDER;
		static {
			TEST_DATA_FOLDER = new File(TESTS_DIR, "testData/*");
		    TEST_DATA_PATTERN = Pattern.compile(".*/(\\d)\\.txt");
	    CLASSES_FOLDER = new File(TESTS_DIR, "classes/*");
		    CLASSES_MAPPINGS_FOLDER = new File(TESTS_DIR, "mappings/*");
		}

		@Test
		public void testCallAll() throws IOException {
			new FSPathResultListImpl_0();
		}

		@Test
		public void testCallEach() throws IOException {
			for (int i = 0; i < 100; i ++) {
				new FSPathResultListImpl_0();
			}
		}

		@Test
		public void testCreateFileReader() throws IOException {
			File f = new File(TEST_DATA_FOLDER, "10.txt");
			try {
				System.out.println("Running file: " + f.getAbsolutePath());
				FileReader fr = new FileReader(f);
				String data = "";
				String str = "";
				int ch = 0;
				int id = 0;
				while ((ch = fr.read())!= -1) {
					if (ch!= '\r') {
						data = data + (char)ch;
					}
					else {
						if(fr.read()!= -1){
							break;
						}
						if(fr.read()!= -1){
							break;
						}
					}
					str = str + "";
				}
				fr.close();
				System.out.println("Data string: " + str);
				assertTrue("File reader returned unexpected result", data.startsWith("FileReader returned unexpected result"));
				assertTrue("File reader returned unexpected result", data.equals(str.replaceAll(TEST_DATA_PATTERN, null)));
				assertTrue("File reader returned unexpected result", data.equals(String.valueOf(id)));
				assertTrue("File reader returned unexpected result", data.startsWith("FileReader returned unexpected result"));
			}
			finally {
				f.delete();
			}
		}
}
