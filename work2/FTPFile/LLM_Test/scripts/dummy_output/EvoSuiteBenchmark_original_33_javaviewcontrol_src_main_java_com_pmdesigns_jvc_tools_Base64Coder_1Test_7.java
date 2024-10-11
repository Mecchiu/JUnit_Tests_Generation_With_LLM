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
    public void test(){
    	//1- Bitmap byte[]
    	byte[] in = new byte[] {
    			(byte)('A'+32),
       			(byte)32,
    			(byte)('A'+32),
       			(byte)32,
       			(byte)('A'+32),
       			(byte)32,
       			(byte)('A'+32),
      			(byte)32,
      			(byte)32
    	};

    	byte[] out = Base64Coder.encode(in);
    	assertArrayEquals(in, out);
    	
    	// 2- Byte byte[]
		byte[] in1 = new byte[] {
			(byte)1,
			(byte)('A'+32),
			(byte)32
    	};

		byte[] in2 = new byte[] {
			(byte)4,
			(byte)32,
			(byte)4,
			(byte)64,
			(byte)64,
			(byte)64,
			(byte)64
    	};

    	byte[] out1 = Base64Coder.encode(in1);
    	byte[] out2 = Base64Coder.encode(in2);
    	assertArrayEquals(out1, out2);
    	
    	// 3- Byte String
		String inStr = new String("A string with a Base64 encoded value");
		String outStr = Base64Coder.encodeString(inStr);
		assertEquals(inStr, outStr);

		// 4- Byte String[]
		byte[] inStrArray = new byte[] {
			1,
			(byte)2,
			(byte)3,
			(byte)4
    	};
		byte[] outStrArray = Base64Coder.encode(inStrArray);
		assertArrayEquals(inStrArray, outStrArray);
    }
}