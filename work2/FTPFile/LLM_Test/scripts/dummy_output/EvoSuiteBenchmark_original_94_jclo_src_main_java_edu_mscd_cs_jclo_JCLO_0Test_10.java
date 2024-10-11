// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		private final String ALIAS_NAME = "test";

		/**
		* 		Creates a JCLO from a string.
		* 		@param	string	value to be parsed
		* 	@return		JCLO parsed from string
		*/
		private JCLO makeParseable(String string) {
		
		String s = new JCLO(string);
		
		if ( s.length() > 0 )
			return new JCLO(s);
		
		else
			return new JCLO(string);
		}
		
		/**
		* 		Just a simple method for testing.
		* 
		* 		@return		<i>object</i>
		*/
		private Object getObject(Field f);
		
		/**
		* Just a simple method for testing.
		* @return		<i>object</i>
		*/
		private String getArrayType(Class type);
		
		/**
		* 		Just a simple method for testing.
		* 		@return		<i>object</i>
		*/
		private Object makeObject(String type, String... args);

		/**
		* 		Just a simple method for testing.
		* 		@return		<i>object</i>
		*/
		private boolean getBoolean(String key);

		/**
		* 		Just a simple method for testing.
		* 		@return		<i>object</i>
		*/
		private byte getByte(String key);

		/**
		* 		Just a simple method for testing.
		* 		@return		<i>object</i>
		*/
		private char getChar(String key);

}