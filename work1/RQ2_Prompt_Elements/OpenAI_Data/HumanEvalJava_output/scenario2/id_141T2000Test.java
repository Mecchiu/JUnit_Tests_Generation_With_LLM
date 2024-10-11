// FileNameCheckTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
	@Test
			void test1() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("file.txt"));
			}
			@Test
			void test2() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.exe"));
			}
			@Test
			void test3() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.dll"));
			}
			@Test
			void test4() {
				assertEquals("No", FileNameCheck.fileNameCheck("file."));
			}
			@Test
			void test5() {
				assertEquals("No", FileNameCheck.fileNameCheck("file"));
			}
			@Test
			void test6() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.a"));
			}
			@Test
			void test7() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.a.txt"));
			}
			@Test
			void test8() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.a.exe"));
			}
			@Test
			void test9() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.a.dll"));
			}
			@Test
			void test10() {
				assertEquals("No", FileNameCheck.fileNameCheck("file.1.txt"));
			}
}
