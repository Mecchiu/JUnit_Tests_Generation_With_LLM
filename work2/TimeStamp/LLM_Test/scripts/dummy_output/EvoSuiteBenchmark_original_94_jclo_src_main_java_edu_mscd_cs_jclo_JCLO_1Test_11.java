// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		
	/**
	* An example usage string.
	*/
	public static String usage() 
	{
		return "Parsing an Arithmetic Object Example.\nUsage:\njava edu.mscd.cs.jclo.JCLO jcloreport object [int]";
	}
}