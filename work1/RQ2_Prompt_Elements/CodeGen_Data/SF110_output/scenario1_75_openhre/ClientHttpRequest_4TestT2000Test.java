// ClientHttpRequest_4Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {

    /**
    * Method for generating a random content as base64 encoded with {@link Random#nextBytes(byte[])}.
    */
  @Test
    public void test_generateRandomContentAsBase64_6() { 
        String content = String.format("%s", new String(new Random().nextBytes(new byte[8]))).replace("-", "+");
        String expected = String.format("Zm9vZm9uanZXIgZm9uc2FuZXJvZnQ=");
        String expected1 = String.format("Zm9vZm9uanZXIgZm9uc2FuZXJvZnQaGFuY2UgbWFydWQ=");
        assertEquals(expected, ClientHttpRequest.generateRandomContent(content));
        assertEquals(expected, ClientHttpRequest.generateRandomContent(expected).replaceAll("\\+", "+"));
    }
    
    /**
    * Method for generating a random content as base64 encoded with {@link Random#nextBytes(byte[])}.
    */
  @Test
    public void test_generateRandomContentasBase64_14() { 
        String content = String.format("%s", new String(new Random().nextBytes(new byte[8])))
//				+ "1";
           .replace("-", "+");
        String expected = String.format("Zm9vZm9uanZXIgZm9uc2FuZXJvZnQ=");
        String expected1 = String.format("Zm9vZm9uanZXIgZm9uc2FuZXJvZnQaGFuY2UgbWFydWQ=");
        assertEquals(expected, ClientHttpRequest.generateNextString(content, 8, expected));
        assertEquals(expected, ClientHttpRequest.generateNextString(content, 8, expected1).replaceAll("\\+", "+"));
    }
    
    /**
    * Method for generating a random content as base64 encoded with {@link Random#nextBytes(byte[])}.
    */
  private String generateNextString(String content, int length, String expected) {
    int count = length;
    String s1;
    s1 = content;
    while (count-- > 0 && s1.length() > 0) {
        s1 = String.format("%s", new String(new byte[content.length() - 1]))
            + s1;
    }
    return expected.replaceAll("\\+", "+") + "\r\n" + s1;
  }
	
    /**
    * Method for generating the file names in the directory and test the output result. 
*/
  @Test
    public void test_output_file_names_in_the_directory() throws Exception {
//        assertFileDoesNotExist("d/test");
//        assertFileDoesNotExist("d/test/index.html");
//        test_output_file_names_with_a_different_name_to_same_directory();
//
//        assertFileDoesNotExist("d4/test");
//        assertFileDoesNotExist("d4/test-1.jpg");
//        assertFileDoesNotExist("d4/test-2.jpg");
//        assertFileDoesNotExist(File.separator + "d4");
        setDir("d4/");
        assertFileDoesNotExist(File.separator + String.format("d4/Index.html"));
        assertFileDoesNotExist(File.separator + String.format("d4/page.html"));
        assertFileDoesNotExist("d4/test/index.html");
        assertFileDoesNotExist("d4/test/page.html");

        setDir("dir2/d4/");
        assertFileDoesNotExist(File.separator + String.format("dir2/d4/Index.html"));
        assertFileDoesNotExist(File.separator + String.format("dir2/d4/page.html"));
        assertFileExists("d4/test/index.html");
        assertFileDoesNotExist("d4/test/page.html");

        setDir("dir3/d4/");
        assertFileDoesNotExist(File.separator + String.format("dir3/d4/Index.html"));
        assertFileDoesNotExist(File.separator + String.format("dir3/d4/page.html"));
        assertFileDoesNotExist("d4/test/index.html");
        assertFileDoesNotExist("d4/test/page.html");

        setDir("dir4/d4");
        assertFileDoesNotExist(File.separator + String.format("dir4/index.html"));
        assertFileDoesNotExist(File.separator + String.format("dir4/page.html"));
        assertFileDoesNotExist("d4/test/index.html");
        assertFileDoesNotExist("d4/test/page.html");
    }
    
    /**
    * Method for converting the given file name into the directory. 
*/
  public void setDir(String fileName) throws Exception {
	    File file = new File(dir, fileName);	
	    System.out.println(file.getAbsolutePath());
        assertFileExists(fileName);
	    file.delete();
    }
    
    /**
    * Method for getting the contents of the given directory. 
*/
  public void getDirContents(File directory) throws Exception {

    File[] directoryReadings = directory.listFiles();

    assertDirContents("./", directory);
//    assertDirContents(".\\.", directory);

    for (int index = 0; index < 10; index++) {
        System.out.println(directory.getAbsolutePath() + "/" + String.format("%02d", index + 1));
    }
    if (directoryReadings.length == 0) {
        throw new RuntimeException("The TestClientHttpRequest.init method was not used in case of default input param file.");
    }
  }
  
  private void assertFileDoesNotExist(String fileName) throws Exception {
      assertFileDoesNotExist(new File(dir, fileName));
  }

  private void assertFileDoesNotExist(File file) throws Exception {
      assertFalse("File " + file.getAbsolutePath() + " does not exist", file.exists());
  }

  private void assertFileAndRead(File file) throws Exception {
	  assertFileExists(file.getAbsolutePath());
	  InputStream input = new FileInputStream(file);
	  String result = new String( new InputStreamReader