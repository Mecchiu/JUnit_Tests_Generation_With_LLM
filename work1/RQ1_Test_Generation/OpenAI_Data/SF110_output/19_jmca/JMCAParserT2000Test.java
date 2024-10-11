// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains ten unit test cases for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {

	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java program.
	*/
	@Test
	void testParseValidJavaProgram() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/valid_java_program.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/valid_java_program.java"));
			assertNotNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError2() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError3() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError4() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError5() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError6() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError7() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError8() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.xml";
		try {
			ASTNode root = parser.parse(new FileInputStream("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.java"));
			assertNull(root);
		} catch (IOException e) {
			fail("IOException occurred");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError9() {
		JMCAParser parser = new JMCAParser();
		parser.intermediateFile = "test/com/soops/CEN