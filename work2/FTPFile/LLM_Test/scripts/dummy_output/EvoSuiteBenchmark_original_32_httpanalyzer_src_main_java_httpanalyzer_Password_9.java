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
		private static final Logger logger = Logger.getLogger("httpAnalyzerTest");
	 	private char[] hash;
	 	private byte[] password; 
	 	private MessageDigest md;

		public PasswordTest() {

			password = new char[] {'0','5','7','9','3','3','8','4','6','3'};
			try {
				md = MessageDigest.getInstance("SHA-256");                    // this will hash your password with the SHA-256 algorithm
                } catch (NoSuchAlgorithmException e) {
                    logger.log(Level.SEVERE, "MessageDigest unavailable.", e);
                    System.exit(1);
                }
			
	 	}

	 	/**
	 	* test crypt with valid passed password.
	 	*/
	 	@Test 
	 	public void testHash1() throws Exception {
		    //System.cout.println("Test 1: ");
		    for (int i = 0; i < hash.length; ++i) {	// loop through all the different
			    char c = hash[i];
			 	String hash1 = hexCharsToString(c);
	    	 	md.update(c.charArray());
		    
	    	 	byte[] result = crypt(password, hash1);
	    	 	String output = hexCharsToString(result);
	    	 	logger.log(Level.FINER, "" + hash1 + " => " + output);
		 	}
	 	}

	 	/**
	 	* test crypt with invalid password.
	 	*/
	 	@Test 
	 	public void testHash2() throws Exception {
		 	logger.log(Level.FINER, "invalid_hex_string");
		 	String invalidSymbol = "";
		 	String invalidPassword = "";
	 	 	try {
	 	 	password = new char[] {'1','5','7','8','3','3','8','4','6','3'};
	 	 		invalidPassword = "";

	 	 	} catch (Exception e1) {
	 	 			String errorCode = e1.getMessage();
	 	 			logger.log(Level.WARNING, "" + errorCode, e1);
	 	 	}
	 	 	
	 	 	for (byte b : password.clone().toStringChunk(invalidPassword.toCharArray())) {
	 	 		String hash1 = hexCharsToString(b);
	 		 	String hash2 = hexCharsToString(b);
	 		 	byte[] result2 = crypt(password, hash1);
	 		 	
	 		 	System.out.println("hash1 => " +
	 		 			                                          hash1);
	 		 	
	 		 	assertEquals("error message hash1 and hash2 do not match", hash1, hash2);
	 		}
	 	}
	 	

	 	/**
	 	* test crypt with invalid hash.
	 	*/
	 	@Test 
	 	public void testHash3() throws Exception {
		 	logger.log(Level.FINER, "invalid_hex_string");
		 	String hash1 =
		 	 	hexCharsToString(new char[] {'1','5','7','9','3','3','8','4','6',
		 	 		'3','3','8','4','6','3','3','8','4','6','3'});
	 		String invalidSymbol = "";
	 	 	try {
	 	 	password = new char[] {'1','5','7','9','3','3','8','4','6','3'};
 	 	 	password = "";

 	 	 	} catch (Exception e1) {
	 	 			String errorCode = e1.getMessage();
	 	 			logger.log(Level.WARNING, "" + errorCode, e1);
	 
	 	 	}
	 	 	
	 	 	for (byte b : password.clone().toStringChunk(invalidSymbol.toCharArray())) {
	 		 	String hash1 = hexCharsToString(b);
		 		String hash2 = hash1;
		 		byte[] result2 = crypt(password, hash1);
		 		assertEquals("error message hash1 and hash2 do not match", hash1, hash2);
	 		}
	 	}




}