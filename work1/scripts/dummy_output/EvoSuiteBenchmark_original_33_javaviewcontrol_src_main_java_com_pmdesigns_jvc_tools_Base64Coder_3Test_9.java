// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		
	private static final String base64 = "ABCDEFGHIJKLMNOPQRSTUVW...";
	@Test
	void test_decodeString1() {
		assertArrayEquals(base64.toCharArray(), decodes(base64));
	}

	@Test
	void test_decodeString2() {
		assertArrayEquals(base64.toCharArray(), decodes(base64.replace("+", "A")));
	}

	@Test
	void test_decodeString3() {
		assertArrayEquals(base64.toCharArray(), decodes(base64.replace(".", "A")));
	}

	@org.junit.jupiter.api.Test
	void test_decodeString3_1() {
		byte[] bArray = base64.getBytes();
		assertArrayEquals(bArray, decodes(bArray));
	}
}

// Base64 Coder_4Test.java
public class Base64Coder_4Test {
    @Test
    void test_encode_decoded_data() {
        char[] encoded = { '\0', 'r', 'e', 'l', 'o','','s', 'a', 't', 'e'};
        char[] bArray = base64.toCharArray();
        assertArrayEquals(bArray, encode(bArray, encoded.length));

        bArray = base64.toCharArray();
        assertArrayEquals(bArray, encode(bArray, encoded.length));
    }

    @org.junit.jupiter.api.Test
    void test_encode_decoded_data_1() {
        char[] bArray = base64.toCharArray();
        char[] encoded = { '\0', 'r', 'e', 'l', 'o','','s', 'a', 't', 'e'};
        assertArrayEquals(bArray, encode(bArray, encoded.length));
    }

    @org.junit.jupiter.api.Test
    void test_decode_string() {
        char[] bArray = base64.toCharArray();
        assertArrayEquals(bArray, decodes(bArray));
    }

    @Test
    void test_encode_decoded_data_2() {
        char[] bArray = base64.toCharArray();
        assertArrayEquals(base64, encode(base64, bArray.length));

        bArray = base64.toCharArray();
        assertArrayEquals(base64, encode(base64, bArray.length));
    }

    @org.junit.jupiter.api.Test
    void test_encode_string() {
        assertArrayEquals(base64.toCharArray(), encodes(base64));
    }
}