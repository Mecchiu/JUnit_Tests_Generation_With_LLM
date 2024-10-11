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
		ASTNode root = parser.parse(new FileReader("src/test/resources/validJavaProgram.java"));
		assertNotNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithSyntaxError.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError2() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError2.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError3() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError3.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError4() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError4.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError5() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError5.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError6() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError6.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError7() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError7.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError8() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError8.java"));
		assertNull(root);
	}
}

// JMCATest.java
package com.soops.CEN4010.JMCA;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
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
		ASTNode root = parser.parse(new FileReader("src/test/resources/validJavaProgram.java"));
		assertNotNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a syntax error.
	*/
	@Test
	void testParseJavaProgramWithSyntaxError() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithSyntaxError.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError2() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError2.java"));
		assertNull(root);
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a Java program containing a lexical error.
	*/
	@Test
	void testParseJavaProgramWithLexicalError3() {
		JMCAParser parser = new JMCAParser();
		ASTNode root = parser.parse(new FileReader("src/test/resources/javaProgramWithLexicalError3.java