// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {

	/**
	* Test case for {@link JCLO#usage()} method.
	* It tests the usage message for the acceptable command line variables.
	*
	* @see JCLO#usage()
	*/
	@Test
	void testUsage() {
		JCLO jclo = new JCLO(new JCLO_1Test());
		String usage = jclo.usage();
		assertEquals("Usage: java edu.mscd.cs.jclo.JCLO_1Test [--] [--help] [--version] [--verbose] [--debug] [--file <file>] [--dir <dir>] [--size <size>] [--date <date>] [--time <time>] [--datetime <datetime>] [--boolean <boolean>] [--byte <byte>] [--char <char>] [--short <short>] [--int <int>] [--float <float>] [--double <double>] [--long <long>] [--string <string>] [--bytes <bytes>] [--chars <chars>] [--shorts <shorts>] [--ints <ints>] [--floats <floats>] [--doubles <doubles>] [--longs <longs>] [--strings <strings>] [--additional <additional>]", usage);
	}
}

// JCLO_2Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#parse(String[])} method.
*/
class JCLO_2Test {
		
	/**
	* Test case for {@link JCLO#parse(String[])} method.
	* It tests the parsing of a command line.
	*
	* @see JCLO#parse(String[])
	*/
	@Test
	void testParse() {
		JCLO jclo = new JCLO(new JCLO_2Test());
		String[] args = {"--help", "--version", "--verbose", "--debug", "--file", "file", "--dir", "dir", "--size", "size", "--date", "date", "--time", "time", "--datetime", "datetime", "--boolean", "boolean", "--byte", "byte", "--char", "char", "--short", "short", "--int", "int", "--float", "float", "--double", "double", "--long", "long", "--string", "string", "--bytes", "bytes", "--chars", "chars", "--shorts", "shorts", "--ints", "ints", "--floats", "floats", "--doubles", "doubles", "--longs", "longs", "--strings", "strings", "--additional", "additional"};
		jclo.parse(args);
		assertEquals(true, jclo.getBoolean("help"));
		assertEquals(true, jclo.getBoolean("version"));
		assertEquals(true, jclo.getBoolean("verbose"));
		assertEquals(true, jclo.getBoolean("debug"));
		assertEquals("file", jclo.getString("file"));
		assertEquals("dir", jclo.getString("dir"));
		assertEquals("size", jclo.getString("size"));
		assertEquals("date", jclo.getString("date"));
		assertEquals("time", jclo.getString("time"));
		assertEquals("datetime", jclo.getString("datetime"));
		assertEquals("boolean", jclo.getString("boolean"));
		assertEquals("byte", jclo.getString("byte"));
		assertEquals("char", jclo.getString("char"));
		assertEquals("short", jclo.getString("short"));
		assertEquals("int", jclo.getString("int"));
		assertEquals("float", jclo.getString("float"));
		assertEquals("double", jclo.getString("double"));
		assertEquals("long", jclo.getString("long"));
		assertEquals("string", jclo.getString("string"));
		assertEquals("bytes", jclo.getString("bytes"));
		assertEquals("chars", jclo.getString("chars"));
		assertEquals("shorts", jclo.getString("shorts"));
		assertEquals("ints", jclo.getString("ints"));
		assertEquals("floats", jclo.getString("floats"));
		assertEquals("doubles", jclo.getString("doubles"));
		assertEquals("longs", jclo.getString("longs"));
		assertEquals("strings", jclo.getString("strings"));
		assertEquals("additional", jclo.getString("additional"));
	}
}

// JCLO_3Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getValue(String)} method.
*/
class JCLO_3Test {
		
	/**
	* Test case for {@link JCLO#getValue(String)} method.
	* It tests the current value of the variable in the object.
	*
	* @see JCLO#getValue(String)
	*/
	@Test
	void testGetValue() {
		JCLO jclo = new JCLO(new JCLO_3Test());
		String[] args = {"--help", "--version", "--verbose", "--debug", "--file", "file", "--dir", "dir", "--size", "size", "--date", "date", "--time", "time", "--datetime", "datetime", "--boolean", "boolean", "--byte", "byte", "--char", "char", "--short", "short", "--int", "int", "--float", "float", "--double", "double", "--long", "long", "--string", "string", "--bytes", "bytes", "--chars", "chars", "--shorts", "shorts", "--ints", "ints", "--floats", "floats", "--doubles", "doubles", "--longs", "longs", "--strings", "strings", "--additional", "additional"};
		jclo.parse(args);
		assertEquals(true, jclo.getValue("help"));
		assertEquals(true, jclo.getValue("version"));
		assertEquals(true, jclo.getValue("verbose"));
		assertEquals(true, jclo.getValue("debug"));
		assertEquals("file", jclo.getValue("file"));
		assertEquals("dir", jclo.getValue("dir"));
		assertEquals("size", jclo.getValue("size"));
		assertEquals("date", jclo.getValue("date"));
		assertEquals("time", jclo.getValue("time"));
		assertEquals("datetime", jclo.getValue("datetime"));
		assertEquals("boolean", jclo.getValue("