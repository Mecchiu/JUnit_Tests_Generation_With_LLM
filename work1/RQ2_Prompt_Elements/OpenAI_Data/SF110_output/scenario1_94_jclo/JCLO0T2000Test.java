// JCLOTest.java
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
class JCLOTest {

		/**
		* Test case 1:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue1() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key1");
				assertEquals("value1", value);
		}
		
		/**
		* Test case 2:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue2() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key2");
				assertEquals("value2", value);
		}
		
		/**
		* Test case 3:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue3() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key3");
				assertEquals("value3", value);
		}
		
		/**
		* Test case 4:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue4() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key4");
				assertEquals("value4", value);
		}
		
		/**
		* Test case 5:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue5() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key5");
				assertEquals("value5", value);
		}
		
		/**
		* Test case 6:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue6() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key6");
				assertEquals("value6", value);
		}
		
		/**
		* Test case 7:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue7() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key7");
				assertEquals("value7", value);
		}
		
		/**
		* Test case 8:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue8() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key8");
				assertEquals("value8", value);
		}
		
		/**
		* Test case 9:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue9() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key9");
				assertEquals("value9", value);
		}
		
		/**
		* Test case 10:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue10() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key10");
				assertEquals("value10", value);
		}
}