// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		
	@Test
	void test() {
		
//		final byte in[] = new byte[] {1, 2, 3};
//		final byte out[] = Base64Coder.encode(in);
//		
//		verifyArguments(in);
//		verifyArguments(out);
		
		final byte in[] = new byte[] {(byte)1, (byte)2, (byte)3};
		final byte out[] = Base64Coder.encode(in);
		
		verifyArguments(in);
		verifyArguments(out);
		
		assertArrayEquals(new byte[] {(byte)1, (byte)2, 3}, out);
		
//		final String inS[] = new String[] {"ABC", "1234"};
//		final String outS[] = new String[] {Base64Coder.encode(inS[0])+ "ABC", Base64Coder.encode(inS[1])+" "};
//		
//		verifyArguments(inS);
//		verifyArguments(outS);
		
		assertArrayEquals(new String[] {"ABC", "1234"}, outS);
		
		
		final byte in[] = new byte[] {1, (byte)2};
		final byte out[] = Base64Coder.encode(in);
		
		verifyArguments(in);
		verifyArguments(out);
		
		assertArrayEquals(new byte[] {1, 2}, out);
		
//		final String inS[] = new String[] {"ABC", "1234"};
//		final String outS[] = new String[] {Base64Coder.encode(inS[0])+ "ABC", Base64Coder.encode(inS[1])+" "};
//		
//		verifyArguments(inS);
//		verifyArguments(outS);
		
		assertArrayEquals(new String[] {"ABC", "1234"}, outS);
	}
			
	private static void verifyArguments(byte[] s) {
		assertArrayEquals(s, Base64Coder.decode(s));
	}
	

}