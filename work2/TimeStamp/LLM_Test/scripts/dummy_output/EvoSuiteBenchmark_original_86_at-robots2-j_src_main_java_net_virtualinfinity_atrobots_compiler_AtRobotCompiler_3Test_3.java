// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {
		/** Test constructor with input reader. */
  @Test
    public void testConstructorWithInput() throws IOException {
      LineNumberReader reader = new LineNumberReader(new StringReader(
        "@atrobots.com. Test file name.\n" +
        "@atrobots.com. Test message (message 2).\n" +
        "@atrobots.com. Test file name\n" +
        "@atrobots.com. Test message (message 3).\n" +
        "@atrobots.com. File name."
        ));

      AtRobotCompiler_3Test object = new AtRobotCompiler_3Test();
      byte[] bytes = "<@atrobots.com. Test file name\n" +
        "@atrobots.com. Test message (message 2)".getBytes());
                                
      String line = reader.readLine();
      assertNotNull(line);
      String lineValue = line.substring(line.length() - 1, line.length());
      assertEquals(lineValue, "2");
  }

  /**
* Test constructor with input stream.
*/
  @Test
  public void testConstructorWithInInput() throws IOException {
  		LineNumberReader reader = new LineNumberReader(new InputStreamReader(
  		    new ByteArrayInputStream(
  		        "(@atrobots.com. Test message (message 2).\n" +
  		        "@atrobots.com. Test message (message 3).\n" +
  		        "@atrobots.com. Test file name)".getBytes())));

		AtRobotCompiler_3Test object = new AtRobotCompiler_3Test();
		try {
			byte[] bytes = "<@atrobots.com. Test message (message 2).\n" +
	  			"@atrobots.com. Test message (message 3).\n" +
	  			"@atrobots.com. Test file name). ".getBytes();
		} catch (IOException e) {
			try {
				((ByteArrayInputStream)new ByteArrayInputStream(bytes)).close();
			} catch (IOException e1) {
				fail("Unable to close a closeInputStream");
			}
			return;
		}

		String line = reader.readLine();
		assertNotNull(line);
		String lineValue = line.substring(line.length() - 1, line.length());
		assertEquals("Test message (message 2).\n" +
				    "Test message (message 3).\n" +
				    "Test file name.",lineValue);
  }

  /**
* Test compiler with nulls.
*/
  @Test
  public void testCompilerWithNulls() throws IOException {
      LineNumberReader reader = new LineNumberReader(new StringReader("@" + "Test file name.\n" +
        "@atrobots.com. Test message (message 2).\n" +
        "@atrobots.com. Test message (message 3).\n" +
        "@atrobots.com. File name."));
    
      AtRobotCompiler_3Test object = new AtRobotCompiler_3Test();
      byte[] bytes = "<@" + "Test file name\n" +
        "@atrobots.com. Test message (message 2)".getBytes();
                                
      String line = reader.readLine();
      assertNotNull(line);
      String lineValue = line.substring(line.length() - 1, line.length());
      assertEquals("Test file name\n" +
        "Test message (message 2).\n" +
        "Test message (message 3)".getBytes(),lineValue);
  }
}