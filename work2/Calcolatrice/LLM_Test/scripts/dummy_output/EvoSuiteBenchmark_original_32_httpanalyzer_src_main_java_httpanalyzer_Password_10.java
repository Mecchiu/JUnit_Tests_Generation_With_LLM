// PasswordTest.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains one unit test case for the {@link Password#crypt(String, String)} method.
*/
class PasswordTest {
		
    // private String _password;
	private char[] _salt;
	private String _saltType;
	
	@Test
    public void testEncryption(){
        String encodedPASSWORD = "A.Bc3dG1");
        
        String hashedPassword = Password.crypt(encodedPASSWORD, _salt);
        
        assertEquals(encodedPASSWORD, hashedPassword);
    }
		
		@Test
    public void testEncodedPassword(){
    	String encodedPASSWORD = "A.Bc3dG1");
        
        String encodedPASSWORD_ENCPH = Password.cryptAsEncrypedPassword(_salt[4]);
        
        assertEquals(password(encodedPASSWORD, _salt[4]), password(encodedPASSWORD_ENCPH, _salt[4]));
    }
		
		@Test
    public void testPasswordSalt(){
        String encodedPASSWORD = "A.Bc3dG1";
        
        String encodedPASSWORD_SALT = Password.cryptAsSalt(_salt);
        
        assertEquals(password(encodedPASSWORD, _salt[4]+(char)16), password(encodedPASSWORD_SALT, _salt[4]+(char)16));

    }
		
	@Test
	public void testSaltType(){
		
		String encodedPASSWORD_SALT = Password.cryptAsSalt(_salt[4]);
	
		try{
			_saltType = MessageDigest.getInstance("SHA").
                            digest(_salt[4]).toUpperCase().substring(0,16);
		
		}catch (NoSuchAlgorithmException e){
			throw new RuntimeException("Failed to get SHA algorithm. Check the password and salt types", e);
		}
	
		
	}
		
}
// end class PasswordTest.java