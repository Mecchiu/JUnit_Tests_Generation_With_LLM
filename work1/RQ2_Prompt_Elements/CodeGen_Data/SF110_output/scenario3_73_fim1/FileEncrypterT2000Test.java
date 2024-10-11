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

    // Static class variables
    static final String fileName = "EncrypterTest.java";
    /**
     * Singleton
     */
    private final static FileEncrypter instance = getInstance();
    
    /**
     * FileEncrypter getInstance().
     */
    private final static FileEncrypter getInstance() {
		
		return instance;
    }
    
    // Test constructor
    static final void someTest() {
        
        // Initialize variables
		File file = new File(fileName);
		
		// Create new FileEncrypter
        FileEncrypter instance = getInstance();
        
        instance.putFileToEncryption(file, "someData");
    }
    
    // Test encryptFileToFileAndWriteToFile
    @Test
    void testEncryptFileToFileAndWriteToFile() {
        
        // Initialize variables
	    File file = new File(fileName);
	    
        assertTrue(file.createNewFile());
        
        FileOutputStream fOut = null;
        FileInputStream fIn = null;
        
        String encryptedContent = "";
        
        try {
        	String filePath = null;
        	
            try {
            	filePath = file.getPath();
            } catch (SecurityException e) {
                
                return;
            }
            
            File dir = new File(filePath);
            dir.mkdirs();
            
            try {
                fOut = new FileOutputStream(filePath + "/encryptedData");
                
                byte[] data = "someData".getBytes();
                fOut.write(data);
                fOut.flush();
                
            } catch (IOException e) {
                return;
            }
            
            fIn = new FileInputStream(filePath + "/encryptedData");
        	encryptedContent = inEncryption(fIn, true);
        }
        
        finally {
        	if (fOut!= null) {
        		try {
        			fOut.close();
        		} catch (IOException e) {
        			
        			assertThrowable(e);
        			
        		}
        	}
        	if (fIn!= null) {
        		try {
        			fIn.close();
        		} catch (IOException e) {
        			
        			assertThrowable(e);
        			
        		}
        	}
        }
        
        byte[] encryptedData = encryptedContent.getBytes("UTF-8"); 
        String expected = "someData".getBytes();
        assertArrayEquals(expected, encryptedData);
        
        File file2 = new File(file.getPath(), fileName);
        assertTrue(file2.delete());
    }
    
    /**
     * Test inEncryption.
     * @param inFile In file.
     * @param encrypt Whether inEncryption should be executed.
     * @return Encrypted data.
     */
    private String inEncryption(FileInputStream inFile, boolean encrypt)
          throws IOException {
        
        String encryptedContent = "";
        SecretKeySpec secretKeySpec = new SecretKeySpec(new 
                byte[] { (byte)128, (byte)128, (byte)128, (byte)128, (byte)128 },
                                                            "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        FileOutputStream fOut = null;

        try {
        	String filePath = null;
        	
            try {
            	String filePath2 = file.getPath();
            	assertNotNull(filePath2);
            	filePath = filePath2;
            } catch (SecurityException
			                                //e) {
			                                                    
			    				return "";
			                                //}
			                                //  catch (Exception err) {
			                               //			    	if(err==null){
					                              	fatalThrowable(
					                              		            "File not found","File not found");
					   				        //        } else{
					   				          	   //        }
			                                                              //  throw err;
			                                                            //}
			                               )
            	assertNotNull(filePath);
            	
            	fOut = new FileOutputStream(filePath + "/encryptedData");
            	// FileUtils.writeStringToFile(encryptedContent, fOut);
            	encryptedContent = inEncryption(fOut
                   , encrypt);
            	
                fOut.write(encryptedContent.getBytes("UTF-8"));

            } catch (IOException e) {
                return
                		"could not encrypt the data: "
            		+ e.getMessage();
            }
            
        } finally {
            if (fOut!= null) {
            	try {
            		fOut.close();
            	} catch (IOException e) {

            	}
            }
        }
        return encryptedContent;
    }
    
    /**
     * Test putFileToEncryption.
     */
    private String putFileToEncryption(File file, String contents) {
     
        String encryptedContent = "";
        FileInputStream fIn = null;
        try {
            fIn = new FileInputStream(file);
            encryptedContent = inEncryption(fIn, true);
        } catch (IOException e) {
            return "putFileToEncryption failed: "
                    + e.getMessage();
        } finally {
            
        	if (fIn!= null) {
        		try {
        			try {
        				fIn.close();
        			} catch (IOException e) {
        				
        				return
        					"putFileToEncryption failed: "
            		+ e.getMessage();
            		} finally {
        				// Close the input stream.
        				
        			}
        		} finally {
        			try {
        				fIn.close();
        			} catch (IOException e) {

        			}
        		}
        	}
        }
        return encryptedContent;
    }
    
    /**
     * Test exceptional case.
     * @param caughtExpected Exception in the exceptional case.
     * @param caughtMessage Exception in the exceptional case.
     * @throws IOException Exception in the exceptional case.
     */
    private static void fatalThrowable(String caughtExceptionMessage,
            String caughtMessage) throws IOException {
        
        throw new IOException
        				("Error: " + caughtExpectedMessage
            + "(" + caughtExceptionMessage
            + ")"
            );
    }
    
    // -------------------------------------------------------------------------
    
}
