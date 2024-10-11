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

	/**
	* Initialize the en-rypted data.
	* <br>
	* For a given test-case,
	* this method should be used as {@link FileEncrypter#getInstance()}.
	* @throws IOException in case of any I/O error.
	*/
	public static void initialize() throws IOException {
		File f;
        final String PASSWORD = "1234";
		final String IV = "12345";
		final String DES_CIPHER = "DESede";
	
		f = FileUtils.getFile();
		FileOutputStream fos  = new FileOutputStream("encrypted_file");
		final File encryptedFile = new File("encrypted_file");
		fos.write(PASSWORD.getBytes());
		fos.write(FILE_HOST_KEY);
		fos.write(IV);
		FileInputStream fis  = new FileInputStream(f.getPath());           // Read the encrypted data
		final String actual = new String(new Cipher(DES_CIPHER, fis).doFinal("encrypted_file".getBytes()), "UTF-8");
        fos.close();
		fis.close();
		
		
		encryptedFile.deleteOnExit();
		
	
		
	}
	
	/**
	* Test encryption for file without secret key.
	* <p>NOTE: We expect the encrypted data to use the same encryption engine
	* as the original file.</p>
	* @throws IOException if any IO exception occur.
	*/
	@Test
	public void testEncryptionWithoutSecretKey() throws IOException {
		
	final String fileName = "encrypted_file";
	// Initialize the data to encrypt
		
	initialize();

	File expectedFile = new File(encryptedFile.getPath());  // The encrypted files must be equal to the same size; this function works only if the encrypted data is already hashed
	
    
	// Encrypt the encrypted data in 2 steps
	FileOutputStream fos = null;
	try {

		Cipher encrypt = Cipher.getInstance("DES/ECB/PKCS5Padding");
		SecretKeySpec kSec = new SecretKeySpec(FILE_HOST_KEY, "DES");
		encrypt.init(Cipher.ENCRYPT_MODE, kSec);        // Initialize the cipher
	
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		encrypt.doFinal(bos);

		expectedFile    = new File(encryptedFile.getPath() + fileName);
		fos           = new FileOutputStream(expectedFile);
		BytesArrayOutputStream bosEnc = new BytesArrayOutputStream();
		bos         = new ByteArrayOutputStream();
		encrypt.doFinal(bosEnc, 0);
        
		byte[] fileHash = new byte[4];
		encrypt.doFinal(fileHash, 0);
        
		fos.write(fileHash);
  }}
	
	/**
     * Test encryption for file with same secret key.
     * <p>NOTE: We expect the encrypted data to be encrypted using the same encryption engine
     * as the original file.</p>
     * @throws IOException if any IOException occur.
     */
    @Test
    public void testEncryptionWithSameSecretKey() throws IOException {

    final String fileName = "encrypted_file";
    // Initialize the data to encrypt
    
    initialize();

    File expectedFile = new File(encryptedFile.getPath());
    byte[] actualBytes = new byte[FILE_HOST_KEY.length];
    final SecretKeySpec kSec = new SecretKeySpec(FILE_HOST_KEY, "DES");
    FileOutputStream fos = null;
    try {

      Cipher encrypt = Cipher.getInstance("DES/ECB/PKCS5Padding");
      SecretKeySpec kSecRes = new SecretKeySpec(kSec.getEncoded(), "DES");
      encrypt.init(Cipher.ENCRYPT_MODE, kSecRes);        // Initialize the cipher
      byte[] encryptedBytes = encrypt.doFinal(FILE_HOST_KEY);
       
      FileInputStream fis = new FileInputStream(encryptedFile);
      fos = new FileOutputStream("encrypted_file");
      encrypt.doFinal(fos, 0);
         
      byte[] actualBytesRes = new byte[FILE_HOST_KEY.length];
      encrypt.doFinal(actualBytesRes, 0);
      fos.write(actualBytesRes, 0, FILE_HOST_KEY.length);
      encrypt.doFinal(fos, 0);

       
      actualBytes = actualBytesRes;
    }}
        
    
} //end of test class



/**
*
* @author Fermi-Lane
*
*/
