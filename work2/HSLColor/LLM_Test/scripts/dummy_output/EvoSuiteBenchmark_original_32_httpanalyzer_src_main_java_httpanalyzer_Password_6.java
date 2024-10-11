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
		/**
		 * Returns a String containing the un-encrypted password.
		 *
		 * @returns A String containing the un-encrypted password.
		 */
		public static String unencryptPassword(String strPassword);


		/**
		 * Returns a String containing the encrypted passwd.
		 *
		 * @param strpw A String containing the un-encrypted password.
		 * @param strsalt A 2 character String, containing the salt to
		 * 				encrypt the password with.
		 * @returns A String containing the encrypted passwd.
		 */
		public static String crypt(String strpw, String strsalt);


		/**
		 * Unit test case for the {@link Password#unencryptPassword(String)} method.
		*/
		@junit.jupiter.Test
		public void testUnencryptPassword() {
			String strAlgosl = "MD5";
			MessageDigest md5 = null;
			try {
				md5 = MessageDigest.getInstance(strAlgosl);
			}
			catch (Exception e) {
				e.printStackTrace();
				Logger.getLogger(PasswordTest.class.getName()).log(Level.SEVERE, "Exception caught: " + e.getMessage());
			}
			assertNull(strAlgosl, "Cannot find the algorithm : " + strAlgosl);

			//
			// System.out.println("A = " + "PASSWORD TEST");
			assertNotNull(strpw, "Unencrypted password cannot be null");

			String strpw_crypted = Password.crypt(strpw, null);
			// System.out.print("\t UNCRTED: " + strpw + "\n\n");
			assertEquals(strAlgosl, Password.unencryptPassword(strpw_crypted), "Cerifisé, password");
		}
		
}