// StringEncrypter_0Test.java
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
* It contains one unit test case for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_0Test {
		
	/**
	 * Private Constructor
	 */
	@SuppressWarnings("FieldCanBeLocal")
    private StringEncrypter(){}
		
    /**
     * Tests: Encryption with a {@link StringEncrypter} using its default set of
     * parameters (specified by {@link Cipher#getParameter()}).
     */
    @Test
	public void testEncryptStringString(){
		StringEncrypter aStrEncrypter = new StringEncrypter();
		String aEncryptedStr = aStrEncrypter.encrypt(strEncryptUsingTheDefaultConstructorParams);
		assertEquals("Error in the encrypted string.",strEncrypt,aEncryptedStr,0);
    }
	
	/**
	 * Tests: Encryption with a {@link StringEncrypter} using a {@link PBEKeySpec}.
	 * It uses a {@link String#PasswordProtector} for password encryption.
	 */
    @Test
	public void testEncryptStringPBEKeySpec(){
		PBEKeySpec aPBEKeySpec = new PBEKeySpec(new char[]{'a', 'b', 'c', 'd'});
		PBEKeyFactory aPBEKeyFactory = SecretKeyFactory.getInstance("PBE", "BC");
		SecretKey aSecretKey1 = aPBEKeyFactory.generateSecret(aPBEKeySpec);

		String encStr = aStrEncrypter.encrypt(pbeEncryptUsingThePasswordProtectorWithEncryptionUsingTheKeyWithTheKey(pBEKeySpec, aSecretKey1));
		assertEquals("Error in the encrypted string.",enCrpt1EncryptingString,encStr,0);
    }
	
	/**
	 * Tests: Decryption with a {@link StringEncrypter} using its default set of
     * parameters (specified by {@link Cipher#getParameter()}).
     *
     */
    @Test
    public void testDecryptStringString(){
		StringEncrypter aStrEncrypter = new StringEncrypter();
		String aDecryptedStr = aStrEncrypter.decrypt(strDecryptUsingTheDefaultConstructorParams);
		assertEquals("Error in the decrypted string.",strDecrypted,aDecryptedStr);
    }
	
	/**
	 * Tests: Decryption with a {@link StringEncrypter} using a {@link PBEKeySpec}.
     * It uses a {@link String#KeyProtectedPassword} for password decryption.
     */
    @Test
    public void testDecryptStringPBEKeySpec(){
		PBEKeySpec aPBEKeySpec = new PBEKeySpec(new char[]{'a', 'b', 'c', 'd'});
		PBEKeyFactory aPBEKeyFactory = SecretKeyFactory.getInstance("PBE", "BC");
		SecretKey plainKey1 = aPBEKeyFactory.generateSecret(aPBEKeySpec);
		StringEncryptor aStrEncryptor = new StringEncryptor(chars);
		String aDecryptedStr;
		Decryptor aDecryptor = new Decryptor(aStrEncryptor,plainKey1,"");
		aDecryptedStr = aDecryptor.decrypt(strDecryptUsingThePBEForDecryptionUsingThePasswordProtectedPassword(pBEKeySpec,plainKey1));
		assertEquals("Error in the decrypted string.",enCrp1Decrypted,aDecryptedStr);
    }
	
	/**
	 * Tries to use the {@link StringEncryptor} by calling its {@link StringEncryptor#encrypt(String)} method.
     */
    private StringEncryptor encryptedEncryptor(String aEncrypted){
    	StringEncryptor aStrEncryptor = new StringEncryptor(chars);
		aStrEncryptor.encrypt(aEncrypted);
		return aStrEncryptor;
    }
	
	/**
	 * Uses the {@link String} to encrypt a String using the {@link PBEKeySpec}.
	 */
    @Test
	public void testEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKeyWithTheKey(StringPBEKeySpec aPBEKeySpec){
		StringPBEKeySpec aStrPBEKeySpec = new StringPBEKeySpec(new char[]{'a', 'b', 'c', 'd'});
        SecretKeyFactory aSecretKeyFactory = SecretKeyFactory.getInstance("PBE", "BC");
        SecretKey plainKey1 = aSecretKeyFactory.generateSecret(aPBEKeySpec);
		
		StringEncryptor aStrEncryptor = encryptedEncryptor(strEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKey(aPBEKeySpec,aSecretKey1));
        int intResult = aStrEncryptor.encrypt(chars);
        assertEquals("Error in the encrypted string.",encrpt1Encrypted,strEncrypted,1);
        //System.out.println("The encrypted String : "+encrpt1Encrypted+" encrypted with the PBE Key with the key: "+aStrEncryptor +" ");
        
        int intCorrectResult = intEncryptUsingThePasswordProtectedPasswordWithTheKey(aPBEKeySpec,aSecretKey1);
        assertEquals("Error in the encrypted string.",encrpt1Correct,intResult,1);
        System.out.println("The correct result of the encrypted string is : "+encrpt1Correct+" encrypted with the PBE Key with the key: "+aStrEncryptor +" with the key: "+aPBEKeySpec);
    }
	
	/**
	 * Uses the {@link PBEKeySpec} to encrypt a String using the PBE key using the {@link String#PasswordProtector}.
     */
    @Test
	public void testEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKeyWithThePBE(StringPBEKeySpec aPBEKeySpec){
		String aEncryptingString = encryptedEncryptor(strEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKey(aPBEKeySpec,pBEKeyWithMyPassword)).encrypt(strEncryptingWithThePasswordProtectedPassword);
		assertEquals("Error in the encrypted string.",strEncrypted,aEncryptingString,0);
		System.out.println("The encrypted string : "+strEncrypted+" was encrypted with the password in the password protector" );
	}
	
	/**
	 * Encrypts with the password protected by the {@link String#PasswordProtector}.
	 */
    @Test
	public void testEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKey(StringPBEKeySpec aPBEKeySpec){
		String encryptedStr = encryptedEncryptor(strEncryptUsingThePasswordProtectedPasswordWithEncryptionUsingTheKey(aPBEKeySpec)).encrypt(strEncryptingWithThePasswordProtectedPassword);
}
}