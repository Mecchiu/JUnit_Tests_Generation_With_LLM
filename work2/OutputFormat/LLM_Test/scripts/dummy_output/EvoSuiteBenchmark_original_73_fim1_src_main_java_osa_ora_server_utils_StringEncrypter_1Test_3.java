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
* It contains one unit test case for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_1Test {
		
	/**
     * One unit test for 'decrypt'.
     */
    @Test
    public void encryptTest() {
        char[] pass = {'p', 'a','s', 'z'};

        String str = (new RandomStringGenerator().generateRandomString(10)).toLowerCase();

        String keyStr = "passwd-encrypted-" + new RandomStringGenerator().generateSymbols().toLowerCase();

        // One of the following cases could be problematic
        // - No password entered -
        // - Password contains spaces -
        // - Password characters in use -
        // - Two consecutive password characters -

        char[] expected = new char[str.length()];

        System.arraycopy(pass, 0, expected, 0, pass.length);

        String expectedEncrypted = String.valueOf(expected);

        String encrypted = StringEncrypter.encrypt(str, keyStr);

    }
}

// class PBE_1Test.java
class PBE_1Test {
    
    /**
     * Empty class.
     */
    public static class Data {

        /**
         * Empty class.
         */
        public Data() {
        }

    }

    // Create and initialize instance.
    protected Data createInstance() {
        return new Data();
    }
    // getInstance - return instance.
    public static Data getInstance( ) {
        return new Data();
    }
    // clearInstance - clear instance
    public static void clearInstance( ) {
    }
    // encrypt - encrypt string with 'password' or PBE mode.
    public String encrypt(String str) {
        Cipher cipher = null;
        byte[] pass = null;
        byte[] newPass = null;

        try {
            keySpec = new PBEKeySpec(PASSWORD);

            KeyFactory keyFact = SecretKeyFactory.getInstance( "PBE" );

            PBEParameterSpec pbeParamSpec = new PBEParameterSpec(PASSWORD);


            // Create a key out of the password (KeyFactory.getInstance( "PBE") );
            
            SecretKey secretKey = keyFact.generateSecret(pbeParamSpec);

            Cipher c = javax.crypto.Cipher.getInstance("PBE");

            newPass = c.getEncoded(secretKey);

            encrypted = javax.crypto.Cipher.doFinal(newPass, 0);

        } catch (Exception e) {
            System.out.println(new StringBuilder().append(e.getClass().getName()).append(":")
               .append(e.getMessage()).toString());
        }
        return encrypted;
    }
    // decrypt - decrypts encrypted String
    public String decrypt(String encryptedString) {
        newPBE = null;

        cipher = javax.crypto.Cipher.getInstance("PBE");
        System.out.println(encryptedString);
        System.out.println(cipher.getIV());
        cipher.init(Cipher.DECRYPT_MODE, newPBE);
        Cipher c = null;

        byte buff[] = null;
        int offset = offset = encryptedString.length();
        byte[] cipherBytes = cipher.doFinal(encryptedString.toCharArray());

        buff = cipherBytes.clone();

        // Reset the buffers in the returned arrays
        buff = buff[0];
        buff[0] = buff[1];
        buff[1] = buff[2];
        buff[2] = buff[3];
        
        while(encryptedString.length() > offset){
            encryptedString = encryptedString.substring(offset,encryptedString.length());
            offset = 0;
        }

        System.out.println(encryptedString);
        System.out.println(buff);
        c = javax.crypto.Cipher.getInstance("PBE");
        System.out.println(c);
        c.init(Cipher.DECRYPT_MODE, newPBE);
        byte res[] = new byte[buff.length];
        System.arraycopy(buff,offset,res,0,res.length);

        cipherBytes = res;

        return new String(cipherBytes);
    }
}