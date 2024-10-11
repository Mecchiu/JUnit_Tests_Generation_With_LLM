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
		private static final String PWD_BOTH_SHA_SET_MANDATORY_PASSWD = "<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eCYs=>";

		@Test
		public void testEncryptedPasswd_NoPasswd_NoSalt_NoHash() throws NoSuchAlgorithmException {
			String pwd;
			pwd = crypt(PWD_BOTH_SHA_SET_MANDATORY_PASSWD, "");
			assertEquals("Should not get any salt", "", pwd.substring(32));
			assertNull(pwd.substring(0, 16));    // TODO: Should this test be null?
		}

		@Test
		public void testEncryptedPasswd_NotEncrypted_NoSalt() throws NoSuchAlgorithmException, NoSuchAlgorithmException {
			String pwd;
			pwd = crypt(PWD_BOTH_SHA_SET_MANDATORY_PASSWD, "test");
			assertEquals("Should be no salt", "test", pwd.substring(32));
			assertNotEquals("Should not match", PWD_BOTH_SHA_SET_MANDATORY_PASSWD, pwd.substring(0, 56));
		}

		@Test
		public void testEncryptedPasswd_Encrypted_HasSalt() throws NoSuchAlgorithmException, NoSuchAlgorithmException {
			String pwd;
			msgDigest = new MessageDigest("SHA-1");
			pwd = crypt(PWD_BOTH_SHA_SET_MANDATORY_PASSWD, PWD_BOTH_SHA_SET_MANDATORY_PASSWD);
			assertHashEquals("Didn't match digest", msgDigest.digest(pwd.getBytes()), pwd.substring(0, 56));
		}

		private static final String PWD_BOTH_SHA_SET_MANDATORY_PASSWD = "<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=";

		private String getPwd(String strSalt) {
			return  "<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=" + strSalt + ">".concat(strSalt);
		}

		private String getPwd(String strSalt, String strHash) {
			return  getPwd("<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=" + strSalt + ">") + "|" + hash(strHash);
		}

		private static final String hash(String strHash) throws NoSuchAlgorithmException {
			return hash64(getPwd(strHash));
		}

		private static final String hash32(String strHash) throws NoSuchAlgorithmException {
			return hash32("<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=" + strHash, 32);
		}

		private static final String hash64(String strHash) throws NoSuchAlgorithmException {
			MessageDigest mDigest = new MessageDigest("SHA-256");
			return hash64("<sha256-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=" + strHash, 64);
		}

		private static final String hash32(String strHash, int minLength)
				throws NoSuchAlgorithmException {
			mDigest.update(getPwd(strHash).getBytes(), 0, strHash.length());
			int hash = mDigest.digestLength();
			return mDigest.digest(new byte[minLength - hash]);
		}

		private static final String hash64(String strHash, int minLength)
				throws NoSuchAlgorithmException {
			return hash64("<sha256-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=" + strHash, 64, minLength);
		}

}
// 	private static final String PWD_BOTH_SHA_SET_MANDATORY_PASSWD = "<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=>";
// 	private static final String PWD = "<sha1-1hk4yC6MnQ5f7R4fqdKG2k9BXhE1l9UdVz0eM9cWQDkzMlk=>";