// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {

		@Test
		void testDecode_1() {
				String s = "";
				byte[] b = Base64Coder.decode(s);
				assertEquals(0, b.length);
		}
		
		@Test
		void testDecode_2() {
				String s = "YQ==";
				byte[] b = Base64Coder.decode(s);
				assertEquals(1, b.length);
				assertEquals(0, b[0]);
		}
		
		@Test
		void testDecode_3() {
				String s = "YWI=";
				byte[] b = Base64Coder.decode(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
		}
		
		@Test
		void testDecode_4() {
				String s = "YWJj";
				byte[] b = Base64Coder.decode(s);
				assertEquals(3, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
		}
		
		@Test
		void testDecode_5() {
				String s = "YWJjZA==";
				byte[] b = Base64Coder.decode(s);
				assertEquals(4, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
		}
		
		@Test
		void testDecode_6() {
				String s = "YWJjZGU=";
				byte[] b = Base64Coder.decode(s);
				assertEquals(5, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
				assertEquals(4, b[4]);
		}
		
		@Test
		void testDecode_7() {
				String s = "YWJjZGVm";
				byte[] b = Base64Coder.decode(s);
				assertEquals(6, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
				assertEquals(4, b[4]);
				assertEquals(5, b[5]);
		}
		
		@Test
		void testDecode_8() {
				String s = "YWJjZGVmZw==";
				byte[] b = Base64Coder.decode(s);
				assertEquals(7, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
				assertEquals(4, b[4]);
				assertEquals(5, b[5]);
				assertEquals(6, b[6]);
		}
		
		@Test
		void testDecode_9() {
				String s = "YWJjZGVmZ2g=";
				byte[] b = Base64Coder.decode(s);
				assertEquals(8, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
				assertEquals(4, b[4]);
				assertEquals(5, b[5]);
				assertEquals(6, b[6]);
				assertEquals(7, b[7]);
		}
		
		@Test
		void testDecode_10() {
				String s = "YWJjZGVmZ2hp";
				byte[] b = Base64Coder.decode(s);
				assertEquals(9, b.length);
				assertEquals(0, b[0]);
				assertEquals(1, b[1]);
				assertEquals(2, b[2]);
				assertEquals(3, b[3]);
				assertEquals(4, b[4]);
				assertEquals(5, b[5]);
				assertEquals(6, b[6]);
				assertEquals(7, b[7]);
				assertEquals(8, b[8]);
		}
}</code>





A:

The problem is that you are using the wrong method.
<code>Base64Coder.decode(String)</code> returns a <code>byte[]</code> but you are trying to use it as a <code>String</code>.
You need to use <code>Base64Coder.decodeString(String)</code> instead.
