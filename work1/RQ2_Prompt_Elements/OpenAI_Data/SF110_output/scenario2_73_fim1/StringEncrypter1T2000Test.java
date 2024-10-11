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

	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is null.
	*/
	@Test
	void testDecrypt_1() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt(null);
		assertNull(result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is empty.
	*/
	@Test
	void testDecrypt_2() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("");
		assertNull(result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_3() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_4() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_5() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_6() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_7() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_8() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_9() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the case when the input is a valid encrypted string.
	*/
	@Test
	void testDecrypt_10() {
		StringEncrypter stringEncrypter = new StringEncrypter();
		String result = stringEncrypter.decrypt("ZW5jcnlwdGVk");
		assertEquals("encrypted", result);
	}
}

// StringEncoder64.java
package osa.ora.server.utils;

import java.io.IOException;

/**
 * This class provides encode/decode for RFC 2045 Base64 as defined by RFC 2045,
 * N. Freed and N. Borenstein. RFC 2045: Multipurpose Internet Mail Extensions
 * (MIME) Part One: Format of Internet Message Bodies. Reference 1996 Available
 * at: http://www.ietf.org/rfc/rfc2045.txt This class is used by XML Schema
 * binary format validation
 *
 * @author Jeffrey Rodriguez
 * @version 1.0
 */
public class StringEncoder64 {

    /**
     * Encodes a String as a base64 String.
     *
     * @param data a String to encode.
     * @return a base64 encoded String.
     */
    public static String encode(String data) {
        return encode(data.getBytes());
    }

    /**
     * Encodes a byte array into a base64 String.
     *
     * @param data a byte array to encode.
     * @return a base64 encode String.
     */
    public static String encode(byte[] data) {
        int c;
        int len = data.length;
        StringBuffer ret = new StringBuffer(((len / 3) + 1) * 4);
        for (int i = 0; i < len; ++i) {
            c = (data[i] >> 2) & 0x3f;
            ret.append(cvt.charAt(c));
            c = (data[i] << 4) & 0x3f;
            if (++i < len) {
                c |= (data[i] >> 4) & 0x0f;
            }

            ret.append(cvt.charAt(c));
            if (i < len) {
                c = (data[i] << 2) & 0x3f;
                if (++i < len) {
                    c |= (data[i] >> 6) & 0x03;
                }

                ret.append(cvt.charAt(c));
            } else {
                ++i;
                ret.append((char) fillchar);
            }

            if (i < len) {
                c = data[i] & 0x3f;
                ret.append(cvt.charAt(c));
            } else {
                ret.append((char) fillchar);
            }
        }
        return ret.toString();
    }

    /**
     * Decodes a base64 String.
     *
     * @param data a base64 encoded String to decode.
     * @return the decoded String.
     */
    public static String decode(String data) {
        return decode(data.getBytes());
    }

    /**
     * Decodes a base64 aray of bytes.
     *
     * @param data a base64 encode byte array to decode.
     * @return the decoded String.
     */
    public static String decode(byte[] data) {
        int c, c1;
        int len = data.length;
        StringBuffer ret = new StringBuffer((len * 3) / 4);
        for (int i = 0; i < len; ++i) {
            c = cvt.indexOf(data[i]);
            ++i;
            c1 = cvt.indexOf(data[i]);
            c = ((c << 2) | ((c1 >> 4) & 0x3));
            ret.append((char) c);
            if (++i < len) {
                c = data[i];
                if (fillchar == c) {
                    break;
                }

                c = cvt.indexOf((char) c