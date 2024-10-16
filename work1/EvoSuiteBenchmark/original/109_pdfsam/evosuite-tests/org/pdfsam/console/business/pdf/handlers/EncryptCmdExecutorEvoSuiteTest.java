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
import org.pdfsam.console.business.dto.commands.EncryptParsedCommand;
import org.pdfsam.console.business.dto.commands.PageLabelsParsedCommand;
import org.pdfsam.console.business.pdf.handlers.EncryptCmdExecutor;
import org.pdfsam.console.exceptions.console.ConsoleException;
import org.pdfsam.console.exceptions.console.EncryptException;

@RunWith(EvoSuiteRunner.class)
public class EncryptCmdExecutorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      encryptCmdExecutor0.clean();
      assertEquals(0, encryptCmdExecutor0.countObservers());
  }

  @Test
  public void test1()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      try {
        encryptCmdExecutor0.execute((AbstractParsedCommand) null);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      EncryptParsedCommand encryptParsedCommand0 = new EncryptParsedCommand();
      try {
        encryptCmdExecutor0.execute((AbstractParsedCommand) encryptParsedCommand0);
        fail("Expecting exception: EncryptException");
      } catch(EncryptException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      PageLabelsParsedCommand pageLabelsParsedCommand0 = new PageLabelsParsedCommand();
      try {
        encryptCmdExecutor0.execute((AbstractParsedCommand) pageLabelsParsedCommand0);
        fail("Expecting exception: ConsoleException");
      } catch(ConsoleException e) {
        /*
         * CLS005 - Bad command.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      PdfFile[] pdfFileArray0 = new PdfFile[1];
      EncryptParsedCommand encryptParsedCommand0 = new EncryptParsedCommand((File) null, "r", "r", "r", 1043, "r", pdfFileArray0, (File) null, true, true, '`');
      try {
        encryptCmdExecutor0.execute((AbstractParsedCommand) encryptParsedCommand0);
        fail("Expecting exception: EncryptException");
      } catch(EncryptException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      EncryptCmdExecutor encryptCmdExecutor0 = new EncryptCmdExecutor();
      PdfFile pdfFile0 = new PdfFile("rc4_128", "rc4_128");
      PdfFile[] pdfFileArray0 = new PdfFile[2];
      pdfFileArray0[0] = pdfFile0;
      pdfFileArray0[1] = pdfFile0;
      EncryptParsedCommand encryptParsedCommand0 = new EncryptParsedCommand((File) null, "rc4_128", "rc4_128", "rc4_128", (-5), "rc4_128", pdfFileArray0, (File) null, true, true, (File) null, 'W');
      try {
        encryptCmdExecutor0.execute((AbstractParsedCommand) encryptParsedCommand0);
        fail("Expecting exception: EncryptException");
      } catch(EncryptException e) {
      }
  }
}
