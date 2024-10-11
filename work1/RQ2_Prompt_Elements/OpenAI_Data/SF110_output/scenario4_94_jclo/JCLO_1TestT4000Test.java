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
		assertEquals("Usage: java edu.mscd.cs.jclo.JCLO_1Test [--] [--help] [--version] [--verbose] [--debug] [--file <file>] [--dir <dir>] [--size <size>] [--date <date>] [--time <time>] [--datetime <datetime>] [--boolean <boolean>] [--byte <byte>] [--char <char>] [--short <short>] [--int <int>] [--float <float>] [--double <double>] [--long <long>] [--string <string>] [--bytes <bytes>] [--chars <chars>] [--shorts <shorts>] [--ints <ints>] [--floats <floats>] [--doubles <doubles>] [--longs <longs>] [--strings <strings>] [--file=<file>] [--dir=<dir>] [--size=<size>] [--date=<date>] [--time=<time>] [--datetime=<datetime>] [--boolean=<boolean>] [--byte=<byte>] [--char=<char>] [--short=<short>] [--int=<int>] [--float=<float>] [--double=<double>] [--long=<long>] [--string=<string>] [--bytes=<bytes>] [--chars=<chars>] [--shorts=<shorts>] [--ints=<ints>] [--floats=<floats>] [--doubles=<doubles>] [--longs=<longs>] [--strings=<strings>]", usage);
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
		String[] args = {"--help", "--version", "--verbose", "--debug", "--file", "file", "--dir", "dir", "--size", "size", "--date", "date", "--time", "time", "--datetime", "datetime", "--boolean", "true", "--byte", "1", "--char", "a", "--short", "1", "--int", "1", "--float", "1.0", "--double", "1.0", "--long", "1", "--string", "string", "--bytes", "1", "--chars", "a", "--shorts", "1", "--ints", "1", "--floats", "1.0", "--doubles", "1.0", "--longs", "1", "--strings", "string", "--file=file", "--dir=dir", "--size=size", "--date=date", "--time=time", "--datetime=datetime", "--boolean=true", "--byte=1", "--char=a", "--short=1", "--int=1", "--float=1.0", "--double=1.0", "--long=1", "--string=string", "--bytes=1", "--chars=a", "--shorts=1", "--ints=1", "--floats=1.0", "--doubles=1.0", "--longs=1", "--strings=string"};
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
		assertEquals(true, jclo.getBoolean("boolean"));
		assertEquals(1, jclo.getByte("byte"));
		assertEquals('a', jclo.getChar("char"));
		assertEquals(1, jclo.getShort("short"));
		assertEquals(1, jclo.getInt("int"));
		assertEquals(1.0, jclo.getFloat("float"));
		assertEquals(1.0, jclo.getDouble("double"));
		assertEquals(1, jclo.getLong("long"));
		assertEquals("string", jclo.getString("string"));
		assertEquals(1, jclo.getBytes("bytes")[0]);
		assertEquals('a', jclo.getChars("chars")[0]);
		assertEquals(1, jclo.getShorts("shorts")[0]);
		assertEquals(1, jclo.getInts("ints")[0]);
		assertEquals(1.0, jclo.getFloats("floats")[0]);
		assertEquals(1.0, jclo.getDoubles("doubles")[0]);
		assertEquals(1, jclo.getLongs("longs")[0]);
		assertEquals("string", jclo.getStrings("strings")[0]);
		assertEquals("file", jclo.getString("file"));
		assertEquals("dir", jclo.getString("dir"));
		assertEquals("size", jclo.getString("size"));
		assertEquals("date", jclo.getString("date"));
		assertEquals("time", jclo.getString("time"));
		assertEquals("datetime", jclo.getString("datetime"));
		assertEquals(true, jclo.getBoolean("boolean"));
		assertEquals(1, jclo.getByte("byte"));
		assertEquals('a', jclo.getChar("char"));
		assertEquals(1, jclo.getShort("short"));
		assertEquals(1, jclo.getInt("int"));
		assertEquals(1.0, jclo.getFloat("float"));
		assertEquals(1.0, jclo.getDouble("double"));
		assertEquals(1, jclo.getLong("long"));
		assertEquals("string", jclo.getString("string"));
		assertEquals(1, jclo.getBytes("bytes")[0]);
		assertEquals('a', jclo.getChars("chars")[0]);
		assertEquals(1, jclo.getShorts("shorts")[0]);
		assertEquals(1, jclo.getInts("ints")[0]);
		assertEquals(1.0, jclo.getFloats("floats")[0]);
		assertEquals(1.0, jclo.getDoubles("doubles")[0]);
		assertEquals(1, jclo.getLongs("longs")[0]);
		assertEquals("string", jclo.getStrings("strings")[0]);
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
		String[] args = {"--help", "--version", "--verbose", "--debug", "--file", "file", "--dir", "dir", "--size", "size", "--date", "date", "--time", "time", "--datetime", "datetime", "--boolean", "true", "--byte", "1", "--char", "a", "--short", "1", "--int", "1", "--float", "1.0", "--double", "1.0", "--long", "1", "--string", "string", "--bytes", "1", "--chars", "a", "--shorts", "1", "--ints", "1", "--floats", "1.0", "--doubles", "1.0", "--longs", "1", "--strings", "string", "--file=file", "--dir=dir", "--size=size", "--date=date", "--time=time", "--datetime=datetime", "--boolean=true", "--byte=1", "--char=a", "--short=1", "--int=1", "--float=1.0", "--double=1.0", "--long=1", "--string=string", "--bytes=1", "--chars=a", "--shorts=1", "--ints=1", "--floats=1.0", "--doubles=1.0", "--longs=1", "--strings=string"};
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
		assertEquals(true, jclo.getValue("boolean"));
		assertEquals(1, jclo.getValue("byte"));
		assertEquals('a', jclo.getValue("char"));
		assertEquals(1, jclo.getValue("short"));
		assertEquals(1, jclo.getValue("int"));
		assertEquals(1.0, jclo.getValue("float"));
		assertEquals(1.0, jclo.getValue("double"));
		assertEquals(1, jclo.getValue("long"));
		assertEquals("string", jclo.getValue("string"));
		assertEquals(1, jclo.getValue("bytes"));
		assertEquals('a', jclo.getValue("chars"));
		assertEquals(1, jclo.getValue("shorts"));
		assertEquals(1, jclo.getValue("ints"));
		assertEquals(1.0, jclo.getValue("floats"));
		assertEquals(1.0, jclo.getValue("doubles"));
		assertEquals(1, jclo.getValue("longs"));
		assertEquals("string", jclo.getValue("strings"));
		assertEquals("file", jclo.getValue("file"));
		assertEquals("dir", jclo.getValue("dir"));
		assertEquals("size", jclo.getValue("size"));
		assertEquals("date", jclo.getValue("date"));
		assertEquals("time", jclo.getValue("time"));
		assertEquals("datetime", jclo.getValue("datetime"));
		assertEquals(true, jclo.getValue("boolean"));
		assertEquals(1, jclo.getValue("byte"));
		assertEquals('a', jclo.getValue("char"));
		assertEquals(1, jclo.getValue("short"));
		assertEquals(1, jclo.getValue("int"));
		assertEquals(1.0, jclo.getValue("float"));
		assertEquals(1.0, jclo.getValue("double"));
		assertEquals(1, jclo.getValue("long"));
		assertEquals("string", jclo.getValue("string"));
		assertEquals(1, jclo.getValue("bytes"));
		assertEquals('a', jclo.getValue("chars"));
		assertEquals(1, jclo.getValue("shorts"));
		assertEquals(1, jclo.getValue("ints"));
		assertEquals(1.0, jclo.getValue("floats"));
		assertEquals(1.0, jclo.getValue("doubles"));
		assertEquals(1, jclo.getValue("longs"));
		assertEquals("string", jclo.getValue("strings"));
	}
}

// JCLO_4Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#toString()} method.
*/
class JCLO_4Test {
		
	/**
	* Test case for {@link JCLO#toString()} method.
	* It tests the external representation of the object.
	*
	* @see JCLO#toString()
	*/
	@Test
	void testToString() {
		JCLO jclo = new JCLO(new JCLO_4Test());
		String[] args = {"--help", "--version", "--verbose", "--debug", "--file", "file", "--dir", "dir", "--size", "size", "--