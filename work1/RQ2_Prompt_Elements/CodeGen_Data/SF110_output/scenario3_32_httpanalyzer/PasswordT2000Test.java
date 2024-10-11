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
	 * Test method for {@link Password#crypt(String, String)}.
	 */
	@Test
	public void testCryptPassword() {

		String strpw = "password_123456";
		String strsalt = "salt_12345678";
		String strpassw = "password_123456";

		String result = Password.crypt(strpw, strsalt);
		assertEquals(strpassw, result);

		try {
			result = Password.crypt(strpw, strsalt);
			fail();
		}
		catch (Exception e) {
			assertTrue(PasswordTest.class.getName() + ": Password was not encrypted: " + e.toString(), e.getMessage().equals("Password was not encrypted. Password was: ")
					&& e.getMessage().contains("salt"));
		}
	}
	
	/**
	 * 
	 * @param encryptPassw
	 * @param salt
	 * @return
	 * @throws Exception 
	 * */
	public static byte[] crypt(String encryptPassw,String salt) throws Exception{
		
		assertNotNull(encryptPassw);
		assertNotNull(salt);
		assertFalse(encryptPassw.isEmpty());
		assertTrue(salt.isEmpty());
		
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(encryptPassw.getBytes());
			byte[] result = md.digest();
			md = MessageDigest.getInstance("MD5");
			md.update(salt.getBytes());
			byte[] result2= md.digest();
			System.out.println(encryptPassw + " == " + byteArrayToString(result)+" "+byteArrayToString(result2));
			return result2;		
		}catch (NoSuchAlgorithmException e) {
			fail(e.toString());
		}	
		
		return null;
	}
	
	/**
	 * 
	 * @param salt
	 * @return
	 * @throws Exception 
	 */
	public static String byteArrayToString(byte[] b) throws Exception{ 
		for(byte bt : b){
			System.out.println(byteArrayToString(bt));
		}
		
		String strTemp = "";
		try {
			for(byte bt : b){
				strTemp += bt;
			}
			strTemp = strTemp.substring(0,16);
		}
		catch (Exception e){
			System.err.println(e.toString());
			;
		}
		return strTemp;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String cryptPassword(){
		String strTemp = "";
		try {
			strTemp = Password.crypt("test", "test");
		}
		catch (Exception e){
			System.err.println(e.toString());
			;
			strTemp = null;
		}
		return strTemp;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String cryptSalt(){
		String strTemp = "";
		try {
			strTemp = Password.crypt("test", "");
		}
		catch (Exception e){
			System.err.println(e.toString());
			;
			strTemp = null;
		}
		return strTemp;
	}

	@Test
	public void  testCryptPassword(){
	
		
		
		
	}
}
