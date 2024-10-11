// FileNameCheckTest.java
package original;

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
				assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
			}
			@Test
			void test2() {
				assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
			}
			@Test
			void test3() {
				assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
			}
			@Test
			void test4() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
			}
			@Test
			void test5() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
			}
			@Test
			void test6() {
				assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
			}
			@Test
			void test7() {
				assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
			}
			@Test
			void test8() {
				assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
			}
			@Test
			void test9() {
				assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
			}
			@Test
			void test10() {
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
			}
			@Test
			void test11() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("this_is_valid.txt"));
			}
			@Test
			void test12() {
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
			}
			@Test
			void test13() {
				assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
			}
			@Test
			void test14() {
				assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
			}
			@Test
			void test15() {
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
			}
			@Test
			void test16() {
				assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
			}
			@Test
			void test17() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
			}
			@Test
			void test18() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
			}
			@Test
			void test19() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
			}
			@Test
			void test20() {
				assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
			}
			@Test
			void test21() {
				assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
			}
			@Test
			void test22() {
				assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
			}
			@Test
			void test23() {
				assertEquals("No", FileNameCheck.fileNameCheck("final132"));
			}
			@Test
			void test24() {
				assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
			}
			@Test
			void test25() {
				assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
			}
			@Test
			void test26() {
				assertEquals("No", FileNameCheck.fileNameCheck("s."));
			}
}