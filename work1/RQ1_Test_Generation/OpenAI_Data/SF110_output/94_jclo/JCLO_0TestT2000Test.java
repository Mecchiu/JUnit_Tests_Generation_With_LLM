// JCLO_0Test.java
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
class JCLO_0Test {

		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is null.
		*/
		@Test
		void testGetValue_0() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertNull(jclo.getValue(null));
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is empty.
		*/
		@Test
		void testGetValue_1() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertNull(jclo.getValue(""));
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is not found.
		*/
		@Test
		void testGetValue_2() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertNull(jclo.getValue("notFound"));
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_3() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("a"), "a");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_4() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("b"), "b");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_5() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("c"), "c");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_6() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("d"), "d");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_7() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("e"), "e");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_8() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("f"), "f");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_9() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("g"), "g");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_10() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("h"), "h");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_11() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("i"), "i");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_12() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("j"), "j");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_13() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("k"), "k");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_14() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("l"), "l");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_15() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("m"), "m");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_16() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("n"), "n");
		}
		
		/**
		* Test case for {@link JCLO#getValue(String)} method.
		* It tests the case when the key is found.
		*/
		@Test
		void testGetValue_17() {
				JCLO jclo = new JCLO(new JCLO_0Test());
				assertEquals(jclo.getValue("o"), "o");