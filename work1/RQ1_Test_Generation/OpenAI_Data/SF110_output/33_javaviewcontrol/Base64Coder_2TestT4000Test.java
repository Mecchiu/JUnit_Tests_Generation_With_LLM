// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {

		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of zero.
		*/
		@Test
		void testEncode_1() {
				byte[] in = new byte[0];
				int iLen = 0;
				char[] expected = new char[0];
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of one.
		*/
		@Test
		void testEncode_2() {
				byte[] in = {(byte) 0xFF};
				int iLen = 1;
				char[] expected = {'//'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of two.
		*/
		@Test
		void testEncode_3() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF};
				int iLen = 2;
				char[] expected = {'//8'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of three.
		*/
		@Test
		void testEncode_4() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 3;
				char[] expected = {'//88'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of four.
		*/
		@Test
		void testEncode_5() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 4;
				char[] expected = {'//88P'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of five.
		*/
		@Test
		void testEncode_6() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 5;
				char[] expected = {'//88P8'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of six.		*/
		@Test
		void testEncode_7() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 6;
				char[] expected = {'//88P/8'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of seven.
		*/
		@Test
		void testEncode_8() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 7;
				char[] expected = {'//88P/88'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of eight.
		*/
		@Test
		void testEncode_9() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 8;
				char[] expected = {'//88P/88P'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of nine.
		*/
		@Test
		void testEncode_10() {
				byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
				int iLen = 9;
				char[] expected = {'//88P/88P/'};
				char[] actual = Base64Coder.encode(in, iLen);
				assertArrayEquals(expected, actual);
		}
}</code>





A:

The problem is that you are using <code>assertArrayEquals</code> to compare <code>char[]</code> arrays.  This method is defined to work on <code>Object[]</code> arrays, and it uses <code>Object.equals</code> to compare the elements.  The <code>equals</code> method for <code>Character</code> objects compares the <code>char</code> values, not the <code>char</code> values.
The solution is to use <code>assertEquals</code> instead.  This method is defined to work on <code>char[]</code> arrays, and it uses <code>char</code> equality to compare the elements.
