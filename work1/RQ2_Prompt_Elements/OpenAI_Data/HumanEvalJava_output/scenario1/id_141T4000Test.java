// FileNameCheckTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

	/**
	* Test case 1.
	* The input file name is "abc.txt".
	* The expected result is "Yes".
	*/
	@Test
	void test1() {
		String fileName = "abc.txt";
		String expected = "Yes";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input file name is "abc.exe".
	* The expected result is "Yes".
	*/
	@Test
	void test2() {
		String fileName = "abc.exe";
		String expected = "Yes";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input file name is "abc.dll".
	* The expected result is "Yes".
	*/
	@Test
	void test3() {
		String fileName = "abc.dll";
		String expected = "Yes";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input file name is "abc.txt.txt".
	* The expected result is "No".
	*/
	@Test
	void test4() {
		String fileName = "abc.txt.txt";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input file name is "abc.exe.exe".
	* The expected result is "No".
	*/
	@Test
	void test5() {
		String fileName = "abc.exe.exe";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input file name is "abc.dll.dll".
	* The expected result is "No".
	*/
	@Test
	void test6() {
		String fileName = "abc.dll.dll";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input file name is "abc.txt.exe".
	* The expected result is "No".
	*/
	@Test
	void test7() {
		String fileName = "abc.txt.exe";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input file name is "abc.exe.dll".
	* The expected result is "No".
	*/
	@Test
	void test8() {
		String fileName = "abc.exe.dll";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input file name is "abc.dll.txt".
	* The expected result is "No".
	*/
	@Test
	void test9() {
		String fileName = "abc.dll.txt";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input file name is "abc.txt.exe.dll".
	* The expected result is "No".
	*/
	@Test
	void test10() {
		String fileName = "abc.txt.exe.dll";
		String expected = "No";
		String actual = FileNameCheck.fileNameCheck(fileName);
		assertEquals(expected, actual);
	}
}