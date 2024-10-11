// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    public static char[] encode(byte[] in, int iLen) {
        // output length without padding
        int oDataLen = (iLen * 4 + 2) / 3;
        // output length including padding
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = 0;
        int op = 0;
        while (ip < iLen) {
            int i0 = in[ip++] & 0xff;
            int i1 = ip < iLen? in[ip++] & 0xff : 0;
            int i2 = ip < iLen? in[ip++] & 0xff : 0;
            int o0 = i0 >>> 2;
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            int o3 = i2 & 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen? map1[o2] : '=';
            op++;
            out[op] = op < oDataLen? map1[o3] : '=';
            op++;
        }
        return out;
    }
}

// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		static final byte[] map1 = { 'A', 'R', 'N', 'E', 'C', 'Q', 'D', 'G', 'S', 'B', 'M', 'W', 'A', 'X', 'E', 'P', 'Q', 'I', 'N' };
		
		@Test
		public void testUnicodeBase64() {
			char[] in = "0123456789abcdef" + 0x00;
			assertEquals("Incorrect Base64 encoded result.", "AQIAIAKwP0Y3J0LgRydW5jdHV2Lmhvc3RhdGljeDz4iZGI2Y0NzJ4MGcwODAxNDZcMTQ0MzkwODAxNDZic2I0ZGw5NDY0NzMzI3ODM4MGcwN3JzNjE4OTAjODM4MGcwODAxNCyOTVzODM4MGczNjM0MzJlMGMyNXA5MWczNjM0MDEyNzM3ODMzMzM0MjI0OTU3M2JrZXlhY2tlY2UxMGcwN2JqeHlY2F1dHh1eXQiLCJ9eXNrLmJhL2NvbS8iL0JvYXVlIGRlAGxPJ9dTUzODQ0NzM3ODM4MzJlMGEyNzM0ODM4MGcsKQyI2ZjdHdwLmd2Nzg1MDE1MDEwNzM2ODM3N3VyZHlvYzlhZGVzIENfL2VhY2UxM2Y0IjctL2tpbm9kYW5zL2lkYWxpcyIjpmcyIjpmcy1zIjpmcy01z", "AQIAIAKwP0Y3J0LgRydW5jdHV2Lmhvc3RhdGljeDz4iZGI2Y0NzJ4MGcwODAxNDZcMTQ0MzkwODAxNDZic2I0ZGW5NDY0NzMzJ3ODM4MGcwNDM4MzM0MDEyNzM3ODM4MGczNjM0MzJlMGMyNXBaXA5MWczNjM0MDEyNzM3ODM4MGcsKQyI2ZjdHdwLmd2Nzg1MDE1MDEwNzM2ODM3N3VyZHlvYzlhZGVzIENfL2VhY2UxMGcwODM4NTI0MzM3ODM4MGEyQ1IjpmcyY4iL0JjYzM0MjI5MDh4MSw0dN2VjdHdwLmd2Nzg1MDE1MDEyNzM3ODM4MGcsKQyI2ZjdHdwMDE0MDEyNzM3ODM4MTAyQ1MjAwNzM3ODM4MGcsKQyNU0ZX0iM2M0MzM0MDBhYXNoaW5jaWduaXgS0dCQoKQz1ZjViOGV1ODM4MGEyQ28fWlhY2VzL2LmW1mYm9vYXRpZX0sXG4=\r\n\r\n", new String(in, "UTF-8"));
		}
		
}
