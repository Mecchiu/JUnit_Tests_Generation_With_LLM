// FileEncrypterTest.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains one unit test case for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {
		static {
			System.loadLibrary("javasystest");
		}

	@Test
	public void testToEncryptFileExists() {
		// Given
		String name = "file.txt";
		boolean result = false;
		
		try {
			// When
			try {
				// Then
				File file = new File("abc");
								File fileExists = FileEncrypter.getInstance().getEncryptionMethod("abc.txt").encrypt(file);
				result = fileExists.exists();
			}   
			
			// Then
			catch (IOException ioException) {
				fail("Error expected, but did not occur: " + ioException);
			}
		}   
		catch (UnsatisfiedLinkError unimaledLinkException) {
			fail("Error expected, but did not occur: " + unimaledLinkException);
		} 
		
		// Assertions
		assertTrue(result);
		
		System.loadLibrary();
	}
	
	@Test
	public void testToEncryptFileDoesNotExist() {
		// given

		// When
		File file = new File("abc");
		
		try {
			// When
			FileEncrypter.getInstance().getEncryptionMethod("abc.txt").encrypt(file);
		}   
		catch (UnsatisfiedLinkError unimaledLinkException) {
			fail("Error expected, but did not occur: " + unimaledLinkException);
		} 
		
		// And again
		try  {
			FileEncrypter.getInstance().getEncryptionMethod("abc.txt").encrypt(file);
		} 
		catch (UnsatisfiedLinkError unimaledLinkException) {
			fail("Error expected, but did not occur: " + unimaledLinkException);
		}
		
		// Assertions
		assertFalse(file.exists());
	}
	
	@Test
	public void testToEncryptFile() {
		// given
		
		// When
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			// When
			try {
				fileInputStream = new FileInputStream(
					"abc.txt");
				Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
				SecretKeySpec key = new SecretKeySpec(
					new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, "AES", 16);
				IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{
					(byte) (4), (byte) (5), (byte) (6), (byte) (7),
					(byte) (8), (byte) (9), (byte) (10), (byte) (11),
					(byte) (12), (byte) (13), (byte) (14), (byte) (15)
				});
				cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
				fileOutputStream = new FileOutputStream(
					"FileEncrypterTest.dat");
				byte[] theNewByteArray = new byte[10240];
				byte[] output;
				while ((output = fileInputStream.read())!= -1) {
					theNewByteArray[7] = (byte)output;
					cipher.doFinal(theNewByteArray, 0, theNewByteArray.length);
					fileOutputStream.write(theNewByteArray);
				}
			}
				
			// Then
			catch (IOException ioException) {
				fail("Error expected, but did not occur: " + ioException);
			}
		}   
		catch (UnsatisfiedLinkError unimaledLinkException) {
			fail("Error expected, but did not occur: " + unimaledLinkException);
		} 
		
		// And again
		try   {
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
			SecretKeySpec key = new SecretKeySpec(
				new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, "AES", 16);
    		IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{
    				(byte) (4), (byte) (5), (byte) (6), (byte) (7),
    				(byte) (8), (byte) (9), (byte) (10), (byte) (11),
    				(byte) (12), (byte) (13), (byte) (14), (byte) (15)
    		});
    		cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
    		File fileOld = new File("abc");
			fileOld.delete();
			fileOld.createNewFile();
    		byte[] theNewByteArray = new byte[10240];
    		fileOutputStream = new FileOutputStream("FileEncrypterTest.dat");
    		byte[] theOldByteArray = fileOld.read(theNewByteArray);
    		cipher.doFinal(theOldByteArray, 0, theOldByteArray.length);
    		fileOutputStream.write(theOldByteArray);
		}  
		finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			}
			catch (IOException ioException) {
				fail("Error expected, but did not occur: " + ioException);
			} 
		}
	}

}