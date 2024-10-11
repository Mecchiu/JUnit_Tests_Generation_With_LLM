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
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile() {
		try {
			File file = new File("src/test/resources/validJavaFile.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile2() {
		try {
			File file = new File("src/test/resources/validJavaFile2.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile3() {
		try {
			File file = new File("src/test/resources/validJavaFile3.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile4() {
		try {
			File file = new File("src/test/resources/validJavaFile4.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile5() {
		try {
			File file = new File("src/test/resources/validJavaFile5.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile6() {
		try {
			File file = new File("src/test/resources/validJavaFile6.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile7() {
		try {
			File file = new File("src/test/resources/validJavaFile7.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile8() {
		try {
			File file = new File("src/test/resources/validJavaFile8.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile9() {
		try {
			File file = new File("src/test/resources/validJavaFile9.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile10() {
		try {
			File file = new File("src/test/resources/validJavaFile10.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile11() {
		try {
			File file = new File("src/test/resources/validJavaFile11.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile12() {
		try {
			File file = new File("src/test/resources/validJavaFile12.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile13() {
		try {
			File file = new File("src/test/resources/validJavaFile13.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile14() {
		try {
			File file = new File("src/test/resources/validJavaFile14.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile15() {
		try {
			File file = new File("src/test/resources/validJavaFile15.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile16() {
		try {
			File file = new File("src/test/resources/validJavaFile16.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile17() {
		try {
			File file = new File("src/test/resources/validJavaFile17.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile18() {
		try {
			File file = new File("src/test/resources/validJavaFile18.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile19() {
		try {
			File file = new File("src/test/resources/validJavaFile19.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile20() {
		try {
			File file = new File("src/test/resources/validJavaFile20.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile21() {
		try {
			File file = new File("src/test/resources/validJavaFile21.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
			parser.parse(rdr);
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link JMCAParser#parse(Reader)} method.
	* It tests the parser with a valid Java file.
	*/
	@Test
	void testParseValidJavaFile22() {
		try {
			File file = new File("src/test/resources/validJavaFile22.java");
			FileInputStream fis = new FileInputStream(file);
			Reader rdr = new java.io.InputStreamReader(fis);
			JMCAParser parser = new JMCAParser();
	