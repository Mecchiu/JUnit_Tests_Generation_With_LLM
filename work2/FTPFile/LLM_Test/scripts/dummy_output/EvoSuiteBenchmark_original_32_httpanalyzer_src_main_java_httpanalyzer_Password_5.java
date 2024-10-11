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
		
 /** Creates new PasswordTest object */
   PasswordTest(String message, String salt, String messageHash) {
       
       assertNotNull(message, "message");
       assertNotNull(salt, "salt");
       assertNotNull(messageHash, "messageHash");
   }
	 /** Gets the hash (including the salt) of the message encrypted by calling {@link Password#crypt(String, String)} 
	 * on <tt>messageHash</tt> where <tt>messageHash</tt> was created with <tt>salt</tt>.
	 * The hash may not be the same of the one created by
	 * {@link org.junit.jupiter.api.Assertions#assertEquals(java.lang.String, java.lang.String)},
	 * or, if the <tt>hash</tt> is in the wrong format, it may
	 * not equal to one derived from <tt>passwordHash</tt>.
	 *
	 * @param message The string to be encrypted.
	 * @param salt The salt used in the password hash.
	 * @param messageHash The encrypted password hash.
	
	 * @returns The hash of the encrypted pw.
	 */
    public static String extractHash( String message, String salt, String messageHash) {
        
       assertNotNull(messageHash, "messageHash");
       assertNotNull(message, "message");
       assertNotNull(messageHash, "messageHash");
       assertTrue(messageHash, messageHash.startsWith(salt));
       
       String encodedMessage = new String (messageHash.substring(messageHash.length()-salt.length()).getBytes());
       String decodedMessage = new String (encodedMessage.getBytes(messageHash.getBytes()));
       
       String calculatedPasswordHash = new String ();
       try {
          calculatedPasswordHash = MessageDigest.getInstance("SHA-1").digest(decodedMessage);
       } catch (NoSuchAlgorithmException ex) {
          calculatedPasswordHash = "";
       }
       return calculatedPasswordHash.toLowerCase();
    }
    
	/**
	 * Test of the function with its arguments defined by {@link Password#extractHash(java.lang.String, java.lang.String)}.
	 * An error will occur if <tt>salt</tt> is not in the format provided by <tt>Password#extractHash(java.lang.String,java.lang.String)}.
	 *
	 * @param args the arguments defined by the function
	 */
    public static void testWithPasswordSalt( String[] args) {
	String message = args[0];
	String salt = args[1];
	String messageHash = args[2];
        try{
            Password.extractHash(message, salt, messageHash);
            fail ("Exception was not thrown in testWithPasswordSalt.");
        }
        catch(Exception ex) {
            assertTrue (MessageDigest.isBadKeyException(ex.getMessage()));
        }
    }
	
	/**
	 * Checks the the string is in the format that is used in the {@link Password#extractHash(String, String)}.
	 * An error will occur if <tt>salt</tt> is not in the format defined by {@link Password#extractHash(String)}.
	 *
	 * @param str The string to be checked.
	 * @return True if the given string contain the message hash (in the string format)
	 * 				else False.
	 */
	public static boolean checkMessageHash(String str) {
		assertTrue(str, 
				 ((Password.extractHash(str,Password.newString(""))).equals("") == true )) ;
}
}