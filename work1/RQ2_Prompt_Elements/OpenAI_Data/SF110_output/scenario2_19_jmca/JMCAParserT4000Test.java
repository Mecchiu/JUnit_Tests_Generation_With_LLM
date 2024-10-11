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
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/valid_java_program.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/valid_java_program.java"));
		assertNotNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError2() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError3() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError4() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError5() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError6() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError7() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError8() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError9() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error9.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error9.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError10() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error10.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error10.java"));
		assertNull(root);
	}
}

// JMCATest.java
package com.soops.CEN4010.JMCA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains ten unit test cases for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCATest {
		
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java program.
	*/
	@Test
	void testParseValidJavaProgram() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/valid_java_program.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/valid_java_program.java"));
		assertNotNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError2() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error2.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError3() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error3.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError4() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error4.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError5() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error5.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError6() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error6.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError7() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error7.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError8() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error8.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError9() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error9.xml");
		ASTNode root = parser.parse(new FileReader("test/com/soops/CEN4010/JMCA/test_files/java_program_with_syntax_error9.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program that contains a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError10() {
		JMCAParser parser = new JMCAParser();
		parser.setIntermediateFile("test/com/soops/CEN4010/JMCA/test_files/java_program_with_sy