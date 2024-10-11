// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		
  @Test
  public void testLogon() throws IOException {
    QSAdminAPI api = new QSAdminAPI("127.0.0.1", 9080);
    if (api.logon()) {
      return;
    }
    assertTrue("Logon failed.", false);
  }
  
  @Test
  public void testSendFile() throws IOException {
    QSAdminAPI api = new QSAdminAPI("127.0.0.1", 9080);
    String fileName = "test";
    InputStream stream = new FileInputStream(fileName);
    byte[] bytes = new byte[200];
    for (int i = 0; i < 200; i++) {
      bytes[i] = (byte) ((i & 0xff) + 0x10);
    }
    System.err.println("Send file : "+fileName);
    boolean success = api.sendFile(fileName, stream, bytes.length);
    assertTrue("Send file failed.", success);
  }
  
  @Test
  public void testSendFileError() throws IOException {
    QSAdminAPI api = new QSAdminAPI("127.0.0.1", 9080);
    String fileName = "qsadmin_test_file_error";
    String content = "filecontent";
    InputStream stream = new FileInputStream(fileName);
    byte[] bytes = new byte[200];
    for (int i = 0; i < 200; i++) {
      bytes[i] = (byte) ((i & 0xff) + 0x10);
    }
    System.err.println("Send file : "+fileName);
    boolean success = api.sendFile(fileName, stream, bytes.length);
    assertTrue("Send file failed.", success);
    
  }
}