// ClientProperties_1Test.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains one unit test case for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientProperties_1Test {
		
  /**
   * Tests the {@link ClientProperties#fileCopy(InputStream, File)} method.
   *
   * @throws IOException
   * -
   * @see ClientProperties#fileCopy(InputStream, File)
   * @see ClientProperties#fileCopy(InputStream)
   * @see ClientProperties.FileSource
   * @see ClientProperties#FileDestinations(String, String)
   * 
  public void verifyFileCopy() throws IOException {
    //this method tests if FileInputStream and FileOutputStream correctly behave when 
    //file copied (FileOutputStream is a stream not a String) and vice versa
  	//if this fails, use fileCopy(InputStream) methods
  }
		
  /** Tests that {@link ClientProperties#fileCopy(InputStream, File)} doesn't throw fileExitingException 
  (but throws fileExitingException in {@link ClientProperties#SetProperties(File, File)})
  If this fails, use test fileCopy(InputStream) method
  */
  @Test
  public void testFileCopy() throws IOException {        
/*
    InputStream data = mock(InputStream.class);	
    File outputFile = mock(File.class);
    File destFile = mock(File.class);
    
    setInputStream(data);
    setExistingFile(false);
    setFileName("../src");
    String outputFileContent = "Testing";        
    //if file is already created using setExistingFile then this should not fail
    setExistingFile(true);
    FileDestinations(inputFile, outputFileName);
    FileDestinations(inputFile, destinationFile);
    FileSource(inputFile);
    setExistingFile(true);
    FileDestinations(destFile, destinationFile);
    FileSource(destFile);
    
    assertSame("fileExitingException", "success", validate());
        */    
    assertFalse("file exists", File.exists(tmpConf));
    setFileName("../src/src");
    setFileName("../src");
    
    InputStream data = mock(InputStream.class);	
    FileOutputStream dest = mock(FileOutputStream.class);
    FileOutputStream destFile = mock(FileOutputStream.class);
    setExistingFile(false);
    setInputStream(data);
    setFileName("../src");
    String tempDir = new File("../src").getAbsolutePath();
    new File(tempDir, destinationName).mkdirs();
    dest = new FileOutputStream(destFile) {
      public void write(int b) throws IOException {
      }
    };
    FileDestinations(inputFile, outputFileName);
    FileDestinations(inputFile, destinationFile);
    FileSource(inputFile);
    setExistingFile(true);
    FileDestinations(destFile, destinationFile);
    FileSource(destFile);
        
    dest.flush();
  }

  /** Creates InputStream, which has inputStream set. 
  * 
  * @param fileName -
  *            Name of an XML file
  * @return
  * - InputStream created file 
  */
  FileInputStream mock(String fileName) {

    File sourceFile = new File(tmpConf, fileName);
    return new FileInputStream(sourceFile);
  }

  /** Creates an already existing file.
  *
  * @param pathName -
  *            Name of the file
  * @return True if the file was successfuly created, false otherwise
  */
  public boolean setFileName(String pathName) {
    File testFilename = new File(pathName);
    if (testFilename.exists()) { 
      return false;
    } else {
      logger.info("File doesn't exist");
      return true;
    }
  }
  /** Creates an existing input stream.  
  *
  * @param pathName -
  *            Name of the file
  * @return
  * - InputStream created in the file
  */
  public FileInputStream mock(String pathName, boolean overwrite) throws IOException {
    File testFilename = new File(pathName);
    if (testFilename.exists()) { 
      return new FileInputStream(testFilename);
    } else {
      logger.info("File doesn't exist");
    }
    return mock(pathName);
  }
  /** Creates an already existing file. 
  *
  * @param filename -
  *            name of the file
  * @return
  * - InputStream created file 
  */
  FileInputStream mock(String filename) {
    logger.info("Filename:" + filename);
    File testFile = new File(filename);
    return new FileInputStream(testFile);
  }

  /**
  * Saves the properties to the given file. If this fails, all existing properties
  * are copied to the given directory.
  *
  * @param fileName -
  *            name of file
  */
  public void setFileName(String fileName, String outputDir) {
    String currentDir = System.getProperty(Constants.TMP_CONF, "");
    File newTmpFile = new File(currentDir + "/" + fileName);
    logger.info("Test File Created: " + newTmpFile);
    setFileName(fileName);
    FileOutputStream dest = new FileOutputStream(newTmpFile);
    FileSource(newTmpFile);
    setFileName("");
    dest.flush();
  }

}