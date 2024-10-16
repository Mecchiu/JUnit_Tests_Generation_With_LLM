/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.console.business.pdf.handlers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import org.junit.BeforeClass;
import org.pdfsam.console.business.dto.PdfFile;
import org.pdfsam.console.business.dto.commands.AbstractParsedCommand;
import org.pdfsam.console.business.dto.commands.DecryptParsedCommand;
import org.pdfsam.console.business.dto.commands.SlideShowParsedCommand;
import org.pdfsam.console.business.pdf.handlers.DecryptCmdExecutor;
import org.pdfsam.console.exceptions.console.ConsoleException;

@RunWith(EvoSuiteRunner.class)
public class DecryptCmdExecutorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DecryptCmdExecutor decryptCmdExecutor0 = new DecryptCmdExecutor();
      decryptCmdExecutor0.clean();
      assertEquals(false, decryptCmdExecutor0.hasChanged());
  }

  @Test
  public void test1()  throws Throwable  {
      DecryptCmdExecutor decryptCmdExecutor0 = new DecryptCmdExecutor();
      try {
        decryptCmdExecutor0.execute((AbstractParsedCommand) null);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DecryptCmdExecutor decryptCmdExecutor0 = new DecryptCmdExecutor();
      SlideShowParsedCommand slideShowParsedCommand0 = new SlideShowParsedCommand();
      try {
        decryptCmdExecutor0.execute((AbstractParsedCommand) slideShowParsedCommand0);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DecryptCmdExecutor decryptCmdExecutor0 = new DecryptCmdExecutor();
      PdfFile[] pdfFileArray0 = new PdfFile[2];
      PdfFile pdfFile0 = new PdfFile("\"3o)j_tk$63;rC7j", "\"3o)j_tk$63;rC7j");
      pdfFileArray0[0] = pdfFile0;
      pdfFileArray0[1] = pdfFileArray0[0];
      DecryptParsedCommand decryptParsedCommand0 = new DecryptParsedCommand(pdfFileArray0, (File) null, "\"3o)j_tk$63;rC7j", false, false, (File) null, '[');
      // Undeclared exception!
      try {
        decryptCmdExecutor0.execute((AbstractParsedCommand) decryptParsedCommand0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
