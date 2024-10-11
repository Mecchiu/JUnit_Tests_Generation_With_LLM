// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {
		
	/**
	 * test constructor.
	*/
	@Test
	public void testConstructor1() {
		assertNotNull("AtRobotCompiler.constructor(File) must not be null.",
		    		compile(new File("TestFile")));
	}
	
	/**
	 * test constructor.
	* test input string is an integer
	*/
	@Test
	public void testConstructor2() {
		assertNotNull("AtRobotCompiler.constructor() must not be null.",
		    		compile("#123"));
	}
	
	/**
	 * test constructor.
	* test input string is not an integer
	*/
	@Test
	public void testConstructor3() {
		assertNotNull("AtRobotCompiler.constructor() must not be null.",
		    		compile("2"));
	}
	
	/**
	 * test constructor.
	*/
	@Test
	public void testConstructorInt() {
		int num = 1234;
		assertNotNull("AtRobotCompiler.constructor(int) must not be null.",
		    		compile(num));
	}
	
	/**
	 * test write a single string.
	*/
	@Test
	public void testWriteString() {
		assertEquals("WriteString(String) must return the same string.",
		    		"Hello", compile("Hello"));
	}
	
	/**
	 * test write a single string.
	* test input string is not an string
	*/
	@Test
	public void testWriteString3() {
		int num = 1234;
		assertNotEquals("WriteString(String) must return null string.", null, compile(num));
	}
	
	/**
	 * test write a single string to a stream out of an integer.
	* test input string is an integer
	*/
	@Test
	public void testWriteString4() {
		assertNotEquals("WriteString(String) must return null string.", null, compile("123"));
	}
	
	/**
	 * test write a single string to a string
	* test input string is not an integer
	*/
	@Test
	public void testWriteString5() {
		assertNotEquals("WriteString(String) must return null string.", null, compile("2"));
	}
	
	/**
	 * test write a single string to a string
	* test input string is the same as input string
	*/
	@Test
	public void testWriteString6() {
		assertEquals("WriteString(String) must return the same string.",
		    		"Hello", compile("Hello"));
	}
	
	/**
	 * test write a single string to a reader.
	* test input string is an integer
	*/
	@Test
	public void testWriteString7() {
		assertNotEquals("WriteString(String) must return null string.", null, compile("123"));
	}
	
	/**
	 * test write a single string to a reader.
	* test input string is not an integer
	*/
	@Test
	public void testWriteString8() {
		assertEquals("WriteString(String) must return the same string.",
		    		"Hello","World");
	}
	
	/**
	 * test write a single string to a string
	* test input string is not null
	*/
	@Test
	public void testWriteString9() {
		assertNotEquals("WriteString(String) must return the same string.",
		    		"null", compile("Hello"));
	}
	
	/**
	 * test write a single string to a string.
	* test input string is not null
	*/
	@Test
	public void testWriteString10() {
		assertEquals("WriteString(String) must return the same string.",
		    		"Hello", compile("java.lang.String"));
	}
	
	/**
	 * test write a single string to a reader.
	* test input string is non-null
	*/
	@Test
	public void testWriteString11() {
		assertNotEquals("WriteString(String) must return the same string.",
		    		"World", compile("java.lang.String"));
	}
	
	/**
	 * test write a single string to reader
	* test input string is not null
	*/
	@Test
	public void testWriteString12() {
		assertEquals("WriteString(String) must return the same string.",
		    		"Hello", compile("#1234"));
	}
	
}