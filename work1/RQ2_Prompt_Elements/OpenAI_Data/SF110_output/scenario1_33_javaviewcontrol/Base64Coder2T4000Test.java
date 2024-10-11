// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64CoderTest {

		@Test
		void testEncode() {
				byte[] in = new byte[0];
				char[] out = Base64Coder.encode(in, in.length);
				assertEquals(0, out.length);
				
				in = new byte[] { 'a' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(4, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('=', out[2]);
				assertEquals('=', out[3]);
				
				in = new byte[] { 'a', 'b' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(4, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('=', out[3]);
				
				in = new byte[] { 'a', 'b', 'c' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(4, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				
				in = new byte[] { 'a', 'b', 'c', 'd' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(8, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(8, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(8, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(8, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(8, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(12, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				
				in = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p' };
				out = Base64Coder.encode(in, in.length);
				assertEquals(16, out.length);
				assertEquals('Y', out[0]);
				assertEquals('Q', out[1]);
				assertEquals('g', out[2]);
				assertEquals('w', out[3]);
				assertEquals('=', out[4]);
				assertEquals('=', out[5]);
				assertEquals('=', out[6]);
				assertEquals('=', out[7]);
				assertEquals('=', out[8]);
				assertEquals('=', out[9]);
				assertEquals('=', out[10]);
				assertEquals('=', out[11]);
				assertEquals('=', out[12]);
				assertEquals('=', out[13]);
				assertEquals('=', out[14]);
				assertEquals('=', out[15]);
		}
}