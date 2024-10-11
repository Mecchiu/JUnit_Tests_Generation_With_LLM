// StringEncrypter_1Test.java
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
class StringEncrypter_1Test {

	/**
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#decrypt(String)}.
	* Test case 1 for method {@link StringEncrypter#getInstance(String)}.
	* Test case 1 for method {@link StringEncrypter#StringEncrypter(String)}.
	* Test case 1 for method {@link StringEncrypter#encrypt(String)}.
	* Test case 1 for method {@link StringEncrypter