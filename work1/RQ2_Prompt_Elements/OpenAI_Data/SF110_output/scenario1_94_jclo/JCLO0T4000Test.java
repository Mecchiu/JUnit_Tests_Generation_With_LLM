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
				assertEquals(value, "value1");
		}
		
		/**
		* Test case 2:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue2() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key2");
				assertEquals(value, "value2");
		}
		
		/**
		* Test case 3:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue3() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key3");
				assertEquals(value, "value3");
		}
		
		/**
		* Test case 4:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue4() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key4");
				assertEquals(value, "value4");
		}
		
		/**
		* Test case 5:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue5() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key5");
				assertEquals(value, "value5");
		}
		
		/**
		* Test case 6:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue6() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key6");
				assertEquals(value, "value6");
		}
		
		/**
		* Test case 7:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue7() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key7");
				assertEquals(value, "value7");
		}
		
		/**
		* Test case 8:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue8() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key8");
				assertEquals(value, "value8");
		}
		
		/**
		* Test case 9:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue9() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key9");
				assertEquals(value, "value9");
		}
		
		/**
		* Test case 10:
		* Test the {@link JCLO#getValue(String)} method with a valid key.
		*/
		@Test
		void testGetValue10() {
				JCLO jclo = new JCLO();
				Object value = jclo.getValue("key10");
				assertEquals(value, "value10");
		}
}