// StringEncrypterTest.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypterTest {

		@Test
		void testDecrypt() {
				StringEncrypter se = new StringEncrypter();
				assertEquals("test", se.decrypt("test"));
		}
}

// StringEncoder64.java
package osa.ora.server.utils;

import java.io.IOException;

public class StringEncoder64 {

    public static String encode(byte[] d) {
        if (d == null)
            return null;
        byte data[] = new byte[d.length + 2];
        System.arraycopy(d, 0, data, 0, d.length);
        byte dest[] = new byte[(data.length / 3) * 4];
        // 3-byte to 4-byte conversion
        for (int sidx = 0, didx = 0; sidx < d.length; sidx += 3, didx += 4) {
            dest[didx] = (byte) ((data[sidx] >>> 2) & 077);
            dest[didx + 1] = (byte) ((data[sidx + 1] >>> 4) & 017 | (data[sidx] << 4) & 077);
            dest[didx + 2] = (byte) ((data[sidx + 2] >>> 6) & 003 | (data[sidx + 1] << 2) & 077);
            dest[didx + 3] = (byte) (data[sidx + 2] & 077);
        }
        // 0-63 to ascii printable conversion
        for (int idx = 0; idx < dest.length; idx++) {
            if (dest[idx] < 26)
                dest[idx] = (byte) (dest[idx] + 'A');
            else if (dest[idx] < 52)
                dest[idx] = (byte) (dest[idx] + 'a' - 26);
            else if (dest[idx] < 62)
                dest[idx] = (byte) (dest[idx] + '0' - 52);
            else if (dest[idx] < 63)
                dest[idx] = (byte) '+';
            else
                dest[idx] = (byte) '/';
        }
        // add padding
        for (int idx = dest.length - 1; idx > (d.length * 4) / 3; idx--) {
            dest[idx] = (byte) '=';
        }
        return new String(dest);
    }

    public static byte[] decode(String str) throws IOException {
        if (str == null)
            return null;
        byte data[] = str.getBytes();
        // ascii printable to 0-63 conversion
        for (int idx = 0; idx < data.length; idx++) {
            if (data[idx] == '=')
                data[idx] = 0;
            else if (data[idx] == '/')
                data[idx] = 63;
            else if (data[idx] == '+')
                data[idx] = 62;
            else if (data[idx] >= '0' && data[idx] <= '9')
                data[idx] = (byte) (data[idx] - ('0' - 52));
            else if (data[idx] >= 'a' && data[idx] <= 'z')
                data[idx] = (byte) (data[idx] - ('a' - 26));
            else if (data[idx] >= 'A' && data[idx] <= 'Z')
                data[idx] = (byte) (data[idx] - 'A');
        }
        // 4-byte to 3-byte conversion
        byte dest[] = new byte[data.length];
        int sidx, didx;
        for (sidx = 0, didx = 0; didx < dest.length - 2; sidx += 4, didx += 3) {
            dest[didx] = (byte) (((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
            dest[didx + 1] = (byte) (((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
            dest[didx + 2] = (byte) (((data[sidx + 2] << 6) & 255) | (data[sidx + 3] & 077));
        }
        if (didx < dest.length) {
            dest[didx] = (byte) (((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
        }
        if (++didx < dest.length) {
            dest[didx] = (byte) (((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
        }
        return dest;
    }
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.encode("test".getBytes()));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#decode(String)} method.
*/
class StringEncoder64Test {
		
		@Test
		void testDecode() {
				StringEncoder64 se = new StringEncoder64();
				assertEquals("test", se.decode("test"));
		}
}

// StringEncoder64Test.java
package osa.ora.server.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncoder64}.
* It contains ten unit test cases for the {@link StringEncoder64#encode(byte[])} method.
*/
class StringEncoder64Test {
		
		@Test
		void testEncode() {
				StringEncoder64