// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {
/**
		* Initialize {@link Convert} thread before each unit test
		*/
		static public ConvertTest TestInit() throws Exception {
			return NewConvertTest("");
		}

		/**
		* Get a thread for the JMTSTest case
		* The thread is used to run test cases.
		*/
		static public ConvertTest getSUT() throws Exception {
			return NewConvertTest("");
		}

		/**
		* Get the test case object
		* For example, to run a specific test then
		* set the argument of this function to some value.
		*/
		ConvertTest NewConvertTest(String testFile) throws Exception {
/*
		String testFile = "jtst_" + testFile;

		/* create file which contains one test case */
		File testFile1 = new File(testFile);

		BufferedWriter testOut = new BufferedWriter(
				new FileWriter(testFile + ".txt"));

// write string to testOut
		testOut.write("Hello, World");
		testOut.write("\n\n");

// write the test case object
		testOut.flush();
		testOut.close();
		InputStreamReader in1 = new InputStreamReader(
                new FileInputStream(testFile), "UTF-8");

		String testString = "Hello, World";
		String testString1 = in1.readLine();
		testString1 = testString1.toString();
		in1.close();

		return new ConvertTest(testFile, testString, testFile1, testString1,
                in1);
*/
        }


}
