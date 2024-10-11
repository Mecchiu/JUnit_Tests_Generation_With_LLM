// FileNameCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

	@Test
	void testFileNameCheck() {
		assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
		assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
		assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
		assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
		assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
		assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("this_is_valid.txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
		assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
		assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
		assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
		assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
		assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
		assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
		assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("final132"));
		assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
		assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
		assertEquals("No", FileNameCheck.fileNameCheck("s."));
	}
}