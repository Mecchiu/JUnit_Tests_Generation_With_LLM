// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		
	
	
    @Test
	public void test_0_en_de() throws Exception {

		String target = Base64Coder_2Test.test_en_de();

		assertEquals("", target);
	}

	@Test
	public void test_1_en_de() throws Exception {

		char[] target = Base64Coder_2Test.test_en_de();

		assertEquals("A", target);
	}

	@Test
	public void test_2_en_de() throws Exception {

		short[] target = Base64Coder_2Test.test_en_de();

		assertEquals("B", target);
	}

	@Test
	public void test_3_en_de() throws Exception {

		int[] target = Base64Coder_2Test.test_en_de();

		assertEquals("C", target);
	}

	@Test
	public void test_4_en_de() throws Exception {

		long[] target = Base64Coder_2Test.test_en_de();

		assertEquals("D", target);
	}

	@Test
	public void test_5_en_de()  throws Exception {

		float[] target = Base64Coder_2Test.test_en_de();

		assertEquals("E", target);
	}

	@Test
	public void test_6_en_de()  throws Exception {

		double[] target = Base64Coder_2Test.test_en_de();

		assertEquals("F", target);
	}

		//@Test
		//public void test() {
		//    System.out.println("=======");
		//    String s   = Base64Coder_2Test.test_en_de();
		//    System.out.println("en d\":"+s);
		//    String s2 = Base64Coder.encodeString(new Bb2Coder(), s);
		//    System.out.println("en en de\":"+s2);
		//    
		//    System.out.println("=======");
		//    String s3 = Base64Coder.encodeString(new Bb2Coder_8(), s);
		//    System.out.println("en en de ende\":"+s3);
		////
		//    }

}